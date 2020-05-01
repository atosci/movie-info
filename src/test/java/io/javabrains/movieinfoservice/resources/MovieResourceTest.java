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
	
	MovieResource movie = Mockito.mock(MovieResource.class);
	
	@Test
	void testGetMovieInfo() {

		String expected = movie.getMovieInfo("titanic");
		String actual = movie.getMovieInfo("titanic");

		Gson gson = new Gson();

		Movie movieExpected = gson.fromJson(expected, Movie.class);
		Movie movieActual = gson.fromJson(actual, Movie.class);

		when(movie.getMovieInfo(eq(movieExpected.getTitle())))
				.thenReturn(String.valueOf(new Movie(movieExpected.getTitle(), movieExpected.getPlot(), movieExpected.getYear(),
						movieExpected.getGenre(), movieExpected.getDirector(), movieExpected.getActors())));

		assertEquals(movieExpected.getTitle(), movieActual.getTitle());
		assertEquals(movieExpected.getPlot(), movieActual.getPlot());
	}

}
