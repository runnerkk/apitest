package khpractice.api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
public class MovieDetail {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

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

    @ManyToMany
    private List<Genre> genres;

    @ManyToMany
    private List<ProductionCompany> ProductionCompanies;

    @ManyToMany
    private List<ProductionCountry> ProductionCountries;

    @ManyToMany
    private List<SpokenLanguage> SpokenLanguages;
}
