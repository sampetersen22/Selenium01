package SelProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bestBuy02 {

	
        @Test
	public void test03() throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Java -Aut Test\\WebDriver\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bestbuy.com/?intl=nosplash");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[normalize-space()='Menu']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='TV & Home Theater']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='TVs by Size']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='75-Inch TVs']")).click();
		driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Add to Cart'])[1]")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Continue shopping']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Menu']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Brands']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Apple']")).click();
		driver.findElement(By.xpath("(//a[@role='button'][normalize-space()='Mac'])[1]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='MacBook Air']")).click();
		driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Add to Cart'])[1]")).click();
		driver.findElement(By.xpath("(//a[normalize-space()='Go to Cart'])[1]")).click();
		driver.findElement(By.xpath("(//button[normalize-space()='Checkout'])[1]")).click();
		driver.findElement(By.xpath("(//button[normalize-space()='Continue as Guest'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='user.emailAddress'])[1]")).sendKeys("123@gmail.com");
		driver.findElement(By.xpath("(//input[@id='user.phone'])[1]")).sendKeys("347 689 2340");
		driver.findElement(By.xpath("(//span[normalize-space()='Continue to Payment Information'])[1]")).click();
		
		

		
		
		
		
	}

}
