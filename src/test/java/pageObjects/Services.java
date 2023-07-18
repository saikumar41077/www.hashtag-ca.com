package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Services extends BasePage
{
	public Services(WebDriver driver,JavascriptExecutor js)
    {
  	  super(driver,js);
    }
	
	Actions actions = new Actions(driver);
	
	//Elements
	    @FindBy(xpath = "//ul[@class='navbar-nav mr-auto mt-2 mt-lg-0']/li[1]")
        WebElement lnkServices;
	
		@FindBy(xpath = "//div[@class='row m-0']//div[1]//li[1]//a[1]")
	    WebElement navWordpress_Dev;
		
		@FindBy(xpath = "//a[text()='Blockchain Development']")
	    WebElement navBlockchain_Dev;
		
		@FindBy(xpath = "//a[text()='Design and Prototyping']")
	    WebElement navDesign_and_Prototyping;
		
		@FindBy(xpath = "//a[text()='FileMaker Pro Development']")
	    WebElement navFileMaker_Pro_Dev;
		
		@FindBy(xpath = "//a[text()='UI Development']")
	    WebElement navUI_Dev;
		
		@FindBy(xpath = "//a[text()='DB & Backend Development']")
	    WebElement navDB_Backend_Dev;
		
		
		
		
		//Action Methods
		public void clickWordpress_Dev() 
	      {
	    	  actions.moveToElement(lnkServices);
	  		  actions.moveToElement(navWordpress_Dev).click().perform();
	      }
		
		public void clickBlockchain_Dev() 
	      {
	    	  actions.moveToElement(lnkServices);
	  		  actions.moveToElement(navBlockchain_Dev).click().perform();
	      }
		
		public void clickDesign_Prototyping() 
	      {
	    	  actions.moveToElement(lnkServices);
	  		  actions.moveToElement(navDesign_and_Prototyping).click().perform();
	      }
		
		public void clickFileMaker_Pro_Dev() 
	      {
	    	  actions.moveToElement(lnkServices);
	  		  actions.moveToElement(navFileMaker_Pro_Dev).click().perform();
	      }
		
		public void clickUI_Dev() 
	      {
	    	  actions.moveToElement(lnkServices);
	  		  actions.moveToElement(navUI_Dev).click().perform();
	      }
		
		public void clicknDB_Backend_Dev() 
	      {
	    	  actions.moveToElement(lnkServices);
	  		  actions.moveToElement(navDB_Backend_Dev).click().perform();
	      }
		
		
		
		
		/*public String isWordpressExists() 
	    { 
	    	try 
	    	{
	    	return (txtAbout_Us.getText());
	    	}
	    	catch(Exception e)
	    	{
	    		return "false";
	    	}
	    }*/
}
