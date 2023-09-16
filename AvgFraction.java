import java.util.*;

class AvgFraction
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a fraction. Numerator followed by denominator. Negative fraction to quit.");
      Fraction nextFrac = new Fraction(in.nextInt(), in.nextInt());
      int numOfFractions = 0;  // counter to track how many fractions were entered
      Fraction sumOfFractions = new Fraction(); // accumulator to add up all the entered Fractions    
      Fraction max = new Fraction(nextFrac);
      Fraction min = new Fraction(nextFrac); 
           
      while( nextFrac.toDecimal() >= 0 )
      {
         numOfFractions++;
         // sumOfFractions = sumOfFractions + nextFrac;     
         sumOfFractions.plusEquals(nextFrac);
         
         if( nextFrac.toDecimal() > max.toDecimal() )
            max = nextFrac;
         
         if( nextFrac.toDecimal() < min.toDecimal() )
            min = nextFrac;                 
         
         // increment
         System.out.println("Enter a fraction. Numerator followed by denominator. Negative fraction to quit.");
         //nextFrac = new Fraction(in.nextInt(), in.nextInt()); - not the best way - new Fraction created each time
         nextFrac.num = in.nextInt();
         nextFrac.den = in.nextInt();
         
      }
      
      sumOfFractions.reduce();
      System.out.println("The sum of the fractions is " + sumOfFractions);
      // calculate the average
      // avergage = sumOfFractions/numOfFractions;
      
      //Fraction avg = new Fraction(sumOfFractions.num, sumOfFractions.den*numOfFractions);
      // wrapper object
      
      Fraction avg = sumOfFractions.divide( new Fraction(numOfFractions, 1) );
      System.out.println("The average of the fractions is " + avg);
      System.out.println("The max of the fractions is " + max);
      System.out.println("The min of the fractions is " + min);

        
   }

}