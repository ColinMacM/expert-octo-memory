import java.util.*;


/**
 * This program will read in a mark and determine if it is 
 * a passing grade. The mark could be in character format or
 * in int format.
 * @author Mr. C
 * date: Oct. 5th, 2022
 */
class FiveFiveNumFive
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Letter Grade? (y/n)");
    char response = in.nextLine().charAt(0);
    System.out.println("Value of grade?");
    
    if (response == 'y')
    {
      char mark = in.nextLine().charAt(0);
      if (isPass(mark))
        System.out.println("Pass");
    }
    else // assume numerical grade
    {
      int mark = in.nextInt();
      if(isPass(mark))
        System.out.println("Pass");
    }
  }
  
  /**
   * This method will take a mark as a character - for example
   * a, b, c, d, f, and then return true if the mark is a 
   * passing mark (a, b, c, d) and false otherwise.
   * @param mark the input mark - could be upper or lowercase a, b, c, d, or f
   * @return true if the mark is passing and false otherwise
   */
  public static boolean isPass(char mark)
  {
    if((mark >= 65 && mark <= 68) || (mark >= 97 && mark <= 100))
      return true;
    else
      return false;
  }
  
  /**
   * This method will take a mark as an int - for example
   * 95% and then return true if the mark is a 
   * passing mark (>= 50) and false otherwise.
   * @param mark the input mark - out of 100
   * @return true if the mark is passing and false otherwise
   */
  public static boolean isPass(int mark)
  {
    if(mark >= 50)
      return true;
    else
      return false;
  }
  
}