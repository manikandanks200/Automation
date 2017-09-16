package test.testsuite;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.common.CommonMethods;
import test.functions.CoreFunction;

public class NewTest1 {
	CoreFunction core=new CoreFunction();
	
  @BeforeSuite
  public void beforeSuite() throws IOException {
	  CommonMethods.loadHostandBrowser();
  }

  @AfterSuite
  public void afterSuite() throws IOException {
	  CommonMethods.closeBrowser();
  }
  
  @Test
  public void Testcase1() throws IOException,Exception{
	  core.HometoLoginPage();
	  core.validLogin();
	  String s1=core.searchItem("Hammer");
	  System.out.println("search strign"+s1+" "+s1.contains("Hammer")+s1.endsWith("Hammer"));
	  Assert.assertEquals(s1.contains("Hammer"),true);
//	  CommonMethods.findAllWebElements(By.xpath("//*"));

  }

  @BeforeMethod
  public void beforeMethod() {
	  
  }

  @AfterMethod
  public void afterMethod() {
  }


  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }
   
 
 
  
}
