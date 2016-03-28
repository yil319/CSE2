/*
Vincent Liu
CSE002-111
hw09-Games
2016/03/29

The objective of this homework is to get practice in writing methods, 
overloading methods, and in forcing the user to enter good input.

This program contains three games: guessTheBox, spinTheWheel, and scrambler.
*/

import java.util.Scanner;   //imports Scanner
import java.util.Random;    //imports Random number generator

public class Games{
    public static void main(String[] args){
    //declairs class and main method
        Scanner scan = new Scanner (System.in); //declairs & constructs the scanner
        
        System.out.println("Welcome to Bubba game center!");
        //greets the user
        System.out.println("Please select the game you want to play.");
        System.out.print("Type in: guessTheBox, spinTheWheel, or scrambler: ");
        //asks the user to choose the game by typing in the corresponding name
        
        String game = "";   //initializes String variable game
        
        while(scan.hasNext()){  //check for any input
            game = scan.nextLine();    //assigns game as the next input
            
            if(game.equals("guessTheBox")){
                guessTheBox();  //calls the method guessTheBox
                break;
            }   //end of if statement
            else if(game.equals("spinTheWheel")){
                spinTheWheel(); //calls the method spinTheWheel
                break;
            }   //end of else if statement
            else if(game.equals("scrambler")){
                scrambler();    //calls the method scrambler
                break;
            }   //end of else if statement
            else{
                System.out.println
                ("Error: Bubba's arcade does not have such game.");
                //prints error message
                System.exit(0); //exits the program
            }   //end of else statement
        }   //end of while loop
    }   //end of main method

    public static void guessTheBox(){
        Scanner scan = new Scanner (System.in); //declairs & constructs the scanner
        Random random = new Random ();  //declaris & constructs the random number generator
        int randomInt = random.nextInt(3) + 1;
        //declairs the int value randomInt and it generates a random int <= 3
        
        System.out.print("Please choose box 1, 2, or 3 by typing in the number: ");
        //asks the user to choose the box
        int box = 0;    //initializes int value box
        while(scan.hasNext()){  //check for any input
            if(scan.hasNextInt()){    //check for input type
                box = scan.nextInt();    //assigns box as the next input
                while(box<1 || box>3){ //check if input is within domain
                    System.out.println
                    ("Error: please type in an integer from 1 to 3, inclusive.");
                    //prints the error message
                    System.out.print("Select desired box: ");
                    //asks user for input
                    box = scan.nextInt();    //assigns box as the next input
                }   //end of while loop
                break;
            }   //end of if statement
            else{   //in cases of error
            System.out.println("Error: please type in an integer. " + scan.next());
            //prints out the error message and the false input
            System.out.print("Select desired box: ");    
            //asks user for input
            }   //end of else statement
        }   //end of while loop
        
        if(box==randomInt){
            System.out.println
            ("Congratulations! You just opened the box and received donkey dung!");
            //greets the user
            System.exit(0); //exits the program
        }   //end of if statement
        else{
            System.out.println("Sorry, you opened an empty box, try next time!");
            //tells the user that it was a wrong guess
            System.exit(0); //exits the program
        }   //end of else statement
    }   //end of guessTheBox method

    public static void spinTheWheel(){
        Scanner scan = new Scanner (System.in); //declairs & constructs the scanner
        Random random = new Random ();  //declaris & constructs the random number generator
        int number = random.nextInt(5) + 1;
        //declairs the int value number and it generates a random int <= 5 and !=0
        int randomColor = random.nextInt(2);
        //declairs the int value color and it generates a random int <= 2
        int numberInput = 0; //initializes int variable numberInput
        String color = "";  //initializes String variable color
        String colorInput = "";  //initializaes int variable colorInput
        
        switch(randomColor){
            case 0: color = "red"; break;   //assigns color as red
            case 1: color = "black"; break; //assigns color as black
        }   //end of switch statement
        
        System.out.print("Choose a color from red and black: ");
        //asks the user to choose a color from red and black
        
        while(scan.hasNext()){  //check for any input
            if(scan.hasNextLine()){
                colorInput = scan.nextLine();    //assigns colorInput as the next input
                colorInput = colorInput.toLowerCase();  //converts the input to lower cases
                break;
                }   //end of if statemnet
            else{
                System.out.println
                ("Error: Please intput [red] or [black].");
                //prints error message
                colorInput = scan.nextLine();    //assigns colorInput as the next input
                colorInput = colorInput.toLowerCase();  //converts the input to lower cases
            }   //end of else statement
        }   //end of while loop

        System.out.print("Pick a number from 1 to 5: ");
        //asks the user to pick a number from 1 to 5
        
        while(scan.hasNext()){  //check for any input
            if(scan.hasNextInt()){    //check for input type
                numberInput = scan.nextInt();    //assigns numberInput as the next input
                while(numberInput<1 || numberInput>5){ //check if input is within domain
                    System.out.println
                    ("Error: please type in an integer from 1 to 5, inclusive.");
                    //prints the error message
                    System.out.print("Pick a number from 1 to 5: ");
                    //asks user for input
                    numberInput = scan.nextInt();    //assigns numberInput as the next input
                }   //end of while loop
                break;
            }   //end of if statement
            else{   //in cases of error
            System.out.println("Error: please type in an integer. " + scan.next());
            //prints out the error message and the false input
            System.out.print("Pick a number from 1 to 5: ");    
            //asks user for input
            numberInput = scan.nextInt();    //assigns numberInput as the next input
            }   //end of else statement
        }   //end of while loop
        
        System.out.println("The result is "+color+" "+number+".");
        
        if(colorInput.equals(color) && numberInput==number){
            System.out.println
            ("Congratulations! You just won the prize and received donkey dung!");
            //greets the user
            System.exit(0); //exits the program
        }   //end of if statement
        else{
            System.out.println("Sorry, you guessed wrong, try next time!");
            System.exit(0); //exits the program
        }   //end of else statement
    }   //end of spinTheWheel method
    
    public static void scrambler(){
        Scanner scan = new Scanner (System.in); //declairs & constructs the scanner

        System.out.print("Please enter a word: ");  //asks the user for input
        
        String wordInput = scan.nextLine();
        //assigns String variable wordInput as the next user input
        int length = wordInput.length();
        //assigns int variable length as the length of the word input
        
        char[] letter = new char[length];
        //assigns the length of word input to the char array letter
        
        for(int i=0; i<length; i++){
            letter[i] = wordInput.charAt(i);
            //assigns the letters to corresponding numbers
        }   //end of for loop
        
        for(int k=0; k+1<length; k++){  //opens a for loop for swapping letters
        char temp = ' ';    //initializaes char variable temp
        temp = letter[k];   //assigns temp as the k^th letter
        letter[k] = letter[k+1];    //assigns the k^th letter as the next one
        letter[k+1] = temp; //assigns the k+1^th letter as the previous one
        }   //end of for loop
        
        String word = new String(letter);
        //assigns String variable word as the scrambled letters
		System.out.println(word);   //prints the scrambled word
    }   //end of scrambler method
    
}   //end of class