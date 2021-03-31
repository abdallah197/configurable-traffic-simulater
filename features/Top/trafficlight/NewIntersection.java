package trafficlight;


/**
 * TODO description
 */
public class NewIntersection {
	
	
	public void enqueueVehicle(Road road) {
		original(road);
		if (road.toString() =="TOP") {
			numVehiclestop ++;	
		}
	}
	

	
	public  String getIntersectionState() {
		String original = original();

	return   original + " " + "TV" + bottomUpLight + numVehiclestop;
	}
	
}