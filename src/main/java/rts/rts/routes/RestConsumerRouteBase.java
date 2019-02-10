/*
 * Copyright 2005-2016 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package rts.rts.routes;

import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import rts.rts.configurador.ConfigurationRoute;
import rts.rts.model.RelacionRTS;
import rts.rts.properties.RestConsumerBase;


@Component
public class RestConsumerRouteBase extends ConfigurationRoute {
    
	@Autowired
	private RestConsumerBase restConfig;
	
    @Bean
    ServletRegistrationBean servletRegistrationBean() {
        ServletRegistrationBean servlet = new ServletRegistrationBean(
            new CamelHttpTransportServlet(), restConfig.getContext() +"/*");
        servlet.setName("CamelServlet");
        return servlet;
    }

   @Override
    public void configure() throws Exception {
	   super.configure();
        restConfiguration()
            .contextPath(restConfig.getContext()).apiContextPath(restConfig.getApiPath())
                .apiProperty("api.title", restConfig.getApiPath())
                .apiProperty("api.version", restConfig.getApiVersion())
                .apiProperty("cors", "true")
                .apiContextRouteId("doc-api")
            .component("servlet")
            .bindingMode(RestBindingMode.json);

        rest(restConfig.getServiceName())
        .post().type(RelacionRTS.class)
    	.to("direct:servicesRest");
    
    from("direct:servicesRest")
      .to("direct:transformationRouteBase");
 
    }
}
