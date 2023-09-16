import java.util.*;
public class AddFractions
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Fraction f1 = new Fraction();    
        
        Fraction f2 = new Fraction();
        
        f1.num = input.nextInt();
        f1.den = input.nextInt();
        f2.num = input.nextInt();
        f2.den = input.nextInt();
        
        Fraction f3 = f1.times(f2);
        System.out.println(f3.toString());
      
    }
}