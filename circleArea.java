import java.lang.Math;
class circleArea
{
   public static void main(String[] args)
   {
      Circle c1 = new Circle();
      Circle c2 = new Circle();
      c1.x = 4;
      c1.y = -1;
      c1.r = 3;
      c2.x = 3;
      c2.y = -2;
      c2.r = 5;
      double area = Math.PI * (c1.r* c1.r);
      System.out.println("The area of the first circle is: " + area);
      Circle c3 = c1.smaller(c2);
      System.out.println("(" + c3.x + ", " + c3.y + ") and the radius is " + c3.r);
   }
}