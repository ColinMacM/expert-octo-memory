class twoDeeArray
{
   public static void main(String[] args)
   {
      Fraction[][] a = new Fraction[3][5];
      for(int j = 0; j < a.length; j++)
      {
         for(int i = 0; i < a[0].length; i++)
         {
            if(i == 0)
               System.out.print(new Fraction(j, 1) + " ");
            else   
               System.out.print(new Fraction(j, i) + " ");
         }
         System.out.println();
      }
   }
}