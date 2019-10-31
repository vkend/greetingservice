package com.vishalkendre.greetingservice.service;

/**
 * Interface to implement business logic for Greeting visitors
 * @author vkendre
 *
 */
public interface GreetingService {

	/**
	 * Returns a custom message to visitors based on first name and last name
	 * @param firstName
	 * @param lastName
	 * @return
	 */
	String getMessage(String firstName, String lastName);

}
