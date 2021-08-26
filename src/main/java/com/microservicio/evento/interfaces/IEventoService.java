package com.microservicio.evento.interfaces;

import java.util.List;

import com.microservicio.evento.DTO.EventoDTO;

public interface IEventoService {

	public EventoDTO getEventoById(int idEvento);
	public List<EventoDTO> getAll();
	public String altaEvento(EventoDTO c);
	public String editarEvento(EventoDTO c);
	public String borrarEvento(int idEvento);
}
