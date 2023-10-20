package SelProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Java -Aut Test\\WebDriver\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu'][1]")).click();
		driver.findElement(By.xpath("//a[@class='hmenu-item' and @data-menu-id='8']")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Power Banks')])[2]")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath("//div[normalize-space()='Ambrane 10k mah Slim Powerbank - 999rs Only']")).click();
		

	}

}
