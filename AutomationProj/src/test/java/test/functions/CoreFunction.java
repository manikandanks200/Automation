package test.functions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.common.CommonMethods;



public class CoreFunction {
	public String s1="";
	
	
	public void HometoLoginPage() throws IOException,Exception{
		try{
		Thread.sleep(2000);	
		CommonMethods.FindWebElement("xpath", "//*[@id=\"headerMyAccountTitle\"]/div").click();
		CommonMethods.FindWebElement("xpath", "//*[@id=\"authSignIn\"]/a/span").click();
		}catch(Exception e){
			System.out.println("my exception : "+e.toString());
		}
			
	}
	
	public void validLogin() throws IOException{
		try{
		CommonMethods.FindWebElement("xpath", "//*[@id=\"email_id\"]").sendKeys("mani.ks76@gmail.com");
		CommonMethods.FindWebElement("xpath", "//*[@id=\"password\"]").sendKeys("Zillion9)");
		CommonMethods.FindWebElement("xpath", "//*[@id=\"accountSignIn\"]/span").click();
		}catch(Exception e){
			System.out.println("my exception : "+e.toString());
		}
			
	}
	
	
	public String searchItem(String search) throws IOException{
		try{
		Thread.sleep(2000);
		CommonMethods.FindWebElement("id", "headerSearch").sendKeys(search);
		CommonMethods.FindWebElement("id", "headerSearchButton").click();
		CommonMethods.FindWebElement("xpath", "//*[@id=\"products\"]/div/div[1]/div/div[2]/a/img").click();
		s1=CommonMethods.FindWebElement("xpath", "//*[@id=\"productinfo_ctn\"]/div[2]/div[2]/div[1]/h1").getText();
		return s1;

		}catch(Exception e){
			System.out.println("my exception : "+e.toString());
		}
		return s1;
			
	}
	
	
	
}
