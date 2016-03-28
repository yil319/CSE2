/*
Vincent Liu
CSE002-111
lab09-Methods
2016/03/25

The objective of this lab is to get basic 
experience in declaring and calling methods.

This program will generate random basic English sentences.
*/

import java.util.Scanner;   //imports Scanner
import java.util.Random;    //imports Random number generator

public class Methods{
    public static void main(String[] args){
    //declairs class and main method
    
        Scanner scan = new Scanner (System.in);
        //declairs & constructs the scanner
        
        int i = 0;  //initializes and assigns int value i = 0
        while(i==0){
                System.out.println("The "+adjectives()+" "+adjectives()+" "+
                subject()+" "+verb()+" the "+adjectives()+" "+object()+".");
                //prints out the randomly generated sentence
                System.out.println();   //changes the line
                System.out.print("Type 1 for another sentence, 2 to quit.");
                //asks if the user wants another sentence
                int k = scan.nextInt();
                //declairs and assigns int value k as the next integer input
                if(k==1){   //condition for generating another sentence
                    i = 0;    //sets the value of i = 0
                    System.out.println();   //changes the line
                }   //end of if statement
                else if(k==2){  //condition for quitting
                    i++;    //adds 1 to the value of i
                }   //end of else if statement
        }   //end of while loop
    }   //end of main method

    public static String adjectives(){  //opens a String method for the adjectives
        Random random = new Random ();
        //declaris & constructs the random number generator
        int randomInt = random.nextInt(10);
        //declairs athe int value randomInt and it generates a random int less than 10
        String adjectives = ""; //initializes String value adjectives

        switch(randomInt){  //switch statement for the list of adjectives
            case 0: adjectives = "bulky";
                break;
            case 1: adjectives = "smart";
                break;
            case 2: adjectives = "stupid";
                break;
            case 3: adjectives = "quick";
                break;
            case 4: adjectives = "moist";
                break;
            case 5: adjectives = "slimy";
                break;
            case 6: adjectives = "sloppy";
                break;
            case 7: adjectives = "creepy";
                break;
            case 8: adjectives = "sketchy";
                break;
            case 9: adjectives = "flamboyant";
                break;
        }   //end of switch statement
        return adjectives;   //returns the result
    }   //end of method adjectives
    
    public static String subject(){     //opens a String method for the subjects
        Random random = new Random ();
        //declaris & constructs the random number generator
        int randomInt = random.nextInt(10);
        //declairs the int value randomInt and it generates a random int less than 10
        String subject = "";    //initializes String value subject

        switch(randomInt){  //switch statement for the list of subject
            case 0: subject = "flying spaghetti";
                break;
            case 1: subject = "father";
                break;
            case 2: subject = "gold fish";
                break;
            case 3: subject = "duck";
                break;
            case 4: subject = "goblin";
                break;
            case 5: subject = "spider";
                break;
            case 6: subject = "toad";
                break;
            case 7: subject = "frog";
                break;
            case 8: subject = "teacher";
                break;
            case 9: subject = "wrestler";
                break;
        }   //end of switch statement
        return subject;   //returns the result
    }   //end of method subject
    
    public static String verb(){    //opens a String method for the verbs
        Random random = new Random ();
        //declaris & constructs the random number generator
        int randomInt = random.nextInt(10);
        //declairs the int value randomInt and it generates a random int less than 10
        String verb = "";   //initializes String value verb

        switch(randomInt){  //switch statement for the list of verb
            case 0: verb = "burned";
                break;
            case 1: verb = "touched";
                break;
            case 2: verb = "licked";
                break;
            case 3: verb = "masssaged";
                break;
            case 4: verb = "grabbed";
                break;
            case 5: verb = "kicked";
                break;
            case 6: verb = "slapped";
                break;
            case 7: verb = "stung";
                break;
            case 8: verb = "pierced";
                break;
            case 9: verb = "radiated";
                break;
        }   //end of switch statement
        return verb;   //returns the result
    }   //end of method verb
    
    public static String object(){  //opens a String method for the objects
        Random random = new Random ();
        //declaris & constructs the random number generator
        int randomInt = random.nextInt(10);
        //declairs the int value randomInt and it generates a random int less than 10
        String object = ""; //initializes String value object

        switch(randomInt){  //switch statement for the list of object
            case 0: object = "Donald Trump";
                break;
            case 1: object = "student";
                break;
            case 2: object = "bunny";
                break;
            case 3: object = "kitten";
                break;
            case 4: object = "Spike Lu";
                break;
            case 5: object = "Simon Shao";
                break;
            case 6: object = "baby";
                break;
            case 7: object = "pole";
                break;
            case 8: object = "golf ball";
                break;
            case 9: object = "chicken";
                break;
        }   //end of switch statement
        return object;   //returns the result
    }   //end of method object
    
}   //end of class