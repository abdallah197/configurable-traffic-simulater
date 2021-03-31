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
		int curr = NewInter.numVehiclesbottom;
		NewInter.enqueueVehicle(Road.BOTTOM);
		Assertions.assertEquals(curr+1, NewInter.numVehiclesbottom);
		
	}
	
	@Test
	void testgetIntersectionState() {
		original();
		NewIntersection NewInter = new NewIntersection();
		String actual = NewInter.getIntersectionState();
		String expected = "BVr" + (NewInter.numVehiclesbottom);
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