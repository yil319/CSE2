/*
Vincent Liu
CSE002-111
hw07-Triangles
2016/03/22

The objective of this homework is to get 
practice with writing while, for, and do-while loops.

This program generates number triangles using three different types of loop
*/

import java.util.Scanner;    //imports Scanner

public class Triangles{
    public static void main(String[] args){
    //declairs class and main method
    
        Scanner scan = new Scanner (System.in);
        //declairs & constructs the scanner
    
        System.out.print("Enter a number between 5 and 30: ");
        //asks the user for an input between 5 and 30
        int number = scan.nextInt();
        //initializes and declairs int value number as the next int input

//using only for loops        
        if(true){   //opens an if statement to store code
            int k=1;
            //initializes and declairs int value k = 1
            for(int row=0; row<number; row++){
            //sets variable, condition, and increment for for loop
                for(int col=0; col<number; col++){
                //sets variable, condition, and increment for for loop
                    if(row<k && col<k){ //check if need to print
                        System.out.print(k);    //prints the value of k
                    }   //end of if statement
                }   //end of for loop
                System.out.println();   //changes the line
                k++;    //adds 1 to the value of k
            }   //end of for loop
            k=number-1; //sets k = number - 1
            for(int row=number; row>1; row--){
            //sets variable, condition, and increment for for loop
                for(int col=number; col>1; col--){
                //sets variable, condition, and increment for for loop
                    if(row<=k+1 && col<=k+1){   //check if need to print
                        System.out.print(k);    //prints the value of k
                    }   //end of if statement
                }   //end of for loop
                System.out.println();   //changes the line
                k--;    //minuses 1 from the value of k
            }   //end of for loop
        }   //end of if statement
        
//using only while loops
        if(true){   //opens an if statement to store code
            int row=0;  //initializes and declairs int value row = 0
            int col=0;  //initializes and declairs int value col = 0
            int k=1;    //initializes and declairs int value k = 1
            while(row<number){  //opens a while loop for condition
                col=0;  //resets col = 0
                while(col<number){  //opens a while loop for condition
                    if(row<k && col<k){ //check if need to print
                        System.out.print(k);    //prints the value of k
                    }   //end of if statement
                    col++;  //adds 1 to the value of col
                }   //end of while loop
                System.out.println();   //changes the line
                k++;    //adds 1 to the value of k
                row++;  //adds 1 to the value of row
            }   //end of while loop
            k=number-1;  //sets k = number - 1
            while(row>1){   //opens a while loop for condition
                col=number;  //resets col = 0
                while(col>1){   //opens a while loop for condition
                    if(row<=k+1 && col<=k+1){ //check if need to print
                        System.out.print(k);    //prints the value of k
                    }   //end of if statement
                    col--;  //takes 1 away from the value of col
                }   //end of while loop
                System.out.println();   //changes the line
                k--;    //takes 1 away from the value of k
                row--;  //takes 1 away from the value of row
            }   //end of while loop
        }   //end of if statement
        
//using only do-while loops
        if(true){   //opens an if statement to store code
            int row=0;  //initializes and declairs int value row = 0
            int col=0;  //initializes and declairs int value col = 0
            int k=1;    //initializes and declairs int value k = 1
            do{ //opens a do-while loop
                col=0;  //resets col = 0
                do{ //opens a do-while loop
                    if(row<k && col<k){ //check if need to print
                        System.out.print(k);    //prints the value of k
                    }   //end of if statement
                    col++;  //adds 1 to the value of col
                }while(col<number); //sets conditions for the do-while loop
                System.out.println();   //changes the line
                k++;    //adds 1 to the value of k
                row++;  //adds 1 to the value of row
            }while(row<number); //sets conditions for the do-while loop
            k=number-1;  //sets k = number - 1
            do{ //opens a do-while loop
                col=number;  //resets col = 0
                do{ //opens a do-while loop
                    if(row<=k+1 && col<=k+1){ //check if need to print
                        System.out.print(k);    //prints the value of k
                    }   //end of if statement
                    col--;  //takes 1 away from the value of col
                }while(col>1);  //sets conditions for the do-while loop
                System.out.println();   //changes the line
                k--;    //takes 1 away from the value of k
                row--;  //takes 1 away from the value of row
            }while(row>1);  //sets conditions for the do-while loop
        }   //end of if statement

    }   //end of main method
}   //end of class