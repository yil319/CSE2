/*
Vincent Liu
CSE002-111
hw06-RunFactorial
2016/03/04

This program takes an user input between 
9 and 16 (inclusive) and outputs the factorial result.
*/

import java.util.Scanner;    //imports Scanner

public class RunFactorial{
    public static void main(String[] args){
    //declairs class and main method
    
        Scanner scan = new Scanner (System.in);
        //declairs & constructs the scanner
    
        System.out.println("Please enter an integer that is between 9 and 16:");
        //asks the user for an integer input between 9 and 16, inclusive
        int number = scan.nextInt();
        //declairs and assigns the integer value number as the next integer input
    
        while(number < 9 || number > 16){   //opens a loop to check if the input is valid
            System.out.println("Invalid input, enter again!");
            //asks the user for a valid input
            number = scan.nextInt();
            //stores the re-entered value
        }   //end of loop
        
        int factorial = number;  //declairs and initializes the integer value factorial
        int i = 1;  //declairs and initializes the integer value i
        while(i < number){  //opens a loop to calculate the factorial
            factorial *= i; //re-assigns factorial as the mutiplied result
            i++;    //adds 1 to i after each time the loop is ran
        }   //end of loop
        
        System.out.println("Input accepted:\n" + number + "! = " + factorial);
        //outputs the result
        
    }   //end of main method
}   //end of class