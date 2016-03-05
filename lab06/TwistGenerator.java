/*
Vincent Liu
CSE002-111
lab06-TwistGenerator
2016/03/04

The goal of this lab is to get familiar with loops, 
a critical piece of syntax that is essential for many programming languages.

The program will print out a simple “twist” on the screen.
*/

import java.util.Scanner;    //imports Scanner

public class TwistGenerator{
    public static void main(String[] args){
    //declairs class and main method
    
    Scanner scan = new Scanner (System.in);
    //declairs & constructs the scanner
    
    System.out.println("Enter a positive integer.");
    //asks the user to input a positive integer
    
    int length = scan.nextInt();
    //declairs and assigns integer value length as the next user input

    while (length <= 0){    //opens a loop to test the input
        System.out.println("Enter a positive integer.");    //asks the user for a valid input
        length = scan.nextInt();    //stores the input for testing
    }   //end of loop
    
    int twist = length%3;  //declairs and assigns the sentinel variable twist
    int firstLine = 1;  //declairs and assigns the sentinel variable firstLine
    int secondLine = 1; //declairs and assigns the sentinel variable secondLine
    int thirdLine = 1;  //declairs and assigns the sentinel variable thirdLine
    
    while (firstLine <= length/3){   //opens a loop to print the first line of twist
        System.out.print("\\ /");  //prints the twist
        ++firstLine;    //adds 1 to the sentinel variable firstLine
        if (firstLine > length/3){   //opens a if statement to print the partial twists on the first line
            switch (twist){ //declairs a switch statement that prints partial twists
                case 1: System.out.print("\\"); break;   //prints the first part of a twist
                case 2: System.out.print("\\ "); break;   //prints the second part of a twist
                case 0: System.out.print("/"); break;   //prints the third part of a twist
            }   //end of switch statement
        }   //end of loop
    }   //end of loop
    
    System.out.println(""); //changes to the next line in output
    
    while (secondLine <= length/3){   //opens a loop to print the second line of twist
        System.out.print(" X ");  //prints the twist
        ++secondLine;    //adds 1 to the sentinel variable secondLine
    }   //end of loop
    
    System.out.println(""); //changes to the next line in output
    
    while (thirdLine <= length/3){   //opens a loop to print the third line of twist
        System.out.print("/ \\");  //prints the twist
        ++thirdLine;    //adds 1 to the sentinel variable thirdLine
        if (thirdLine > length/3){   //opens a if statement to print the partial twists on the third line
            switch (twist){ //declairs a switch statement that prints partial twists
            case 1: System.out.print("/"); break;   //prints the first part of a twist
            case 2: System.out.print("/ "); break;   //prints the second part of a twist
            case 0: System.out.print("\\"); break;   //prints the third part of a twist
            }   //end of switch statement
        }   //end of loop
    }   //end of loop

    }   //end of main method
}   //end of class