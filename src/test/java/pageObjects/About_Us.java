package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class About_Us extends BasePage
{
	public About_Us(WebDriver driver,JavascriptExecutor js)
    {
  	  super(driver,js);
    }
	
	//Elements
	
	@FindBy(xpath = "//h1[text() = 'About us']")
    WebElement txtAbout_Us;
	
	//Action Methods
	public String isAbout_UsExists() 
    { 
    	try 
    	{
    	return (txtAbout_Us.getText());
    	}
    	catch(Exception e)
    	{
    		return "false";
    	}
    }

}
