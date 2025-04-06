package khpractice.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import khpractice.api.entity.Genre;
import khpractice.api.entity.MovieDetail;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieDetailDTO {

    private boolean adult;
    @JsonProperty("backdrop_path")
    private String backdropPath;
    private int budget;
    @JsonProperty("homepage")
    private String homePage;
    @JsonProperty("imdb_id")
    private String imdbId;
    @JsonProperty("original_language")
    private String originalLanguage;
    @JsonProperty("original_title")
    private String originalTitle;
    //private String overview;
    private Double popularity;
    @JsonProperty("poster_path")
    private String posterPath;
    @JsonProperty("release_date")
    private String releaseDate;
    private int revenue;
    private int runtime;
    private String status;
    private String tagline;
    private String title;
    private boolean video;
    @JsonProperty("vote_average")
    private Double voteAverage;
    @JsonProperty("vote_count")
    private int voteCount;

    public static MovieDetailDTO fromEntity(MovieDetail movieDetail) {
        MovieDetailDTO dto = new MovieDetailDTO();

        dto.setAdult(movieDetail.isAdult());
        dto.setBackdropPath(movieDetail.getBackdropPath());
        dto.setBudget(movieDetail.getBudget());
        dto.setHomePage(movieDetail.getHomePage());
        dto.setImdbId(movieDetail.getImdbId());
        dto.setOriginalLanguage(movieDetail.getOriginalLanguage());
        dto.setOriginalTitle(movieDetail.getOriginalTitle());
        //dto.setOverview(movieDetail.getOverview());
        dto.setPopularity(movieDetail.getPopularity());
        dto.setPosterPath(movieDetail.getPosterPath());
        dto.setReleaseDate(movieDetail.getReleaseDate());
        dto.setRevenue(movieDetail.getRevenue());
        dto.setRuntime(movieDetail.getRuntime());
        dto.setStatus(movieDetail.getStatus());
        dto.setTagline(movieDetail.getTagline());
        dto.setTitle(movieDetail.getTitle());
        dto.setVideo(movieDetail.isVideo());
        dto.setVoteAverage(movieDetail.getVoteAverage());
        dto.setVoteCount(movieDetail.getVoteCount());
        return dto;
    }
}

