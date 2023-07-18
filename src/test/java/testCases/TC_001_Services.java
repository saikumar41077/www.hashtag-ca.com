package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.Home;
import org.openqa.selenium.interactions.Actions;



public class TC_001_Services extends BaseClass
{
	
	
    @Test
	public void test_account_Registration() 
	
	{   
    	logger.debug("application logs....");
    	logger.info("*** Starting TC_001_Services");
		try {
			
		Home hp=new Home(driver,js);
		hp.clickServices();
		logger.info("click on link Services link");
	
		
		//boolean confmsg=hp.isShopifyExists();
		//logger.info("validating expected message");
		//Assert.assertEquals(confmsg,true);
		}
		catch(Exception e)
		{
			logger.error("test failed");
			Assert.fail();
		}
		logger.info("*** finished TC_001_Services");
	}
	
}
