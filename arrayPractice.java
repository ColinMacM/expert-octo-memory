
import java.util.*;
public class arrayPractice 
{
    public static void main(String []args) 
    {

        Scanner kbReader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = kbReader.nextInt();
        int[] occurence = new int[11];
        double mean = 0.0;
        double counter = 0.0;
        while(n>=0)
        {
            n = kbReader.nextInt();
            if(n>= 0 && n <= 10)
            {
               occurence[n]++;
                
            }
            if(n<=0)
            {
               continue;
            }

        }
        for(int i=0; i<occurence.length; i++)
        {
            System.out.println("Score " + i + " Occurence " + occurence[i]);
        }
        for(int i=0; i<occurence.length; i++)
        {
            mean += (i*occurence[i]);
            counter+= (occurence[i]);
        }
        mean = Math.round(mean/counter * 10.0)/10.0;
        System.out.println("Mean: " + mean);
    }
}