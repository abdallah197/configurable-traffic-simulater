package trafficlight; 

/**
 * TODO description
 */
public   class  NewIntersection  extends Intersection {
	
	public int time  = 0;

	
	public int otime= 0;

	
	public int otimeBT= 0;

	
	public String light = "g";

	
	public String PedLight = "r";

	
	public String bottomUpLight = "r";

	
	public String OrangeOn = "off";

	
	public String OnDemandBT = "off";

	
	public String BTStatus = "init";

	
	public int OnRequestStarttime  = 9;

	
	public int OnRequestBTTimer = 9;

	
	public int OrangeBT= 0;

	
	public int numVehiclesleft = 0;

	
	public int statusLR = 0;

	
	public String prev;

	
	public String prevBT;

	
	public int statusBT = 0;

	
	public int OrangeBTCount= 0;

	
	public int numVehiclesright = 0;

	
	public int numPedleft = 0;

	
	public int numPedright = 0;

	
	public int numPedtop = 0;

	
	public int numPedbottom = 0;

	
	public int  numVehiclesbottom = 0;

	
	public int  numVehiclestop = 0;

	
	
	

	 private void  enqueueVehicle__wrappee__Base  (Road road) {
 
	}

	
	
	
	 private void  enqueueVehicle__wrappee__Left  (Road road) {
		enqueueVehicle__wrappee__Base(road);
		if (road.toString() =="LEFT") {
			numVehiclesleft ++;	
		}
	}

	
	
	 private void  enqueueVehicle__wrappee__Right  (Road road) {
			enqueueVehicle__wrappee__Left(road);
			if (road.toString() =="RIGHT") {
				numVehiclesright ++;	
			}

	}

	
	
	
	 private void  enqueueVehicle__wrappee__Bottom  (Road road) {
		enqueueVehicle__wrappee__Right(road);
		if (road.toString() =="BOTTOM") {
			numVehiclesbottom ++;	
		}

	}

	
	
	
	public void enqueueVehicle(Road road) {
		enqueueVehicle__wrappee__Bottom(road);
		if (road.toString() =="TOP") {
			numVehiclestop ++;	
		}
	}

	
	public  void enqueuePedestrian(Road road) {
		
	}

	
	
	 private void  advanceTime__wrappee__Base  () {
		

	}

	
	public  void advanceTime() {
		if (OrangeOn == "on") {
			advanceTime__wrappee__Base();
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

	
	
	 private String  getIntersectionState__wrappee__Base  () {
		
	return light;
	}

	
	

	
	 private String  getIntersectionState__wrappee__Left  () {
		String original = getIntersectionState__wrappee__Base();
	return   "LV" + original + numVehiclesleft;
	}

	

	
	 private String  getIntersectionState__wrappee__Right  () {
		String original = getIntersectionState__wrappee__Left();
	return   original + " " + "RV" + light+numVehiclesright;
	}

	
	

	
	 private String  getIntersectionState__wrappee__Bottom  () {

		String original = getIntersectionState__wrappee__Right();
	return   original + " "+ "BV" + bottomUpLight + numVehiclesbottom;
	}

	
	

	
	public  String getIntersectionState() {
		String original = getIntersectionState__wrappee__Bottom();

	return   original + " " + "TV" + bottomUpLight + numVehiclestop;
	}


}
