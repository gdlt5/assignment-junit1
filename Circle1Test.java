
/***
* Example JUnit testing class for Circle1 (and Circle)
*
* - must have your classpath set to include the JUnit jarfiles
* - to run the test do:
*     java org.junit.runner.JUnitCore Circle1Test
* - note that the commented out main is another way to run tests
* - note that normally you would not have print statements in
*   a JUnit testing class; they are here just so you see what is
*   happening. You should not have them in your test cases.
***/

import org.junit.*;

public class Circle1Test
{
   // Data you need for each test case
   private Circle1 circle1;
   double LIMIT;

// 
// Stuff you want to do before each test case
//
@Before
public void setup()
{
   System.out.println("\nTest starting...");
   circle1 = new Circle1(1,2,3);
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
   p = circle1.moveBy(1,1);
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
   p = circle1.moveBy(-1,-1);
   Assert.assertTrue(p.x == 0 && p.y == 1);
}

//
//Test an expansion
//
@Test
public void testExpand(){
   System.out.println("Running test testExpand.");
   double rad = circle1.scale(2);
   Assert.assertEquals(8, rad, LIMIT);
}

//
// Test a compression
//
@Test
public void testCompress(){
   System.out.println("Running test testCompress.");
   double rad = circle1.scale(2);
   Assert.assertEquals(8, rad, LIMIT);
}

//
// Test an intersection
//
@Test
public void testIntersect(){
   System.out.println("Running test testIntersect.");
   Circle1 newCircle = new Circle1(1, 8, 5);
   Assert.assertTrue(circle1.intersects(newCircle));
}


//
// Test circle inside another
//
@Test
public void testInnerCircle(){
   System.out.println("Running test testInnerCircle.");
   Circle1 newCircle = new Circle1(1, 3, 1);
   Assert.assertFalse(circle1.intersects(newCircle));
}


//
// Test seperate circles that do not intersect
//
@Test
public void testSeperateCircles(){
   System.out.println("Running test testSeperateCircles.");
   Circle1 newCircle = new Circle1(1, 14, 5);
   Assert.assertFalse(circle1.intersects(newCircle));
}


//End tests

/*** NOT USED
public static void main(String args[])
{
   try {
      org.junit.runner.JUnitCore.runClasses(
               java.lang.Class.forName("Circle1Test"));
   } catch (Exception e) {
      System.out.println("Exception: " + e);
   }
}
***/

}

