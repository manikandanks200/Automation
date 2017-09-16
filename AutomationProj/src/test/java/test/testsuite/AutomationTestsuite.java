package test.testsuite;

import org.testng.annotations.Test;

import test.common.CommonMethods;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


public class AutomationTestsuite {
	

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() throws IOException {
	  CommonMethods.loadHostandBrowser();
  }

  @AfterSuite
  public void afterSuite() throws IOException {
	  CommonMethods.closeBrowser();
  }
  
	
  @Test
  public void f() {
  }

}
