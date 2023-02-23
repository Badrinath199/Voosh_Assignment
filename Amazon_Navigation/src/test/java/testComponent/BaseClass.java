package testComponent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.LandingPage;

public class BaseClass {
	public WebDriver driver= null;
	public LandingPage lp;
	public WebDriver initialization()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		return driver;
	}
	
	@BeforeMethod
	public void lunchApp()
	{
		driver=initialization();
		lp=new LandingPage(driver);
		lp.getLandingPage();
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
