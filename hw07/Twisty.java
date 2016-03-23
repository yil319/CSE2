/*
Vincent Liu
CSE002-111
hw07-Twisty
2016/03/22

The objective of this homework is to get 
practice with writing while, for, and do-while loops.

This program will generate helixes of desired length and width.
*/

import java.util.Scanner;    //imports Scanner

public class Twisty{
    public static void main(String[] args){
    //declairs class and main method
    
        Scanner scan = new Scanner (System.in);
        //declairs & constructs the scanner
    
        System.out.print("Input your desired length: ");    //asks user for input
        int length = 0; //initializes int value length
        while(scan.hasNext()){  //check for any input
            if(scan.hasNextInt()){    //check for input type
                length = scan.nextInt();    //assigns length as the next input
                while(length > 80){ //check if input is within domain
                    System.out.println("Error: please type in an integer less than 80.");
                    //prints the error message
                    System.out.print("Input your desired length: ");
                    //asks user for input
                    length = scan.nextInt();    //assigns length as the next input
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
        
        System.out.print("Input your desired width: ");     //asks user for input
        int width = 0;  //initializes int value width
        while(scan.hasNext()){  //check for any input
            if(scan.hasNext()){ //check for input type
                width = scan.nextInt(); //assigns width as the next input
                while(width > length){  //check if width is larger and length
                    System.out.println("Error: please inpur an integer smaller than the length.");
                    //prints out the error message
                    System.out.print("Input your desired width: ");
                    //asks user for input
                    width = scan.nextInt(); //assigns width as the next input
                }   //end of while loop
                break;
            }   //end of if statement
            else{   //in cases of error
            System.out.println("Error: please type in an integer. " + scan.next());
            //prints out the error message and the false input
            }   //end of else statement
        }   //end of while loop
        
        for(int row=0; row<width; row++){
        //sets variable, condition, and increment for for loop
            for(int col=0; col<length; col++){
            //sets variable, condition, and increment for for loop
                if((col-row)%width==0 && 0<=col%(2*width) && col%(2*width)<width){
                //assumes all cases of hashtags going down-right
                    System.out.print("#");  //prints a hashtag
                }   //end of if statement
                else if((row+col)%width==width-1 && 0<=col%(2*width) && col%(2*width)<width){
                //assumes all cases of slashes
                    System.out.print("/");  //prints a slash
                }   //end of else if statement
                else if((col-row)%width==0){
                //assumes all cases of backslashes
                    System.out.print("\\"); //prints a backslash
                }   //end of else if statement
                else if((row+col)%width==width-1){
                //assumes all cases of hashtags going up-right
                    System.out.print("#");  //prints a hashtag
                }   //end of else if statement
                else{
                    System.out.print(" ");  //prints empty spaces
                }   //end of else statement
            }   //end of for loop
            System.out.println();
        }   //end of for loop
        
    }   //end of main method
}   //end of class