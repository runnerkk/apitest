package khpractice.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import khpractice.api.entity.MovieDetail;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MovieDetailDTO {

    @JsonProperty("backdrop_path")
    private String backdropPath;
    private String homePage;
    @JsonProperty("imdb_id")
    private String imdbId;
    @JsonProperty("original_language")
    private String originalLanguage;
    @JsonProperty("original_title")
    private String originalTitle;
    private String overview;
    private Double popularity;
    @JsonProperty("poster_path")
    private String posterPath;
    @JsonProperty("release_date")
    private String releaseDate;
    private String status;
    private String tagline;
    private String title;
    @JsonProperty("vote_average")
    private Double voteAverage;
    private int runtime;
    private int budget;
    @JsonProperty("vote_count")
    private int voteCount;
    private boolean video;
    private boolean adult;
}

