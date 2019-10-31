package com.vishalkendre.greetingservice.service;

import com.vishalkendre.greetingservice.dto.VisitorStats;

/**
 * Used to provide statistical information related to the application
 * @author vkendre
 *
 */
public interface StatisticsService {
	VisitorStats getVisitorStatistics();

}
