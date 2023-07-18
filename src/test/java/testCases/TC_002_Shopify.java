package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Home;
import pageObjects.Shopify;

public class TC_002_Shopify extends BaseClass
{
	 @Test
		public void test_Shopify() 
		
		{   
	    	logger.debug("application logs....");
	    	logger.info("*** Starting TC_002_Shopify");
			try {
				
			Home hp=new Home(driver,js);
			hp.clickShopify();;
			logger.info("click on Shopify link");
		
            Shopify sf=new Shopify(driver,js);			
			boolean confmsg=sf.isShopifyExists();
			logger.info("validating expected message");
			Assert.assertEquals(confmsg,true);
			}
			catch(Exception e)
			{
				logger.error("test failed");
				Assert.fail();
			}
			logger.info("*** finished TC_001_Services");
		}


}
