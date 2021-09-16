package com.lti.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import com.lti.demo.Calculator;
import com.lti.demo.MyApp;

class MyAppTest {

	/**@Test
	void test() {
		fail("Not yet implemented");
	}*/
	//@Test
	
	void testShow()
	{
		MyApp m = new MyApp();
		String s = m.show();
		Assertions.assertEquals("hello maven",s);
		
	}
	
	@Test
	void testAdd() {
		int sum = Calculator.add(100, 200);
	Assertions.assertEquals(300, sum);
	//expected,actual,optional
	Assertions.assertEquals(600, Calculator.add(300, 300),"Testinggg");
	Assertions.assertNotEquals(200, sum);
	}
	
	@Test
	void testAssertFalse() {
		Assertions.assertFalse("Rishi".length()==5);
	Assertions.assertFalse(10>20,"comparing");
	
	}
	
	@Test
	void testAssertNull(){
		String s1=null;
		String s2="abc";
		Assertions.assertNull(s1);
		Assertions.assertNotNull(s2);
	}
//
//	@Test
//	void testAssertAll() {
//		String s1="abc";
//		String s2="pqr";
//		String s3="xyz";
//		Assertions.assertAll("data",
//				() -> Assertions.assertEquals(s1, "abc"),
//				() -> Assertions.assertEquals(s2, "pqr"),
//				() -> Assertions.assertEquals(s3, "xyz")
//				);
//	}
	
//	@Test
//	void testCollections()
//	{
//		ArrayList<String> myList = new ArrayList<>();
//		myList.add("Hello");
//		Assertions.assertFalse(myList.isEmpty());
//		ArrayList<Integer> myList1 = new ArrayList<>();
//	Assertions.assertEquals(true, myList1.isEmpty());
//	
//	
//	}
	
	
//	@Test
//	public void testExceptions() {		
//		
//	    Exception exception = Assertions.assertThrows(NumberFormatException.class, () -> {
//	        Integer.parseInt("100assff");
//	        });
//
//	    String expectedMessage = "For input string";
//	    String actualMessage = exception.getMessage();
//	    Assertions.assertTrue(actualMessage.contains(expectedMessage));
//	   // Assertions.assertEquals(expectedMessage,actualMessage);
//	    
//	}	
	
	 @Test
	 void testAssumeTrue() {
	      boolean b = "A" == "A";
	      Assumptions.assumeTrue(b);
	     // Assertions.assertEquals("Hello", "Hello");
	 }

	
	 @Test
	 void testAssumeFalse() {
	      boolean b = 'A' != 'A';
	      Assumptions.assumeFalse(b);
	      Assertions.assertEquals("Hello", "Hello");
	 }
	 
	 @Test
	 void testAssumeFalseEnvProp() {
	      System.setProperty("env", "prod");
	      Assumptions.assumeFalse("dev".equals(System.getProperty("env")));
	      System.out.println("further code will execute only if above assumption hold");
	 }

//	 @Test
//	 void testAssumingThat() {
//	      System.setProperty("env", "test");
//	      Assumptions.assumingThat("test".equals(System.getProperty("env")),
//	           () -> {
//	        	   Assertions.assertEquals(10, 10);
//	                System.out.println("perform below assertions only on the test env");
//	                });
//
//	      Assertions.assertEquals(20, 20);
//	      System.out.println("perform below assertions on all env");
//	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
