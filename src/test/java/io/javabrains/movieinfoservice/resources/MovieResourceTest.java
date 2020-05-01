package io.javabrains.movieinfoservice.resources;

import static org.junit.jupiter.api.Assertions.*;

import com.google.gson.Gson;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

import io.javabrains.movieinfoservice.models.Movie;


@RunWith(MockitoJUnitRunner.class)
class MovieResourceTest {

	@Rule public MockitoRule rule = MockitoJUnit.rule();
	
	@Test
	void testGetMovieInfo() {

		MovieResource movieResource = new MovieResource();

		String expected = "{\"Title\":\"Titanic\",\"Plot\":\"A seventeen-year-old aristocrat falls in love with a kind but poor artist aboard the luxurious, ill-fated R.M.S. Titanic.\",\"Year\":\"1997\",\"Genre\":\"Drama, Romance\",\"Director\":\"James Cameron\",\"Actors\":\"Leonardo DiCaprio, Kate Winslet, Billy Zane, Kathy Bates\"}";
		String actual = movieResource.getMovieInfo("titanic");

		Gson gson = new Gson();

		Movie movieExpected = gson.fromJson(expected, Movie.class);
		Movie movieActual = gson.fromJson(actual, Movie.class);

		assertEquals(movieExpected.getTitle(), movieActual.getTitle());
		assertEquals(movieExpected.getPlot(), movieActual.getPlot());
	}

}
