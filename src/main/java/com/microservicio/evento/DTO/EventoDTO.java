package com.microservicio.evento.DTO;

import java.util.Date;

public class EventoDTO  {

	private int idEvento;
	private String nombre;
	private String descripCorta;
	private String descripExt;
	private Date fechaEvento;
	private String horaEvento;
	private String politicaAccess;
	private RecintoDTO recinto;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripCorta() {
		return descripCorta;
	}
	public int getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
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
	public RecintoDTO getRecinto() {
		return recinto;
	}
	public void setRecinto(RecintoDTO recinto) {
		this.recinto = recinto;
	}
	public EventoDTO(int idEvento, String nombre, String descripCorta, String descripExt, Date fechaEvento, String horaEvento,
			String politicaAccess, RecintoDTO recinto) {
		super();
		this.nombre = nombre;
		this.descripCorta = descripCorta;
		this.descripExt = descripExt;
		this.fechaEvento = fechaEvento;
		this.horaEvento = horaEvento;
		this.politicaAccess = politicaAccess;
		this.recinto = recinto;
	}
	
	public EventoDTO() {
		super();
	}
	
	@Override
	public String toString() {
		return "EventoDTO [idEvento=" + idEvento + ", nombre=" + nombre + ", descripCorta=" + descripCorta
				+ ", descripExt=" + descripExt + ", fechaEvento=" + fechaEvento + ", horaEvento=" + horaEvento
				+ ", politicaAccess=" + politicaAccess + ", recinto=" + recinto + "]";
	}

	
	
}
