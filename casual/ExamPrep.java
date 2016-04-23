import java.util.Scanner;   //imports Scanner
import java.util.Random;    //imports Random number generator

public class ExamPrep{
    public static void main(String[] args){
    //declairs class and main method
        Scanner scan = new Scanner (System.in); //declairs & constructs the scanner
        
        int n = 5;
        int k = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i<k && j<k){
                    System.out.print(k-1);
                }
            }
            System.out.println();
            k++;
        }
        
        n = 10;
        for(int i=5; i<n; i--){
            for(int j=5; j<n; j--){
                if(i<k-(i-5)){
                    System.out.print(k);
                }
            }
            System.out.println();
            k++;
        }
    }
}