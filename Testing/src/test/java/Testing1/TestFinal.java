package Testing1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestFinal {
	
	@BeforeTest
	public void f1(){
		System.out.println("hello 123");
		
	}
	
	
	@Test
	public void f2(){
		
	}
	
	@AfterTest
	public void f3(){
		
	}
}
