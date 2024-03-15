package testNGExamples;

import org.testng.annotations.Test;

public class Example1 {
  @Test
  public void f() {
  }
  
  @Test
  public void testCase0() {
	  System.out.println("I am TC0");
	  calling();
  }
  
  public void calling() {
	  System.out.println("I am calling method");
  }
}

