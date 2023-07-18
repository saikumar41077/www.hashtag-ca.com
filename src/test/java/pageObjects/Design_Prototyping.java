package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageObjects.BasePage;

public class Design_Prototyping extends BasePage
{
	public Design_Prototyping(WebDriver driver,JavascriptExecutor js)
    {
  	  super(driver,js);
    }
	
	        //Elements
			@FindBy(xpath = "//h1[text() = 'Design and']")
		    WebElement txt_Design_Prototyping;
			
			//Action Methods
			public String isDesign_PrototypingExists()
		    { 	
		    	try 
		    	{
		    	return (txt_Design_Prototyping.getText());
		    	}
		    	catch(Exception e)
		    	{
		    		return "false";
		    	}
		    }

}
