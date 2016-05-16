/*
Vincent Liu
CSE002-111
lab10-Arrays
2016/04/08

The objective of this lab is to get familiar with one-dimentional array.

This program will store midterm grades of students and print them out.
*/

import java.util.Scanner;   //imports Scanner

public class Arrays{
    public static void main(String[] args){
    //declairs class and main method
    
        Scanner scan = new Scanner (System.in);
        //declairs & constructs the scanner
        
        int randomInt = 5 + (int)(Math.random() * 5);
        //declairs the int value randomInt and it generates a random int [5,10]
        String[] students = new String[randomInt];
        //declairs the String array students with [randomInt] elements
        System.out.println("Enter " + randomInt + " student names:");
        
        for(int i=0; i<randomInt; i++){
            students[i] = scan.nextLine();
        }   //end of for loop
        
        int[] midterm = new int[randomInt];
        //declairs the int array midterm with [randomInt] elements
        for(int j=0; j<randomInt; j++){
            midterm[j] = (int)(Math.random() * (100 + 1));
        }
        
        System.out.println("Here are the midterm grades of the "
        + randomInt + " students above:");
        for(int k=0; k<randomInt; k++){
            System.out.print(students[k] + ": ");
            System.out.println(midterm[k]);
        }

    }   //end of main method
}   //end of class