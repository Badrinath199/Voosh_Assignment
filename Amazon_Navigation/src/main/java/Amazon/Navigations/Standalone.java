package Amazon.Navigations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Standalone {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//hamburger menu
		//driver.findElement(By.id("nav-hamburger-menu")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class='nav-sprite hmenu-close-icon']")).click();
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//a[normalize-space()='Amazon Pay']")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Amazon miniTV']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Click to visit Amazon Store']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Best Sellers")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Mobiles")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Customer Service")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Electronics")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Fashion")).click();
		Thread.sleep(1000);
		
	
		
		driver.close();


	}

}
