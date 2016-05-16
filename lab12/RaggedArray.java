/*
Vincent Liu
CSE002-111
lab12-RaggedArray
2016/04/22

The objective of this lab is to get practice with 2D ragged array.

The program will ask the user for an integer which will be the size
of the main array (the size of the column). Then, this program will 
create a random-sized member array (of length less than that of the 
 main array) and assign one to each element of the main array
*/

import java.util.Scanner;   //imports Scanner
import java.util.Arrays;    //imports Arrays

public class RaggedArray{
    public static void main(String[] args){
    //declairs class and main method
    
    Scanner scan = new Scanner (System.in);
    //declairs & constructs the scanner
    int i = 0, j = 0;
    
    System.out.print("Please enter an integer as the size of the main array: ");
    //asks the user for the size of the main array
    int size = scan.nextInt();
    int[][] array = new int [size][];
    
    for(i=0; i<array.length; i++){
        array[i] = new int [(int) (Math.random() * size)];
    }
    
    for(i=0; i<array.length; i++){
        for(j=0; j<array[i].length; j++){
            array [i][j] = (int) (Math.random() * 20 + 1);
        }
    }
    System.out.println();
    
    System.out.println("Here is your unsorted array:");
    for(i=0; i<array.length; i++){
        if(array[i].length==0){System.out.print("0");}
        for(j=0; j<array[i].length; j++){
            System.out.print(array[i][j]);
            if(j>=0 && j<array[i].length-1){System.out.print(", ");}
        }
        System.out.println();
    }
    System.out.println();
    
    System.out.println("Here is your sorted array:");
    int min = 0;
    for(i=0; i<array.length; i++){
        for(j=0; j<array[i].length; j++){
            Arrays.sort(array[i]);
        }
    }
    for(i=0; i<array.length; i++){
    if(array[i].length==0){System.out.print("0");}
        for(j=0; j<array[i].length; j++){
            System.out.print(array[i][j]);
            if(j>=0 && j<array[i].length-1){System.out.print(", ");}
        }
        System.out.println();
    }
    System.out.println();
    
    System.out.println("Here is your rearranged array:");
    for(int k = 0; k<array.length; k++){
        for(i=0; i<array.length; i++){
            for(j=0; j<array[i].length;j++){
                if(array[i].length>array[k].length){
                int[] temp = new int [array[i].length];
                temp = array[k];
                array[k] = array[i];
                array[i] = temp;
                }
            }
        }
    }
    
    for(i=0; i<array.length; i++){
        if(array[i].length==0){System.out.print("0");}
        for(j=0; j<array[i].length; j++){
            System.out.print(array[i][j]);
            if(j>=0 && j<array[i].length-1){System.out.print(", ");}
        }
        System.out.println();
    }
    System.out.println();
    
    System.out.print("What number would you like to search for? ");
    int search = scan.nextInt();
    boolean found = false;
    for(i=0; i<array.length; i++){
        for(j=0; j<array[i].length; j++){
        if(search==array[i][j])
        found = true;
        }
    }
    
    if(found){
        System.out.println("The number " + search + " was found in column "
        + j + ", row " + i + ".");
    }
    
    else{
        System.out.println("The number " + search + " was not found.");
    }
    }   //end of main method
}   //end of class