/*
Vincent Liu
CSE002-111
hw06-Fibonacci
2016/03/04

This program asks the user to input the first and second number and
the expected digits in a fibonacci's series and produces the result.
*/

import java.util.Scanner;    //imports Scanner

public class Fibonacci{
    public static void main(String[] args){
    //declairs class and main method
    
        Scanner scan = new Scanner (System.in);
        //declairs & constructs the scanner
    
        System.out.print("Enter the first number in the sequence: ");
        //asks the user to input int value a1
        int a1 = scan.nextInt();
        //declairs and assigns int value a1 as the next user input
        while (a1 <= 0){    //opens a loop to test the input
        System.out.println("Enter a positive integer.");    //asks the user for a valid input
        a1 = scan.nextInt();    //stores the input for testing
        }   //end of loop

        System.out.print("Enter the second number in the sequence: ");
        //asks the user to input int value a2
        int a2 = scan.nextInt();
        //declairs and assigns int value a2 as the next user input
        while (a2 <= 0){    //opens a loop to test the input
        System.out.println("Enter a positive integer.");    //asks the user for a valid input
        a2 = scan.nextInt();    //stores the input for testing
        }   //end of loop

        System.out.print("How many custom Fibonacci numbers should be printed? ");
        //asks the user to input int value n
        int n = scan.nextInt();
        //declairs and assigns int value n as the next user input
        while (n <= 0){    //opens a loop to test the input
        System.out.println("Enter a positive integer.");    //asks the user for a valid input
        n = scan.nextInt();    //stores the input for testing
        }   //end of loop
        
        int i = 2;  //declairs and assigns the int value i = 3
        int an = 0; //declairs and initializes the int value an
        
        System.out.println("The numbers are:");
        
        while (i <= n){
            an = a1 + a2;
            System.out.print(a1 + ", ");   //outputs the result
            a1 = a2;
            a2 = an;
            i++;
        }   //end of loop
        System.out.print(a1 + ".\n");

    }   //end of main method
}   //end of class