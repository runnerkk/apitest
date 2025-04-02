package khpractice.api.controller;

import khpractice.api.dto.MovieDetailDTO;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class MovieDeatilController {


    private final String API_KEY = "eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIxYTgwOWNhNjk1ZGM1MjNhNWVhZGRhMDE1NTlmNTMxNSIsIm5iZiI6MTc0MzQwODAxOS4wMTcsInN1YiI6IjY3ZWE0YjkzN2E3NTI5NGI3NmM2ZDEwNCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.e_2ALQjMwsQEaEAvzUTgRfKdYLsPJcMB9yleCP87Csc";
    private final String TMDB_URL = "https://api.themoviedb.org/3/movie/";

    @GetMapping("movie/detail/{movie_id}")
    public ResponseEntity<MovieDetailDTO> getMovieDetail(@PathVariable String movieId) {
        RestTemplate restTemplate = new RestTemplate();
        String url = TMDB_URL + movieId + "?api_key=" + API_KEY;

        HttpHeaders headers = new HttpHeaders();
        headers.set("accept", "application/json");
        headers.set("Authorization", "Bearer " + API_KEY);

        HttpEntity<String> request = new HttpEntity<>(headers);

        ResponseEntity<MovieDetailDTO> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                request,
                MovieDetailDTO.class
        );
        return ResponseEntity.ok(response.getBody());
    }
}
