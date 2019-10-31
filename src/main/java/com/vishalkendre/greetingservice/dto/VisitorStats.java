package com.vishalkendre.greetingservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.vishalkendre.greetingservice.model.Visitor;

/**
 * 
 * A pojo class for returning visitor statistics
 * @author vkendre
 *
 */
public class VisitorStats {
	Long totalVisits = 0l;
	List<String> visitorFirstNames = new ArrayList<>();
	List<String> visitorLastNames = new ArrayList<>();
	List<Visitor> visitors;
	public Long getTotalVisits() {
		return totalVisits;
	}
	public void setTotalVisits(Long totalVisits) {
		this.totalVisits = totalVisits;
	}
	public List<String> getVisitorFirstNames() {
		return visitorFirstNames;
	}
	public void setVisitorFirstNames(List<String> visitorFirstNames) {
		this.visitorFirstNames = visitorFirstNames;
	}
	public List<String> getVisitorLastNames() {
		return visitorLastNames;
	}
	public void setVisitorLastNames(List<String> visitorLastNames) {
		this.visitorLastNames = visitorLastNames;
	}
	public List<Visitor> getVisitors() {
		return visitors;
	}
	public void setVisitors(List<Visitor> visitors) {
		this.visitors = visitors;
	}
}