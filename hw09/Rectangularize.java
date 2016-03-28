/*
Vincent Liu
CSE002-111
hw09-Rectangularize
2016/03/29

The objective of this homework is to get practice in writing methods, 
overloading methods, and in forcing the user to enter good input.

This program will convert input into rectangles.
*/

import java.util.Scanner;   //imports Scanner

public class Rectangularize{
    public static void main(String[] args){
    //declairs class and main method
        Scanner scan = new Scanner (System.in); //declairs & constructs the scanner
        
        System.out.print("Please enter an input: ");    //asks the user to enter an input
        int integerInput = 0;   //initializes int value integerInput
        String stringInput = " ";   //initializes String value stringInput 
        
        while(scan.hasNext()){  //check for any input
            if(scan.hasNextInt()){    //check for input type
            rectangle(integerInput=scan.nextInt());
            //calls rectangle method and assigns integerInput as the next int input
            break;
            }   //end of if statement
            else if(scan.hasNextLine()){    //check for input type
            rectangle(stringInput=scan.nextLine());
            //calls rectangle method and assigns stringInput as the next String input
            break;
            }   //end of else if statement
        }   //end of while loop
    }   //end of main method
    
    public static void rectangle(int integerInput){
        for(int row=0; row<integerInput; row++){
        //sets variable, condition, and increment for for loop
            for(int col=0; col<integerInput; col++){
            //sets variable, condition, and increment for for loop
                if(col<integerInput){
                    System.out.print("%");  //prints the integerInput
                }   //end of if statement
                else if(row<integerInput){
                    System.out.print("%");  //prints the integerInput
                }   //end of else if statement
            }   //end of for loop
            System.out.println();
        }   //end of for loop
    }   //end of rectangle method with int input
    
    public static void rectangle(String stringInput){   //method for String input
        int length = stringInput.length();
        //assigns int variable length as the length of the word input

        for(int i=0; i<length; i++){
        //sets variable, condition, and increment for for loop
            System.out.println(stringInput);
            //prints the string input length number of times
        }   //end of for loop
    }   //end of rectangle method with string input
    
}   //end of class