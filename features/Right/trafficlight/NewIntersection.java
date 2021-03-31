package trafficlight;


/**
 * TODO description
 */
public class NewIntersection {
	
	public void enqueueVehicle(Road road) {
			original(road);
			if (road.toString() =="RIGHT") {
				numVehiclesright ++;	
			}

	}

	
	public  String getIntersectionState() {
		String original = original();
	return   original + " " + "RV" + light+numVehiclesright;
	}
	
}