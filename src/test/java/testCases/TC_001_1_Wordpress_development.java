package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;



import pageObjects.Services;
import pageObjects.Wordpress_Development;

public class TC_001_1_Wordpress_development extends BaseClass
{
	 @Test
		public void test_Wordpress_development() 
		
		{   
	    	logger.debug("application logs....");
	    	logger.info("*** Starting  TC_001_1_Wordpress_development");
			try {
				
			Services s=new Services(driver,js);
			s.clickWordpress_Dev();
			logger.info("click on link Services link");
			
			Wordpress_Development wd=new Wordpress_Development(driver,js);
			String confmsg=wd.isWord_pressExists();
		
			
			logger.info("validating expected message");
			

			Assert.assertTrue(confmsg.contains("Wordpress"));
			//Assert.assertEquals(confmsg,"");  
			}
			catch(Exception e)
			{
				logger.error("test failed");
				Assert.fail();
			}
			logger.info("*** finished TC_001_1_Wordpress_development");
		}
}
