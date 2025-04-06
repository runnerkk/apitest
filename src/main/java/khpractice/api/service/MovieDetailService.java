package khpractice.api.service;

import jakarta.transaction.Transactional;
import khpractice.api.dto.MovieDetailDTO;
import khpractice.api.entity.MovieDetail;
import khpractice.api.repository.MovieDetailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MovieDetailService {

    private final MovieDetailRepository movieDetailRepository;

    @Transactional
    public MovieDetail saveMovieDetail(MovieDetailDTO dto) {

        MovieDetail movieDetail = MovieDetail.builder()
                .adult(dto.isAdult())
                .backdropPath(dto.getBackdropPath())
                .budget(dto.getBudget())
                .homePage(dto.getHomePage())
                .imdbId(dto.getImdbId())
                .originalLanguage(dto.getOriginalLanguage())
                .originalTitle(dto.getOriginalTitle())
                //.overview(dto.getOverview())
                .popularity(dto.getPopularity())
                .releaseDate(dto.getReleaseDate())
                .revenue(dto.getRevenue())
                .runtime(dto.getRuntime())
                .status(dto.getStatus())
                .tagline(dto.getTagline())
                .title(dto.getTitle())
                .video(dto.isVideo())
                .voteAverage(dto.getVoteAverage())
                .voteCount(dto.getVoteCount())
                .build();

        return movieDetailRepository.save(movieDetail);
    }

    public List<MovieDetailDTO> getAllMovieDetails() {
        List<MovieDetail> movieDetail = movieDetailRepository.findAll();
        return movieDetail.stream()
                .map(MovieDetailDTO::fromEntity)
                .collect(Collectors.toList());
    }
}
