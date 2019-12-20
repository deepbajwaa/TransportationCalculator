package ProjectFiles;

public class Taxi extends Car {

	//Declare arrays that will be used throughout the class
	static double [] taxiPrices = {4.25,1.25,4.25,1.77};
	static String [] taxiServices = {"A-1 Taxi (Base $4.25 +  $1.25 per km)"+" Kwik Cab( First 100 meters: $4.25 + $1.77 per km)"};
		
		public Taxi(boolean isMovement, double distance, double time, boolean hasMotor, boolean hasWheels, int amountOfDoors, int mpg) {
			
			super(isMovement, distance, time, hasMotor, hasWheels, amountOfDoors, mpg);

			
		}//closes constructor
		
		
		public static double aTaxi(int distance){
			//gets the price of A1 Taxi
			double aTaxi = (distance*(taxiPrices[1]))+taxiPrices[0];
			return aTaxi;
			
		}//closes method
		
		
		public static double kwikKab(int distance){
			//gets the price of kwikKab
			double kwikKab = (distance*(taxiPrices[3]))+taxiPrices[2];
			return kwikKab;
			
		}//closes method	
		
	

}//closes class
