package com.microservicio.evento.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.microservicio.evento.DTO.EventoDTO;
import com.microservicio.evento.DTO.RecintoDTO;
import com.microservicio.evento.model.Evento;
import com.microservicio.evento.model.Recinto;

public class EventoMapper {

	public List<EventoDTO> listaEventoToListaEventoDTO (List<Evento> listaEvento){
		
		List<EventoDTO> listaEventoDTO = new ArrayList();
		
		if(listaEvento.isEmpty()) {
			for(Evento evento: listaEvento) {
				listaEventoDTO.add(eventoToEventoDTO(evento));
			}
		}
		return listaEventoDTO;
	}
	
	public EventoDTO eventoToEventoDTO(Evento evento) {
		EventoDTO dto = new EventoDTO();
		
		if(StringUtils.isNotBlank(Integer.toString(evento.getIdEvento()))) {
			dto.setIdEvento(evento.getIdEvento());
		}
		if(StringUtils.isNotBlank(evento.getNombre())) {
			dto.setNombre(evento.getNombre());
		}
		if(StringUtils.isNotBlank(evento.getDescripCorta())) {
			dto.setDescripCorta(evento.getDescripCorta());
		}
		if(StringUtils.isNotBlank(evento.getDescripExt())) {
			dto.setDescripExt(evento.getDescripExt());
		}
		if(StringUtils.isNotBlank(evento.getFechaEvento().toString())) {
			dto.setFechaEvento(evento.getFechaEvento());
		}
		if(StringUtils.isNotBlank(evento.getHoraEvento())) {
			dto.setHoraEvento(evento.getHoraEvento());
		}				
		if(StringUtils.isNotBlank(evento.getPoliticaAccess())) {
			dto.setPoliticaAccess(evento.getPoliticaAccess());
		}
		if(evento.getRecinto() != null) {
			RecintoDTO recintoDTO = new RecintoDTO();
			
			if(StringUtils.isNotBlank(Integer.toString(evento.getRecinto().getIdRecinto()))) {
				recintoDTO.setIdRecinto(evento.getRecinto().getIdRecinto());
			}
			
			if(StringUtils.isNotBlank(evento.getRecinto().getNombre())) {
				recintoDTO.setNombre(evento.getRecinto().getNombre());
			}
			
			if(StringUtils.isNotBlank(evento.getRecinto().getDireccion())) {
				recintoDTO.setDireccion(evento.getRecinto().getDireccion());
			}
			
			if(StringUtils.isNotBlank(evento.getRecinto().getLugar())) {
				recintoDTO.setLugar(evento.getRecinto().getLugar());
			}
			
			if(StringUtils.isNotBlank(Integer.toString(evento.getRecinto().getAforo()))) {
				recintoDTO.setAforo(evento.getRecinto().getAforo());
			}
			
			dto.setRecinto(recintoDTO);
		}
		return dto;
	}
	
	public Evento eventoDtoToEvento(EventoDTO eventoDTO) {
		Evento evento = new Evento();
		
		if(StringUtils.isNotBlank(Integer.toString(eventoDTO.getIdEvento()))) {
			evento.setIdEvento(eventoDTO.getIdEvento());
		}
		if(StringUtils.isNotBlank(eventoDTO.getNombre())) {
			evento.setNombre(eventoDTO.getNombre());
		}
		if(StringUtils.isNotBlank(eventoDTO.getDescripCorta())) {
			evento.setDescripCorta(eventoDTO.getDescripCorta());
		}
		if(StringUtils.isNotBlank(eventoDTO.getDescripExt())) {
			evento.setDescripExt(eventoDTO.getDescripExt());
		}
		if(StringUtils.isNotBlank(eventoDTO.getFechaEvento().toString())) {
			evento.setFechaEvento(eventoDTO.getFechaEvento());
		}
		if(StringUtils.isNotBlank(eventoDTO.getHoraEvento())) {
			evento.setHoraEvento(eventoDTO.getHoraEvento());
		}				
		if(StringUtils.isNotBlank(eventoDTO.getPoliticaAccess())) {
			evento.setPoliticaAccess(eventoDTO.getPoliticaAccess());
		}
		if(eventoDTO.getRecinto() != null) {
			Recinto recinto = new Recinto();
			
			if(StringUtils.isNotBlank(Integer.toString(eventoDTO.getRecinto().getIdRecinto()))) {
				recinto.setIdRecinto(eventoDTO.getRecinto().getIdRecinto());
			}
			
			if(StringUtils.isNotBlank(eventoDTO.getRecinto().getNombre())) {
				recinto.setNombre(eventoDTO.getRecinto().getNombre());
			}
			
			if(StringUtils.isNotBlank(eventoDTO.getRecinto().getDireccion())) {
				recinto.setDireccion(eventoDTO.getRecinto().getDireccion());
			}
			
			if(StringUtils.isNotBlank(eventoDTO.getRecinto().getLugar())) {
				recinto.setLugar(eventoDTO.getRecinto().getLugar());
			}
			
			if(StringUtils.isNotBlank(Integer.toString(eventoDTO.getRecinto().getAforo()))) {
				recinto.setAforo(eventoDTO.getRecinto().getAforo());
			}
			
			evento.setRecinto(recinto);
		}
		return evento;
	}
	
	public List<Evento> listaEventoDtoToListaEvento (List<EventoDTO> listaEventoDTO){
		
		List<Evento> listaEvento = new ArrayList();
		
		if(listaEventoDTO.isEmpty()) {
			for(EventoDTO eventoDTO: listaEventoDTO) {
				listaEvento.add(eventoDtoToEvento(eventoDTO));
			}
		}
		return listaEvento;
	}
}
