/*
Vincent Liu
CSE002-111
lab07-Bowtie
2016/03/11

The goal of this lab is to further practice while loops with a break statement.
This program generates bowties with ‘*’.
*/

import java.util.Scanner;    //imports Scanner

public class Bowtie{
    public static void main(String[] args){
    //declairs class and main method
    
	Scanner scan = new Scanner (System.in);
        //declairs & constructs the scanner
    
	int numberStars = 9;
    int nStars = numberStars;
	int i = 0;
	int k = 0;
	while(i < nStars){	//starts a while loop that prints the top half of the bowtie
		System.out.print("*");	//prints a star ‘*'
		i++;		//set i = i + 1
		while(i == nStars){	//starts a while loop for ending each row of stars
			nStars -= 2;	//set nStars = nStars - 2
			i = 0;	//reset i = 0
			k++;		//set k = k + 1
			switch(k){	//starts a switch statement to format the stars
				case 1: System.out.print("\n "); break;
				case 2: System.out.print("\n  "); break;
				case 3: System.out.print("\n   "); break;
				case 4: System.out.print("\n    "); break;
				case 5: System.out.print("\n     "); break;
				case 6: System.out.print("\n      "); break;
				case 7: System.out.print("\n       "); break;
				case 8: System.out.print("\n        "); break;
				case 9: System.out.print("\n         "); break;
				case 10: System.out.print("\n          "); break;
				case 11: System.out.print("\n           "); break;
				case 12: System.out.print("\n            "); break;
				case 13: System.out.print("\n             "); break;
				case 14: System.out.print("\n              "); break;
				case 15: System.out.print("\n               "); break;
				case 16: System.out.print("\n                "); break;
				case 17: System.out.print("\n                 "); break;
				//put in the correct spaces for each line of stars
			}	//end of switch
		}	//end of while loop
	}	//end of while loop
	int mStars = numberStars
	while(mStars < numberStars){		//starts a while loop for the bottom half of the bowtie
		nStars += 2;	//set nStars = nStars + 2
		while(i < nStars){	//starts a while loop that prints stars
			System.out.print("*");	//prints one star '*'
			i++;	//set i = i + 1
		}	//end of while loop
		System.out.print(k);
		i = 0;	//reset i = 0
	}	//end of while loop		

    }   //end of main method
}   //end of class