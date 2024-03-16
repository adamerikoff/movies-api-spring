package dev.ae.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> getAllMovies(){
        return this.movieRepository.findAll();
    }

    public Optional<Movie> getSingleMovie(String imdbdId){
        return this.movieRepository.findMovieByImdbId(imdbdId);
    }
}
