package com.vishalkendre.greetingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vishalkendre.greetingservice.dto.VisitorStats;
import com.vishalkendre.greetingservice.service.StatisticsService;

/**
 * REST service implementation to fetch statistical information associated with
 * the application
 * 
 * @author vkendre
 *
 */
@RestController
public class StatisticsController {

	@Autowired
	StatisticsService statisticsService;

	/**
	 * 
	 * @return latest visitor statistics based on the structure of
	 *         {@link VisitorStats}
	 */
	@GetMapping(path = "/visitorstats", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<VisitorStats> getStatistics() {
		return new ResponseEntity<>(statisticsService.getVisitorStatistics(), HttpStatus.OK);
	}
}
