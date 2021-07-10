package shop.watchawiki.api.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.watchawiki.api.movies.domain.Movies;

public interface MoviesRepository extends JpaRepository<Movies, Long> {
}
