import java.util.*;

class SumFactors
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Plz enter a valid int");
      int num = input.nextInt(); //comments are for colins eyes
      double counter = 0; //these will be used later in the code
      int sumOfFactors = 0;
      for(int i = 1; i <= num; i++)
      {
         if(num % i == 0) //checks if prime
         {
            for(int j = 1; j <= i; j++)
            {
               if(i%j == 0) //checks if the prime has primes
               {
                  counter++; //counts the number of primes in the prime.
               }
            }
            if(counter%2 ==0) //if the prime is even,
            {
               sumOfFactors = sumOfFactors + i; //it gets added to the total sum
            }
            counter = 0; //reset counter
         }     
      }
      System.out.println(sumOfFactors);
   }
}