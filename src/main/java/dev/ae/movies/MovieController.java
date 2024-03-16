package dev.ae.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;
    @GetMapping("/")
    public ResponseEntity<List<Movie>> allMovies(){
        return new ResponseEntity<List<Movie>>(movieService.getAllMovies(), HttpStatus.OK);
    }
    @GetMapping("/{imdbdId}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbdId){
        return new ResponseEntity<Optional<Movie>>(this.movieService.getSingleMovie(imdbdId), HttpStatus.OK);
    }
}
