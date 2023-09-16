/**
 * This program will focus on all methods regarding 3D vectors.
 * Results of certain programs will give a runtime exception in z.
 * The main method has some hard coded test cases to test each method
 * @author Colin MacMillan
 * Date: Nov. 15, 2022
 */
class ThreeDVector
{
   
   /**
   * the x-component of the vector 
   */
   Fraction x; 			// x-component of vector
   /**
   * the y-component of the vector
   */
   Fraction y; 			// y-component of vector
   /**
   * the z-component of the vector. Must be between 999 and -999.
   */
   private Fraction z; 	// z-component of vector
   // For the purposes of this lab the z component must be between -1000 
   // and 1000 (non-inclusive). 
   /**
   * This is a constructor method that sets all the values 0.
   */
   public ThreeDVector()
   {
      this.x = new Fraction(0, 1); //instance fields
      this.y = new Fraction(0, 1);
      this.z = new Fraction(0, 1);
   }
   /**
   * This is a constructor methods where you can set the i, j, and k values
   *  z can only be 1000 and -1000
   * @param x the i value of a 3d vector
   * @param y the j value of a 3d vector
   * @param z the k value of a 3d vector
   */
   public ThreeDVector(Fraction a, Fraction b, Fraction c) throws Exception
   {
      x = a;
      y = b;
      if(c.toDecimal() < 1000 || c.toDecimal() > -1000)
         z = c;
      else 
         throw new Exception(" After calculation the z component is no longer valid");
   }

   public double Magnitude()
   {
      double mag = 0;
      mag = (x.toDecimal())*(x.toDecimal())+(y.toDecimal())*(y.toDecimal())+(z.toDecimal())*(z.toDecimal());
      return Math.sqrt(mag);
   }
   /**
    * This method will add any 2 3D vectors together.
    * The product will be expressed as one 3D vector that is the sum of the two
    * For example, if vector 1 is [4, 6, 8] and vector 2 is [3, 6, 7] the result will be[7, 12, 15]
    * @param other the implicit and explicit 3d vectors 
    * @return the sum of the two 3D vectors
    */
   public ThreeDVector plus(ThreeDVector other)
   {
      ThreeDVector sum = new ThreeDVector();
      sum.x = this.x.plus(other.x);
      sum.y = this.y.plus(other.y);
      if(this.z.plus(other.z).greaterThan(-1000) && this.z.plus(other.z).lessThan(1000))
         sum.z = this.z.plus(other.z);
      else
         throw new RuntimeException(" After calculation the z component is no longer valid");
      return sum;
   }
   /**
    * This method will subtract any 2 3D vectors together, the implicit vs the explicit
    * The product will be expressed as one 3D vector that is the difference of the two
    * For example, if vector 1 is [4, 6, 8] and vector 2 is [3, 6, 7] the result will be[1, 0, 1]
    * @param other the implicit and explicit 3d vectors 
    * @return the difference of the two 3d vectors
    */
   public ThreeDVector minus(ThreeDVector other)
   {
      ThreeDVector difference = new ThreeDVector();
      difference.x = this.x.minus(other.x);
      difference.y = this.y.minus(other.y);
      if(this.z.minus(other.z).greaterThan(-1000) && this.z.minus(other.z).lessThan(1000))
         difference.z = this.z.minus(other.z);
      else
         throw new RuntimeException(" After calculation the z component is no longer valid");
      return difference;
   }
   /**
    * This method will multiply each part of the 3d vector and output it as a double.
    * The result will then be then rounded to three decimal places.
    * Example: x*x + y*y + z*z.
    * For example, if the 3d Vector was [4, 2, 3] and [7, 4, 0] = 36.
    * @param other the explicit ThreeDVector.
    * @return taking the dot product of two 3d vectors and rounding to 3 decimal places.
    */
   public Fraction dot(ThreeDVector other)
   {
      return (this.x.times(other.x)).plus(this.y.times(other.y)).plus(this.z.times(other.z)); 
   }
   /**
    * This method will find the cross product in the same 3D cartesian plane.
    * The cross result will be expressed as one 3D vector.
    * For example, if the two 3d vectors was [3, 4, 5] and [7, 8, 9],
    * it would return -36i-4j+8k 
    * @param other the explicit 3D vectors
    * @return the cross product of the 3D vectors
    */
   public ThreeDVector cross(ThreeDVector other)
   {
      ThreeDVector cross = new ThreeDVector();
      cross.x = (this.y.times(other.z)).minus(other.z.times(other.y));
      cross.y = (this.x.times(other.y)).minus(this.y.times(other.x));
      if((this.z.times(other.x)).minus(this.x.times(other.z)).greaterThan(-1000) && (this.z.times(other.x)).minus(this.x.times(other.z)).lessThan(1000))
         cross.z = (this.z.times(other.x)).minus(this.x.times(other.z));
      else
         throw new RuntimeException(" After calculation the z component is no longer valid");
      return cross;
   }
   /**
    * This void method will take a 3D vector and multiply by a scalar.
    * The individual i, j, and k are multiplied by this scalar.
    * It will update the values, but not return any value.
    * For example, if the 3D vector is [4, 3, 6] and the double is 4 [16, 12, 24]
    * @param scalar a double that you want the implict 3D vector to be multiplied by.
    */
   public void scalarMultiply(int scalar)
   {
      x.num = x.num*scalar;
      y.num = y.num * scalar;
      if(z.num*scalar > -1000 && z.num*scalar < 1000)
         z.num = z.num*scalar;
      else
         throw new RuntimeException(" After calculation the z component is no longer valid");
   }

