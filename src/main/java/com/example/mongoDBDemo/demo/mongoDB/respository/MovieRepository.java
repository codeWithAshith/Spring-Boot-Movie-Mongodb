package com.example.mongoDBDemo.demo.mongoDB.respository;

import com.example.mongoDBDemo.demo.mongoDB.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface MovieRepository extends MongoRepository<Movie, Long> {

}
