/**
*
* Student name:  xxxxx
* Completion date: xxxx
*
* TriangleTest.txt: the template file of TriangleTest.java
* Student tasks: 
* - Write 20 JUnit test cases for Triangle class 
* - Then run this file on the command line with the jar files provided
*
*/
package tests;

import classes.*;

import static org.junit.Assert.*;
import org.junit.Test;

public class TriangleTest {
	// info msgs
	public String equilateral = "This is an equilateral triangle. ";
	public String isosceles = "This is an isosceles triangle. ";
	public String scalene = "This is a scalene triangle. ";

	// err msgs
	public String sideOneNotInt = "The side 1 is not an integer number.\n\n";
	public String sideTwoNotInt = "The side 2 is not an integer number.\n\n";
	public String sideThreeNotInt = "The side 3 is not an integer number.\n\n";
	public String sideNegative = "At least one side is negative!\n";
	public String triangleInvalid = "Not a valid triangle!\n";
	public String triangleTooBig = "This triangle is too big.\n";

	@Test
	public void test1(){
		Triangle triangle = new Triangle("12","12","12");
		assertEquals("This is an equilateral triangle. ",triangle.triangleType());	
	}//end test
	
	@Test
	public void test2(){
		Triangle triangle = new Triangle("3","3","5");
		assertEquals("This is an isosceles triangle. ",triangle.triangleType());
	 	
	}//end test
	
	@Test
	public void test3(){
		Triangle triangle = new Triangle("4","5","6");
		assertEquals("This is a scalene triangle. ", triangle.triangleType());
		// expected value: "This is a scalene triangle. "  
		// value returned from the method: triangle.triangleType() 
	}//end test
	
	@Test
	public void test4(){
		// add your code below
		Triangle triangle = new Triangle("4.23","5","6");
		assertEquals(sideOneNotInt + triangleInvalid, triangle.triangleType());   
		// change above arguments(true, true) to (expectedValue, valueReturned)

	}//end test

	@Test
	public void test5(){
		Triangle tri6 = new Triangle("8","8","1");
        assertEquals(isosceles,tri6.triangleType());
		
	}//end test
	
	@Test
	public void test6(){
		Triangle triangle = new Triangle("g","g","6");
		assertEquals(sideOneNotInt + sideTwoNotInt+ triangleInvalid, triangle.triangleType());
		
	}//end test
	
	@Test
	public void test7(){
		Triangle triangle = new Triangle("a","b","c");
		assertEquals(sideOneNotInt + sideTwoNotInt + sideThreeNotInt + triangleInvalid, triangle.triangleType());
		
	}//end test
	
	@Test
	public void test8(){
		Triangle triangle = new Triangle("-5","5","6");
		assertEquals(sideNegative + triangleInvalid, triangle.triangleType());
	}//end test
	
	@Test
	public void test9(){
		Triangle triangle = new Triangle("100","90","6");
		assertEquals(triangleInvalid, triangle.triangleType());
	}//end test
	
	@Test
	public void test10(){
		Triangle triangle = new Triangle("","90","6");
		assertEquals(sideOneNotInt+triangleInvalid, triangle.triangleType());
	}//end test	
	
	@Test
	public void test11(){
		Triangle triangle = new Triangle("400","390","346");
		assertEquals(triangleTooBig, triangle.triangleType());
	}//end test
	
	@Test
	public void test12(){
		Triangle triangle = new Triangle("0","0","0");
		assertEquals(triangleInvalid, triangle.triangleType());
	}//end test
	
	@Test
	public void test13(){
		Triangle triangle = new Triangle("","","");
		assertEquals(sideOneNotInt+sideTwoNotInt+sideThreeNotInt+triangleInvalid, triangle.triangleType());
	}//end test
	
	@Test
	public void test14(){
		Triangle triangle = new Triangle("-0.9","-890","90000");
		assertEquals(sideOneNotInt+sideNegative+triangleInvalid+triangleTooBig, triangle.triangleType());
	}//end test
	
	@Test
	public void test15(){
		Triangle triangle = new Triangle("80","80","10.0");
		assertEquals(isosceles, triangle.triangleType());
	}//end test
	
	@Test
	public void test16(){
		Triangle triangle = new Triangle("","-90.9","0");
		assertEquals(sideOneNotInt+sideTwoNotInt+triangleInvalid, triangle.triangleType());
	}//end test	
	
	@Test
	public void test17(){
		Triangle triangle = new Triangle("10 ","10","60");
		assertEquals(isosceles, triangle.triangleType());
	}//end test
	
	
	@Test
	public void test18(){
		Triangle triangle = new Triangle("5+5","10","20-10");
		assertEquals(equilateral, triangle.triangleType());
	}//end test	
	
	
	@Test
	public void test19(){
		Triangle triangle = new Triangle("","","");
		assertEquals(sideOneNotInt+triangleInvalid, triangle.triangleType());	
	}//end test
	
	@Test
	public void test20(){
		assertEquals(true,true);	
	}//end test

}
