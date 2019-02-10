
package rts.rts.pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fechaAnulacionFactura"
})
public class FechaAnulacionFactura {

    @JsonProperty("fechaAnulacionFactura")
    private String fechaAnulacionFactura;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fechaAnulacionFactura")
    public String getFechaAnulacionFactura() {
        return fechaAnulacionFactura;
    }

    @JsonProperty("fechaAnulacionFactura")
    public void setFechaAnulacionFactura(String fechaAnulacionFactura) {
        this.fechaAnulacionFactura = fechaAnulacionFactura;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
