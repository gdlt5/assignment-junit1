
/***
* Circle2Test.java
*
*
* Testing class for Circle2.java (and Circle.java)
***/

import org.junit.*;

public class Circle2Test
{
   // Data you need for each test case
   private Circle2 circle2;
   double LIMIT;

// 
// Stuff you want to do before each test case
//
@Before
public void setup()
{
   System.out.println("\nTest starting...");
   circle2 = new Circle2(1,2,3);
   LIMIT = 0.00001;
}

//
// Stuff you want to do after each test case
//
@After
public void teardown()
{
   System.out.println("\nTest finished.");
}

//
// Test a simple positive move
//
@Test
public void simpleMove()
{
   Point p;
   System.out.println("Running test simpleMove.");
   p = circle2.moveBy(1,1);
   Assert.assertTrue(p.x == 2 && p.y == 3);
}

// 
// Test a simple negative move
//
@Test
public void simpleMoveNeg()
{
   Point p;
   System.out.println("Running test simpleMoveNeg.");
   p = circle2.moveBy(-1,-1);
   Assert.assertTrue(p.x == 0 && p.y == 1);
}

//
//Test an expansion
//
@Test
public void testExpand(){
   System.out.println("Running test testExpand.");
   double rad = circle2.scale(2);
   Assert.assertEquals(8, rad, LIMIT);
}

//
// Test a compression
//
@Test
public void testCompress(){
   System.out.println("Running test testCompress.");
   double rad = circle2.scale(2);
   Assert.assertEquals(8, rad, LIMIT);
}

//
// Test an intersection
//
@Test
public void testIntersect(){
   System.out.println("Running test testIntersect.");
   Circle2 newCircle = new Circle2(1, 8, 5);
   Assert.assertTrue(circle2.intersects(newCircle));
}


//
// Test circle inside another
//
@Test
public void testInnerCircle(){
   System.out.println("Running test testInnerCircle.");
   Circle2 newCircle = new Circle2(1, 3, 1);
   Assert.assertFalse(circle2.intersects(newCircle));
}


//
// Test seperate circles that do not intersect
//
@Test
public void testSeperateCircles(){
   System.out.println("Running test testSeperateCircles.");
   Circle2 newCircle = new Circle2(1, 14, 5);
   Assert.assertFalse(circle2.intersects(newCircle));
}


//End tests

/*** NOT USED
public static void main(String args[])
{
   try {
      org.junit.runner.JUnitCore.runClasses(
               java.lang.Class.forName("circle2Test"));
   } catch (Exception e) {
      System.out.println("Exception: " + e);
   }
}
***/

}

