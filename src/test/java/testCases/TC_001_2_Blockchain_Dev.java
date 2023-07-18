package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Services;
import pageObjects.Blockchain_Dev;

public class TC_001_2_Blockchain_Dev extends BaseClass
{
	@Test
	public void test_Blockchain_Dev() 
	
	{   
    	logger.debug("application logs....");
    	logger.info("*** Starting  TC_001_2_Blockchain_Dev");
		try {
			
		Services s=new Services(driver,js);
		s.clickBlockchain_Dev();
		logger.info("click on link Services link");
		
		Blockchain_Dev bd=new Blockchain_Dev(driver,js);
		String confmsg=bd.isBlockchain_DevExists();
	
		
		logger.info("validating expected message");
		

		Assert.assertTrue(confmsg.contains("Blockchain"));
		//Assert.assertEquals(confmsg,"");  
		}
		catch(Exception e)
		{
			logger.error("test failed");
			Assert.fail();
		}
		logger.info("*** finished TC_001_2_Blockchain_Dev");
	}
}
