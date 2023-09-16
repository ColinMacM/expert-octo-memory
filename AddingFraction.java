import java.util.*;
class AddingFraction
{
   public static void main(String args[])
   {
      Scanner kbReader = new Scanner(System.in);
      Fraction f1 = new Fraction();
      Fraction f2 = new Fraction();
      System.out.println("enter the numerator of the first fraction.");
      f1.num = kbReader.nextInt();
      System.out.println("enter the denominator of the first fraction.");
      f1.den = kbReader.nextInt();
      System.out.println("enter the numerator of the second fraction.");
      f2.num = kbReader.nextInt();
      System.out.println("enter the denominator of the second fraction.");
      f2.den = kbReader.nextInt();
      Fraction sum = new Fraction();
      sum.num = (f1.num*f2.den) + (f2.num*f1.den);
      sum.den = f1.den*f2.den;
      System.out.println(sum.num + "/" + sum.den);
   
   }
}