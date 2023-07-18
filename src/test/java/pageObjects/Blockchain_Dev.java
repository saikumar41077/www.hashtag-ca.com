package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Blockchain_Dev  extends BasePage
{
	public Blockchain_Dev(WebDriver driver,JavascriptExecutor js)
    {
  	  super(driver,js);
    }
	
	//Elements
	
		@FindBy(xpath = "//h1[text() = 'Blockchain ']")
	    WebElement txt_Blockchain_Dev;
		
		//Action Methods
		public String isBlockchain_DevExists()
	    { 
			
	    	try 
	    	{
	    	return (txt_Blockchain_Dev.getText());
	    	}
	    	catch(Exception e)
	    	{
	    		return "false";
	    	}
	    }

}
