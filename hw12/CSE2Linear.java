/*
Vincent Liu
CSE002-111
hw11-CSE2Linear
2016/04/15

The objective of this homework is to get practice with 
arrays and in searching single dimentional arrays.

This program will store integer inputs in an array and sort/scramble the
list, then prompt the user to search for a specific value within the array.
*/

import java.util.Scanner;   //imports Scanner
import java.util.Random;    //imports Random
import java.util.Arrays;    //imports Arrays

public class CSE2Linear{
    public static void main(String[] args){
    //declairs class and main method
        Scanner scan = new Scanner (System.in); //declairs & constructs the scanner
        Random rand = new Random(); //declairs & constructs the random
        
        System.out.print("Enter 15 ascending ints for final grades in CSE2: ");
        //asks the user to enter 15 ints for final grades in CSE2
        
        int[] grades = new int[15];
        //declairs the int array grades with [15] elements
        int gradeInput = 0; //initializes int value gradeInput
        
        for(int i=0; i<grades.length; i++){
            while(scan.hasNext()){  //check for any input
                if(scan.hasNextInt()){    //check for input type
                    gradeInput = scan.nextInt();    //assigns gradeInput as the next input
                    while(gradeInput<0 || gradeInput>100){ //check if input is within domain
                        System.out.println
                        ("Error: please input an integer from 1 to 100, inclusive.");
                        //prints the error message
                        System.out.print("Enter ints for final grades in CSE2: ");
                        //asks user for input
                        gradeInput = scan.nextInt();    //assigns gradeInput as the next input
                    }   //end of while loop
                    break;  //breaks the loop
                }   //end of if statement
                else{   //in cases of error
                System.out.println("Error: please type in an integer. " + scan.next());
                //prints out the error message and the false input
                System.out.print("Enter ints for final grades in CSE2: ");    
                //asks user for input
                gradeInput = scan.nextInt();    //assigns gradeInput as the next input
                }   //end of else statement
            }   //end of while loop
            grades[i] = gradeInput;  //stores gradeInput into grades[]
        }   //end of for loop
        
        System.out.print("The final grades for CSE2 are: \n");
        //prints out the sorted grades
        for(int i=0; i<grades.length; i++){    //opens a for loop to print the grades
            Arrays.sort(grades);    //sorts the grades in ascending order
            System.out.print(grades[i]+" ");    //prints the sorted grades
        }   //end of for loop
        
        System.out.println();
        
        System.out.print("Scrambled: \nThe final grades for CSE2 are: \n");
        //prints out the scrambled grades
        for (int i=0; i<grades.length; i++) {   //opens a for loop to scramble the array
		    int randomPosition = rand.nextInt(grades.length);   //assigns random position
		    int temp = grades[i];   //initializes int value temp and assigns it as grade[i]
		    grades[i] = grades[randomPosition]; //stores the value
		    grades[randomPosition] = temp;  //stores the value
		    System.out.print(grades[i]+" ");    //prints the scrambled grades
        }   //end of for loop

        System.out.print("Enter a grade to search for: ");
        //prompts the user to input the grade to search for
        
        int searchInt = scan.nextInt(); //assigns searchInt as the next int input
        
        for(int i=0; i<grades.length; i++){
            if(grades[i]==searchInt){
                System.out.print(grades[i]);
            }   //end of if statement
        }   //end of for loop
        
    }   //end of main method
}   //end of class