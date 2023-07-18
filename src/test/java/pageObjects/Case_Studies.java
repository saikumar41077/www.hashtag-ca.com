package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Case_Studies extends BasePage
{
	public Case_Studies(WebDriver driver,JavascriptExecutor js)
    {
  	  super(driver,js);
    }
	
	//Elements
	
	@FindBy(xpath = "//span[text()='Case Studies']")
    WebElement txtCase_Studies;
	
	//Action Methods
	public String isCase_StudiesExists() throws InterruptedException 
    { 
		Thread.sleep(1000);
    	try 
    	{
    	return (txtCase_Studies.getText());
    	}
    	catch(Exception e)
    	{
    		return "false";
    	}
    }
}
 