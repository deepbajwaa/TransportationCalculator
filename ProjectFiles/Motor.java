package ProjectFiles;

public class Motor extends Transportation {
	
	//instance variables
	boolean hasMotor;
	boolean hasWheels;
	
	public Motor(boolean isMovement, double distance, double time,boolean hasMotor,boolean hasWheels) {
		super(isMovement, distance, time);
		this.hasWheels = hasWheels; 
		this.hasMotor = hasMotor;
		
	}//closes constructor
	
	
}//closes class