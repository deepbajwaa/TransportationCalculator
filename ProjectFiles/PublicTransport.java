package ProjectFiles;

public class PublicTransport extends Transportation {

	public PublicTransport(boolean hasMovement, double distance, double time ){
		super(hasMovement,distance,time);
		
	}//constructor

	//There are three methods each to hold the prompts for the goTrain, subway, and bus methods that will be called later on
	
	public static String[] goTrain(){
		
		String[] goTrain = {"The cost of the GO Train depends on how fare you are going.", "For now since this program is local to Brampton, "
				+ "if you need to go to Toronto (The closest major city)", "it would cost: \n"+ "Adult:	Single Pass: $9.15 		Day Pass: $18.30",
				"Student:	Single Pass: $9.15 		Day Pass: $18.30","Senior or Child:	Single Pass: $4.60 		Day Pass: $9.15"};
		
		return goTrain; 
				
		
	}//closes method
	
	
	public static String[] bus(){
		
		String[] bus = {"In Brampton every bus service whether it be Brampton Transit or", "ZUM costs the same price.", 
				"With Presto Card: $2.50 (every 2 hours)","Without Presto Card: $3.75 (every 2 hours)"};
		
		return bus;
			
		
	}//closes method
	
	
	public static String[] subway(){
		
		String[] subway = {"Currently there is no subway option in Brampton but if you were in ", "Toronto the prices would be ", 
				"Adult: Single Token: $3.00 	Presto Card: $3.00 	Single Fare Price: $3.25",
				"Without Presto Card: $3.75 (every 2 hours)",
				"Senior(65+) / Student(13-19): Single Token: $2.10 	Presto Card: $2.05 	Single Fare Price: $2.10"};
		
		
		return subway;
				
		
	}//closes method
		
	
}//closes class