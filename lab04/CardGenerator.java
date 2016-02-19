/*
Vincent Liu
CSE002-111
lab03-CardGenerator
2016/02/19

the goal of this lab is to exercise in using if statements,
switch statements, Math.random(), a random number generator.

this program generates random card outputs.
e.g. You picked the 6 of Clubs
*/

import java.util.Random;    //imports random number generator
import java.util.Scanner;   //imports Scanner

public class CardGenerator{
    public static void main(String[] args){
    //declairs class and main method
    
    //scanner
    Scanner myScanner;  //declairs a scanner
    myScanner = new Scanner (System.in);    //constructs the scanner

    int card = (int) (Math.random()*52+1);   //randomly assigns an integer from 0-52.

    String suit = "";
    //declairs string variable suit
    String identity = "";
    //declairs string variable identity
    
    if (card <= 13)
        suit = "Dimonds";   //assigns suit as Dimonds if random number card <= 13
    else if (card <= 26)
        suit = "Clubs";     //assigns suit as Clubs if random number 13 < card <= 26
    else if (card <= 39)
        suit = "Hearts";    //assigns suit as Hearts if random number 26 < card <= 39
    else if (card <= 52)
        suit = "Spades";    //assigns suit as Spades if random number 39 < card <= 52
    else
        System.out.println("error, try again"); //prints out error message
        
    int remainder = card % 13;
    //declairs and assigns the variable remainder, which is the remainder of random number card devided by 13
    
    switch (remainder){     //declairs switch method remainder
        case 1: identity = "Ace"; break;    //assigns the identity of Ace
        case 2: identity = "2"; break;      //assigns the identity of 2
        case 3: identity = "3"; break;      //assigns the idenenty of 3
        case 4: identity = "4"; break;      //assigns the idenenty of 4
        case 5: identity = "5"; break;      //assigns the idenenty of 5
        case 6: identity = "6"; break;      //assigns the idenenty of 6
        case 7: identity = "7"; break;      //assigns the idenenty of 7
        case 8: identity = "8"; break;      //assigns the idenenty of 8
        case 9: identity = "9"; break;      //assigns the idenenty of 9
        case 10: identity = "10"; break;    //assigns the idenenty of 10
        case 11: identity = "Jack"; break;  //assigns the idenenty of Jack
        case 12: identity = "Queen"; break; //assigns the idenenty of Queen
        case 0: identity = "King"; break;   //assigns the idenenty of King
    }   //end of switch method

    System.out.println("You picked the " + identity + " of " + suit);
    //outputs the identity and suit of the randomly picked card

    }   //end of main method
}   //end of class