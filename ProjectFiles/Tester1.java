package ProjectFiles;
import java.awt.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*; 
import java.util.*; 
public class Tester1 {
	/*
	 * Name: Simrandeep Bajwa
	 * Date: January 12,2018
	 * Purpose: To create a program that gives you the most efficient transportation distance based on the distance entered. The program incourages the user to chose a 
	 * method of transportation that is the least detrimental to the environmental
	 */
	
	//NOTE: RECURSIVE MEAN NEEDS TO BE FIXED AND ADD IMAGES AND DATA IS NOT SAVING
	
	
	//Declare all variables that will be used throughout the program
	static int distance;
	static int num;
	static int dataPieces;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		title();
		optionsMenu();
		Introduction();
		stats();
		
	}//closes main
	
	
	public static void title(){
		JFrame window = new JFrame("Efficient Transportation v2!!! Please click out of the screen to continuue!!! ");
		//window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon image = new ImageIcon("G:\\Downloads\\BMW.jpg");
		JLabel label = new JLabel(image);
		window.add(label);
		window.setSize(800, 250);
		window.setVisible(true);
		}
	
	
	public static void Introduction(){
		//This method gives the user an introduction to the program
		
		
		//makes a call to the transportation call
		Transportation object1 = new Transportation(true,5,2);
		
		//An array is created to hold the introduction
		String [] intro = object1.Intro1();
		
		//A new window is created and its size is instantiated
		JFrame programIntro = new JFrame("Introduction");
		programIntro.setSize(600, 350);
		//A new panel is created and its size is instantiated
		JPanel panel = new JPanel();
		//add picture
	//	ImageIcon image = new ImageIcon("G:\\Downloads\\BMW.jpg");
	//	JLabel pic = new JLabel(image);
	//	pic.setBounds(100,300,200,200);
		
		
		//A new JTextArea is created to print the introduction out
        final JTextArea infoBar;//new TextArea
        infoBar = new JTextArea();//Set size, adds String "Hi"
        
        //add elements to the panel
        panel.add(infoBar);
       // panel.add(pic);
        
        //add the panel to the window
        programIntro.add(panel);
        programIntro.setVisible(true);
        
        
			for(int index = 0; index<intro.length;index++){//a for loop is used to print out the introduction paragraph 
				
				infoBar.append(intro[index]+ "\n");
				try {
					  Thread.sleep(2000); //1000 milliseconds is one second
					} catch (InterruptedException ie) {
					    //Handle exception
					}
				
			}//closes for loop
			
			try {
				  Thread.sleep(15000); //1000 milliseconds is one second
				} catch (InterruptedException ie) {
				    //Handle exception
				}
			
			programIntro.setVisible(false);
				
	
	}//closes method
	
	
	
	
	public static void publicTransport(){
		//This method tells the user about all the public transportation options there are in Brampton,ON
		
		
		
		final JFrame publicTransport = new JFrame("Public Transportation Options");//A new window is created and its size is instantiated
		publicTransport.setSize(600, 200);
		
		//A new panel is created
		JPanel panel = new JPanel();
		
		panel.setLayout(null);//Allows elements like JButton to be added
	
		JLabel method = new JLabel("Chose a method of public transportation!!!");//A new label is created to tell the user to chose a method of public transport
		method.setFont(new Font("Times New Roman", Font.PLAIN, 12)); //changes font
		method.setForeground(Color.GREEN);//changes font's color
		method.setBounds(80,20,500,40); //its size
       
	    
	    JButton bus = new JButton("Bus"); //creates a button and choses its position and dimensions
	    bus.setBounds(80,70,100,50);
	    
	    JButton subway = new JButton("Subway"); //creates a button and choses its position and dimensions
	    subway.setBounds(215,70,100,50);
	    
	    JButton goTrain = new JButton("Go Train"); //creates a button and choses its position and dimensions
	    goTrain.setBounds(350,70,100,50);
	    
	    
	    //add elements to the panel
	    panel.add(bus);
	    panel.add(goTrain);
	    panel.add(subway);
	    panel.add(method);
        
	    //add panel to the window
	    publicTransport.add(panel);
        
        //So the user can see the window
	    publicTransport.setVisible(true);
        
        
        
        
    
        //an actionListen is used to give the button functionality
       bus.addActionListener(new ActionListener()
    		   {
    	   		
    	   public void actionPerformed(ActionEvent ev)
    	   {
    		   //makes the window invisible 
    		   publicTransport.setVisible(false); 
    		 bussing();
    				
    				
    	   		}//
    	   
    	   
    	   
    		   });//closes actionListner
       
      subway.addActionListener(new ActionListener()
	   {
   		
   public void actionPerformed(ActionEvent ev)
   {
	   //makes the window invisible 
	   publicTransport.setVisible(false); 
	 subway();
			
			
   		}//
   
   
   
	   });//closes actionListner
       
       
       goTrain.addActionListener(new ActionListener()
	   {
   		
   public void actionPerformed(ActionEvent ev)
   {
	   //makes the window invisible 
	   publicTransport.setVisible(false); 
	 goTrain();
			
			
   		}//
   
   
   
	   });//closes actionListner
        
        
		
	}//closes options menu
	
	
	
	public static void bussing(){
		//This method gives information about bussing in Brampton, ON
		
		//Creates an object from the PublicTransport class
		PublicTransport object1 = new PublicTransport(true,5,2);
		
		//sets the array bussing to the method(returns a string array) bus in the PublicTransport class
		String [] bussing = object1.bus();
		
		final JFrame busMenu = new JFrame("Bussing");//A new window is created and its size is instantiated
		busMenu.setSize(600, 300);
		
		
		JPanel panel = new JPanel();//A new panel is created
		
		panel.setLayout(null);//Allows elements like JButton to be added
			
        final JTextArea bussingInfo;//new TextArea
        bussingInfo = new JTextArea();//Set size, adds String "Hi"
        bussingInfo.setBounds(100,70,380,100);//set the size and position
        
        
        JButton exit = new JButton("Exit!!!");
        exit.setBounds(230,190,100,50);//set the size and position
        //adds elements onto the panel
        panel.add(bussingInfo);
        panel.add(exit);
        
      //adds panel onto the window
        busMenu.add(panel);
 
        
        exit.addActionListener(new ActionListener()
		   {
	   		
	   public void actionPerformed(ActionEvent ev)
	   {
		   optionsMenu();
		   busMenu.setVisible(false);
		   
	   }//
	   
	   
	   
		   });//closes actionListener
        
        //makes the window visible
        busMenu.setVisible(true);
        
			
			for(int index = 0; index<bussing.length;index++){ //used to print out the string array
								
					bussingInfo.append(bussing[index] + "");//prints the array onto the text field
				
				
				
				bussingInfo.append("\n");
				
			
			}//closes for loop
		
			
			//makes the window invisible
			
			//busMenu.setVisible(false);
				
		
		
		
	}//close method
	
	
	
