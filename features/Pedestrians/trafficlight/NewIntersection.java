package trafficlight;

/**
 * TODO description
 */

public class NewIntersection {


	public  void enqueuePedestrian(Road road) {

		if (road.toString() =="LEFT") {
			numPedleft++;	
		}
		if (road.toString() =="RIGHT") {
			numPedright++;	
		}
		if (road.toString() =="BOTTOM") {
			numPedbottom++;	
		}
		if (road.toString() =="TOP") {
			numPedtop++;	
		}
	}
	public  String getIntersectionState() {
		if (light =="r") {
			PedLight = "g";
		}
		else if (light =="g") {
			PedLight = "r";
		}

		String original = original();
		String[] arr = original.split("\\s+");
		if (arr.length == 2) {
			return   arr[0]+"P"+PedLight+numPedleft +" " + arr[1]+"P"+PedLight+numPedright;
		}
		else {
			return   arr[0]+"P"+PedLight+numPedleft +" " + arr[1]+"P"+PedLight+numPedright + " " + arr[2]+"P"+light+numPedbottom + " " + arr[3]+"P"+light+numPedtop;
		}

	}



}