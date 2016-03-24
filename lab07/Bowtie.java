/*
Vincent Liu
CSE002-111
lab07-Bowtie
2016/03/11

The goal of this lab is to further practice while loops with a break statement.
This program generates bowties with ‘*’.
*/

import java.util.Scanner;    //imports Scanner

public class Bowtie{
    public static void main(String[] args){
    //declairs class and main method
    
	Scanner scan = new Scanner (System.in);
        //declairs & constructs the scanner
    
    if(true){	//opens an if statement to store code
		int nStars = 9;	//initializes and declairs the int value nStars = 9
	    for(int row=0; row<nStars; row++){
    	//sets variable, condition, and increment for for loop
    		for(int col=0; col<nStars; col++){
    		//sets variable, condition, and increment for for loop
    			if(row<=nStars/2 && col<row){
    			//opens an if statement for conditions
    				System.out.print(" ");	//prints a space
    			}	//end of if statement
    			else if(row>=nStars/2 && col>row){
    			//opens an else if statement for conditions
    				System.out.print(" ");	//prints a space
    			}	//end of else if statement
    			else if(row+col>=nStars && row<=nStars/2){
    			//opens an else if statement for conditions
    				System.out.print(" ");	//prints a space
    			}	//end of else if statement
    			else if(row+col<=nStars-2 && row>=nStars/2){
    			//opens an else if statement for conditions
    				System.out.print(" ");	//prints a space
    			}	//end of else if statement
    			else{	//opens an else statement for printing stars
    				System.out.print("*");	//prints a star
    			}	//end of else statement
    		}	//end of for loop
    		System.out.println();	//changes the line
	    }	//end of for loop
    }	//end of if statement
    
    if(true){	//opens an if statement to store code
    	System.out.print("Input an odd integer from 3 to 33, inclusive: ");
    	int nStars = 0;	//initializes int value nStars
		while(scan.hasNext()){  //check for any input
            if(scan.hasNextInt()){    //check for input type
                nStars = scan.nextInt();    //assigns nStars as the next input
                while(nStars<3 || nStars>33){ //check if input is within domain
                    System.out.println
                    ("Error: please type in an odd integer from 3 to 33, inclusive.");
                    //prints the error message
                    System.out.print("Input an odd integer: ");
                    //asks user for input
                    nStars = scan.nextInt();    //assigns nStars as the next input
                }   //end of while loop
                break;
            }   //end of if statement
            else{   //in cases of error
            System.out.println("Error: please type in an integer. " + scan.next());
            //prints out the error message and the false input
            System.out.print("Input your desired length: ");    
            //asks user for input
            }   //end of else statement
        }   //end of while loop
        
	    for(int row=0; row<nStars; row++){
    	//sets variable, condition, and increment for for loop
    		for(int col=0; col<nStars; col++){
    		//sets variable, condition, and increment for for loop
    			if(row<=nStars/2 && col<row){
    			//opens an if statement for conditions
    				System.out.print(" ");	//prints a space
    			}	//end of if statement
    			else if(row>=nStars/2 && col>row){
    			//opens an else if statement for conditions
    				System.out.print(" ");	//prints a space
    			}	//end of else if statement
    			else if(row+col>=nStars && row<=nStars/2){
    			//opens an else if statement for conditions
    				System.out.print(" ");	//prints a space
    			}	//end of else if statement
    			else if(row+col<=nStars-2 && row>=nStars/2){
    			//opens an else if statement for conditions
    				System.out.print(" ");	//prints a space
    			}	//end of else if statement
    			else{	//opens an else statement for printing stars
    				System.out.print("*");	//prints a star
    			}	//end of else statement
    		}	//end of for loop
    		System.out.println();	//changes the line
	    }	//end of for loop
	}	//end of if statement
    
    }   //end of main method
}   //end of class   