public static void subway(){
	//This method gives information about the subway in Brampton, ON
	//Creates an object from the PublicTransport class
		PublicTransport object1 = new PublicTransport(true,5,2);
		
		//sets the array subway to the method(returns a string array) subway in the PublicTransport class
		String [] subway = object1.subway();
		 
		final JFrame subwayMenu = new JFrame("Subway"); //A new window is created and its size is instantiated
		subwayMenu.setSize(600, 300);
		
		
		JPanel panel = new JPanel();//creates a new panel
		
		panel.setLayout(null);//Allows elements like JButton to be added
		
        final JTextArea subwayInfo;//new TextArea
        subwayInfo = new JTextArea();//Set size, adds String "Hi"
        subwayInfo.setBounds(50,70,500,100);
        
  
        
        JButton exit = new JButton("Exit!!!");
        exit.setBounds(230,190,100,50);//set the size and position
        //adds elements onto the panel
        panel.add(subwayInfo);
        panel.add(exit);
        
      //adds panel onto the window
        subwayMenu.add(panel);
 
        
        exit.addActionListener(new ActionListener()
		   {
	   		
	   public void actionPerformed(ActionEvent ev)
	   {
		   optionsMenu();
		   subwayMenu.setVisible(false);
		   
	   }//
	   
	   
	   
		   });//closes actionListener
        
        
        //makes the window visible
        subwayMenu.setVisible(true);
        
        for(int index = 0; index<subway.length;index++){ //used to print out the string array
			
			subwayInfo.append(subway[index] + "");//prints the array onto the text field
		
		
		
		subwayInfo.append("\n");
		
	
        }//closes for loop
			
		
	}//close method
	
	
	public static void goTrain(){
		//This method gives information about the subway in Brampton, ON
		//Creates an object from the PublicTransport class
	PublicTransport object1 = new PublicTransport(true,5,2);
	
	//sets the array goTrain to the method(returns a string array) goTrain in the PublicTransport class
	String [] goTrain = object1.goTrain();
	
	
	final JFrame goTrainMenu = new JFrame("GO Train");	//A new window is created and its size is instantiated
	goTrainMenu.setSize(600, 300);
	
	JPanel panel = new JPanel(); // adds a new panel
	
	
	//Allows elements like JButton to be added
	panel.setLayout(null);
	
	
    final JTextArea infoBar;//new TextArea
    infoBar = new JTextArea();//Set size, adds String "Hi"
    infoBar.setBounds(20,70,550,100);
   
    //add elements onto the panel
    panel.add(infoBar);
    
   
    
    
    JButton exit = new JButton("Exit!!!");
    exit.setBounds(230,190,100,50);//set the size and position
    //adds elements onto the panel
    panel.add(infoBar);
    panel.add(exit);
    
  //adds panel onto the window
    goTrainMenu.add(panel);
    
    exit.addActionListener(new ActionListener()
	   {
   		
   public void actionPerformed(ActionEvent ev)
   {
	   optionsMenu();
	   goTrainMenu.setVisible(false);
	   
   }//
   
   
   
	   });//closes actionListener
    
    
    
    
		
    for(int index = 0; index<goTrain.length;index++){ //used to print out the string array
		
		infoBar.append(goTrain[index] + "");//prints the array onto the text field
	
	
	
		infoBar.append("\n");
	
    }//closes for loop
	
		
    goTrainMenu.setVisible(true);
	
	
}//close method
	
	
public static void optionsMenu(){
	//This is the begging of the program, and it starts off by asking for far the user is going in kilometers, and then from there it progresses	
	
		final JFrame optionsMenu = new JFrame("Options");//A new window is created and its size is instantiated
		optionsMenu.setSize(600, 200);
		
		JPanel panel = new JPanel();//a new panel is created
		
		panel.setLayout(null);//Allows elements like JButton to be added
		
		
		JLabel askDis = new JLabel("How far are you travelling??? (PLEASE INPUT AN INTEGER!!!) (IN KILOMETERS)"); //Tells the user to enter in a distance
		 askDis.setFont(new Font("Times New Roman", Font.PLAIN, 12));//changes font
		 askDis.setForeground(Color.ORANGE);
		 
		askDis.setBounds(80,20,500,40);
		
		
        
		final JTextArea userRow;//new TextArea and set size
	    userRow = new JTextArea();
	    userRow.setBounds(80,70,200,40);
	    
	    
	    JButton input = new JButton("INPUT!!!");//creates new button and sets its size
	    input.setBounds(400,70,100,50);
	    
	    //add elements onto the panel
	    panel.add(input);
	    panel.add(userRow);
        panel.add(askDis);
        
        //add the panel to the menu
        optionsMenu.add(panel);
        
        //make the window visible
        optionsMenu.setVisible(true);
        
                
    
        //adds functionality to the button
       input.addActionListener(new ActionListener()
    		   {
    	   		
    	   public void actionPerformed(ActionEvent ev)
    	   {
    		   
    		   //Gives the user the appropriate response depending on what they enter
    		   
    		    if(!userRow.getText().equals("")){//if the user enters something
    	        	
    	        	int userVal = Integer.parseInt(userRow.getText());
    	        	distance = userVal; 
    	        	
    	        	if(userVal<0){
    	        		System.out.println("INVALID INPUT!!!");
    	        	}
    	        	else if(userVal==0){
    	        		System.out.println("You are already at your destination!!!");
    	        	}
    	        	else if(userVal>3){
    	        		
    	        		overThreeDis();
    	        		optionsMenu.setVisible(false);
    	        	}
    	        	else if(userVal<=3){
    	        		
    	        		lessThanThree();
    	        		optionsMenu.setVisible(false);
    	        		
    	        	}
    	        	
    	        }
    	   
    	   }//
    	   
    	   
    	   
    		   });//closes actionListener
        
        
        
		
	}//closes options menu
	public static void lessThanThree(){
		//Gives the user options if the distance they entered is less than 3 kilometers
		
		
		final JFrame lessThanThreeMenu = new JFrame("Distance less than 3 Kilometers"); //A new window is created and its size is instantiated
		lessThanThreeMenu.setSize(600, 330);
		
		JPanel panel = new JPanel();// a new panel is created
		
		//Allows elements like JButton to be added
		panel.setLayout(null);
		
		JLabel mode = new JLabel("Select a mode of transportation!!!");//Prompts the user to select a mode of transportation
		mode.setBounds(190,20,200,40);
		 mode.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));//changes font
		 mode.setForeground(Color.GREEN);
	
	    //creates buttons for each of the different options and creates its size
	    JButton bike = new JButton("Cycling");
	    bike.setBounds(320,80,190,70);
	    
	    JButton skate = new JButton("Skate Boarding");
	    skate.setBounds(50,80,190,70);
	    
	    JButton walk = new JButton("Walking");
	    walk.setBounds(185,190,190,70);
	    
	    
	    //adds elements onto the panel
	    panel.add(walk);
	    panel.add(bike);
	    panel.add(skate);
        panel.add(mode);
        
        //adds the panel onto the lessThanThreeMenu
        lessThanThreeMenu.add(panel);
        lessThanThreeMenu.setVisible(true);
		
        
        
        
        bike.addActionListener(new ActionListener(){
    		
   		 public void actionPerformed(ActionEvent ev)
   		 {
   			 //makes window invisible
   			 lessThanThreeMenu.setVisible(false);
   			 
   			 //creates an object called time of the bike Class
   			 Skateboard time = new Skateboard(true,1,1,true,true,true);
   			 
   			 //Creates a variable timeForDis to hold the amount of mins it takes to bike
   			 double timeForDis = time.travelTime(distance);
   			 
   			 //Tells user how long it would take to bike with a JLabel
   			JLabel mode = new JLabel("It would take you "+ timeForDis +" "
   					+ "minutes to bike!!!");
   			mode.setBounds(30,70,250,40);
   			mode.setFont(new Font("Comic Sans MS", Font.PLAIN, 12)); //changes font
   			mode.setForeground(Color.GREEN);//changes font's color
   			
   			
   			
   			mode.setFont(new Font("Comic Sans MS", Font.PLAIN, 12)); //changes font
   			mode.setForeground(Color.GREEN);//changes font's color
   		
   			final JFrame lessThanThreeMenu1 = new JFrame("Bike");//A new window is created and its size is instantiated
   			lessThanThreeMenu1.setSize(300, 300);
   			
   			JPanel panel = new JPanel();// a new panel is created
   			
   			//Allows elements like JButton to be added
   			panel.setLayout(null);
   			
   			//add elements onto the panel
   			panel.add(mode);
   			
   			//Add a button to allow the user to return to the optionsMenu
   			JButton exit = new JButton("Go to Options Menu!!!");
   			exit.setBounds(50,130,170,50);
   			panel.add(exit);
   			
   			
   		 
   	        exit.addActionListener(new ActionListener(){
   	    		
   	   		 public void actionPerformed(ActionEvent ev)
   	   		 {
   	   			 lessThanThreeMenu1.setVisible(false);
   	   			 
   				 optionsMenu();
   	   	
   	   	
   	   		 }
   	   		
   	   		
   	   		
   	   		
   	   });//closes action listener
   		    //add panel to the window
   	     lessThanThreeMenu1.add(panel);
   	     
   	     //makes window Visible
 	    lessThanThreeMenu1.setVisible(true);
   	
   	
   	
   		 }
   		
   		
   		
   		
   });//closes actionListener
        
        
        skate.addActionListener(new ActionListener(){
    		
      		 public void actionPerformed(ActionEvent ev)
      		 {
      			 //makes the window invisible
      			 lessThanThreeMenu.setVisible(false);
      			 
       			 //creates an object called time of the Skateboard Class
      			 Skateboard time = new Skateboard(true,1,1,true,true,true);
      			 
       			 //Creates a variable timeForDis to hold the amount of mins it takes to skateboard
      			 double timeForDis = time.travelTime(distance);
      			 
       			 //Tells user how long it would take to skate with a JLabel
      			JLabel skatePrompt = new JLabel("It would take you "+ timeForDis +" "
      					+ "minutes to skateboard!!!");
      			skatePrompt.setBounds(10,70,280,40);
      			skatePrompt.setFont(new Font("Comic Sans MS", Font.PLAIN, 12)); //changes font
      			skatePrompt.setForeground(Color.GREEN);//changes font's color
      			
      			//creates a new window 
      			final JFrame skateMenu = new JFrame("Skateboard!!!");
      			JPanel panel = new JPanel();
      			
      			//Allows elements like JButton to be added
      			panel.setLayout(null);
      			skateMenu.setSize(300, 300);
      			
      			//add elements to panel
      			panel.add(skatePrompt);
      			
      			//create a JButton to exit 
      			JButton exit = new JButton("Go to Options Menu!!!");
      			exit.setBounds(50,130,170,50);
      			
      			//adds elements to the panel
      			panel.add(exit);
      			
      			
      		 
      	        exit.addActionListener(new ActionListener(){
      	    		
      	   		 public void actionPerformed(ActionEvent ev)
      	   		 {
      	   			 skateMenu.setVisible(false);
      	   			 
      				 optionsMenu();
      	   	
      	   	
      	   		 }
      	   		
      	   		
      	   		
      	   		
      	   });//closes action listener
      	        
      	        //adds panel to the window
      	     skateMenu.add(panel);
      	     
      	     //makes window visible
    	    skateMenu.setVisible(true);
      	
      	
      	
      		 }
      		
      		
      		
      		
      });//closes actionListener
        
        
        
        walk.addActionListener(new ActionListener(){
    		
     		 public void actionPerformed(ActionEvent ev)
     		 {
     			 //makes the window invisible
     			 lessThanThreeMenu.setVisible(false);
     			
     			 //calls an object of the Active class
     			Active time = new Active(true,1,1,true,true);
     			 
     			//a variable timeForDis is used to hold the time it takes to walk in mins
     			 double timeForDis = time.walkTime(distance);
     			 
     			 //a JLabel is used to tell the user how long it takes to walk
     			JLabel mode = new JLabel("It would take you "+ timeForDis +" "
     					+ "minutes to walk!!!");
     			mode.setBounds(10,70,280,40);
     			mode.setFont(new Font("Comic Sans MS", Font.PLAIN, 12)); //changes font
     			mode.setForeground(Color.GREEN);//changes font's color
     			
     			//creates a new window
     			final JFrame walkingMenu = new JFrame("Walking!!!");
     			walkingMenu.setSize(300, 300);
     			//creates a new panel
     			JPanel panel = new JPanel();
     			
     			//Allows elements like JButton to be added
     			panel.setLayout(null);
     			
   
     			//add a button to allow the user to exit
     			JButton exit = new JButton("Go to Options Menu!!!");
     			exit.setBounds(50,130,170,50);
     			
     			//add elements to the panel 
     			panel.add(exit);
     			panel.add(mode);
     			
     		 //add funtionality to the button
     	        exit.addActionListener(new ActionListener(){
     	    		
     	   		 public void actionPerformed(ActionEvent ev)
     	   		 {
     	   			 walkingMenu.setVisible(false);
     	   			 
     				 optionsMenu();
     	   	
     	   	
     	   		 }
     	   		
     	   		
     	   		
     	   		
     	   });//closes action listener
     	        //add the panel to the window
     	     walkingMenu.add(panel);
     	     
     	     //make the window visible
   	    walkingMenu.setVisible(true);
     	
     	
     	
     		 }
     		
     		
     		
     		
     });//closes actionListener
        
       
        
        
        
		
		
	}//closes method
		
	
	
	
	public static void overThreeDis(){
		//This method gives options if the distance that is entered is over 3 kilometers
		
		//creates a new window
		final JFrame distanceOver3 = new JFrame("Distance Over 3 Kilometers");
		distanceOver3.setSize(600, 300);
			
			//creates a new panel
		JPanel panel = new JPanel();
		
		//Allows elements like JButton to be added
		panel.setLayout(null);
	
		//prompt user to chose a transportation method
		JLabel mode = new JLabel("Select a mode of transportation!!!");
		mode.setBounds(190,20,200,40);
		mode.setFont(new Font("Times New Roman", Font.PLAIN, 12)); //changes font
		mode.setForeground(Color.GREEN);//changes font's color
	
	    //creates buttons to allow the user to input an action
	    JButton motor = new JButton("Lazy :( (Motor Transport)");
	    motor.setBounds(320,80,190,70);
	    
	    JButton active = new JButton("Active!!!");
	    active.setBounds(50,80,190,70);
	    
	    JButton publicTran = new JButton("Public Transport");
	    publicTran.setBounds(190,160,190,70);
	    
	    //add elements onto the panel
	    panel.add(active);
	    panel.add(motor);
	    panel.add(publicTran);
        panel.add(mode);
        
        //add panel to the window
        distanceOver3.add(panel);
        
        //set window visible
        distanceOver3.setVisible(true);
		
        //add functionality to button
        motor.addActionListener(new ActionListener(){
        		
        		 public void actionPerformed(ActionEvent ev)
        		 {
        			 distanceOver3.setVisible(false);
        			 motor();
        	
        	
        	
        		 }
        		
        		
        		
        		
        });//closes actionListener
        
       publicTran.addActionListener(new ActionListener(){
    		
   		 public void actionPerformed(ActionEvent ev)
   		 {
   			 distanceOver3.setVisible(false);
   			 publicTransport();
   	
   	
   	
   		 }
   		
   		
   		
   		
   });//closes actionListener
        
        //add functionality to button
        active.addActionListener(new ActionListener(){
    		
   		 public void actionPerformed(ActionEvent ev)
   		 {
   			 distanceOver3.setVisible(false);
   			lessThanThree();
   			
   		 }
   		
   		
   		
   		
   });//closes actionListener
        
        
		
		
	}// closes over 3
	
	
	public static void motor(){
	//This method gives the user the options of motor transportation they can use
	
	
	//creates a new window
		final JFrame motorMenu = new JFrame("Motor Transportation");
		
			//creates a new panel
		JPanel panel = new JPanel();
		
		//Allows elements like JButton to be added
		panel.setLayout(null);
		motorMenu.setSize(600, 390);
		
		//Prompt the user to select a mode of motor transportation
		JLabel mode = new JLabel("Select a mode of  motor transportation!!!");
		mode.setBounds(170,40,250,40);
		mode.setFont(new Font("Times New Roman", Font.PLAIN, 12)); //changes font
		mode.setForeground(Color.RED);//changes font's color
	
	    //create buttons for each of the options
	    JButton car = new JButton("Car");
	    car.setBounds(320,80,190,70);
	    
	    JButton uber = new JButton("Uber");
	    uber.setBounds(50,200,190,70);
	    
	    JButton taxi = new JButton("Taxi");
	    taxi.setBounds(320,200,190,70);
	    
	    JButton other = new JButton("Other");
	    other.setBounds(50,80,190,70);
	    
	    //add the elements onto the panel
	    panel.add(other);
	    panel.add(taxi);
        panel.add(car);
        panel.add(uber);
        panel.add(mode);
        
        //add the panel onto the window
        motorMenu.add(panel);
        
        //make the window visible
        motorMenu.setVisible(true);
		
        //add functionality to the button
        other.addActionListener(new ActionListener(){
        		
        		 public void actionPerformed(ActionEvent ev)
        		 {
        			 
        			 motorMenu.setVisible(false);
        	
        				//creates a new window
        			 final JFrame otherMenu = new JFrame("Motor Transportation");
        			 
          			//creates a new panel
        			 JPanel panel = new JPanel();
        			 
        				//Allows elements like JButton to be added
        			 panel.setLayout(null);
        			 otherMenu.setSize(300, 300);
        			 
        			 //Prompts the user
        			 JLabel leave = new JLabel("Safe Travels!!!");
        			 leave.setBounds(100,50,100,100);
        			leave.setFont(new Font("Comic Sans MS", Font.PLAIN, 12)); //changes font
        			leave.setForeground(Color.GREEN);//changes font's color
        			 
        			 //adds element onto the panel
        			 panel.add(leave);
        			 
        			 
        			 
        			 JButton exit = new JButton("Exit!!!");
        			    exit.setBounds(85,130,100,50);//set the size and position
        			    //adds elements onto the panel
   	
        			    panel.add(exit);
        			    
        			
        			    exit.addActionListener(new ActionListener()
        				   {
        			   		
        			   public void actionPerformed(ActionEvent ev)
        			   {
        				   otherMenu.setVisible(false);
        				   optionsMenu();	   
        				   
        			   }//
        			   
        			   
        			   
        				   });//closes actionListener
        			 
        			 
        			 
        			 //adds panel onto the window
        			 otherMenu.add(panel);
        			 
        			//makes window visible
        			 otherMenu.setVisible(true);
        		          
        	
        		 }
        		
        		
        		
        		
        });//closes action listener
        
        
        //add functionality to the button
        car.addActionListener(new ActionListener(){
        		
        		 public void actionPerformed(ActionEvent ev)
        		 {
        			 
        			motorMenu.setVisible(false);
        				//creates a new window
        			 final JFrame carMenu = new JFrame("Motor Transportation");
        			 
          			//creates a new panel
        			 JPanel panel = new JPanel();
        			 
        				//Allows elements like JButton to be added
        			 panel.setLayout(null);
        			 carMenu.setSize(300, 300);
        			 
        			 
        			 //prompts the user
        			 JLabel leave = new JLabel("Safe Travels!!!");
        			 leave.setBounds(100,50,100,100);
        				leave.setFont(new Font("Comic Sans MS", Font.PLAIN, 12)); //changes font
        				leave.setForeground(Color.RED);//changes font's color
        			 
        			 
        			  //adds a button to go to the commute statistics mentu
        			 JButton commute = new JButton(" Commute Statistics!!!");
        			 commute.setBounds(40,140,200,50);
        			 
        			 //add elements to the panel
        			 panel.add(leave);
        			 panel.add(commute);
        			 
        			 
        			 
        			    //add panel to the window
        			 carMenu.add(panel);
        			 
         			//makes window visible
        			 carMenu.setVisible(true);
        		          
        			 
        			 
        			    commute.addActionListener(new ActionListener(){
        		    		
        			   		 public void actionPerformed(ActionEvent ev)
        			   		 {
        			   			 
        			   			 carMenu.setVisible(false);
        		   	   			 
        		   				 weeklyCommute();
        			   		          
        			   	
        			   		 }
        			   		
        			   		
        			   		
        			   		
        			   });//closes action listener
        			 
        	
        		 }
        		
        		
        		
        		
        });//closes action listener
        
        
        
        taxi.addActionListener(new ActionListener(){
    		
   		 public void actionPerformed(ActionEvent ev)
   		 {
   			 
   			 motorMenu.setVisible(false);
   	
   			taxi();
   		          
   	
   		 }
   		
   		
   		
   		
   });//closes action listener
        
        
        
        
        uber.addActionListener(new ActionListener(){
    		
   		 public void actionPerformed(ActionEvent ev)
   		 {
   	
			 motorMenu.setVisible(false);
   			 uber();
   	
   	
   		 }
   		
   		
   		
   		
   });//closes action listener
        
        
		
		
	}//closes motor
	
	public static void weeklyCommute(){
		//This method is to get how many days the user commutes with a max of 7 days
		
		//creates a new window
		final JFrame weeklyCommute = new JFrame("Weekly Commute Statistics");
		
			//creates a new panel
		JPanel panel = new JPanel();
		
		//Allows elements like JButton to be added
		panel.setLayout(null);
		weeklyCommute.setSize(580, 200);
		
		JLabel mode = new JLabel("How many days do you commute? (Max of 7 days)");
		mode.setBounds(50,40,300,40);
		mode.setFont(new Font("Times New Roman", Font.PLAIN, 12)); //changes font
		mode.setForeground(Color.RED);//changes font's color
		  
		final JTextArea userRow;//new TextArea
        userRow = new JTextArea();//Set size, adds String "Hi"
        userRow.setBounds(50,80,300,30);
        
        //a button is added to input value
		JButton input = new JButton("INPUT!!!");
	    input.setBounds(400,70,100,50);
	   
	    //add elements to the panel
        panel.add(userRow);
		panel.add(mode);
	    panel.add(input);
        
	    //add panel to the window
	    weeklyCommute.add(panel);
        
		//makes window visible
	    weeklyCommute.setVisible(true);
        
        
        
       input.addActionListener(new ActionListener()
    		   {
    	   		
    	   public void actionPerformed(ActionEvent ev)
    	   {
    		   
    		   //This is if the user enters something, then the program will get that values and set it to the length of an array
    		   if(!userRow.getText().equals("")){
    			   weeklyCommute.setVisible(false);
    		   int days = Integer.parseInt(userRow.getText());
    		   int values[] = new int[days];
    		   
    		   dataPieces=  days;
    		   
    		   //call to method to get the distances
    		   weeklyPt1(days);
    		    
    		   }//if
    		   
    		   
    		    
    		    
    	   
    	   }//
    	   
    	   
    	   
    		   });//closes actionListener
        
	
		
		
		
	    //add panel to the window
       weeklyCommute.add(panel);
		
		//makes window visible
       weeklyCommute.setVisible(true);
		
		
		
	}//closes  method
	
	public static void weeklyPt1(final int days){
		//this method gets the distances that the user enters and puts them into a different file where it can be read later
		
		
		//userVal2 is the length of the array
 
		   final int values[] = new int[num];
	
	        		if(days > 0 && days<8){
	        		
	        			//creates a new window
		   			final JFrame weeklyStatistics = new JFrame("Weekly Commute Statistics");
		   			
	     			//creates a new panel
	        		JPanel panel = new JPanel();
	        		
	        		//Allows elements like JButton to be added
	        		panel.setLayout(null);
	        		weeklyStatistics.setSize(580, 600);
	        		
	        		//prompt the user for their distances
	        		JLabel distance = new JLabel("Please enter distance?");
	        		distance.setBounds(50,40,250,40);
	        		distance.setFont(new Font("Times New Roman", Font.PLAIN, 12)); //changes font
	        		distance.setForeground(Color.RED);//changes font's color
	        		
	        		
	        		//creates text area for the user to enter their distances 
	        		final JTextArea[] list = new JTextArea[days];
	        		
	        		  int xPos =70;
	        		
	        		  
	        		for (int index =0 ;index < days; index++){ //prints out all the JTextAreas in the array so that the user can enter their distances
	        			
	        			list[index] = new JTextArea();
	        			list[index].setBounds(40, xPos, 30,30);
	        			panel.add(list[index]);
	        	
	        			xPos += 40;
	        			
	        		}//for loop
	        		
	        	
	        		//creates a button
	                JButton save = new JButton("Save");
	        	    save.setBounds(400,70,100,50);
	        	    
	        	    //adds elements onto the panel
	        	    panel.add(save);
	        		panel.add(distance);
	        	
	        	    //add panel to the window
	        		weeklyStatistics.add(panel);
	        		
        			//makes window visible
	        		weeklyStatistics.setVisible(true);
	                
	                
	        		save.addActionListener(new ActionListener()
	     		   {
	        			
	     	   public void actionPerformed(ActionEvent ev)
	     	   {
	     		  weeklyStatistics.setVisible(false);
	     		  
	     		  //creates an array to set the size of the array
	     		   String[] arrayList = new String[days];
	     		
	     				for (int index =0 ; index < days;index++){
	     					if(!list[index].getText().equals("")){
	     						
	     						arrayList[index]= list[index].getText();//gets each of the distances and assigns them to the indicies of arrayList
	     					
	     					}
	     					
	     				}
	     			
	     				
	     				
							saveData(arrayList);
							try {
								stats();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
	     				
		        
	     			
	     	   }//
	     	   
	     	   
	     	   
	     		   });
	        	
	        	    //add panel to the window
	        		weeklyStatistics.add(panel);
	        		
        			//makes window visible
	        		weeklyStatistics.setVisible(true);
		 //  }
	        		
	        		}//closes if
	        		else {
	        			System.out.println("Please enter a value between 0 and 7!!!");
	        			
	        			
	        		}
	        		
	      
	   
	  }//closes method
	
	
	
	
	public static int[] loadArrayFromFile1(String[] array, BufferedReader file) throws IOException{
      	//Description - retrieving the read file that will be used to store each line into an array and return that array to be loaded into another array.
      	int[] tem = new int[array.length];
		
		
		
		for (int index = 0; index < array.length; index++){
			array[index] = file.readLine();
             	tem[index]= Integer.parseInt(array[index]);
      	}
      	return tem;
	}//Method - loadArray
	
	
	   
	public static void saveData(String[] fileLines){
      	/*
      	 * Description - This method is take an String array write it in the saveData.txt file. Each element of the string array will represent each line in the file
      	 */
      	try{
             	PrintWriter write = new PrintWriter("saveData.txt");
             	
             	for (int index = 0; index <fileLines.length; index++ ){
                   	write.print(fileLines[index]+"\n");
                   	
             	}
             	write.close();
      	} catch(FileNotFoundException e){
             	e.printStackTrace();
      	}
      	
      
      	
	}//Method - saveData
	
	
	public static void stats() throws IOException{
		/*
      	 * Description - This method gets statistics like the average distance, and how consitant the distances are, and also prints out the array sorted
      	 */
		
		BufferedReader savedData;
		final String[] savedData1 = new String[dataPieces];
		final int[] savedData2;
		//savedData = new BufferedReader(new FileReader("saveData.txt"));		
		savedData2=loadArrayFromFile1(savedData1, new BufferedReader(new FileReader("saveData.txt")));
		
		
		
		
		
		//savedData1 = loadArrayFromFile(savedData, savedData);
		
	
		final Car object = new Car(true, distance, 0, true, true, 0, 0);
				
		
		//creates a new window
		final JFrame statsMenu = new JFrame("Statistics Menu");
		
		
			//creates a new panel
		JPanel panel = new JPanel();
		
		//Allows elements like JButton to be added
		panel.setLayout(null);
		statsMenu.setSize(580, 500);
		
		//Statistics
	double mean1 = object.recursiveMean( savedData2,savedData2.length);
	double standardDeviation = object.standardDeviation(mean1,savedData2);
	int[] sortedArray = object.selectionSort(savedData2);
	
	
//	double mean1 = 0;
//	double standardDeviation =0;
	//int[] sortedArray =new int[5];
		
		
		//Prompts all the statistics based on the distances entered
		JLabel statsPrompt = new JLabel("Here are some stats about your drive, and some additional elements!!!");
		statsPrompt.setBounds(20,40,600,40);
		statsPrompt.setFont(new Font("Comic Sans MS", Font.PLAIN, 12)); //changes font
		statsPrompt.setForeground(Color.ORANGE);//changes font's color
		
		JLabel statsMean = new JLabel("Your average commute distance: " + mean1);
		statsMean.setBounds(20,80,600,40);
		statsMean.setFont(new Font("Comic Sans MS", Font.PLAIN, 12)); //changes font
		statsMean.setForeground(Color.ORANGE);//changes font's color
		
		JLabel statsStandardDevation = new JLabel("Heres how consistant your distances are (higher the number the more unconsistant): " + standardDeviation);
		statsStandardDevation.setBounds(20,120,600,40);
		statsStandardDevation.setFont(new Font("Comic Sans MS", Font.PLAIN, 12)); //changes font
		statsStandardDevation.setForeground(Color.ORANGE);//changes font's color
		
		
		JLabel prompt= new JLabel("Here is your distances sorted:");
		prompt.setBounds(20,160,600,40);
		prompt.setFont(new Font("Comic Sans MS", Font.PLAIN, 12)); //changes font
		prompt.setForeground(Color.ORANGE);//changes font's color
		
		JLabel giveCost= new JLabel("Enter a distance, miles per litre, and the gas price!!!");
		giveCost.setBounds(20,250,600,40);
		giveCost.setFont(new Font("Times New Roman", Font.PLAIN, 12)); //changes font
		giveCost.setForeground(Color.RED);//changes font's color
		
		final JTextArea distance = new JTextArea();
		distance.setBounds(20,300,30,30);
		
		final JTextArea kilometersPerLitre = new JTextArea();
		kilometersPerLitre.setBounds(70,300,30,30);
		
		final JTextArea gasPrice = new JTextArea();
		gasPrice.setBounds(120,300,30,30);
		
		final JButton input = new JButton("INPUT!!!");
		input.setBounds(200,300,100,30);
		
		final JButton input2 = new JButton("INPUT!!!");
		input2.setBounds(200,385,100,30);
		
		//A textarea is created to print out the sorted array
		final JTextArea sortedList = new JTextArea();
		sortedList.setBounds(20,200,250,40);
		
		final JTextArea enterValue = new JTextArea();
		enterValue.setBounds(20,380,150,40);
		
		//Adds a label to prompt user
		JLabel valExist = new JLabel("Check to see if a value exist in your array!!! (Enter a value)");
		valExist.setBounds(20,350,600,40);
		valExist.setFont(new Font("Times New Roman", Font.PLAIN, 12)); //changes font
		valExist.setForeground(Color.RED);//changes font's color
		
		
		//uses a loop to print out each indicy of the array into the textarea
		for(int index = 0; index<sortedArray.length;index++){
			
			
			
			sortedList.append(sortedArray[index]+ ", ");
			
			
			}//closes for loop
			
			
			
		//adds elements onto the panel
		panel.add(valExist);
		panel.add(input2);
		panel.add(enterValue);
		panel.add(input);
		panel.add(giveCost);
		panel.add(gasPrice);
		panel.add(distance);
		panel.add(kilometersPerLitre);
		panel.add(statsPrompt);
		panel.add(statsMean);
		panel.add(statsStandardDevation);
		panel.add(prompt);
		panel.add(sortedList);
		
		
		
		
		
		input2.addActionListener(new ActionListener()
		   {
			
	   public void actionPerformed(ActionEvent ev)
	   {
		   if(!enterValue.getText().equals("")){//if the user enters something
		   
			   int val = Integer.parseInt(enterValue.getText());
			   
			   if(val>0){
				  
				   boolean trueOrNot = object.recursiveSequential( savedData2,savedData2.length, val );
					
				   JLabel existOrNot = new JLabel("Does your Value exist? " + trueOrNot);
				   existOrNot.setBounds(55,70,600,40);
				   existOrNot.setFont(new Font("Comic Sans MS", Font.PLAIN, 12)); //changes font
				   existOrNot.setForeground(Color.RED);//changes font's color
		        	
		        	JButton exit= new JButton("Exit");
		        	exit.setBounds(90,120,100,50);
		        	
		        	//creates a new window
		    		final JFrame valueExistance = new JFrame("Value Existance");
		    		valueExistance.setSize(300, 300);
		    		//creates a new panel
		    		JPanel panel1 = new JPanel();
		    		
		    		//Allows elements like JButton to be added
		    		panel1.setLayout(null);		    		
		    		
		    		panel1.add(exit);
		        	panel1.add(existOrNot);
		        	valueExistance.add(panel1);
		        	
		        	
		        	
		        	exit.addActionListener(new ActionListener()
		    		   {
		    	   		
		    	   public void actionPerformed(ActionEvent ev)
		    	   {
		    		   optionsMenu();
		    		   valueExistance.setVisible(false);
		    		   
		    	   }//
		    	   
		    	   
		    	   
		    		   });//closes actionListener
		        	
		        	
		        	statsMenu.setVisible(false);
		        	
		        	valueExistance.setVisible(true);
				   
				   
				   
			   }
			   else{
				   System.out.println("Invalid Input!!!");
			   }
		   
		    		
			   
		   }//closes if
		    	   }//
		    	   
		    	   
		    	   
		    		   });//closes actionListener
		
		
		
		
		
		input.addActionListener(new ActionListener()
		   {
 			
	   public void actionPerformed(ActionEvent ev)
	   {
		 
		   if(!distance.getText().equals("")&&!kilometersPerLitre.getText().equals("")&&!gasPrice.getText().equals("")){//if the user enters something
	        	
			   
			   
	        	int dis = Integer.parseInt(distance.getText());
	        	int kpl = Integer.parseInt(kilometersPerLitre.getText());
	        	int gasP = Integer.parseInt(gasPrice.getText());
	        	
	        	
	        	
	        	
	        	
	        	if(dis>0&& kpl>0 && gasP>0){
	        		Car cost = new Car(true, 0, 0, true, true, 0, 0);
		        	
		        	int numOfLiters = cost.divisonRecursive(dis, kpl);
		        	int totalCost = numOfLiters*gasP;
	        		
		        	JLabel finalCost= new JLabel("This trip would cost you: $" + totalCost);
		        	finalCost.setBounds(55,70,600,40);
		        	finalCost.setFont(new Font("Comic Sans MS", Font.PLAIN, 12)); //changes font
		        	finalCost.setForeground(Color.RED);//changes font's color
		        	
		        	JButton exit= new JButton("Exit");
		        	exit.setBounds(90,120,100,50);
		        	
		        	//creates a new window
		    		final JFrame costMenu = new JFrame("Cost Menu");
		    		costMenu.setSize(300, 300);
		    		//creates a new panel
		    		JPanel panel1 = new JPanel();
		    		
		    		//Allows elements like JButton to be added
		    		panel1.setLayout(null);		    		
		    		
		    		panel1.add(exit);
		        	panel1.add(finalCost);
		        	costMenu.add(panel1);
		        	
		        	
		        	
		        	exit.addActionListener(new ActionListener()
		    		   {
		    	   		
		    	   public void actionPerformed(ActionEvent ev)
		    	   {
		    		   optionsMenu();
		    		   costMenu.setVisible(false);
		    		   
		    	   }//
		    	   
		    	   
		    	   
		    		   });//closes actionListener
		        	
		        	
		        	statsMenu.setVisible(false);
		        	
		        	costMenu.setVisible(true);
		        	
      		
	        	}
	        	else{
	        		System.out.println("INVALID INPUT!!!");
	        	}
	        	
	        	
	        	
		   }
		   
		   
		   
			
	   }//
	   
	   
	   
		   });
		
		
		
	    //add panel to the window
		statsMenu.add(panel);
		
		//makes window visible
		statsMenu.setVisible(true);
		
		
		
		
		
	}//closes method
	
	
	
	
private static BufferedReader loadArrayFromFile(int[] savedData1, BufferedReader savedData) {
		// TODO Auto-generated method stub
		return null;
	}
public static void uber(){
	//This method gives the user options for all the different types of uber, and then the price for that uber is given 	
	
	
	//creates a new window
		final JFrame uberMenu = new JFrame("Uber Menu");
		
		
			//creates a new panel
		JPanel panel = new JPanel();
		
		//Allows elements like JButton to be added
		panel.setLayout(null);
		uberMenu.setSize(580, 500);
		
		//prompt the user to select a type of uber
		JLabel modeOfUber = new JLabel("Select an Uber!!!");
		modeOfUber.setBounds(235,40,250,40);
		modeOfUber.setFont(new Font("Times New Roman", Font.PLAIN, 12)); //changes font
	
		
		//Create buttons to chose a type of uber
	    JButton uberX = new JButton("UberX");
	    uberX.setBounds(320,80,190,70);
	    
	    JButton uberXL = new JButton("UberXL");
	    uberXL.setBounds(50,200,190,70);
	    
	    JButton uberBlack = new JButton("UberBlack");
	    uberBlack.setBounds(320,200,190,70);
	    
	    JButton uberSelect = new JButton("UberSelect");
	    uberSelect.setBounds(50,80,190,70);
	    
	    JButton uberSUV = new JButton("UberSUV");
	    uberSUV.setBounds(180,320,190,70);
		
		
        //add elements to the panel
		panel.add(modeOfUber);
		panel.add(uberX);
		panel.add(uberXL);
		panel.add(uberBlack);
		panel.add(uberSelect);
		panel.add(uberSUV);
		
		
		
	    //add panel to the window
		uberMenu.add(panel);
		
		//makes window visible
		uberMenu.setVisible(true);
		
	    
		//For all of the buttons a class of Uber is called and methods are called on those objects in order to get each type of uber's price	
	    uberX.addActionListener(new ActionListener(){
    		
	   		 public void actionPerformed(ActionEvent ev)
	   		 {
	   	
	   			uberMenu.setVisible(false);
	   			 
	   			 Uber price = new Uber(true,1,1,true,true,1,1);
	   			 Car sort = new Uber(true,1,1,true,true,1,1);
	   			 
	   			 double priceUberX = price.uberX(distance);
	   			 
	   			// int[] uberBase = sort.partizione(uberPricesBase, 0, uberPricesBase.length);
	   			 
	   			 
	   			 
	   			JLabel mode = new JLabel("You would pay: $"+ priceUberX);
	   			mode.setBounds(70,90,200,40);
	   			mode.setFont(new Font("Comic Sans MS", Font.PLAIN, 12)); //changes font
	   			mode.setForeground(Color.ORANGE);//changes font's color
	   			
	   			//creates a new window
	   			final JFrame uberXMenu = new JFrame("Uber Menu");
	   			
     			//creates a new panel
	   			JPanel panel = new JPanel();
	   			
	   			//Allows elements like JButton to be added
	   			panel.setLayout(null);
	   			uberXMenu.setSize(300, 300);
	   			
	   			
	   			
	   			
	   			JButton exit = new JButton("Go to Options Menu!!!");
	   			exit.setBounds(50,130,170,50);
	   			
	   	        //add elements to the panel
	   			panel.add(exit);
	   			panel.add(mode);
	   			
	   		 
	   	        exit.addActionListener(new ActionListener(){
	   	    		
	   	   		 public void actionPerformed(ActionEvent ev)
	   	   		 {
	   	   			 uberXMenu.setVisible(false);
	   	   			 
	   				 optionsMenu();
	   	   	
	   	   	
	   	   		 }
	   	   		
	   	   		
	   	   		
	   	   		
	   	   });//closes action listener
	   			
	   			
	   			
	   		    //add panel to the window
	   			uberXMenu.add(panel);
	   			
    			//makes window visible
	   		    uberXMenu.setVisible(true);
	   			 
	   	
	   		 }
	    });
	    
	    
	    uberXL.addActionListener(new ActionListener(){
    		
	   		 public void actionPerformed(ActionEvent ev)
	   		 {
	   	
	   			uberMenu.setVisible(false);
	   			 
	   			 Uber price = new Uber(true,1,1,true,true,1,1);
	   			 
	   			 double priceUberXL = price.uberXL(distance);
	   			 
	   			JLabel mode = new JLabel("You would pay: $"+ priceUberXL);
	   			mode.setBounds(70,90,200,40);
	   			mode.setFont(new Font("Comic Sans MS", Font.PLAIN, 12)); //changes font
	   			mode.setForeground(Color.ORANGE);//changes font's color
	   			//creates a new window
	   			final JFrame uberXLMenu = new JFrame("Uber Menu");
	   			
	   			
     			//creates a new panel
	   			JPanel panel = new JPanel();
	   			
	   			//Allows elements like JButton to be added
	   			panel.setLayout(null);
	   			uberXLMenu.setSize(300, 300);
	   			
	   			
	   			JButton exit = new JButton("Go to Options Menu!!!");
	   			exit.setBounds(50,130,170,50);
	   	        
	   			//add elements to the panel
	   			panel.add(exit);
	   			panel.add(mode);
	   			
	   			
	   		 
	   	        exit.addActionListener(new ActionListener(){
	   	    		
	   	   		 public void actionPerformed(ActionEvent ev)
	   	   		 {
	   	   	
	   	   		uberXLMenu.setVisible(false);
	   	   			 
	   				 optionsMenu();
	   	   	
	   	   	
	   	   		 }
	   	   		
	   	   		
	   	   		
	   	   		
	   	   });//closes action listener
	   			
	   		    //add panel to the window
	   	     uberXLMenu.add(panel);
	   			
    			//makes window visible
	   	  uberXLMenu.setVisible(true);
	   			 
	   	
	   		 }
	    });
		
	    
	    uberBlack.addActionListener(new ActionListener(){
    		
	   		 public void actionPerformed(ActionEvent ev)
	   		 {
	   	
	   			uberMenu.setVisible(false);
	   			 
	   			 Uber price = new Uber(true,1,1,true,true,1,1);
	   			 
	   			 double priceUberBlack = price.uberBlack(distance);
	   			 
	   			JLabel mode = new JLabel("You would pay: $"+ priceUberBlack);
	   			mode.setBounds(70,90,200,40);
	   			mode.setFont(new Font("Comic Sans MS", Font.PLAIN, 12)); //changes font
	   			mode.setForeground(Color.ORANGE);//changes font's color
	   			//creates a new window
	   			final JFrame uberBlackMenu = new JFrame("Uber Menu");
	   			
     			//creates a new panel
	   			JPanel panel = new JPanel();
	   			
	   			//Allows elements like JButton to be added
	   			panel.setLayout(null);
	   			uberBlackMenu.setSize(300, 300);
	   			
	   			
	   			JButton exit = new JButton("Go to Options Menu!!!");
	   			exit.setBounds(50,130,170,50);
	   			
	   	        //add elements to the panel
	   			panel.add(exit);
	   			panel.add(mode);
	   			
	   		 
	   	        exit.addActionListener(new ActionListener(){
	   	    		
	   	   		 public void actionPerformed(ActionEvent ev)
	   	   		 {
	   	   			 
	   	   		uberBlackMenu.setVisible(false);
	   	   	
	   				 optionsMenu();
	   	   	
	   	   	
	   	   		 }
	   	   		
	   	   		
	   	   		
	   	   		
	   	   });//closes action listener
	   			
	   			
	   			
	   		    //add panel to the window
	   	     uberBlackMenu.add(panel);
	   			
    			//makes window visible
	   	  uberBlackMenu.setVisible(true);
	   			 
	   	
	   		 }
	    });
		
	    uberSUV.addActionListener(new ActionListener(){
    		
	   		 public void actionPerformed(ActionEvent ev)
	   		 {
	   	
	   			uberMenu.setVisible(false);
	   			 
	   			 Uber price = new Uber(true,1,1,true,true,1,1);
	   			 
	   			 double priceUberSUV = price.uberSUV(distance);
	   			 
	   			JLabel mode = new JLabel("You would pay: $"+ priceUberSUV);
	   			mode.setBounds(70,90,200,40);
	   			mode.setFont(new Font("Comic Sans MS", Font.PLAIN, 12)); //changes font
	   			mode.setForeground(Color.ORANGE);//changes font's color
	   			//creates a new window
	   			final JFrame uberSUVMenu = new JFrame("Uber Menu");
	   			
	   			
     			//creates a new panel
	   			JPanel panel = new JPanel();
	   			
	   			
	   			//Allows elements like JButton to be added
	   			panel.setLayout(null);
	   			uberSUVMenu.setSize(300, 300);
	   			
	   			
	   			
	   			
	   			JButton exit = new JButton("Go to Options Menu!!!");
	   			exit.setBounds(50,130,170,50);
	   			
	   	        //add elements to the panel
	   			panel.add(exit);
	   			panel.add(mode);
	   			
	   		 
	   	        exit.addActionListener(new ActionListener(){
	   	    		
	   	   		 public void actionPerformed(ActionEvent ev)
	   	   		 {
	   	   	
	   	   		uberSUVMenu.setVisible(false);
	   	   			 
	   				 optionsMenu();
	   	   	
	   	   	
	   	   		 }
	   	   		
   	   		
	   	   });//closes action listener
  			
	   		    //add panel to the window
	   	     uberSUVMenu.add(panel);
	   			
    			//makes window visible
	   	  uberSUVMenu.setVisible(true);
   	
	   		 }
	    });
	
	    
	    uberSelect.addActionListener(new ActionListener(){
    		
	   		 public void actionPerformed(ActionEvent ev)
	   		 {
	   	
	   			uberMenu.setVisible(false);
	   			 
	   			 Uber price = new Uber(true,1,1,true,true,1,1);
	   			 
	   			 double priceUberSelect = price.uberSelect(distance);
	   			 
	   			JLabel mode = new JLabel("You would pay: $"+ priceUberSelect);
	   			mode.setBounds(70,90,200,40);
	   			mode.setFont(new Font("Comic Sans MS", Font.PLAIN, 12)); //changes font
	   			mode.setForeground(Color.ORANGE);//changes font's color
	   			//creates a new window
	   			final JFrame uberSelectMenu = new JFrame("Uber Menu");
	   			
	   			
     			//creates a new panel
	   			JPanel panel = new JPanel();
	   			
	   			
	   			//Allows elements like JButton to be added
	   			panel.setLayout(null);
	   			uberSelectMenu.setSize(300, 300);
	   			
	   			
	   			
	   			JButton exit = new JButton("Go to Options Menu!!!");
	   			exit.setBounds(50,130,170,50);
	   	       
	   			//add elements to the panel
	   			panel.add(exit);
	   			panel.add(mode);
	   			
	   		 
	   	        exit.addActionListener(new ActionListener(){
	   	    		
	   	   		 public void actionPerformed(ActionEvent ev)
	   	   		 {
	   	   	
	   	   		uberSelectMenu.setVisible(false);
	   	   			 
	   				 optionsMenu();
	   	   	
	   	   	
	   	   		 }
	   	   		
   	   		
	   	   });//closes action listener
	   			  			
	   		    //add panel to the window
	   	     uberSelectMenu.add(panel);
	   			
    			//makes window visible
	   	  uberSelectMenu.setVisible(true);
   	
	   		 }
	    });
	
	}//closes method
public static void taxi(){
	//This method gives the user options for taxi services in Brampton,ON , and then gives then the price for that taxi service
	
	
	//creates a new window
		final JFrame optionsMenu = new JFrame("Taxi Menu");
		
		
			//creates a new panel
		JPanel panel = new JPanel();
		
		
		//Allows elements like JButton to be added
		panel.setLayout(null);
		optionsMenu.setSize(580, 200);
	
		//prompt user for what taxi service
		JLabel mode = new JLabel("These are the options for taxis in Brampton,ON!!!");
		mode.setBounds(145,20,300,40);
		mode.setFont(new Font("Comic Sans MS", Font.PLAIN, 12)); //changes font
		mode.setForeground(Color.YELLOW);//changes font's color
		
		//creates buttons for the two different services avaliable
		JButton a1 = new JButton("A-1 Taxi");
		a1.setBounds(290,70,240,70);
    
		JButton kwik = new JButton("Brampton Bramlea Kwik Kab");
    	kwik.setBounds(30,70,240,70);
    
	
        //add elements to the panel
    	panel.add(mode);
    	panel.add(a1);
    	panel.add(kwik);
		
	    //add panel to the window
    	optionsMenu.add(panel);
    	
		//makes window visible
    	optionsMenu.setVisible(true);
	
    	
    	//Both buttons get the price of the taxi service and then tell the user their prices. Both of the actionListener make a call
    	// to the Taxi call in order to call their respective methods
    	a1.addActionListener(new ActionListener()
		   {
	   		
	   public void actionPerformed(ActionEvent ev)
	   {
		   optionsMenu.setVisible(false);
 			 
 			 Taxi price = new Taxi(true,1,1,true,true,1,1);
 			 
 			 double priceA1Taxi = price.aTaxi(distance);
 			 
 			JLabel mode = new JLabel("You would pay: $"+ priceA1Taxi);
 			mode.setBounds(70,90,200,40);
 			mode.setFont(new Font("Comic Sans MS", Font.PLAIN, 12)); //changes font
 			mode.setForeground(Color.ORANGE);//changes font's color
 			
 			//creates a new window
 			final JFrame a1Taxi = new JFrame("Taxi Menu");
 			
 			
 			//creates a new panel
 			JPanel panel = new JPanel();
 			
 			
 			//Allows elements like JButton to be added
 			panel.setLayout(null);
 			a1Taxi.setSize(300, 300);
 			
 		
 			
 			JButton exit = new JButton("Go to Options Menu!!!");
 			exit.setBounds(50,130,170,50);
 			
 	        //add elements to the panel
 			panel.add(exit);
 			panel.add(mode);
 			
 		 
 	        exit.addActionListener(new ActionListener(){
 	    		
 	   		 public void actionPerformed(ActionEvent ev)
 	   		 {
 	   	
 	   			 a1Taxi.setVisible(false);
 	   			 
 				 optionsMenu();
 	   	
 	   	
 	   		 }
 	   		
	   
		   });//closes actionListener
 	        	        
 	        
 		    //add panel to the window
   			a1Taxi.add(panel);
   			
			//makes window visible
   		    a1Taxi.setVisible(true);
   		    
	   
	   }
	   
	   
	   
	   
	   });//closes actionListener
    	
    	
    	 kwik.addActionListener(new ActionListener()
		   {
	   		
	   public void actionPerformed(ActionEvent ev)
	   {
		   optionsMenu.setVisible(false);
			 
			 Taxi price = new Taxi(true,1,1,true,true,1,1);
			 
			 double priceKwikTaxi = price.kwikKab(distance);
			 
			JLabel mode = new JLabel("You would pay: $"+ priceKwikTaxi);
			mode.setBounds(70,90,200,40);
			mode.setFont(new Font("Comic Sans MS", Font.PLAIN, 12)); //changes font
 			mode.setForeground(Color.ORANGE);//changes font's color
			//creates a new window
			final JFrame kwikCab = new JFrame("Taxi Menu");
			
 			//creates a new panel
			JPanel panel = new JPanel();
			
			
			//Allows elements like JButton to be added
			panel.setLayout(null);
			kwikCab.setSize(300, 300);
			
			
			
			JButton exit = new JButton("Go to Options Menu!!!");
			exit.setBounds(50,130,170,50);
			
	        //add elements to the panel
			panel.add(exit);
			panel.add(mode);
		 
	        exit.addActionListener(new ActionListener(){
	    		
	   		 public void actionPerformed(ActionEvent ev)
	   		 {
	   	
	   			 kwikCab.setVisible(false);
	   			 
				 optionsMenu();
	   	
	   	
	   		 }
	   		
	   
		   });//closes actionListener
	        
		    //add panel to the window
	       kwikCab.add(panel);
	       
			//makes window visible
	  	kwikCab.setVisible(true);
			
	     
	        
	        
	   }
	   
	   
	   
	   
		   });//closes actionListener
 	
	}//closes taxi method
	
}//closes class
