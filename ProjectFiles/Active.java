package ProjectFiles;

public class Active extends Transportation {
	//instance variables
	boolean humanPowered;
	boolean noMotors;
	
	public Active(boolean isMovement, double distance, double time, boolean humanPowered, boolean noMotors) {
		super(isMovement, distance, time);
		this.humanPowered = humanPowered;
		this.noMotors = noMotors;
		
	}//closes constructor
	
	
	public static double walkTime(int distance){
	//Determines how long it takes to walk
		
		double walkTime = (distance/0.083);
		
		
		walkTime = Math.round(walkTime);
		
		return walkTime;
		
		
		
	}//closes method
	
	
	
	
}//closes class