package trafficlight;

/**
 * TODO description
 */
public class NewIntersection {
	public  void advanceTime() {
		if (OrangeOn == "on") {
			original();
		}
		else {
			time ++;

			if (time % 10 == 0) {
				if (light == "g") {
					light = "r";
				}
				else {
					light = "g";
				}
			}
			if (light == "g") {
				bottomUpLight = "r";
			}
			else if (light == "r") {
				bottomUpLight = "g";
			}
		}
		if (light == "g") {
			if (numVehiclesleft > 0) {
				numVehiclesleft --;
			}
			if (numVehiclesright > 0) {
				numVehiclesright --;
			}
			
			if (numPedbottom > 0) {
				numPedbottom --;
			}
			if (numPedtop > 0) {
				numPedtop --;
			}
		}
		
		if (bottomUpLight == "g"  && ((numVehiclesbottom > 0 ) || (numVehiclestop> 0))) {
			if (numVehiclesbottom > 0) {
				numVehiclesbottom --;
			}
			if (numVehiclestop > 0) {
				numVehiclestop --;
			}
		}

		if (light == "r"  && ((numPedleft > 0 ) || (numPedright> 0))) {
			if (numPedleft > 0) {
				numPedleft --;
			}
			if (numPedright > 0) {
				numPedright --;
			}
		}

	}
}