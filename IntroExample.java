package SelProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java -Aut Test\\WebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/dashboard.xhtml");
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		//WebElement footer = driver.findElement(By.xpath("(//div)[592]"));
		//System.out.println(footer.findElements(By.tagName("a")));
		
		WebElement element1 = driver.findElement(By.xpath("//div[@id='j_idt122']"));
		element1.findElement(By.xpath("//input[@id='email']")).sendKeys("Hello");
		//driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//div[@data-focusable='true']//div//input[@type='text']")).click();
		//driver.findElement(By.xpath("//div[contains(text(),'AGR')]")).click();
        //driver.findElement(By.xpath("//div[normalize-space()='Kangra Airport']")).click();
        //driver.findElement(By.xpath("(//div[@data-focusable='true'])[64]")).click();
        
        
	}

}
