//Vincent Liu
//CSE002-111
//lab02-Cyclometer
//2016/02/05

//The goal of this lab is to  measure the distance traveled with
//wheel diameter, time elasted, and counts of wheel rotations of my bicycle.

public class Cyclometer{
    public static void main(String[] args) {
    //assigning class and main method
    
    //variables
    int secsTrip1 = 480;    //input of time traveled in seconds for trip one
    int secsTrip2 = 3220;   //input of time traveled in seconds for trip two    
    int countsTrip1 = 1561; //input of the number of times wheels rotated for trip one
    int countsTrip2 = 9037; //input of the number of times wheels rotated for trip two
    
    //constants
    double wheelDiameter = 27.0,    //diameter of wheels of my bycicle in inches
           pi = 3.14159,            //approximated value of pi
           feetPerMile = 5280,      //number of feet in a mile
           inchesPerFoot = 12,      //number of inches in a foot
           secondsPerMinute = 60;   //number of seconds in a minute
    double distanceTrip1, distanceTrip2, totalDistance; //declaring dounle values distance of trip one,
                                                        //distance of trip two, and total distance traveled.
    System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute) +  //calculation and storage of
                       " minutes and had " + countsTrip1 + " counts."); //time and counts of trip one
    System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute) +  //calculation and storage of
                       " minutes and had " + countsTrip2 + " counts."); //time and counts of trip two
    
    //calculations
    distanceTrip1 = countsTrip1 * wheelDiameter * pi;   //calculation of distance traveled in inches of trip one
    distanceTrip1 /= inchesPerFoot * feetPerMile;       //converting distance traveled of trip one from inches to miles
    distanceTrip2 = countsTrip2 * wheelDiameter * pi    //calculation of distance traveled in inches of trip two
                    / inchesPerFoot / feetPerMile;      //converting distance traveled of trip two from inches to miles
    totalDistance = distanceTrip1 + distanceTrip2;      //calculation of total distance traveled
    
    //Outputs
    System.out.println("Trip one was " + distanceTrip1 + " miles."); //prints out distance traveled of trip one
    System.out.println("Trip two was " + distanceTrip2 + " miles."); //prints out distance traveled of trip two
    System.out.println("The total distance was " + totalDistance + " miles.");   //prints out total distance traveled
    
    }   //end of main method
}   //end of class