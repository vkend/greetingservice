package com.vishalkendre.greetingservice.controller;

import org.springframework.stereotype.Controller;

import springfox.documentation.annotations.ApiIgnore;

/**
 * MVC Controller for loading home page
 * 
 * @author vkendre
 *
 */
@Controller
@ApiIgnore
public class HomeController {

	/**
	 * 
	 * Launches home page which in turn makes a webservice call to swagger api for
	 * fetching currently available REST services
	 * 
	 * @return home page
	 */
	public String getHomePage() {
		return "home";
	}
}
