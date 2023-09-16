import java.util.*; // Scanner
/**
 * This program will focus on a method findFactors that will find the
 * factors of a given int and return them all in an int array.
 * There is an overloaded method that will do the same for a long parameter.
 * The main method has some hard coded test cases to test each method.
 * @author Colin MacMillan
 * Date: Oct. 12th 2022
 */
class methodTemplate
{
   public static void main(String[] args)
   {
      // test case #1
      //test case, put in one number, System.out.println("let n be 12");
      //expected output (should be 4)
      //program output (is 4)

      

      // test case #2

      //test case #3
      
      //test case #4
      System.out.println("Test case 1 - let n be 12");
      System.out.println("Expected output: [1, 2, 3, 4, 6, 12]");
      System.out.println("Program output: " + Arrays.toString( findFactors(12) ));
      System.out.println("Test case 2 - let n be 7");
      System.out.println("Expected output: [1, 7]");
      System.out.println("Program output: " + Arrays.toString( findFactors(7) ));
               
   }
   
   /**
    * explain the method
    * 
    * 
    * 
    * @param n the input integer for which we are finding the factors
    * @return the array of factors of n
    */   
   public static int[] findFactors(int n)
   {
   
      int[] factors  = new int[numOfFactors(n)];
      int array = 0;
      for(int i = 1; i <= n; i++)
      {
         if( n % i == 0 )  // check if i is a factor of n
         {
            factors[array] = i; // add i to the array in the correct position
            array++;
         }
      }
      return factors;
   
   }
   
   /**
    * This method will find the factors of a given long
    * and return them in an int array. For example, if
    * the input parameter n is 12, the following array
    * should be returned: {1, 2, 3, 4, 6, 12}
    * @param n the input long for which we are finding the factors
    * @return the array of factors of n
    */   
   public static long[] findFactors(long n)
   {
   
      long[] factors  = new long[Math.toIntExact(numOfFactors(n))];
      int array = 0;
      for(int i = 1; i <= n; i++)
      {
         if( n % i == 0 )  // check if i is a factor of n
         {
            factors[array] = i; // add i to the array in the correct position
            array++;
         }
      }
      return factors;
   
   }

   
   /**
    * This method will return the number of factors of input n.
    * For example if n is 12, the method should return 6 (1, 2, 3, 4, 6, 12)
    * @param n - the input number
    * @return the number of factors of n
    */
   public static int numOfFactors(int n)
   {
      int numOfFactors = 0;
      for(int i = 1; i <= n; i++){
         if(n % i == 0)
            numOfFactors++;
      }
      
      return numOfFactors;
   
   }
   
   
   /**
    * This method will return the number of factors of input n.
    * For example if n is 12, the method should return 6 (1, 2, 3, 4, 6, 12)
    * @param n - the input number
    * @return the number of factors of n
    */
   public static long numOfFactors(long n)
   {
      long numOfFactors = 0;
      for(int i = 1; i <= n; i++){
         if(n % i == 0)
            numOfFactors++;
      }
      
      return numOfFactors;
   
   }

  

}