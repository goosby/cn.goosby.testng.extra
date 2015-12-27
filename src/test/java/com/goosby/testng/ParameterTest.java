package com.goosby.testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterTest {
	
	@Parameters("test")
	@BeforeClass
	public void init(String test){
		System.out.println(test);
	}
	
	@Test
	public void test(){
		Reporter.log("test");
	}
	@AfterClass
	public void tearDown(){
		
	}
	
}
