package SelProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
  System.setProperty("webdriver.chrome.driver","D:\\Java -Aut Test\\WebDriver\\Drivers\\chromedriver.exe");
  
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.spicejet.com/");
       driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
     
       driver.findElement(By.xpath("//input[@data-testid='user-mobileno-input-box']")).sendKeys("8667500480");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Maxval123#"); Thread.sleep(3000);
        driver.findElement(By.xpath("//body//div[@id='react-root']//div[@data-testid='application-id']//div//div//div[5]//div[3]")).click(); 
       Thread.sleep(3000);
        driver.findElement(By.xpath("//body//div[@id='react-root']//div[@data-testid='application-id']//div//div//div[5]//div[2]//div[1]//div[2]//div[2]")).click(); 
      driver.findElement(By.xpath("//div[contains(text(),'USD')]")).click();
      driver.findElement(By.xpath("(//div)[291]")).click();
      driver.findElement(By.xpath("(//div[@data-focusable='true'])[20]")).click();
       System.out.println(driver.findElement(By.xpath("(//div)[291]")).getText()); 
      driver.findElement(By.xpath("//div[contains(text(),'From')]")).click();	
       driver.findElement(By.xpath("//div[normalize-space()='Kempegowda International Airport']")).click();
      
		driver.findElement(By.xpath("//div[normalize-space()='Indira Gandhi International Airport']")).click();
		 driver.findElement(By.xpath("(//div)[483]")).click();
         driver.findElement(By.xpath("(//div[@data-focusable='true'])[27]")).click();
         Thread.sleep(3000);
      driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[3]/div[2]")).click();
      driver.findElement(By.xpath("(//div)[162]")).click(); Thread.sleep(3000);
       driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("KUMAR");
       driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("M");
       driver.findElement(By.xpath("(//div[contains(text(),'Next')])[1]")).click();
		driver.quit();
        		}

}
