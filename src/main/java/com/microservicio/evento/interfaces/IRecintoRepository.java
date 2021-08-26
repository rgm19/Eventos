package com.microservicio.evento.interfaces;

import java.util.List;

import com.microservicio.evento.DTO.RecintoDTO;

public interface IRecintoRepository {

	public RecintoDTO getRecintoById(int idRecinto);
	public List<RecintoDTO> getAll();
	public String altaRecinto(RecintoDTO c);
	public String editarRecinto(RecintoDTO c);
	public String borrarRecinto(int idRecinto);
}
