package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.About_Us;
import pageObjects.Home;

public class TC_006_About_us extends BaseClass 
{
	@Test
	public void test_About_us() 
	
	{   
    	logger.debug("application logs....");
    	logger.info("*** Starting TC_006_test_About_us");
		try {
			
		Home hp=new Home(driver,js);
		hp.clickAbout_Us();
		logger.info("click on About_us link");
	
        About_Us au=new About_Us(driver,js);			
		String confmsg=au.isAbout_UsExists();
		logger.info("validating expected message");
		Assert.assertEquals(confmsg,"About us");
		}
		
		catch(Exception e)
		{
			logger.error("test failed");
			Assert.fail();
		}
		logger.info("*** finished TC_006_About_us");
	}
}
