package com.example.microservice.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.microservice.model.Atividade;

public interface AtividadeRepository extends MongoRepository<Atividade, String> {

}
