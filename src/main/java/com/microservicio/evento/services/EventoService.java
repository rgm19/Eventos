package com.microservicio.evento.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.evento.DTO.EventoDTO;
import com.microservicio.evento.interfaces.IEventoService;
import com.microservicio.evento.mapper.EventoMapper;
import com.microservicio.evento.model.Evento;
import com.microservicio.evento.repository.EventoRepository;

@Service
public class EventoService implements IEventoService {

	@Autowired
	private EventoRepository eventoRepository;
	
	@Autowired
	private EventoMapper mapper;
	
	@Override
	public EventoDTO getEventoById(int idEvento) {
		return mapper.eventoToEventoDTO(eventoRepository.findById(idEvento).orElse(null));
	}

	@Override
	public List<EventoDTO> getAll() {
		return mapper.listaEventoToListaEventoDTO((List<Evento>) eventoRepository.findAll());
	}

	@Override
	public String altaEvento(EventoDTO c) {
		eventoRepository.save(mapper.eventoDtoToEvento(c));
		return "Dado de alta correctamente";
	}

	@Override
	public String editarEvento(EventoDTO c) {
		eventoRepository.save(mapper.eventoDtoToEvento(c));
		return "Editado correctamente";
	}

	@Override
	public String borrarEvento(int idEvento) {
		eventoRepository.delete(mapper.eventoDtoToEvento(getEventoById(idEvento)));		
		return "Eliminado correctamente";
	}

}
