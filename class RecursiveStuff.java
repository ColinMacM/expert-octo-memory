class RecursiveStuff
{
  
  public static void main(String[] args)
  {
    //walkStaircase();
    int[] a = {6, 2, 6, 5, 5};
    System.out.println(array6(a, 0));
    System.out.println(bunnyEars(4));
    System.out.println(count7(717));
    System.out.println(fibonacci(8));
    System.out.println(factorial(4));
    
  }
  
  /**
   * Recursive Problem Set #1
   * We have a number of bunnies and each bunny has two big floppy ears. 
   * We want to compute the total number of ears across all the bunnies 
   * given the number of bunnies in the line recursively (without loops 
   * or multiplication).
   */
  public static int bunnyEars(int numBunnies)
  {
    // base case
    if(numBunnies < 0 )
      throw new RuntimeException("Cannot have negative bunnies");
    else if(numBunnies == 0)
      return 0;
    else if(numBunnies == 1)
      return 2;
    else  // recursive case
      return 2 + bunnyEars(numBunnies-1);
  }
  
  /**
   * Recursive Problem Set #5
   * Given a non-negative int n, return the count of the occurrences of 
   * 7 as a digit, so for example 717 yields 2. (no loops). Note that mod 
   * (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide 
   * (/) by 10 removes the rightmost digit (126 / 10 is 12).
   */
  public static int count7(int n)
  {
    if(n == 7)
      return 1;
    else if(n < 10) // all other single digit numbers
      return 0;
    else // n is more than 1 digit
    {
      int ones = n % 10;
      int leftOver = n / 10;
      
      if(ones == 7)
        return 1 + count7(leftOver);
      else
        return 0 + count7(leftOver);
    }
  }
  
  /**
   * Recursive Problem Set #4
   * Given an array of ints, compute recursively if the array contains a 6. 
   * We'll use the convention of considering only the part of the array that 
   * begins at the given index. In this way, a recursive call can pass 
   * index+1 to move down the array. The initial call will pass in index as 0.
   * array6([1, 8, 4, 5], 0) ? true
   * array6([1, 4], 0) ? false
   * array6([6], 0) ? true
   */
  public static boolean array6(int[] nums, int index)
  {
    if(nums.length == 0)
      return false;
    else if(nums[index] == 6)
      return true;
    else if(index == nums.length-1) // reached the end of the array and it's not 6
      return false;
    else
      return array6(nums, index+1);
    
  }

  
  
  public static int fibonacci(long t)
  {
    if( t == 1 )  // base case 1
      return 0;
    else if( t == 2 )  // base case 2
      return 1;
    else   //  recursive case
      return fibonacci(t-1) + fibonacci(t-2);
  }
  
  public static int factorial(int n)
  {
    // base case
    if(n == 2)
      return 2;
    
    // recursive case (calling the SAME method again)
    else
      return n * factorial(n-1);
  }
  
 
  
  public static int factorialTraditional(int n)
  {
    int factorial = n;
    for(int i = n-1; i > 1; i--)
      factorial *= i;
      
    return factorial;
      
  }
  
  
  public static void walkStaircase()
  {
    System.out.println("one step");
    walkStaircase();  // recursive call
  }
}