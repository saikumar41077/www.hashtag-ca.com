package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shopify extends BasePage 
{
	public Shopify(WebDriver driver,JavascriptExecutor js)
    {
  	  super(driver,js);
    }
	
	//Elements
	
	@FindBy(xpath = "//h1[contains(@class,'title-white d-block')]")
    WebElement txtShopify;
	
	//Action Methods
	public boolean isShopifyExists() 
    { 
    	try 
    	{
    	return (txtShopify.isDisplayed());
    	}
    	catch(Exception e)
    	{
    		return (false);
    	}
    }
}
