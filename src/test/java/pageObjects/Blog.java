package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Blog extends BasePage
{
	public Blog(WebDriver driver,JavascriptExecutor js)
    {
  	  super(driver,js);
    }
	
	//Elements
	
	@FindBy(xpath = "//h1[@class='main-title title-white d-block']")
    WebElement txtBlog;
	
	//Action Methods
	public String isBlogExists() 
    { 
    	try 
    	{
    	return (txtBlog.getText());
    	}
    	catch(Exception e)
    	{
    		return "false";
    	}
    }

}
