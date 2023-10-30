package SelProgram;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;




public class bestBuy {
	
	

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Java -Aut Test\\WebDriver\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bestbuy.com/?intl=nosplash");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@id='account-menu-account-button'])[1]")).click();
			driver.findElement(By.xpath("(//a[normalize-space()='Sign In'])[1]")).click(); Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@id='fld-e'])[1]")).sendKeys("santhoshkumar202020202020@gmail.com"); Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='fld-p1'])[1]")).sendKeys("Maxval123"); Thread.sleep(4000);
			driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
			
		
			//String url = driver.findElement(By.cssSelector("a[href*='bestbuy']")).getAttribute("href");
			
		
			//HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			//conn.setRequestMethod("HEAD");
			//conn.connect();
			//int respCode = conn.getResponseCode();
			//System.out.println(respCode);
		
	}

}
