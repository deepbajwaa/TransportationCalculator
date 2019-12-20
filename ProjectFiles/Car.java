package ProjectFiles;
/*
*Purpose: This class helps mainly to do the calculations for the statistics menu that is apart
*of the tester class (supposed to be called the integration class)
*/
public class Car extends Motor {
	//instance variables
	int amountOfDoors;
	int mpg;
	
	
	public Car(boolean isMovement, double distance, double time, boolean hasMotor, boolean hasWheels, int amountOfDoors, int mpg) {
		super(isMovement, distance, time, hasMotor, hasWheels);
		this.amountOfDoors = amountOfDoors;
		this.mpg = mpg;
		
	}//closes constructor
	
	public static double standardDeviation(double mean, int[] array){
		//This method is used to determine the standard deviation of the data set
		
		double varianceSum = 0;
		
		for(int index = 0; index < array.length; index++){
			
			varianceSum += Math.pow(array[index] - mean, 2);
			
		}//closes for
		
		double standardDeviation = Math.sqrt(varianceSum/array.length); 
		
		return standardDeviation;
		
		
	}//closes method
	
	
	public static int[] selectionSort(int[] array){
		//Finds the smallest value repeatedly from the unsorted part and puts it at the beginning
		
		 for (int index = 0; index < array.length - 1; index++)
	        {
	            int index1 = index;
	            
	            //adjacent is set to the index next to the one thats being checked currently
	            for (int adjacent = index + 1; adjacent < array.length; adjacent++)
	            	
	            
	                if (array[adjacent] < array[index1]) //checks to see if the adjacent element is less than any value in the array
	                    index1 = adjacent; //if so then those two indexes are switched
	      
	            int smallerNumber = array[index1];  
	            array[index1] = array[index];
	            array[index] = smallerNumber;
	           
	            
	        }//close for
	        return array;
		
		
	}//closes method
	
	
	public static int mean( int[] array ) {
		int sum = 0;
		int average =0;
		
		for(int index =0; index<array.length;index++){
			
			if(array[index]>0){
			sum+=array[index];
			}
		
		}//closes for loop
		
		average = (sum/array.length);
		
		return average;
		
		
		
	}//closes method
	
	
	
	
	public static boolean recursiveSequential( int[] array, int sizeOfArray, int value ) {
		//This method performs the Sequential algorithm recursively
		
		if( sizeOfArray == 0 ) // if no array exists
		return false;
		if( value == array[ sizeOfArray - 1 ] )// if a value in the array matches the desired search value
		return true; //it will return true
		
		return recursiveSequential( array, sizeOfArray - 1, value );//recursive call to the method if the value has not been found
		
	}//closes method
	
	
	
	  public static int divisonRecursive(int num, int divisor)
       {
		  //This method divides a number recursively
           if( divisor == 0 )//if the divisor is zero
           {
               return 0;
           }
           else if(num-divisor == 0)// if the divisor is the same as the number
           {
              return 1;
           }
           else if( num < divisor)//if the number is less than the divisor
           {
              return 0; 
           }
           else //makes a recursive call and adds one for the one time it can divide so far
           {
               return ( 1 + divisonRecursive(num-divisor, divisor) );
           }
     
       }//closes method
	 
	  
	  public int recursiveMean(int[] array, int lengthOfArray)
	  {
		  //this method is used to recursively find the mean
	    int sum, average;
	    
	    if(lengthOfArray==1){//base case will return the first index of the array
	    	
	    	return array[0];
	    	
	    }
	    
	    
	    else 
	    {
	        
	        sum= array[lengthOfArray-1]+ ((lengthOfArray-1) * recursiveMean(array,lengthOfArray-1));
	    }
	    
	    average = sum/lengthOfArray;
	    
	    return average;
	    
		  
	      
		  
		  
	  }//closes method
	  
	  
	  
	
	  static int partition(int[] array, int low , int high)//high is the last index & low is the first index
	  {
		  //This method performs the quicksort
		  
	      int pivot = high; //selects the pivot
	      
	      int wall =low;
	      int j = high;
	      
	      while(wall<j)
	      {
	          if(array[wall]<=array[pivot])//if the first index is less than or equal to the pivot the wall moves up
	          {
	        	  wall++;
	          }
	          if(array[wall]>array[pivot])// if the index is greater than the pivot
	          {   
	          if((array[wall]>array[pivot]) && (array[j]<=array[pivot]))//if the index at the wall is greater than the pivot and the index at j is
	        	  														//less than or equal to the pivot
	          {
	              int temp= array[wall]; //then the index at wall gets assigns to int temp
	              array[wall]=array[j]; //the wall becomes the value at index j
	              array[j]=temp; //the index at j becomes the value that was at the wall
	              wall++;    
	          }
	          
	          if(array[j]>array[pivot])// if index at j is greater than the pivot 
	          {
	              j--;//j decreases
	          }
	          }//closes if
	      }
	      
	      int temp= array[wall];
	      array[wall]=array[pivot];
	      array[pivot]=temp;
	      
	      return wall;
	  }//closes method
	  
	  
	 public static void quicksort(int[] array, int low, int hi)
	  {
	    //This method makes the call to both itself and the partition method
		  
		  if(low>=hi)
	      {
	         
	      }
	      int split = partition(array, low, hi);
	      
	      quicksort(array, low, split-1);
	      
	      quicksort(array, split+1, hi);
	      
	  }//closes method
	  
	  
}//closes class
