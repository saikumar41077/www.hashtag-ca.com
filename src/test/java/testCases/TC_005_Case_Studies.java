package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;


import pageObjects.Home;
import pageObjects.Case_Studies;

public class TC_005_Case_Studies extends BaseClass
{
	@Test
	public void test_Case_Studies() 
	
	{   
    	logger.debug("application logs....");
    	logger.info("*** Starting TC_005_test_Case_Studies");
		try {
			
		Home hp=new Home(driver,js);
		hp.clickCase_Studies();
		logger.info("click on Case_Studies link");
	
        Case_Studies csd=new Case_Studies(driver,js);			
		String confmsg=csd.isCase_StudiesExists();
		logger.info("validating expected message");
		Assert.assertEquals(confmsg,"Case Studies");
		}
		catch(Exception e)
		{
			logger.error("test failed");
			Assert.fail();
		}
		logger.info("*** finished TC_005_Case_Studies");
	}

}
