package khpractice.api.repository;

import khpractice.api.entity.MovieDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MovieDetailRepository extends JpaRepository<MovieDetail, Long> {
}
