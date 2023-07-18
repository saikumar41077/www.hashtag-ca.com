package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Careers extends BasePage
{
	public Careers(WebDriver driver,JavascriptExecutor js)
    {
  	  super(driver,js);
    }
	
	//Elements
	
	@FindBy(xpath = "//span[text()='Join Us']")
    WebElement txtCareers;
	
	//Action Methods
	public String isCareersExists() 
    { 
    	try 
    	{
    	return (txtCareers.getText());
    	}
    	catch(Exception e)
    	{
    		return "false";
    	}
    }
}
