package test; 


import  org.junit.jupiter.api.Assertions; 

import org.junit.jupiter.api.Test; 

import trafficlight.NewIntersection; 
import trafficlight.Road; 

/**
 * TODO description
 */
public   class  TestNewIntersection {
	
	

	
	@Test
	 private void  testgetIntersectionState__wrappee__Base() {
		NewIntersection NewInter = new NewIntersection();
		String actual = NewInter.getIntersectionState();
		String expected = "g";
		Assertions.assertTrue(actual.contains(expected));
		
	}

	
	
	@Test
	 private void  testgetIntersectionState__wrappee__Left() {
		testgetIntersectionState__wrappee__Base();
		NewIntersection NewInter = new NewIntersection();
		String actual = NewInter.getIntersectionState();
		String expected = "LVg" + (NewInter.numVehiclesleft);
		Assertions.assertTrue(actual.contains(expected));
		
	}

	
	
	@Test
	 private void  testgetIntersectionState__wrappee__Right() {
		testgetIntersectionState__wrappee__Left();
		NewIntersection NewInter = new NewIntersection();
		String actual = NewInter.getIntersectionState();
		String expected = "RVg" + (NewInter.numVehiclesright);
		Assertions.assertTrue(actual.contains(expected));
		
	}

	
	
	@Test
	 private void  testgetIntersectionState__wrappee__Bottom() {
		testgetIntersectionState__wrappee__Right();
		NewIntersection NewInter = new NewIntersection();
		String actual = NewInter.getIntersectionState();
		String expected = "BVr" + (NewInter.numVehiclesbottom);
		Assertions.assertTrue(actual.contains(expected));
		
	}

	
	
	@Test
	void testgetIntersectionState() {
		testgetIntersectionState__wrappee__Bottom();
		NewIntersection NewInter = new NewIntersection();
		String actual = NewInter.getIntersectionState();
		String expected = "TVr" + (NewInter.numVehiclestop);
		Assertions.assertTrue(actual.contains(expected));
		
	}

	
	
	@Test
	 private void  testenqueueVehicle__wrappee__Left() {
		NewIntersection NewInter = new NewIntersection();
		int curr = NewInter.numVehiclesleft;
		NewInter.enqueueVehicle(Road.LEFT);
		Assertions.assertEquals(curr+1, NewInter.numVehiclesleft);
		
	}

	
	
	@Test
	 private void  testenqueueVehicle__wrappee__Right() {
		testenqueueVehicle__wrappee__Left();
		NewIntersection NewInter = new NewIntersection();
		int curr = NewInter.numVehiclesright;
		NewInter.enqueueVehicle(Road.RIGHT);
		Assertions.assertEquals(curr+1, NewInter.numVehiclesright);
		
	}

	
	
	@Test
	 private void  testenqueueVehicle__wrappee__Bottom() {
		testenqueueVehicle__wrappee__Right();
		NewIntersection NewInter = new NewIntersection();
		int curr = NewInter.numVehiclesbottom;
		NewInter.enqueueVehicle(Road.BOTTOM);
		Assertions.assertEquals(curr+1, NewInter.numVehiclesbottom);
		
	}

	
	
	@Test
	void testenqueueVehicle() {
		testenqueueVehicle__wrappee__Bottom();
		NewIntersection NewInter = new NewIntersection();
		int curr = NewInter.numVehiclestop;
		NewInter.enqueueVehicle(Road.TOP);
		Assertions.assertEquals(curr+1, NewInter.numVehiclestop);
		
	}

	
	
	@Test
	 private void  testadvanceTime__wrappee__Left() {
		NewIntersection NewInter = new NewIntersection();
		int curr = NewInter.time;
		NewInter.advanceTime();
		Assertions.assertEquals(curr+1, NewInter.time);
		
	}

	
	
	@Test
	 private void  testadvanceTime__wrappee__Right() {
		testadvanceTime__wrappee__Left();
		NewIntersection NewInter = new NewIntersection();
		int curr = NewInter.time;
		NewInter.advanceTime();
		Assertions.assertEquals(curr+1, NewInter.time);
		
	}

	
	
	@Test
	 private void  testadvanceTime__wrappee__Bottom() {
		testadvanceTime__wrappee__Right();
		NewIntersection NewInter = new NewIntersection();
		int curr = NewInter.time;
		NewInter.advanceTime();
		Assertions.assertEquals(curr+1, NewInter.time);
		
	}

	
	
	@Test
	void testadvanceTime() {
		testadvanceTime__wrappee__Bottom();
		NewIntersection NewInter = new NewIntersection();
		int curr = NewInter.time;
		NewInter.advanceTime();
		Assertions.assertEquals(curr+1, NewInter.time);
		
	}

	
	
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
