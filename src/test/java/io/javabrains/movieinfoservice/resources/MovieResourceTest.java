package io.javabrains.movieinfoservice.resources;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

import io.javabrains.movieinfoservice.models.Movie;
import io.javabrains.movieinfoservice.models.MovieSummary;


@RunWith(MockitoJUnitRunner.class)
class MovieResourceTest {

	@Rule public MockitoRule rule = MockitoJUnit.rule();
	
	MovieResource movie = Mockito.mock(MovieResource.class);
	
	@Test
	void testGetMovieInfo() {
		
		String movieId = "1";
		MovieSummary movieSummary = new MovieSummary(movieId, "Home Alone " + movieId, "Thiefs and kid");
		Movie expected = new Movie(movieId, movieSummary.getTitle(), movieSummary.getOverview());
		
		when(movie.getMovieInfo(eq(movieId)))
			.thenReturn(new Movie(movieId, movieSummary.getTitle(), movieSummary.getOverview()));

		assertEquals(expected.getDescription(), movie.getMovieInfo(movieId).getDescription());
		assertEquals(expected.getMovieId(), movie.getMovieInfo(movieId).getMovieId());
		assertEquals(expected.getName(), movie.getMovieInfo(movieId).getName());
		
	}

}
