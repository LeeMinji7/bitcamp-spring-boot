package shop.watchawiki.api.movies.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import shop.watchawiki.api.movies.domain.Movies;
import shop.watchawiki.api.movies.service.MoviesService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders ="*" )
@RequiredArgsConstructor
@RestController
@RequestMapping("/movies") // 어떤 테이블에서 가지고 올 거냐
public class MoviesController {
    private final MoviesService moviesService;

    @GetMapping("")
    public List<Movies> findAll(){
        return moviesService.findAll();
    }

    @PostMapping("")
    public void save(Movies movie){
        moviesService.save(movie);
    }

    @GetMapping("/count")
    public int count(){
        return moviesService.count();
    }

    @DeleteMapping("/{movieId}")
    public void deleteById(long movieId){
        moviesService.deleteById(movieId);
    }

    @GetMapping("/exists/{movieId}")
    public void existsById(@RequestParam long movieId){
        moviesService.existsById(movieId);
    }
    @GetMapping("/find/{movieId}")
    public Optional<Movies> findById(@RequestParam long movieId){
        return moviesService.findById(movieId);
    }
    @GetMapping("/{movieId}")
    public Movies getById(@RequestParam long movieId){
        return moviesService.getById(movieId);
    }
}
