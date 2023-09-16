import java.util.*;

class CrosswordPuzzle
{
   public static int maxLetters(String str, String strTwo)
   {
         int maxLetters = 0;
         int maxLettersTwo = 0;
         for(int l = 0; l < str.length(); l++)
         {
            for(int k = 0; k < str.length(); k++)
            { 
               if(str.charAt(l) == str.charAt(k))
               {
                  maxLetters++;
               }
            }
         }
         for(int m = 0; m < strTwo.length(); m++)
         {
            for(int n = 0; n < strTwo.length(); n++)
            { 
               if(str.charAt(m) == str.charAt(n))
               {
                  maxLettersTwo++;
               }
            }
         }   
         if(maxLetters > maxLettersTwo)
            return maxLetters;
         else
            return maxLettersTwo;
   } 

   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int letterCounter = 0;
      String str = input.nextLine();
      String strTwo = input.nextLine();
      for(int i = 0; i < str.length(); i++)
      {
         for(int j = 0; j < strTwo.length(); j++)
         { 
            if(str.charAt(i) == strTwo.charAt(j))
            {
               letterCounter++;
            }
         }
      }
   int mostCommonNumber = CrosswordPuzzle.maxLetters(str, strTwo);
   System.out.println(mostCommonNumber);
   }

}