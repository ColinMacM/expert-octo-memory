import java.util.*;

class AddingFractions 
{
   public static void main(String[] args) 
   {
      Scanner input = new Scanner(System.in);
   
      Fraction f1 = new Fraction();
     
      System.out.println("Please enter a numerator of the first fraction");
      f1.num = input.nextInt();
     
      System.out.println("Please enter a denominator of the first fraction");
3     
      Fraction f2 = new Fraction();
     
      System.out.println("Please enter a numerator of the second fraction");
      f2.num = input.nextInt();
     
      System.out.println("Please enter a denominator of the second fraction");
      f2.den = input.nextInt();
     
      Fraction f3 = f2.plus(f1);

           
      System.out.println("The sum of " + f1 + " + " + f2 + " = " + f3);
   
      //System.out.println("-");
      //System.out.println(f3.den);
   }
}