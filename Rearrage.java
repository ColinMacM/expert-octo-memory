import java.util.*; 
/**
 * This program will focus on a method perfectSquareFirst
 * that will arrange perfect squares first and then any numbers afterward.
 * It will not work with negative numbers.
 * The main method has some hard coded test cases to test each method.
 * @author Colin MacMillan
 * Date: October 12th, 2022
 */
class Rearrage
{
   public static void main(String[] args) {
     //test case #1
     int[] ogArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 25}; 
     System.out.println("Test case 1 - let arr be 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 25");
     System.out.println("Expected output: 1    4    9    25    2    3    5    6    7    8    10]");
     System.out.println("Program output: " + Arrays.toString( perfectSquareFirst(ogArr) ));
     System.out.println();
     //test case #2
     int[] ogArr2 = {6, 100, 10, 1};
     System.out.println("Test case 2 - let arr be 6, 100, 10, 1");
     System.out.println("Expected output: 100, 1, 6, 10");
     System.out.println("Program output: " + Arrays.toString( perfectSquareFirst(ogArr2) ));
     System.out.println();
     //test case #3
     int[] ogArr3 = {12, 13, 14, 4};
     System.out.println("Test case 3 - let arr be 12, 13, 14, 4");
     System.out.println("Expected output: 4, 12, 13, 14");
     System.out.println("Program output: " + Arrays.toString( perfectSquareFirst(ogArr3) ));
     System.out.println();
     //test case #4
     long[] ogArr4 = {100000000, 35, 12, 9};
     System.out.println("Test case 4 - let arr be 100000000, 35, 12, 9");
     System.out.println("Expected output: 9, 100000000, 35, 12");
     System.out.println("Program output: " + Arrays.toString( perfectSquareFirst(ogArr4) ));
     System.out.println(); 
     

   }

    /**
     * This method will return an array with perfectSquare values first
     * The input will be any int value.
     * @param any array that has indexes with or without perfect squares
     * @return an array that has the perfect square values first
     */

    public static int[] perfectSquareFirst(int[] arr) {
      int[] arrangedIndex = new int[arr.length];
      int index = 0;
      double sq = 0;
      for(int i = 0; i < arr.length; i++)
      {
         sq = Math.sqrt(arr[i]);
         if(sq - Math.floor(sq) == 0.0)
            {
               arrangedIndex[index] = arr[i];
               index++;
            }
      }
      for(int i = 0; i < arr.length; i++)
      {
     
          sq = Math.sqrt(arr[i]); 
          if(sq - Math.floor(sq) != 0.0)
            {
               arrangedIndex[index] = arr[i];
               index++;
            }

      }
      return arrangedIndex;
   }

    /**
     * This method will return an array with perfectSquare values first
     * The input will be any long value.
     * @param any array that has indexes with or without perfect squares
     * @return an array that has the perfect square values first
     */

    public static long[] perfectSquareFirst(long[] arr) {
      long[] arrangedIndex = new long[arr.length];
      int index = 0;
      double sq = 0;
      for(int i = 0; i < arr.length; i++)
      {
         sq = Math.sqrt(arr[i]);
         if(sq - Math.floor(sq) == 0.0)
            {
               arrangedIndex[index] = arr[i];
               index++;
            }
      }
      for(int i = 0; i < arr.length; i++)
      {
          sq = Math.sqrt(arr[i]); 
          if(sq - Math.floor(sq) != 0.0)
            {
               arrangedIndex[index] = arr[i];
               index++;
            }

      }
      return arrangedIndex;

    }


}