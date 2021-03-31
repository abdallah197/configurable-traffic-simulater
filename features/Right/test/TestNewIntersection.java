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
	void testenqueueVehicle() {
		original();
		NewIntersection NewInter = new NewIntersection();
		int curr = NewInter.numVehiclesright;
		NewInter.enqueueVehicle(Road.RIGHT);
		Assertions.assertEquals(curr+1, NewInter.numVehiclesright);
		
	}
	
	@Test
	void testgetIntersectionState() {
		original();
		NewIntersection NewInter = new NewIntersection();
		String actual = NewInter.getIntersectionState();
		String expected = "RVg" + (NewInter.numVehiclesright);
		Assertions.assertTrue(actual.contains(expected));
		
	}
	
	@Test
	void testadvanceTime() {
		original();
		NewIntersection NewInter = new NewIntersection();
		int curr = NewInter.time;
		NewInter.advanceTime();
		Assertions.assertEquals(curr+1, NewInter.time);
		
	}

}