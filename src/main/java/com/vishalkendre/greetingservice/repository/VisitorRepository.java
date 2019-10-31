package com.vishalkendre.greetingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishalkendre.greetingservice.model.Visitor;

/**
 * Repository for performing CRUD operations using JPA for the {@link Visitor}
 * entity
 * 
 * @author vkendre
 *
 */
public interface VisitorRepository extends JpaRepository<Visitor, Long> {

	/**
	 * Looks up a visitor record by first name and last name
	 * @param userFirst
	 * @param userLast
	 * @return {@link Visitor} entity
	 */
	public Visitor findByUserFirstAndUserLast(String userFirst, String userLast);
}
