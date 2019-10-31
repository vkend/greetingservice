package com.vishalkendre.greetingservice.dto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.vishalkendre.greetingservice.model.Visitor;

/**
 * 
 * A pojo class for returning visitor statistics
 * @author vkendre
 *
 */
public class VisitorStats {
	Long totalVisits = 0l;
	Set<String> visitorFirstNames = new HashSet<>();
	Set<String> visitorLastNames = new HashSet<>();
	List<Visitor> visitors;
	public Long getTotalVisits() {
		return totalVisits;
	}
	public void setTotalVisits(Long totalVisits) {
		this.totalVisits = totalVisits;
	}
	public Set<String> getVisitorFirstNames() {
		return visitorFirstNames;
	}
	public void setVisitorFirstNames(Set<String> visitorFirstNames) {
		this.visitorFirstNames = visitorFirstNames;
	}
	public Set<String> getVisitorLastNames() {
		return visitorLastNames;
	}
	public void setVisitorLastNames(Set<String> visitorLastNames) {
		this.visitorLastNames = visitorLastNames;
	}
	public List<Visitor> getVisitors() {
		return visitors;
	}
	public void setVisitors(List<Visitor> visitors) {
		this.visitors = visitors;
	}
}
