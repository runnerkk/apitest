package khpractice.api.dto;

import khpractice.api.entity.MovieDetail;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MovieDetailDTO {

    private String backdropPath;
    private String homePage;
    private String imdbId;
    private String originalLanguage;
    private String overview;
    private Double popularity;
    private String posterPath;
    private String releaseDate;
    private String status;
    private String tagline;
    private String title;
    private Double voteAverage;
    private int runtime;
    private int budget;
    private int voteCount;
    private boolean video;
    private boolean adult;
}

