package SelProgram;


import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafground {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Java -Aut Test\\WebDriver\\Drivers\\chromedriver.exe");
		  
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/select.xhtml");
		Thread.sleep(2000);
		
		WebElement staticDropdown = driver.findElement(By.className("ui-selectonemenu"));
		
		
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);
		
		
	
	
		
	}

}
