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
	void testenqueuePed() {
		NewIntersection NewInter = new NewIntersection();
		int curr = NewInter.numPedleft;
		NewInter.enqueuePedestrian(Road.LEFT);
		Assertions.assertEquals(curr+1, NewInter.numPedleft);
		
	}
	
	@Test
	void testgetIntersectionState() {
		original();
		NewIntersection NewInter = new NewIntersection();
		String actual = NewInter.getIntersectionState();
		String expected = "Pr" + (NewInter.numPedleft);
		Assertions.assertTrue(actual.contains(expected));
	}


}