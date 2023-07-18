package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Home extends BasePage
{
      public Home(WebDriver driver,JavascriptExecutor js)
      {
    	  super(driver,js);
      }
      
      
      
      //Elements
      
      @FindBy(xpath = "//ul[@class='navbar-nav mr-auto mt-2 mt-lg-0']/li[1]")
      WebElement lnkServices;
      
      @FindBy(xpath = "//ul[@class='navbar-nav mr-auto mt-2 mt-lg-0']/li[2]")
      WebElement lnkShopify;
      
      @FindBy(xpath = "//ul[@class='navbar-nav mr-auto mt-2 mt-lg-0']/li[3]")
      WebElement lnkBlog;
      
      @FindBy(xpath = "//ul[@class='navbar-nav mr-auto mt-2 mt-lg-0']/li[4]")
      WebElement lnkCareers;
      
      @FindBy(xpath = "//ul[@class='navbar-nav mr-auto mt-2 mt-lg-0']/li[5]")
      WebElement lnkCase_Studies;
      
      @FindBy(xpath = "//ul[@class='navbar-nav mr-auto mt-2 mt-lg-0']/li[6]")
      WebElement lnkAbout_Us ;
      
      
      
      
  
      
      
      
      //Action Methods
      public void clickServices() 
      {
    	  lnkServices.click();
      }
      
      
      
      public void clickShopify() 
      {
    	
    	  lnkShopify.click();
      }
      
      public void clickBlog() 
      {
    	
    	  lnkBlog.click();
      }
      
      
      public void clickCareers() 
      {
    	
    	  lnkCareers.click();
      }
      
      public void clickCase_Studies() 
      {
    	
    	  lnkCase_Studies.click();
      }
      
      public void clickAbout_Us() 
      {
    	
    	  lnkAbout_Us.click();
      }
      
      
      
}
