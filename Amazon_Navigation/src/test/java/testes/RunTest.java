package testes;

import org.testng.annotations.Test;

import pageObject.HomePage;
import testComponent.BaseClass;

public class RunTest extends BaseClass{
	
	@Test
	public void run() throws InterruptedException
	{
		HomePage hp=lp.callHomePage();
		hp.humberMune();
		hp.AmazonminiTV();
		hp.AmazonPay();
		hp.BestSellers();
		hp.CustomerService();
		hp.Electronics();
		hp.Fashion();
		hp.Mobiles();
	}

}
