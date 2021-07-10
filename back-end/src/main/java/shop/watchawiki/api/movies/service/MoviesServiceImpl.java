package shop.watchawiki.api.movies.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.watchawiki.api.movies.domain.Movies;
import shop.watchawiki.api.movies.repository.MoviesRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MoviesServiceImpl implements MoviesService{
    private final MoviesRepository moviesRepository;

    public List<Movies> findAll(){
        return moviesRepository.findAll();
    }
    @Override
    public void save(Movies movie){
        moviesRepository.save(movie);
    }
    @Override
    public int count(){
        return (int)moviesRepository.count();
    }
    @Override
    public void deleteById(long movieId){
        moviesRepository.deleteById(movieId);
    }
    @Override
    public void existsById(long movieId){
        moviesRepository.existsById(movieId);
    }
    @Override
    public Optional<Movies> findById(long movieId){
        return moviesRepository.findById(movieId);
    }
    @Override
    public Movies getById(long movieId){
        return moviesRepository.getById(movieId);
    }
}
