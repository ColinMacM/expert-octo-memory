import java.util.*;
class StudentResults
{
   public static void main(String[] args)
   {
      System.out.println("Please enter the scores of paper one and paper two");
      Scanner kbReader = new Scanner(System.in);
      int testOne = kbReader.nextInt();
      int testTwo = kbReader.nextInt();
      boolean ifPass = passOrFalse(testOne, testTwo);
      System.out.println("Pass: " + ifPass);
   }
   public static boolean passOrFalse(int testOne, int testTwo)
   {
      if(testTwo == -1)
         return false;
      else if(testOne == -1)
      {
         if(testTwo == 100)
            return true;
         else
            return false;
      }
      else
      {
         if( ((testOne+testTwo)/2) >= 90)
            return true;
         else
            return false;
      }

      
   }
}
