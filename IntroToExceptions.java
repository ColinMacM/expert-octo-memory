/**
 * This is our basic java template. You can use this as a starting
 * point for any Java program we will be writing.
 * Name: Mr. Cardoso
 * Date: Sept. 20th, 2022
 */
 import java.util.*;
 
 class IntroToExceptions
 { 
     
   public static int factorial(int n)
   {
     int factorial = n;
     for(int i = n-1; i>1; i--)
       factorial *= i;
     
     return factorial;       
     
   }
   
   public static void main(String[] args)
   { 
         
         Scanner kbReader = new Scanner(System.in);
         String[] names = {"Alex", "Evan", "Vincenzo", "Colin", "Keith", "Jimmy", "Patrick"};
         
         System.out.println("Enter the index of the array that you would like to access ");
         int index = 0;
         boolean isValidInput = false;
         do{
            try
            {
               index = kbReader.nextInt();
               isValidInput = true;
            }
            catch(Exception e)
            {
               isValidInput = false;
               kbReader.next();

            }
            System.out.println(names[index]);
         }
         while(!isValidInput);
         
                 
   }  
     
 }
 
 
  