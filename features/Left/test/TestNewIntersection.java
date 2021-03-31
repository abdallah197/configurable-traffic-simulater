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
		NewIntersection NewInter = new NewIntersection();
		int curr = NewInter.numVehiclesleft;
		NewInter.enqueueVehicle(Road.LEFT);
		Assertions.assertEquals(curr+1, NewInter.numVehiclesleft);
		
	}
	
	@Test
	void testgetIntersectionState() {
		original();
		NewIntersection NewInter = new NewIntersection();
		String actual = NewInter.getIntersectionState();
		String expected = "LVg" + (NewInter.numVehiclesleft);
		Assertions.assertTrue(actual.contains(expected));
		
	}
	
	@Test
	void testadvanceTime() {
		NewIntersection NewInter = new NewIntersection();
		int curr = NewInter.time;
		NewInter.advanceTime();
		Assertions.assertEquals(curr+1, NewInter.time);
		
	}
	


}