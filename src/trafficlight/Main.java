package trafficlight; 

import java.lang.IllegalArgumentException; 
import java.util.Scanner; 


public   class  Main {
	
	
	private static final String STEP = "step";

	
	private static final String STATE = "state";

	
	private static final String VEHICLE = "vehicle";

	
	
	/*
	 * Run simulation on intersection.
	 * 
	 * Read commands from stdin and print intersection state after each command.
	 */
	private void simulate() {
		Intersection intersection = Intersection.createIntersection();

		Scanner scanner = new Scanner(System.in);
		try {
		    while (scanner.hasNextLine()) {
			    handleInput(scanner.nextLine(), intersection);
		    }
		} finally {
			scanner.close();
		}
	}

	
	
	/*
	 * Handle input commands.
	 * 
	 * Commands:
	 * - step             -> advance simulation by one step
	 * - state            -> print the current intersection state
	 * - vehicle $road    -> enqueue vehicle on road
	 * 
	 * Note that the feature Pedestrian adds another command.
	 */
	private void handleInput(String input, Intersection intersection) {
		if (input.startsWith(VEHICLE)) {
			Road road = parseRoad(input.substring(VEHICLE.length()).trim());
			intersection.enqueueVehicle(road);
			return;
		}
		if (input.equals(STEP)) {
			intersection.advanceTime();
			return;
		}
		if (input.equals(STATE)) {
		    System.out.println(intersection.getIntersectionState());
			return;
		}
		throw new IllegalArgumentException("Cannot parse command: " + input);
	}

	
	
	 private Road  parseRoad__wrappee__Base  (String roadString) {
		throw new IllegalArgumentException("Cannot parse road: " + roadString);
	}

	
	
	 private Road  parseRoad__wrappee__Left  (String roadString) {
		if (roadString.equals(LEFT)) {
			return Road.LEFT;
		}
		return parseRoad__wrappee__Base(roadString);
	}

	
	
	 private Road  parseRoad__wrappee__Right  (String roadString) {
		if (roadString.equals(RIGHT)) {
			return Road.RIGHT;
		}
		return parseRoad__wrappee__Left(roadString);
	}

	
	
	 private Road  parseRoad__wrappee__Bottom  (String roadString) {
		if (roadString.equals(BOTTOM)) {
			return Road.BOTTOM;
		}
		return parseRoad__wrappee__Right(roadString);
	}

	
	
	private Road parseRoad(String roadString) {
		if (roadString.equals(TOP)) {
			return Road.TOP;
		}
		return parseRoad__wrappee__Bottom(roadString);
	}

	
	
	public static void main(String[] args) {
		new Main().simulate();
	}

	
	
	private static final String LEFT = "left";

	
	
	private static final String RIGHT = "right";

	
	
	private static final String BOTTOM = "bottom";

	
	
	private static final String TOP = "top";


}
