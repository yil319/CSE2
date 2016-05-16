/*
Vincent Liu
CSE002-111
hw13-Holoporter
2016/04/26

The objective of this homework is to get practice in manipulating 
multidimensional ragged arrays, and in writing methods that have array parameters.

This program will 
*/

import java.util.Arrays;    //imports Arrays

public class Holoporter{
    public static void main(String[] args){
    //declairs class and main method
    print(soRandom());
    //print(soRandom());
    }   //end of main method
    
    public static String[][][] soRandom(){
        String[][][] array = new String [(int)(Math.random()* 10 + 1)][][];
        //declairs and assigns random length to from 1 to 10 the 3-D array
        for(int i=0; i<array.length; i++){
            array[i] = new String [(int)(Math.random() * 10 + 1)][];
            //assigns random length from 1 to 10 to the 2-D array
            for(int j=0; j<array[i].length; j++){
                array[i][j] = new String [(int)(Math.random() * 10 + 1)];
                //assigns random length from 1 to 10 to the 1-D array
                for(int k=0; k<array[i][j].length; k++){
                    array[i][j][k] = coder();
                    //assigns code to the element
                }   //end of for loop
            }   //end of for loop
        }   //end of for loop
        return array;   //returns the 3-D String array
    }   //end of soRandom method
    
    public static String coder(){
        char letter1 = (char)(Math.random() * 26 + 'A');    //randomly assigns char value to letter1
        char letter2 = (char)(Math.random() * 26 + 'A');    //randomly assigns char value to letter2

        int num1 = (int)(Math.random() * 10);  //randomly assigns int value to num1
        int num2 = (int)(Math.random() * 10);  //randomly assigns int value to num2
        int num3 = (int)(Math.random() * 10);  //randomly assigns int value to num3
        int num4 = (int)(Math.random() * 10);  //randomly assigns int value to num4
        
        String code = String.valueOf(letter1)+String.valueOf(letter2)+
        String.valueOf(num1)+String.valueOf(num2)+String.valueOf(num3)+String.valueOf(num4);
        return code;   //returns the code
    }   //end of coder method
    
    public static void print(String[][][] array){
        for(int i=0; i<array.length; i++){
            System.out.print(Arrays.toString(array[i]));
            for(int j=0; j<array[i].length; j++){
                System.out.print(Arrays.toString(array[i][j]));
                for(int k=0; k<array[i][j].length; k++){
                    System.out.print(array[i][j][k]);
                    if(k>=0 && k<array[i][j].length-1){System.out.print(",");}
                    if(k==array[i][j].length){System.out.print("|");}
                }   //end of for loop
                if(j==array[i].length){System.out.print("---");}
            }   //end of for loop
        }   //end of for loop
    }   //end of print method
    
    public static void holoport(String[][][] array, String[][][] container){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                for(int k=0; k<array[i][j].length; k++){
                    if(container[i][j].length>array[i][j].length){
                    
                    }
                    container[i][j][k] = array [i][j][k];
                }
            }
        }
    }   //end of holoport method
    
    public static void sampling(){
        
    }

    public static void percentage(){
        
    }
    
    public static void frankenstein(){
        
    }

    
}   //end of class