package trafficlight;

/**
 * TODO description
 */
public  class NewIntersection extends Intersection{
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
	
	

	public  void enqueueVehicle(Road road) {
 
	}
	public  void enqueuePedestrian(Road road) {
		
	}
	
	public  void advanceTime() {
		

	}
	
	public  String getIntersectionState() {
		
	return light;
	}
	
}