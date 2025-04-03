package khpractice.api.controller;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class MovieDetailController {

    private static final String API_KEY = "eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI2NDNlYmU4OWEzMTRmNzljMGY4NTk3NmM2NTg2ODY3MCIsIm5iZiI6MTc0MzYwNTY1Ny42NTEsInN1YiI6IjY3ZWQ0Zjk5Yjk0MjRjZDg5NWFiMDMwNCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.7HAGO-xJ0247pRVgIAmgjbtNmHf5OBxH1P6ABFol804";
    private static final String BASE_URL = "https://api.themoviedb.org/3/movie/";

    private static final OkHttpClient client = new OkHttpClient();

    @GetMapping("/movie/detail/{movie_id}")
    public String getMovieDetail(@PathVariable("movie_id") String movieId) {

        String url = BASE_URL + movieId + "?api_key=" + API_KEY;

        Request request = new Request.Builder()
                .url(url)
                .get()
                .addHeader("accept", "application/json")
                .addHeader("Authorization", "Bearer " + API_KEY)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful() && response.body() != null) {
                return response.body().string();  // 정상 응답 반환
            } else {
                return "API 요청 실패: 응답 코드 " + response.code();  // 실패한 경우, 상태 코드 반환
            }
        } catch (IOException e) {
            return "API 요청 중 오류 발생: " + e.getMessage();  // 예외 발생 시 오류 메시지 반환
        }
    }
}
