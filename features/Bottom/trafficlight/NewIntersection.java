package trafficlight;


/**
 * TODO description
 */
public class NewIntersection {
	
	
	public void enqueueVehicle(Road road) {
		original(road);
		if (road.toString() =="BOTTOM") {
			numVehiclesbottom ++;	
		}

	}
	

	
	public  String getIntersectionState() {

		String original = original();
	return   original + " "+ "BV" + bottomUpLight + numVehiclesbottom;
	}
	
}