   /**
    * This method will check if two 3d vectors are equal to each other,
    * after they have been rounded to 3 decimal places.
    * A truth or false will be returned
    * For example, if the 3D vector is [1, 2, 3] and [1, 2, 3] it will return true. 
    * @param other the explicit constructor
    * @return true or false depending on whether it the 3d vectors are equal to each other
    */
   public boolean equals2(ThreeDVector other)
   {
      if(this.x.equals(other.x) && this.y.equals(other.y) && this.z.equals(other.z))
         return true;
      else
         return false;
   }
   /**
    * This method will check if two 3D vectors are parallel in a 3D cartesian space.
    * It will return true or false.
    * For example, if the vector was [3, 4, 5] and [6, 8, 10] it will return true.
    * This is because they all relate to each other by one half/2.
    * @param other the explicit constructor 
    * @return a true or false depended on whether its parallel or not.
    */
   public boolean isParallel(ThreeDVector other)
   {
      return (this.x.divide(other.x)).equals(this.y.divide(other.y)) && (this.y.divide(other.y)).equals(this.z.divide(other.z));
   }
   /**
    * This method will check if two 3D vectors are parallel in a 3D cartesian space.
    * It will return true or false.
    * For example, if the vector was [3, 4, 5] and [6, 8, 10] it will return true.
    * This is because they all relate to each other by one half/2.
    * @param other the explicit constructor 
    * @return a true or false depended on whether its parallel or not.
    */
   public boolean isPerpendicular(ThreeDVector other)
   {
      return this.dot(other).equals(0.000);
   }
   /**
    * This method will check if two 3D vectors are the same size in a 3D cartesian space.
    * It will return true or false.
    * For example, if the vector was [3, 4, 8] and [6, 7, 10] it will return false.
    * This is because they do not work together
    * @param vec1 one of the two explicit constructors.
    * @param vec2 the second explicit constructor.
    * @return a true or false depending on whether they are the same size.
    */
   public static boolean sameSize(ThreeDVector vec1, ThreeDVector vec2)
   {
      return (vec1.Magnitude()) == (vec2.Magnitude());
   }
   /**
    * This method will put the i, j, and k values and put it in high level words. 
    * if its [0, 1, 3.1415926535] it will output j+3.142k
    * if all values are zero, it will just return 0.
    * @return a string that has the i, j and k values
    */
   public String toString()
   {
      Fraction number = new Fraction();
      String output = "";
      if(x.equals(0) && y.equals(0) && z.equals(0))
         return "0";
      for(int l = 1; l <= 4; l++)
      {
         if(l==1)
            number = x; 
         else if(l==2)
            number = y;
         else
            number = z;
         switch(l)
         {
         case 1:
            if(number.equals(0))
               continue;
            if(number.equals(1)) //checks if its 1 or negative 1
               output += "i";
            else if(number.equals(-1))
               output += "-i";
            output += number + "i"; //is a whole number
            continue;
         case 2:
            if(number.equals(0))
               continue;
            if(number.toDecimal() > 0) //checks if a positive number
               output += "+";
            if(number.equals(1)) //checks if its 1 or negative 1
               output += "j";
            else if(number.equals(-1))
               output += "-j";
            output += number + "j"; //is a whole number
            continue;
         case 3:
            if(number.equals(0))
               continue;
            if(number.toDecimal() > 0) //checks if a positive number
               output += "+";
            if(number.equals(1)) //checks if its 1 or negative 1
               output += "k";
            else if(number.equals(-1))
               output += "-k";
            output += number + "k"; //is a whole number          
            break;
         }
      }
      return output;
   }


}