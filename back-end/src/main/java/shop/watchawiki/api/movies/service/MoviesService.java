package shop.watchawiki.api.movies.service;

import shop.watchawiki.api.movies.domain.Movies;

import java.util.List;
import java.util.Optional;

public interface MoviesService {
    void save(Movies movie);
    List<Movies> findAll();
    void existsById(long movieId);
    int count();
    Optional<Movies> findById(long movieId);
    Movies getById(long movieId);
    void deleteById(long movieId);

}
