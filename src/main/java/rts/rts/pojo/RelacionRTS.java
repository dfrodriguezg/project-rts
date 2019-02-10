
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
    "numFactura",
    "fechaTransaccion",
    "fechaContable",
    "fechaEmision",
    "numReferencia",
    "estado",
    "fechaAnulacion",
    "comentAnulacion",
    "fechaAnulacionFactura"
})
public class RelacionRTS {

    @JsonProperty("numFactura")
    private NumFactura numFactura;
    @JsonProperty("fechaTransaccion")
    private FechaTransaccion fechaTransaccion;
    @JsonProperty("fechaContable")
    private FechaContable fechaContable;
    @JsonProperty("fechaEmision")
    private FechaEmision fechaEmision;
    @JsonProperty("numReferencia")
    private NumReferencia numReferencia;
    @JsonProperty("estado")
    private Estado estado;
    @JsonProperty("fechaAnulacion")
    private FechaAnulacion fechaAnulacion;
    @JsonProperty("comentAnulacion")
    private ComentAnulacion comentAnulacion;
    @JsonProperty("fechaAnulacionFactura")
    private FechaAnulacionFactura fechaAnulacionFactura;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("numFactura")
    public NumFactura getNumFactura() {
        return numFactura;
    }

    @JsonProperty("numFactura")
    public void setNumFactura(NumFactura numFactura) {
        this.numFactura = numFactura;
    }

    @JsonProperty("fechaTransaccion")
    public FechaTransaccion getFechaTransaccion() {
        return fechaTransaccion;
    }

    @JsonProperty("fechaTransaccion")
    public void setFechaTransaccion(FechaTransaccion fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    @JsonProperty("fechaContable")
    public FechaContable getFechaContable() {
        return fechaContable;
    }

    @JsonProperty("fechaContable")
    public void setFechaContable(FechaContable fechaContable) {
        this.fechaContable = fechaContable;
    }

    @JsonProperty("fechaEmision")
    public FechaEmision getFechaEmision() {
        return fechaEmision;
    }

    @JsonProperty("fechaEmision")
    public void setFechaEmision(FechaEmision fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    @JsonProperty("numReferencia")
    public NumReferencia getNumReferencia() {
        return numReferencia;
    }

    @JsonProperty("numReferencia")
    public void setNumReferencia(NumReferencia numReferencia) {
        this.numReferencia = numReferencia;
    }

    @JsonProperty("estado")
    public Estado getEstado() {
        return estado;
    }

    @JsonProperty("estado")
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @JsonProperty("fechaAnulacion")
    public FechaAnulacion getFechaAnulacion() {
        return fechaAnulacion;
    }

    @JsonProperty("fechaAnulacion")
    public void setFechaAnulacion(FechaAnulacion fechaAnulacion) {
        this.fechaAnulacion = fechaAnulacion;
    }

    @JsonProperty("comentAnulacion")
    public ComentAnulacion getComentAnulacion() {
        return comentAnulacion;
    }

    @JsonProperty("comentAnulacion")
    public void setComentAnulacion(ComentAnulacion comentAnulacion) {
        this.comentAnulacion = comentAnulacion;
    }

    @JsonProperty("fechaAnulacionFactura")
    public FechaAnulacionFactura getFechaAnulacionFactura() {
        return fechaAnulacionFactura;
    }

    @JsonProperty("fechaAnulacionFactura")
    public void setFechaAnulacionFactura(FechaAnulacionFactura fechaAnulacionFactura) {
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
