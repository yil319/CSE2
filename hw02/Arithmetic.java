//Vincent Liu
//CSE002-111
//hw02-Arithmetic
//2016/02/05

//the goal of this homework is to get practice manipulating stored in variables,
//in running simple calculations, and in printing the numerical output that I generated.

public class Arithmetic{
    public static void main(String[] args) {
    //assigning class and main method
    
    //variables
    int numPants = 3;           //number of pairs of pants
    double pantsPrice = 34.98;  //cost per pair of pants
    int numShirts = 2;          //nunmber of sweatshirts
    double shirtPrice = 24.99;  //cost per shirt
    int numBelts = 1;           //number of belts
    double beltPrice = 33.99;   //cost per belt
    
    double paSalesTax = 0.06;   //pennsylvania sales tax rate
    
    //calculations
    double totalCostPants = numPants * pantsPrice;          //total cost of pants
    double totalCostShirts = numShirts * shirtPrice;        //total cost of shirts
    double totalCostBelts = numBelts * beltPrice;           //total cost of belts
    double totalTaxPants = totalCostPants * paSalesTax;     //sales tax on all pants
    double totalTaxShirts = totalCostShirts * paSalesTax;   //sales tax on all shirts
    double totalTaxBelts = totalCostBelts * paSalesTax;     //sales tax on all belts
    double totalCostBeforeTax = totalCostPants + totalCostShirts + totalCostBelts;  //total cost before tax
    double totalTax = totalTaxPants + totalTaxShirts + totalTaxBelts;               //total sales tax
    int totalCostAfterTax0 = (int) (totalCostBeforeTax + totalTax) * 100;   //total cost after sales tax
    double totalCostAfterTax1 = totalCostAfterTax0 / 100.00;
    
    //outputs
    System.out.println("I bought " + numPants + " pairs of pants.");
    System.out.println("I bought " + numShirts + " shirts.");
    System.out.println("I bought " + numBelts + " belts.");
    //prints items bought
    
    System.out.println(numPants + " pants costed me " + totalCostPants + " dollars before tax.");
    System.out.println(numShirts + " shirts costed me " + totalCostShirts + " dollars before tax.");
    System.out.println(numBelts + " belts costed me " + totalCostBelts + " dollars before tax.");
    //prints total cost of each type of item before tax
    
    System.out.println("The total cost is " + totalCostBeforeTax + " dollars before applying pennsylvania sales tax.");
    System.out.println("The total cost is " + totalCostAfterTax1 + " dollars after applying pennsylvania sales tax.");
    //prints total cost of the purchase before and after tax
    
    }   //end of main method
}   //end of class