/*
Vincent Liu
CSE002-111
lab03-Check
2016/02/12

the goal of this lab is to demonstrate how I can get
input from the user and use that data to perform computations
*/

import java.util.Scanner;   //imports Scanner

public class Check{
    public static void main(String[] args) {
    //assigning class and main method
    
    //scanner
    Scanner myScanner;  //declairs a scanner
    myScanner = new Scanner (System.in);    //constructs the scanner
    
    //inputs and value assignments
    System.out.print ("Enter the original cost of the check in the form xx.xx: ");
    //asks the user for cost input in the form of xx.xx
    double checkCost = myScanner.nextDouble (); //assigns the double value checkCost as the next input
    System.out.print ("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
    //asks the user for tip percentage in whole number
    double tipPercent = myScanner.nextDouble ();    //assigns the double value tipPercent as the next input
    tipPercent /= 100;  //converts the percentage into a decimal value
    System.out.print ("Enter the number of people who went out to dinner: ");
    //asks the user for number of people who went to the dinner
    int numPeople = myScanner.nextInt ();   //assigns the int value numPeople as the next input
    double totalCost;   //assigns the double value totalCost
    double costPerPerson;   //assigns the double value costPerPerson
    int dollars,    //whole dollar amount of cost
        dimes,      //for storing digits to the right
        pennies;    //of the decimal point for the cost$
    
    //calculations
    totalCost = checkCost * (1 + tipPercent);
    costPerPerson = totalCost / numPeople;
    dollars = (int) costPerPerson;  //get the whole amount, dropping decimal fraction
    dimes = (int) (costPerPerson * 10) % 10;
    pennies = (int) (costPerPerson * 100) % 10;
    /*
     *get dimes and pennies amount, e.g.,
     *(int) (6.73 * 10) % 10 -> 67 % 10 -> 7
     *where the % (mod) operator returns the remainder
     *after the division: 583 % 100 -> 83, 27 % 5 -> 2
     */
    
    //results
    System.out.println ("Each person in the group owes $ "
                        + dollars + '.' + dimes + pennies); //prints the result
    
    }   //end of main method
}   //end of class