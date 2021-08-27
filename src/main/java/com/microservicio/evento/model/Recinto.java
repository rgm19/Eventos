package com.microservicio.evento.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class Recinto implements Serializable{

	@Id
	private static final long serialVersionUID = 1L;
	private int idRecinto;
	private String nombre;
	private String lugar;
	private String direccion;
	private int aforo;
	
	public Recinto(int idRecinto, String nombre, String lugar, String direccion, int aforo) {
		super();
		this.idRecinto = idRecinto;
		this.nombre = nombre;
		this.lugar = lugar;
		this.direccion = direccion;
		this.aforo = aforo;
	}
	
	public Recinto(){}

	public int getIdRecinto() {
		return idRecinto;
	}

	public void setIdRecinto(int idRecinto) {
		this.idRecinto = idRecinto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getAforo() {
		return aforo;
	}

	public void setAforo(int aforo) {
		this.aforo = aforo;
	}

	@Override
	public String toString() {
		return "Recinto [idRecinto=" + idRecinto + ", nombre=" + nombre + ", lugar=" + lugar + ", direccion="
				+ direccion + ", aforo=" + aforo + "]";
	}
	
	
}
