// primary programmer
// chapter 6
class Fraction
{
   // instance fields-NOUNS
   int num;
   private int den;
   
   public Fraction(int num, int den)
   {
      this.num = num;
      if(den != 0)
         this.den = den;
      else{
         System.out.println("Cannot assign a denominator of 0. 1 has been assigned");
         this.den = 1;
      }
   }
   
   public Fraction()
   {
      num = 0;
      den = 1;
   }
   
   public Fraction(Fraction other)
   {
      this.num = other.num;
      this.den = other.den;
   }
   
   // mutator method - AKA - "write" method - AKA "setter" method
   public void setDen(int newDen)
   {
      if(newDen != 0)
         this.den = newDen;
      else
         System.out.println("Cannot set den to 0. Den remains unchanged.");
   }
   
   // accessor method - AKA - "read" method - AKA "getter" method
   public int getDen()
   {
      return this.den;
   }
   
   // instance methods - VERBS
   public Fraction plus(Fraction other)
   {
      Fraction sum = new Fraction();
      sum.num = (num*other.den) + (other.num * den);
      sum.den = (this.den*other.den);

      return sum;
   }
   public Fraction minus(Fraction other)
   {
      Fraction sum = new Fraction();
      sum.num = (num*other.den) - (other.num * den);
      sum.den = (this.den*other.den);

      return sum;
   }
   public void plusEquals(Fraction other)
    {
      this.num = this.num*other.den + this.den * other.num;
      this.den = this.den * other.den;
    }


   public void invertMe()
   {
      int temp = num;
      num = den;
      den = temp;
   }
   
   public Fraction invertCopy()
   {
      Fraction inverted = new Fraction();
      inverted.num = this.den;
      inverted.den = this.num;
      return inverted;
   }
   
   /**
    * This method will return the decimal value of the implicit Fraction
    * as a double.
    * @return the decimal value of the implicit Fraction
    */
    public double toDecimal()
    {
      return this.num/(double)this.den;
    }
    
    // class method
    // don't do this
    public static double toDecimal(Fraction f)
    {
      return f.num/(double)f.den;
    }
    
   public boolean equals(Fraction other)
   {
      this.reduce();
      other.reduce();
      return this.num == other.num && this.den == other.den;
   }
   
   
   public String toString()
   {
      this.reduce();
      return this.num + "/" + this.den;
   }

    
    /**
     * This method multiples the implicit Fraction by the Fraction
     * taken in the parameter and returns the result as a new Fraction.
     * Currently, the result is not simplified.
     * @param other the explicit Fraction
     * @return the product of the implicit and explicit fractions
     */
    public Fraction times(Fraction other) 
    {
      return new Fraction(this.num * other.num, this.den * other.den);
    }
    
    
    
    public Fraction divide(Fraction other) 
    {
      return new Fraction(this.num * other.den, this.den * other.num);
    }
    
       
    /**
     * This method takes another Fraction and compares it's size to the
     * implicit Fraction. The fraction that is larger is the one that is 
     * returned. If they are the same size, then the implicit Fraction is returned
     * @param other - the Fraction we are comparing to
     * @return the larger of the two Fractions
     */
    public Fraction larger (Fraction other)
    {
      if (this.toDecimal() >= other.toDecimal())
         return this;
      else
         return other;
    }
    
        
    public void reduce()
    {
      if( this.den < 0 )
      {
         this.num *= -1;
         this.den *= -1;
      }
      
      int a = Math.abs(this.num);
      int b = Math.abs(this.den);

      //int gcf = gcd(a, b);    CLASS METHOD CALL
      int gcf = this.gcd();         
      
      this.num /= gcf;
      this.den /= gcf;
    
    }
    
    // Finds the gcd of the num and den of a Fraction
    public int gcd()
    {
      int x = Math.abs(this.num);  
      int y = Math.abs(this.den);
      
      for(int i = Math.min(x, y); i > 0; i--)
      {
         if(x % i == 0 && y % i == 0)
            return i;
      }
      
      return 1; 
    
    }
    public boolean greaterThan(int value)
    {
      if(this.num/this.den > value)
         return true;
      else
         return false;
    }
    public boolean lessThan(int value)
    {
      if(this.num/this.den < value)
         return true;
      else
         return false;
    }
    /**
    * Write a method gcd that returns the value of the greatest common
    * divisor of its two int parameters.
    * @param x the first int
    * @param y the second int
    * @return the gcd of x and y
    */
   public static int gcd(int x, int y)
   {  
      x = Math.abs(x);  
      y = Math.abs(y);
      
      for(int i = Math.min(x, y); i > 0; i--)
      {
         if(x % i == 0 && y % i == 0)
            return i;
      }
      
      return 1; 
   }

   
   
}