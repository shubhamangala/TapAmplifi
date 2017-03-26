package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BaseTest implements Autoconst {
	
	public WebDriver driver;
   @BeforeMethod
  public void precondition() {
	   System.setProperty("GECKO_KEY", "webdriver.gecko.driver");
	   driver=new FirefoxDriver();
	   driver.get("file:///C:/Users/Shubhamangala/Documents/shubha.html");
	   
  }

  @AfterMethod
  public void postcondition() {
	  driver.quit();
  }

}
