package com.example.web;

import static org.hamcrest.Matchers.hasSize;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import com.example.demo.SbJunitApplication;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SbJunitApplication.class)
@SpringBootTest
public class MovieControllerTest {

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext wac;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();

	}

	@Test
	public void veriFyAllMovie() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/movies/movie").accept(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$", hasSize(5)));
	}

	@Test
	public void verifyMovieById() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/movies/movie/1").accept(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.id").exists()).andExpect(jsonPath("$.name").exists())
				.andExpect(jsonPath("$.genre").exists());

	}

	@Test
	public void verifyInvalidMovieArgument() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/movies/movie/0").accept(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.errorCode").value(400)).andExpect(jsonPath("$.message")
						.value("The request could not be understood by the server due to malformed syntax."));
	}

	
	@Test
	public void verifySaveMovie() throws Exception {
		
		
		
		mockMvc.perform(MockMvcRequestBuilders.post("/movies/amovie")
		        .contentType(MediaType.APPLICATION_JSON)
		        .content("{\"id\" : \"5\", \"name\" : \"naal\", \"genre\" : \"drama\" }")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.id").exists())
				.andExpect(jsonPath("$.name").exists())
				.andExpect(jsonPath("$.genre").exists())
				.andExpect(jsonPath("$.name").value("naal"))
				.andExpect(jsonPath("$.genre").value("drama"));
			}
	
	
	@Test
	public void verifyUpdateMovie() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.patch("/movies/movie")
        .contentType(MediaType.APPLICATION_JSON)
        .content("{\"id\" : \"5\", \"name\" : \"naal1\", \"genre\" : \"drama1\" }")
        .accept(MediaType.APPLICATION_JSON))
		.andExpect(jsonPath("$.id").exists())
		.andExpect(jsonPath("$.name").exists())
		.andExpect(jsonPath("$.genre").exists())
		.andExpect(jsonPath("$.id").value(5))
		.andExpect(jsonPath("$.name").value("naal1"))
		.andExpect(jsonPath("$.genre").value("drama1"));
	}
	
	/*
	 * @Test public void verifyNullMovie() throws Exception {
	 * mockMvc.perform(MockMvcRequestBuilders.get("/movies/movie/10").accept(
	 * MediaType.APPLICATION_JSON)) .andExpect(jsonPath("$.status").value(404))
	 * .andExpect(jsonPath("$.message").value("Movie with 10not found")); }
	 */

	/*
	 * @Test public void verifyDeleteMovie() throws Exception {
	 * mockMvc.perform(MockMvcRequestBuilders.delete("/movies/movie/4").accept(
	 * MediaType.APPLICATION_JSON)) .andExpect(jsonPath("$.status").value(200))
	 * .andExpect(jsonPath("$.message").value("Movie has been deleted")); }
	 */
}
