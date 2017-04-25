import java.lang.Math;

public class Circle1 extends Circle
{

public Circle1(double x, double y, double radius)
{
   super(x,y,radius);
}

public boolean intersects(Circle other)
{
   double low = Math.pow(radius - other.radius, 2);
   double up = Math.pow(radius + other.radius, 2);
   double distance = Math.pow(center.x - other.center.x, 2) + Math.pow(center.y - other.center.y, 2);
   
   if (low <= distance && distance <= up)
      return true;
   return false;
}

}

