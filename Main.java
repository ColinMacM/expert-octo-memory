import java.util.*;
public class Main 
{

   public static void main(String[] args)
   {
      Scanner kbReader = new Scanner(System.in);
      
      int[] arr = new int[] {10, 20, 30, 40};
      String intOrString = "sus";
      findFactors();
   }

   public static void swap(double[] list, int i, int j)
   {
      double temp = list[i];
      list[i] = list[j];
      list[j] = temp;
   }
   
   public static void printOddIndices(int[] arr)
   {
      for(int i = 1; i < arr.length; i++)
      {
         if(i%2 != 0)
            System.out.println(arr[i]);
      }
   }
   public static int lastMultiple(int[] arr)
   {
      for (int i = arr.length - 1; i >= 0; i--) 
      {
		   if(arr[i]%3 == 0)
         {
            return arr[i];
         }
      }
      return 0;
	}
   public static boolean IntOrString(String intOrString)
   {
      for(int i = 0; i <= intOrString.length(); i++)
      {
         if(Character.isLetter(i))
            return true;
         
      }
   return false;
   }
   public static void replaceLetter(String intOrString)
   {
      Scanner kbReader = new Scanner(System.in);
      String word = kbReader.nextLine();
      String letterFinder = kbReader.nextLine();
      String letterReplacer = kbReader.nextLine();
      String tempword = word.replace(letterFinder.charAt(0), letterReplacer.charAt(0));
      System.out.println(tempword);      
   }
   public static void findFactors()
   {
      Scanner kbReader = new Scanner(System.in);
      int sizeOfArray = kbReader.nextInt();
      int[] factor = new int[sizeOfArray];
      for(int i = 0; i < factor.length; i++)
      {
         if(sizeOfArray % (i) == 0)
            factor[i] = i;
      }
      for(int i = 0; i < factor.length; i++)
      {
      System.out.println(factor[i]);
      }
   }
   


}