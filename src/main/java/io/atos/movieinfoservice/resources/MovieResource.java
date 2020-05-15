package io.atos.movieinfoservice.resources;

import com.google.gson.Gson;
import io.atos.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author Mohamed El Kawakibi
 * @author Puck School
 */
@RestController
@RequestMapping("/movies")
public class MovieResource {

    /** Get the information of the movie based on the movie title
     * @param movieTitle - the title of the movie you wish to review
     * @return JSON of Movie.class
     */
    @RequestMapping(path = "/{movieTitle}", method = GET)
    public String getMovieInfo(@PathVariable("movieTitle") String movieTitle) {

        RestTemplate restTemplate = new RestTemplate();

        String response = restTemplate.getForObject("http://www.omdbapi.com/?t=" + movieTitle + "&apikey=", String.class);

        Gson gson = new Gson();

        Movie movie = gson.fromJson(response, Movie.class);

        return gson.toJson(movie);

    }   

}
