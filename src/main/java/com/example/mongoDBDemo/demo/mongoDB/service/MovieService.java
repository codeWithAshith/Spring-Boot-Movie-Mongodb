package com.example.mongoDBDemo.demo.mongoDB.service;

import com.example.mongoDBDemo.demo.mongoDB.model.Movie;
import com.example.mongoDBDemo.demo.mongoDB.respository.MovieRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public void createMovie(Movie movie) {
            movieRepository.save(movie);
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public void deleteMovieById(Long id){
            movieRepository.deleteById(id);
    }

    public void updateMovie(Long id, Movie newMovie)  {
            Movie movieToUpdate = newMovie;
            movieToUpdate.setId(id);
            movieRepository.save(movieToUpdate);

    }
}
