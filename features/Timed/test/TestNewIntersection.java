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
	void testChangeLightLR() {
		NewIntersection NewInter = new NewIntersection();
		String curr = NewInter.light;
		for (int i = 0; i < 10; i++) {
			NewInter.advanceTime();
			}
		
		Assertions.assertNotEquals(curr, NewInter.light);
		
	}

}