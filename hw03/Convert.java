/*
Vincent Liu
CSE002-111
hw03-Convert
2016/02/12

the goal of this homework is to get practice in writing code that
enables the user to input data and in performing arithmetic operations.
*/

import java.util.Scanner;   //imports Scanner

public class Convert{
    public static void main(String[] args) {
    //assigning class and main method
    
    //scanner
    Scanner myScanner;  //declairs a scanner
    myScanner = new Scanner (System.in);    //constructs the scanner
    
    //inputs, variables, calculations, and prints
    System.out.print ("Enter the distance in meters: ");  //asks for distance input
    double dMeter1 = myScanner.nextDouble();  //gets the input and stores the distance in meters: 34.23
    double dInch1 = dMeter1 * 39.3701; //converts the distance in meters to inches. (1 meter = 39.3701 inch)
    System.out.println (dMeter1 + " meters is " + dInch1 + " inches.");   //prints out the convertion.
    
     System.out.print ("Enter the distance in meters: ");  //asks for distance input
    double dMeter2 = myScanner.nextDouble();  //gets the input and stores the distance in meters: 15.25
    double dInch2 = dMeter2 * 39.3701; //converts the distance in meters to inches. (1 meter = 39.3701 inch)
    System.out.println (dMeter2 + " meters is " + dInch2 + " inches.");   //prints out the convertion.
    
    }   //end of main method
}   //end of class