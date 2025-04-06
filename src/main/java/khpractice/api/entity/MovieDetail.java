package khpractice.api.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "movie_detail")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovieDetail {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private boolean adult;
    private String backdropPath;
    private int budget;
    private String homePage;
    private String imdbId;
    private String originalLanguage;
    private String originalTitle;
    private String overview;
    private Double popularity;
    private String posterPath;
    private String releaseDate;
    private int revenue;
    private int runtime;
    private String status;
    private String tagline;
    private String title;
    private boolean video;
    private Double voteAverage;
    private int voteCount;

    @ManyToMany
    private List<Genre> genres;

    @ManyToMany
    private List<ProductionCompany> ProductionCompanies;

    @ManyToMany
    private List<ProductionCountry> ProductionCountries;

    @ManyToMany
    private List<SpokenLanguage> SpokenLanguages;
}
