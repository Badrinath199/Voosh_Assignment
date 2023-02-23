package pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponent.AbstractComponent;

public class HomePage extends AbstractComponent{
	WebDriver driver;
	
	public HomePage (WebDriver driver)
	{
		//initialization
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//a[@id='nav-hamburger-menu']")
	WebElement humberMune;
	@FindBy(xpath="//div[@class='nav-sprite hmenu-close-icon']")
	WebElement cross;
	
	@FindBy(xpath="//a[normalize-space()='Amazon Pay']")
	WebElement AmazonPay;
	
	@FindBy(xpath="//a[normalize-space()='Amazon miniTV']")
	WebElement AmazonminiTV;
	@FindBy(xpath="//img[@alt='Click to visit Amazon Store']")
	WebElement goback;
	
	@FindBy(linkText = "Best Sellers")
	WebElement BestSellers;
	
	@FindBy(linkText = "Mobiles")
	WebElement Mobiles;
	
	@FindBy(linkText = "Customer Service")
	WebElement CustomerService;
	
	@FindBy(linkText = "Electronics")
	WebElement Electronics;
	
	@FindBy(linkText = "Fashion")
	WebElement Fashion;
	
	public void humberMune() throws InterruptedException
	{
		Thread.sleep(2000);
		humberMune.click();
		Thread.sleep(1000);
		cross.click();
	}
	
	public void AmazonPay() throws InterruptedException
	{
		Thread.sleep(2000);
		AmazonPay.click();
	}
	
	public void AmazonminiTV() throws InterruptedException
	{
		Thread.sleep(2000);
		AmazonminiTV.click();
		Thread.sleep(2000);
		goback.click();
	}
	
	public void BestSellers() throws InterruptedException
	{
		Thread.sleep(2000);
		BestSellers.click();
	}
	
	public void Mobiles() throws InterruptedException
	{
		Thread.sleep(2000);
		Mobiles.click();
	}
	
	public void CustomerService() throws InterruptedException
	{
		Thread.sleep(2000);
		CustomerService.click();
	}
	
	public void Electronics() throws InterruptedException
	{
		Thread.sleep(2000);
		Electronics.click();
	}
	
	public void Fashion() throws InterruptedException
	{
		Thread.sleep(2000);
		Fashion.click();
	}
	
	

	

	
}
