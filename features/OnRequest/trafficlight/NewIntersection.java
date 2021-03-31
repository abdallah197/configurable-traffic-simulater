package trafficlight;

/**
 * TODO description
 */
public class NewIntersection {

	public  void advanceTime() {
		if ((numVehiclesbottom > 0 ) || (numVehiclestop> 0)) {

			statusBT = 1;
			OnDemandBT  ="on";
		}

		if (OrangeOn == "on") {
			
			time ++;				
			if (time >= 10 && OnDemandBT == "on") {
				OnRequestStarttime ++;
				OnRequestBTTimer ++;
			}
			//treat btlight the same 

			//handling of main light
			if (light == "o") {
				otime ++;
				if (otime % 2 ==0) {
					OnRequestStarttime = 0;
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
					if (OnRequestStarttime >= 10 && OnRequestStarttime % 14 == 0) {
						light = "o";
					}
				}
				else {
					if (OnRequestStarttime >= 10 && OnRequestStarttime % 10 == 0) {
						light = "o";
					}
				}

			}
			
			//handling of btlight
			
			// first case we put BTLight as a fix pattern	
			if (otime  % 2 == 0 && OnRequestStarttime ==0  && BTStatus =="init"){
				bottomUpLight = "o";
				prevBT = "r";
				BTStatus = "default" ; 
			}
			 // from here on it gets treated as the default pattern 
			else if (BTStatus == "default") {
				if (bottomUpLight == "o") {
					otimeBT ++;
					if (otimeBT % 2 ==0) {
						OnRequestBTTimer = 0;
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
						if (OnRequestBTTimer >= 10 && OnRequestBTTimer % 14 == 0) {
							bottomUpLight = "o";
						}
					}
					else {
						if (OnRequestBTTimer >= 10 && OnRequestBTTimer % 10 == 0) {
							bottomUpLight = "o";
						}
					}

				}
				
			}
			
		}
		
		//

		else {

			time ++;
			if (time >= 10 && OnDemandBT == "on") {
				OnRequestStarttime ++;
			}
			if (OnRequestStarttime >= 10 && OnRequestStarttime % 10 == 0) {
				if (light == "g") {
					light = "r";
				}
				else {
					light = "g";
				}
			}
			if (otime % 2 ==0 && otime > 0 && OnRequestStarttime <2) {
				bottomUpLight = "o";
			}
			else if (light == "g") {
				bottomUpLight = "r";
			}
			else if (light == "r") {
				bottomUpLight = "g";
			}

		}

		if ((numVehiclesleft > 0) || (numVehiclesright > 0)) {
			statusLR = 1;
		}

		if (light == "g" && statusLR == 1) {
			if (numVehiclesleft > 0) {
				statusLR = 0;
				numVehiclesleft --;
			}
			if (numVehiclesright > 0) {
				statusLR = 0;
				numVehiclesright --;
			}
		}

		if ((numPedleft > 0 ) || (numPedright> 0) || (numVehiclesbottom > 0) || (numVehiclestop > 0)) {
			statusBT = 1;
		}

		if(light == "r" && statusBT ==1) {
			if (numPedleft > 0) {
				statusBT = 0;
				numPedleft --;
			}
			if (numPedright > 0) {
				statusBT = 0;
				numPedright --;
			}
		}






		if(bottomUpLight == "g" && statusBT ==1) {
			if (numVehiclesbottom > 0) {
				statusBT = 0;
				numVehiclesbottom --;
			}
			if (numVehiclestop > 0) {
				statusBT = 0;
				numVehiclestop --;
			}
		}
	}
}