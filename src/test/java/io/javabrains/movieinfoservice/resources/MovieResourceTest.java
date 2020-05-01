package io.javabrains.movieinfoservice.resources;

import static org.junit.jupiter.api.Assertions.*;

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


		
	}

}
