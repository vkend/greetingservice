package com.vishalkendre.greetingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vishalkendre.greetingservice.service.GreetingService;

/**
 * 
 * REST Controller class for sending messages to users
 * 
 * @author vkendre
 *
 */
@RestController
public class GreetingController {

	@Autowired
	GreetingService greetingService;

	/**
	 * Returns a string message implemented within {@link GreetingService} 
	 * 
	 * @param userFirst User first name
	 * @param userLast User last name
	 * @return greeting message
	 */
	@GetMapping(path = "/greeting", produces = MediaType.TEXT_PLAIN_VALUE)
	public String greeting(@RequestParam(value = "userFirst") String userFirst,
			@RequestParam(value = "userLast", required=false) String userLast) {

		return greetingService.getMessage(userFirst, userLast);
	}

}
