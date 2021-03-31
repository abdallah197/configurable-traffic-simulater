package test;


import  org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import trafficlight.NewIntersection;
import trafficlight.Road;

/**
 * TODO description
 */
public class TestNewIntersection {
	

	
	@Test
	void testgetIntersectionState() {
		NewIntersection NewInter = new NewIntersection();
		String actual = NewInter.getIntersectionState();
		String expected = "g";
		Assertions.assertTrue(actual.contains(expected));
		
	}
	

	

}