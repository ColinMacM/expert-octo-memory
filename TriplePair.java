public class TriplePair
{
   public static void main(String args[])
   {
      int[] a = {1, 3, 5, 7, 9};
      int[] b = {-4, 12, 3, 7};
      int[] c = {1, 2, 3, 4};
      int[] d = {8, 10, 2, 6, 7};
      System.out.println(ifTriple(a, 0));
      
      System.out.println("Test Case #1");
      System.out.println("Expected output: true");
      System.out.println("Actual output: " + ifTriple(a, 0));
      System.out.println();
      
      System.out.println("Test Case #2");
      System.out.println("Expected output: false");
      System.out.println("ACtual output: " + ifTriple(b, 0));
      System.out.println();
      
      System.out.println("Test Case #3");
      System.out.println("Expected Output: false");
      System.out.println("Actual output: " + ifTriple(c, 0));
      System.out.println();
      
      System.out.println("Test Case #4");
      System.out.println("Expected Output: false");
      System.out.println("Actual output: " + ifTriple(d, 3));
      System.out.println();
      
      System.out.println("Test Case #5");
      System.out.println("Expected Output: true");
      System.out.println("Actual output: " + ifTriple(d, 0));
           
   }
   public static boolean ifTriple(int[] nums, int index)
   {
      
      if(nums.length == 1) // checks if its size 1
         return false;  
      else if((3*(nums[index])) == nums[index+1]) 
         return true;
      else if(index == nums.length-2)
         return false;
      else
         return ifTriple(nums, index+1); 
   }   
}