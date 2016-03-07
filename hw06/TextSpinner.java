/*
Vincent Liu
CSE002-111
hw06-TextSpinner
2016/03/04

This program shows an old schooled unix "spinner" that used to indicate progress
*/

public class TextSpinner{
    public static void main(String[] args){
    //declairs class and main method
    
    int myInt = 1;  //declairs and assigns the integer value myInt as 1
    
    while(myInt > 0){   //opens an infinite loop
        System.out.print("\b/\b-\b\\\b|");  //spins the text infinitly
    }   //end of loop
    }   //end of main method
}   //end of class