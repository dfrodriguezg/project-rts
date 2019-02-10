package rts.rts.model;

import java.sql.Date;
import org.springframework.stereotype.Component;

@Component
public class RelacionRTS {
	private String numFactura;
	private Date fechaTransaccion;
	private Date fechaContable;
	private Date fechaEmision;
	private String numReferencia;
	private String estado;
	private Date fechaAnulacion;
	private String comentAnulacion;
	private Date fechaAnulacionFactura;

	public String getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}

	public Date getFechaTransaccion() {
		return fechaTransaccion;
	}

	public void setFechaTransaccion(Date fechaTransaccion) {
		this.fechaTransaccion = fechaTransaccion;
	}

	public Date getFechaContable() {
		return fechaContable;
	}

	public void setFechaContable(Date fechaContable) {
		this.fechaContable = fechaContable;
	}

	public Date getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public String getNumReferencia() {
		return numReferencia;
	}

	public void setNumReferencia(String numReferencia) {
		this.numReferencia = numReferencia;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaAnulacion() {
		return fechaAnulacion;
	}

	public void setFechaAnulacion(Date fechaAnulacion) {
		this.fechaAnulacion = fechaAnulacion;
	}

	public String getComentAnulacion() {
		return comentAnulacion;
	}

	public void setComentAnulacion(String comentAnulacion) {
		this.comentAnulacion = comentAnulacion;
	}

	public Date getFechaAnulacionFactura() {
		return fechaAnulacionFactura;
	}

	public void setFechaAnulacionFactura(Date fechaAnulacionFactura) {
		this.fechaAnulacionFactura = fechaAnulacionFactura;
	}

}