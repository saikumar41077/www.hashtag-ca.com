package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Design_Prototyping;
import pageObjects.Services;

public class TC_001_3_Design_Prototyping extends BaseClass
{
	@Test
	public void test_Design_Prototyping()
	
	{   
    	logger.debug("application logs....");
    	logger.info("*** Starting  TC_001_3_Design_Prototyping");
		try {
			
		Services s=new Services(driver,js);
		s.clickDesign_Prototyping();;
		logger.info("click on link Services link");
		
		Design_Prototyping dp=new Design_Prototyping(driver,js);
		String confmsg=dp.isDesign_PrototypingExists();
	
		
		logger.info("validating expected message");
		

		Assert.assertTrue(confmsg.contains("Design and"));
		//Assert.assertEquals(confmsg,"");  
		}
		catch(Exception e)
		{
			logger.error("test failed");
			Assert.fail();
		}
		logger.info("*** finished TC_001_3_Design_Prototyping");
	}
}
