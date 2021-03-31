package trafficlight;

/**
 * TODO description
 */
public class NewIntersection {
 
	
	public String OrangeOn = "on";
	public  void advanceTime() {
		time ++;
		if (light == "o") {
			otime ++;
			if (otime % 2 ==0) {
				time = 0;
				if (prev == "g") {
					light = "r";
				}
				else if (prev == "r"){
					light = "g";
				}
			}
		}

		else {

			prev = light;
			if (light == "r") {
				if (time % 14 == 0) {
					light = "o";
				}
			}
			else {
				if (time % 10 == 0) {
					light = "o";
				}
			}

		}

		//
		if (otime  % 2 == 0 && time ==0  && BTStatus =="init"){
			bottomUpLight = "o";
			prevBT = "r";
			BTStatus = "default" ; 
		}
		// from here on it gets treated as the default pattern 
		else if (BTStatus == "default") {
			OrangeBT ++;
			if (bottomUpLight == "o") {
				otimeBT ++;
				if (otimeBT % 2 ==0) {
					OrangeBT = 0;
					if (prevBT == "g") {
						bottomUpLight = "r";
					}
					else if (prevBT == "r"){
						bottomUpLight = "g";
					}
				}
			}

			else {


				prevBT = bottomUpLight;

				if (bottomUpLight == "r") {
					if (OrangeBT % 14 == 0) {
						bottomUpLight = "o";
					}
				}
				else {
					if (OrangeBT % 10 == 0) {
						bottomUpLight = "o";
					}
				}

			}

		}

	}	
}








