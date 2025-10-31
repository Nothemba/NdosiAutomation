package Tests;

import org.testng.annotations.Test;


public class myTests extends Base{
    @Test
    public void DisplayHomePageTest(){
        homePage.verifyHomepageIsDisplayed();
    }
    @Test(priority = 1)

    public void ClickLeaningMaterialButtonTest(){
        homePage.ClickLeaningMaterialButton();
    }
    @Test(priority = 2)
    public void verifyLoginPageIsDisplayedTest(){
        login.verifyLoginPageIsDisplayed();
    }

    @Test(priority = 3)
    public void EnterEmailTest(){
        login.EnterEmail("nothemba@gmail.com");
    }
    @Test (priority = 4)
    public void EnterPasswordTest(){
        login.EnterPassword("12345678");
    }
    @Test(priority = 5)
    public void ClickLoginButton(){
        login.ClickLoginButton();
    }

    @Test(priority = 6)
    public void welcomeMessageTest(){
        webAumationAdvanced.verifyWelcomeMessage();
    }
    @Test(priority = 7)
    public void clickWebAdvancedTest(){
        webAumationAdvanced.clickWebAdvanced();
    }

}
