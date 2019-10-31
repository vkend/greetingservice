package com.vishalkendre.greetingservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishalkendre.greetingservice.dto.VisitorStats;
import com.vishalkendre.greetingservice.model.Visitor;
import com.vishalkendre.greetingservice.repository.VisitorRepository;

/**
 * Implements {@link StatisticsService}
 * 
 * @author vkendre
 *
 */
@Service
public class StatisticsServiceImpl implements StatisticsService {

	@Autowired
	VisitorRepository visitoryRepository;

	/**
	 * return {@link VisitorStats} object containing latest visitor statistics
	 */
	@Override
	public VisitorStats getVisitorStatistics() {
		final VisitorStats visitorStats = new VisitorStats();
		final List<Visitor> visitors = visitoryRepository.findAll();
		visitors.forEach(visitor -> {
			visitorStats.setTotalVisits(visitorStats.getTotalVisits() + visitor.getVisitCount());
			visitorStats.getVisitorFirstNames().add(visitor.getUserFirst());
			if(visitor.getUserLast() != null) visitorStats.getVisitorLastNames().add(visitor.getUserLast());
		});
		visitorStats.setVisitors(visitors);
		return visitorStats;
	}

}
