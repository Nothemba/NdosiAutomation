package Tests;

import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class myTests extends Base{
    @Test
    public void DisplayHomePageTest(){
        homePage.verifyHomepageIsDisplayed();
    }
    @Test
    public void ClickLeaningMaterialButtonTest(){
        homePage.ClickLeaningMaterialButton();
    }
    @Test
    public void verifyLoginPageIsDisplayedTest(){
        login.verifyLoginPageIsDisplayed();
    }
    @Test
    public void EnterEmailTest(){
        login.EnterEmail("nothemba@gmail.com");
    }
    @Test
    public void EnterPasswordTest(){
        login.EnterPassword("12345678");
    }
    @Test
    public void ClickLoginButton(){
        login.ClickLoginButton();
    }

}
