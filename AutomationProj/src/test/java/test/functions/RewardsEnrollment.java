package test.functions;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;  

public class RewardsEnrollment {
   public static void main(String[] args) throws InterruptedException {
    	String csvFile = "C:\\IHG\\test data\\Book1.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        System.out.println("starting selenium web driver");  
        System.setProperty("webdriver.chrome.driver", "C:\\Tools\\ChromeDriver\\chromedriver.exe");
      
       
        try{  
             br = new BufferedReader(new FileReader(csvFile));
	            while((line = br.readLine()) != null) {
	            	   WebDriver driver = new ChromeDriver();
	            	 driver.get("https://qap.www.ihg.com/rewardsclub/us/en/join/register"); 
	            	 Thread.sleep(1000);
	                String[] columns = line.split(cvsSplitBy);
	                WebElement title=driver.findElement(By.id("PCREnroll_personTitle"));
	                title.sendKeys(columns[0]);
	                Thread.sleep(200);
	                WebElement fname=driver.findElement(By.id("firstName"));
	                fname.sendKeys(columns[1]);
	                Thread.sleep(200);
	              
	              
	                WebElement lname=driver.findElement(By.id("lastName"));
	                lname.sendKeys(columns[2]);
	                Thread.sleep(200);
	  	               
	                
	                WebElement email=driver.findElement(By.id("emailAddress"));
	                email.sendKeys(columns[3]);
	                Thread.sleep(200);
	      
	                WebElement vemail=driver.findElement(By.id("confirmEmailAddress"));
	                vemail.sendKeys(columns[4]);
	                Thread.sleep(200);
	                
	                WebElement pin=driver.findElement(By.id("pin"));
	                pin.sendKeys(columns[5]);
	                Thread.sleep(200);
	                
	                WebElement vpin=driver.findElement(By.id("verifyPin"));
	                vpin.sendKeys(columns[6]);
	                Thread.sleep(200);
	                
	                WebElement radio=driver.findElement(By.id("residenceRadio"));
	                radio.sendKeys(columns[7]);
	                Thread.sleep(200);
	                
	                WebElement address=driver.findElement(By.id("addressField1"));
	                address.sendKeys(columns[8]);
	                Thread.sleep(200);
	                
	                WebElement country=driver.findElement(By.id("countrySelect"));
	                country.sendKeys(columns[9]);
	                Thread.sleep(200);
	                
	                WebElement city=driver.findElement(By.id("city"));
	                city.sendKeys(columns[10]); 
	                Thread.sleep(200);
	                
	                WebElement state=driver.findElement(By.name("state"));
	                state.sendKeys(columns[11]);  
	                Thread.sleep(200);
	                
	                WebElement postalcode=driver.findElement(By.id("postalCode"));
	                postalcode.sendKeys(columns[12]); 
	                Thread.sleep(200);
	             
	                WebElement terms=driver.findElement(By.id("acceptTermsAndConditions1"));
	               terms.click(); 
	               Thread.sleep(200);
	                WebElement join=driver.findElement(By.id("joinSubmitButton"));
	                join.click();  
	                Thread.sleep(200);
	                driver.findElement(By.xpath("//span[text()=\"" + columns[1]+ "\"]")).click();
	                
	                Thread.sleep(200);
	             //  driver.findElement(By.cssSelector("value bold")).getText();
	              //  WebElement rewards=driver.findElement(By.xpath(//*[@id="accountStatusQuickView"]/div[1]/div"));
	                	String rewards=	driver.findElement(By.xpath("//*[contains(@class,'value bold')]/b")).getText();
	                		
	                
	                //String rewards=driver.findElement(By.xpath("//div\[contains(@class,\'value bold\'\]"));
	                //String rewards=driver.findElement(By.xpath("//span[text()=\"value bold\"]")).getText();
	                System.out.println(rewards);
	
	              driver.close();  
	              driver.quit(); 
	                
	            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    
    
}