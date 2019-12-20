package ProjectFiles;

public class Transportation {
	//instance variables
	boolean hasMovement; 
	static double distance;
	double time; //in minutes
	
	
	public Transportation(boolean hasMovement, double distance, double time ){
		this.hasMovement = hasMovement;
		this.distance = distance;
		this.time = time;
		
	}//constructor
	
	
	public static String[] Intro1(){
		//This is used to hold the introduction to the program
		
		String[] intro = {"Welcome to Efficient Transportation v2!!! ","This application is all about choosing the most efficent transportation method",
				"while still being economically friendly. Pollution is a big issue when it comes","to transportation, and this application aims to help reduce pollution by encourging",
				"users like you to choose the most efficient and eco - friendly option of transportation","(depending on the distance you are planning on travelling). Earth is a beautiful place",
				" and it would be selfish of us to destroy the planet and leave our mess behind for","the generations to come after us, so lets take action now!!! Enough talking",
				"now on to the application!!!","NOTE: THIS APPLICATION IS LOCAL TO BRAMPTON, ONTAIRO"};
		return intro;
		
		
	}//closes intro1
	
	
	
	
	
	
}//closes transportation class
