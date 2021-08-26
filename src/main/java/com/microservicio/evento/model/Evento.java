package com.microservicio.evento.model;

import java.io.Serializable;
import java.util.Date;

public class Evento implements Serializable {

	private static final long serialVersionUID = 1L;

	private int idEvento;
	private String nombre;
	private String descripCorta;
	private String descripExt;
	private Date fechaEvento;
	private String horaEvento;
	private String politicaAccess;
	private Recinto recinto;
	
	public int getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripCorta() {
		return descripCorta;
	}
	public void setDescripCorta(String descripCorta) {
		this.descripCorta = descripCorta;
	}
	public String getDescripExt() {
		return descripExt;
	}
	public void setDescripExt(String descripExt) {
		this.descripExt = descripExt;
	}
	public Date getFechaEvento() {
		return fechaEvento;
	}
	public void setFechaEvento(Date fechaEvento) {
		this.fechaEvento = fechaEvento;
	}
	public String getHoraEvento() {
		return horaEvento;
	}
	public void setHoraEvento(String horaEvento) {
		this.horaEvento = horaEvento;
	}
	public String getPoliticaAccess() {
		return politicaAccess;
	}
	public void setPoliticaAccess(String politicaAccess) {
		this.politicaAccess = politicaAccess;
	}
	public Recinto getRecinto() {
		return recinto;
	}
	public void setRecinto(Recinto recinto) {
		this.recinto = recinto;
	}
	public Evento(int idEvento, String nombre, String descripCorta, String descripExt, Date fechaEvento, String horaEvento,
			String politicaAccess, Recinto recinto) {
		super();
		this.nombre = nombre;
		this.descripCorta = descripCorta;
		this.descripExt = descripExt;
		this.fechaEvento = fechaEvento;
		this.horaEvento = horaEvento;
		this.politicaAccess = politicaAccess;
		this.recinto = recinto;
	}
	public Evento() {
		super();
	}
	@Override
	public String toString() {
		return "Evento [idEvento=" + idEvento + ", nombre=" + nombre + ", descripCorta=" + descripCorta
				+ ", descripExt=" + descripExt + ", fechaEvento=" + fechaEvento + ", horaEvento=" + horaEvento
				+ ", politicaAccess=" + politicaAccess + ", recinto=" + recinto + "]";
	}

	
	
}
