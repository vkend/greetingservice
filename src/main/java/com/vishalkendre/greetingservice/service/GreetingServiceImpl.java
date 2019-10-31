package com.vishalkendre.greetingservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.vishalkendre.greetingservice.model.Visitor;
import com.vishalkendre.greetingservice.repository.VisitorRepository;

/**
 * Business logic implementation of {@link GreetingService}
 * 
 * @author vkendre
 *
 */
@Service
public class GreetingServiceImpl implements GreetingService {

	public static final String DEFAULT_WELCOME = "Welcome %s!";

	@Value("${greeting.message:" + DEFAULT_WELCOME + "}")
	private String greetingMessage;

	@Autowired
	VisitorRepository visitoryRepository;

	/**
	 * Returns a custom message to visitors based on first name and last name
	 * @param firstName
	 * @param lastName
	 * @return
	 */
	@Override
	public String getMessage(final String userFirst, final String userLast) {
		final String name = StringUtils.trimWhitespace(userFirst + (userLast == null ? "" : " " + userLast));
		findAndUpdateUser(userFirst, userLast);
		return String.format(greetingMessage, name);
	}

	/**
	 * Looks up for an existing user based on first name and last name. If not
	 * found, creates a new one. Updates the visitor count by 1
	 * 
	 * @param userFirst
	 * @param userLast
	 */
	private void findAndUpdateUser(final String userFirst, final String userLast) {
		Visitor visitor = visitoryRepository.findByUserFirstAndUserLast(userFirst, userLast);
		if (visitor == null) {
			visitor = new Visitor();
			visitor.setUserFirst(userFirst);
			visitor.setUserLast(userLast);
			visitor.setVisitCount(0);
		}
		visitor.setVisitCount(visitor.getVisitCount() + 1);
		visitoryRepository.save(visitor);
	}

}
