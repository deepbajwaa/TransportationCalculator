package ProjectFiles;

public class Skateboard extends Active{
	//instance variables
	boolean hasFourWheels;
	
	
	
	public Skateboard(boolean isMovement, double distance, double time, boolean humanPowered, boolean noMotors,boolean hasFourWheels) {
		super(isMovement, distance, time, humanPowered, noMotors);
		// TODO Auto-generated constructor stub
		this.hasFourWheels = hasFourWheels;
	
	}//closes constructor
	
	
	public static double travelTime(double distance){
		//Used to determine how long it takes to bike and skateboard
		double skatingTime = (distance/0.26);
		
		skatingTime = Math.round(skatingTime);
	
		return skatingTime;
		
		
		
		
		
	}//closes method
	

	
	
	
	
}//closes class
