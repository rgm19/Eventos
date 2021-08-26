package com.microservicio.evento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.evento.DTO.EventoDTO;
import com.microservicio.evento.interfaces.IEventoService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api")
public class EventoController {

	@Autowired
	private IEventoService eventoService;
	
	@GetMapping("/getEventoById/{idevento}")
	public EventoDTO getEventoById(@PathVariable("idevento") int idevento) {
		return eventoService.getEventoById(idevento);
	}

	@GetMapping("/getAll")
	public List<EventoDTO> getAll() {
		return eventoService.getAll();
	}

	@PostMapping("/altaEvento")
	public String altaEvento(@RequestBody EventoDTO evento) {
		return 	eventoService.altaEvento(evento);		
	}

	@PostMapping("/editarEvento")
	public String editarEvento(@RequestBody EventoDTO evento) {
		return 	eventoService.editarEvento(evento);		
	}

	@GetMapping("/borrarEvento/(idevento)")
	public String borrarEvento(@PathVariable("idevento") int idevento) {		
		return eventoService.borrarEvento(idevento);
	}
}
