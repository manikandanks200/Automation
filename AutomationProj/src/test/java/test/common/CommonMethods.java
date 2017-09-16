package test.common;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonMethods {
	static Properties prop=new Properties();
	static WebDriver driver;
	static WebElement we;
	static List el;
	
	public static WebDriver getFirefoxDriver(){
		System.setProperty("webdriver.gecko.driver","C:\\Tools\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
    }
	
	public static WebDriver getChromeDriver(){
		System.setProperty("webdriver.chrome.driver","C:\\Tools\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
 
	public static Properties loadProperties() throws IOException{
		FileInputStream fis=new FileInputStream("C:\\Users\\Manikandan\\workspace\\AutomationProj\\env.properties");
		prop.load(fis);
		
		return prop;
	}
	
	public static WebElement FindWebElement(String type,String reference){
			try{
						if(type.equals("xpath")){
							do{
							we=driver.findElement(By.xpath(reference));
							System.out.println(reference + we.isDisplayed());
							}
					   		while(!we.isDisplayed());	 
						}
						if(type.equals("id")){
							do{
							we=driver.findElement(By.id(reference));
							System.out.println(reference + we.isDisplayed());
							}
					   		while(!we.isDisplayed());	 
						}
						
			}
			catch(Exception e){
				System.out.println("Exception"+e.toString());
			}
			
			  return we;
	}
	public static void findAllWebElements(By by){
		try{
			List<WebElement> el = driver.findElements(by.xpath("//*"));
            int count=0;
            for ( WebElement e : el ) {
             System.out.println( e.getTagName()+"    "+e.getText());

             count++;

            }
        
          System.out.println(count );
		  	
		}
		catch(Exception e){
			System.out.println("Exception"+e.toString());
		}
		

}	
	
	
	public static void loadHostandBrowser() throws IOException{
			if ((CommonMethods.loadProperties().getProperty("Browser")).equals("Chrome"))
			{
				driver=CommonMethods.getChromeDriver();
			}
			
			else if ((CommonMethods.loadProperties().getProperty("Browser")).equals("Firefox"))
			{
				driver=CommonMethods.getFirefoxDriver();
			}
			driver.get(CommonMethods.loadProperties().getProperty("HOST"));
	}
	
	
	public static void closeBrowser() throws IOException{
		driver.close();
	}
}
