package com.microservicio.evento.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.microservicio.evento.model.Recinto;

@Repository
public interface RecintoRepository extends MongoRepository<Recinto, Integer> {

}
