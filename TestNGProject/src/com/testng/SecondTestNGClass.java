package com.testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SecondTestNGClass {
   
  @Test(priority = 3)
  public void login() {
	  System.out.println("i am a login test case");
  }
  
  @Test(enabled =true)
  //@Test(priority = 1)
  public void registration() {
	  //for skipcount
	  throw new SkipException("not used manymore");
	  //below exception it will not excute and gives error
	//  System.out.println("i am a registration test case");
	
  }
  
  @Test(priority = 3)
  public void logout() {
	  System.out.println("i am a logout test case");
  }
}
