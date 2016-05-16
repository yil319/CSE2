/*
Vincent Liu
CSE002-111
lab11-Search
2016/04/15

The objective of this lab is to perform linear 
and binary search on large arrays of random numbers.
*/

import java.util.Scanner;   //imports Scanner

public class Search{
    public static void main(String[] args){
    //declairs class and main method
    
    Scanner scan = new Scanner (System.in);
    //declairs & constructs the scanner
    
    int[] array1 = new int [50];
    int[] array2 = new int [50];
    
    int min = 0;
    int max = 0;
    
    for(int i=0; i<50; i++){
        array1[i] = (int) (Math.random() * 100 + 1);
        array2[i] = (int) (Math.random() * 100 + 1);
    }
    
    for(int i=0; i<array1.length; i++){
        if(array1[i]<array1[min]){
            min = i;
        }
    }
    
    for(int i=0; i<array1.length; i++){
        if(array1[i]>array1[max]){
            max = i;
        }
    }
    
    System.out.println("The maximum of array1 is: " + array1[max]);
    System.out.println("The minimum of array1 is: " + array1[min]);
    
    int num = 0;
    for(int i=0; i<array2.length; i++){
        int random = (int) (Math.random() * 100 + 1);
        array2[i] += random + num;
        num = array2[i] + random;
    }
    
        for(int i=0; i<array2.length; i++){
        if(array2[i]<array2[min]){
            min = i;
        }
    }
    
    for(int i=0; i<array2.length; i++){
        if(array2[i]>array2[max]){
            max = i;
        }
    }
    
    System.out.println("The maximum of array2 is: " + array2[max]);
    System.out.println("The minimum of array2 is: " + array2[min]);
    
    System.out.print("Please enter an integer greater or equal to 0. ");
    int input = 0;
    while(scan.hasNext()){
        input = scan.nextInt();
        if(input>=0){
            break;
        }
        else{
            System.exit(0);
        }
    }
    
    boolean found = false;
    for(int i=0; i<array1.length; i++){
        if(input==array1[i])
        found = true;
    }
    
    for(int i=0; i<array2.length; i++){
        if(input==array2[i])
        found = true;
    }
    
    if(found){
        System.out.println("The number " + input + " was found.");
    }
    
    else{
        System.out.println("The number " + input + " was not found.");
    }
    
    }
}