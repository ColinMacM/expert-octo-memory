class Circle
{
   double x;
   double y;
   double r;
   
   public Circle smaller(Circle other)
   {
      Circle c3 = new Circle();
      if(this.r>other.r)
      {
         c3.x = this.x;
         c3.y = this.y;
         c3.r = this.r;
      }
      else if(other.r>this.r)
      {
         c3.x = other.x;
         c3.y = other.y;
         c3.r = other.r;
      }
      else
      {
         c3.x = this.x;
         c3.y = this.y;
         c3.r = this.r;
      }
      return c3;
   }
}
