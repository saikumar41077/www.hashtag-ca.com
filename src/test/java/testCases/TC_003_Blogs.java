package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Home;
import pageObjects.Blog;

public class TC_003_Blogs extends BaseClass
{
	@Test
	public void test_Blogs() 
	
	{   
    	logger.debug("application logs....");
    	logger.info("*** Starting TC_003_Blogs");
		try {
			
		Home hp=new Home(driver,js);
		hp.clickBlog();;;
		logger.info("click on Blog link");
	
        Blog bg=new Blog(driver,js);			
		String confmsg=bg.isBlogExists();
		logger.info("validating expected message");
		Assert.assertEquals(confmsg,"Blogs");
		}
		catch(Exception e)
		{
			logger.error("test failed");
			Assert.fail();
		}
		logger.info("*** finished TC_003_Blogs");
	}

}
