package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;


import pageObjects.Home;
import pageObjects.Careers;

public class TC_004_Careers extends BaseClass
{
	@Test
	public void test_Careers() 
	
	{   
    	logger.debug("application logs....");
    	logger.info("*** Starting TC_004_Careers");
		try {
			
		Home hp=new Home(driver,js);
		hp.clickCareers();
		logger.info("click on Careers link");
	
        Careers cs=new Careers(driver,js);			
		String confmsg=cs.isCareersExists();
		logger.info("validating expected message");
		Assert.assertEquals(confmsg,"Join Us");
		}
		catch(Exception e)
		{
			logger.error("test failed");
			Assert.fail();
		}
		logger.info("*** finished TC_004_Careers");
	}


}
