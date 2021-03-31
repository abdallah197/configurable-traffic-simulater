package trafficlight;


/**
 * TODO description
 */
public class NewIntersection {
	
	
	public void enqueueVehicle(Road road) {
		original(road);
		if (road.toString() =="LEFT") {
			numVehiclesleft ++;	
		}
	}
	

	
	public  String getIntersectionState() {
		String original = original();
	return   "LV" + original + numVehiclesleft;
	}
	
}