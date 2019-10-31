package com.vishalkendre.greetingservice.controller;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.StringUtils;

import com.vishalkendre.greetingservice.service.GreetingServiceImpl;

@SpringBootTest
@AutoConfigureMockMvc
class GreetingControllerTest {

	@Autowired
	MockMvc mockMvc;

	@Test
	public void basicGreetingTest() throws Exception {
		String userFirst = "Vishal";
		String userLast = "Kendre";
		String greetingMessage = System.getProperty("greetingMessage") == null ? GreetingServiceImpl.DEFAULT_WELCOME
				: System.getProperty("greetingMessage");
		final String name = StringUtils.trimWhitespace(userFirst + " " + userLast);
		String expectedValue = String.format(greetingMessage, name);
		this.mockMvc.perform(get("/greeting").param("userFirst", userFirst).param("userLast", userLast))
				.andExpect(status().isOk()).andExpect(content().string(containsString(expectedValue)));
	}
}
