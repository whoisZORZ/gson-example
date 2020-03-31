package movie;

import java.io.FileReader;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.net.URL;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

    public static void main(String[] args) throws Exception {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Movie movie = new Movie();
        movie.setTitle("Shrek");
        movie.setYear(2001);
        movie.setRating(new BigDecimal("7.8"));
        movie.setVotes(587180);
        movie.setGenres(List.of("animation", "adventure", "comedy"));
        movie.setUrl(new URL("https://www.imdb.com/title/tt0126029/"));

        System.out.println(gson.toJson(movie));

        try (FileWriter writer = new FileWriter("movie.json")) {
            gson.toJson(movie, writer);
        }
        System.out.println(gson.fromJson(new FileReader("movie.json"), Movie.class));
    }

}