package ProjectFiles;

public class Uber extends Car {
	
	static double[][] uberPrices = { {2.50,5.00,5.00,8.00,15.00},{0.81,1.55,1.80,2.70,2.70} };

	static String [] uberOptions = {"UberX (Base $2.50 +  $0.81 per km)","UberXL (Base $5.00 +  $1.55 per km)","UberSELECT (Base $5.00 +  $1.80 per km)","UberBLACK (Base $8.00 +  $2.70 per km)", "UberSUV (Base $15.00 +  $2.80 per km)"};


	public Uber(boolean isMovement, double distance, double time, boolean hasMotor, boolean hasWheels, int amountOfDoors, int mpg) {
		super(isMovement, distance, time, hasMotor, hasWheels, amountOfDoors, mpg);

		
	}//closes constructor
	
	
	public static double uberX(int distance){
		//gets price for uberX
		
		double uberX = (distance*(uberPrices[1][0]))+uberPrices[0][0];
		return uberX;
		
	}//closes constructor
	
	public static double uberXL(int distance){
		//gets price for uberXL

		double uberXL = (distance*(uberPrices[1][1]))+uberPrices[0][1];
		return uberXL;
		
	}//closes constructor
	
	public static double uberSelect(int distance){
		//gets price for uberSelect

		double uberSelect = (distance*(uberPrices[1][2]))+uberPrices[0][2];
		return uberSelect;
		
	}//closes constructor
	
	public static double uberBlack(int distance){
		//gets price for uberBlack
		
		double uberBlack = (distance*(uberPrices[1][3]))+uberPrices[0][3];
		return uberBlack;
		
	}//closes constructor
	
public static double uberSUV(int distance){
	//gets price for uberSUV

		double uberSUV = (distance*(uberPrices[1][4]))+uberPrices[0][4];
		return uberSUV;

		
	}//closes constructor
	
	
	
	
}//closes class
