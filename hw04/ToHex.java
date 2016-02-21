/*
Vincent Liu
CSE002-111
lab04-ToHex
2016/02/19

The goal of this homework is to get practice with 
selection statements, operators, and String manipulation. 
*Note that with multiple selections, the switch 
statement is preferred to a sequence of if statements.

This program converts decimal numbers to hexadecimal numbers.
*/

import java.util.Scanner; //imports Scanner

public class ToHex{
    public static void main(String[] args){
    //declairs class and main method
    
    //scanner
    Scanner myScanner;  //declairs a scanner
    myScanner = new Scanner (System.in);    //constructs the scanner
    
    System.out.println
    ("Please enter three numbers representing RGB values: ");
    //asks user to input three decimal RGB values.

    int r = myScanner.nextInt();
    //declairs and assigns the int value R as the next integer input
    int g = myScanner.nextInt();
    //declairs and assigns the int value G as the next integer input
    int b = myScanner.nextInt();
    //declairs and assigns the int value B as the next integer input
    int rReminder = r % 16;
    //declairs and assigns the integer value rReminder = r/16
    int gReminder = g % 16;
    //declairs and assigns the integer value gReminder = g/16
    int bReminder = b % 16;
    //declairs and assigns the integer value bReminder = b/16
    char hex[] = 
    {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    //declairs and assigns character value hex = 0~9 and A~E
    
    String hexadecimal = Integer.toHexString(r/16) +  hex[rReminder] + 
    Integer.toHexString(g/16) + hex[gReminder] + Integer.toHexString(b/16) + hex[bReminder];    
    //declairs and assigns the string value hexadecimal as the converted value
    
    if (0 <= r & r <= 255 & 0 <= g & g <= 255 & 0 <= b & b <= 255)
    //detects if the values are within correct interval
    System.out.println
    ("The decimal numbers R:" + r + ", G:" + g + ", B:" + b + 
    ", is represented in hexadecimal as: " + hexadecimal + ".");
    //outputs the converted hexadecimal result
    
    else if (r < 0 || r > 255 || g < 0 || g > 255 || b < 0 || b > 255)
    //detects if the values are within correct interval
    System.out.println
    ("Sorry, you must enter values between 0-255.");
    //reminds the user that the values have to be 0-255
    
    else
    System.out.println
    ("Sorry, your input must consist of integers.");
    //reminds the user that the values have to be type integer
    
    }   //end of main method
}   //end of class