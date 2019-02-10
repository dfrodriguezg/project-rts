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
package rts.rts.transformaciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.apache.camel.Exchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import rts.rts.model.RelacionRTS;

@Component("transformationComponent")
public class TransformationComponent {

	private Map<String, String> mapRelacionRts;

	@Autowired
	RelacionRTS relacionRts;

	@PostConstruct
	public void init() {
		mapRelacionRts = new HashMap<>();
	}

	public Map<String,String> transformation(Exchange exchange) {
	
           mapRelacionRts.put("numFactura", relacionRts.getNumFactura());
           mapRelacionRts.put("fechaTransaccion", relacionRts.getFechaTransaccion().toString());
           mapRelacionRts.put("fechaContable", relacionRts.getFechaContable().toString());
           mapRelacionRts.put("fechaEmision", relacionRts.getFechaEmision().toString());
           mapRelacionRts.put("numReferencia", relacionRts.getNumReferencia());
           mapRelacionRts.put("estado", relacionRts.getEstado());
           mapRelacionRts.put("fechaAnulacion", relacionRts.getFechaAnulacion().toString());
           mapRelacionRts.put("comentAnulacion", relacionRts.getComentAnulacion());
           mapRelacionRts.put("fechaAnulacionFactura", relacionRts.getFechaAnulacionFactura().toString());           
		
		return mapRelacionRts;

	}
}
