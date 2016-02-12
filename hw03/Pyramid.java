/*
Vincent Liu
CSE002-111
hw03-Pyramid
2016/02/12

the goal of this homework is to get practice in writing code that
enables the user to input data and in performing arithmetic operations.
*/

import java.util.Scanner;   //imports Scanner

public class Pyramid{
    public static void main(String[] args) {
    //assigning class and main method
    
    //scanner
    Scanner myScanner;  //declairs a scanner
    myScanner = new Scanner (System.in);    //constructs the scanner
    
    //inputs, variables, calculations, and prints
    System.out.print ("The square side of the pyramid is: ");  //asks for side of pyramid input = 25
    double sidePyramid = myScanner.nextDouble();  //gets the input and stores it in sidePyramid
    System.out.print ("The height of the pyramid is: ");    //asks for height of pyramid input = 15
    double heightPyramid = myScanner.nextDouble();    //gets the input and stores it in heightPyramid
    double volumePyramid = sidePyramid * sidePyramid * heightPyramid / 3.0;   //calculates the volume
    System.out.println ("The volume inside the pyramid is: " + volumePyramid);  //prints the result
    
    }   //end of main method
}   //end of class