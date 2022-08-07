package pageObject;

import base.setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class loginPage extends setup {

    //anything from login page
    //UI web elements > Go to console > Click on the Command + F > type the xpath > It will highlight the web elements
     // POM - https://www.guru99.com/page-object-model-pom-page-factory-in-selenium-ultimate-guide.html

     //any functions that's requires in this page

     public loginPage(WebDriver driver){
          PageFactory.initElements(driver,this);
          setup.driver = driver;

     }

     @FindBy(how= How.XPATH,using = "//input[@name='email']")
     public WebElement emailEditBoxLocator;

     @FindBy(how= How.XPATH,using = "//input[@name='password']")
     public WebElement passwordEditBoxLocator;

     @FindBy(how= How.XPATH,using = "//input[@value='Log In']")
     public WebElement logInButtonLocator;


     public void enterEmailAddress(String email){
          emailEditBoxLocator.sendKeys(email);
     }


     public void enterPassword(String password){
          passwordEditBoxLocator.sendKeys(password);
     }

     public void clickLoginButton(){
          logInButtonLocator.click();
     }

     public void verifyHomepageTitle(){
          String act = driver.getTitle();
          String exp = "Sign In";
          Assert.assertEquals(act,exp);
     }
}
