package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Wordpress_Development extends BasePage
{
	public Wordpress_Development(WebDriver driver,JavascriptExecutor js)
    {
  	  super(driver,js);
    }
	
	//Elements
	
		@FindBy(xpath = "//h1[text() = 'Wordpress ']")
	    WebElement Wordpress_Development;
		
		//Action Methods
		public String isWord_pressExists() throws InterruptedException 
	    { 
			Thread.sleep(1000);
	    	try 
	    	{
	    	return (Wordpress_Development.getText());
	    	}
	    	catch(Exception e)
	    	{
	    		return "false";
	    	}
	    }
}
