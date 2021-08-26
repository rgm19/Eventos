package com.microservicio.evento.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.microservicio.evento.model.Evento;

@Repository
public interface EventoRepository extends MongoRepository<Evento, Integer>{

}
