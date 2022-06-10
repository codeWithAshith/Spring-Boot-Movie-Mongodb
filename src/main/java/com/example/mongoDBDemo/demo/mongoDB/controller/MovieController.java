package com.example.mongoDBDemo.demo.mongoDB.controller;

import com.example.mongoDBDemo.demo.mongoDB.model.Movie;
import com.example.mongoDBDemo.demo.mongoDB.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
            movieService.createMovie(movie);
            return new ResponseEntity("Added Successfully " + movie.getTitle(), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getMovies() {
        return new ResponseEntity(movieService.getAllMovies(), HttpStatus.OK);

    }

    @PutMapping("/{id}")
    public ResponseEntity updateMovie(@PathVariable Long id, @RequestBody Movie movie) {
        movieService.updateMovie(id, movie);
        return new ResponseEntity("Updated Successfully " + movie.getTitle(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteMovie(@PathVariable Long id) {
        movieService.deleteMovieById(id);
        return new ResponseEntity("Deleted movie with id "+id, HttpStatus.OK);
    }
}
