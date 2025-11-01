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
        learningPage.verifyWelcomeMessage();
    }
    @Test(priority = 7)
    public void clickWebAdvancedTest(){
        learningPage.clickWebAdvanced();
    }
    @Test(priority = 8)
    public  void SelectDeviceTest(){
        webAutomationAdvanced.deviceType();
    }
    @Test(priority = 9)
    public void selectDeviceTypeTest(){
        webAutomationAdvanced.Brand();
    }

    @Test(priority = 10)
    public void selectStorageSizeTest(){
        webAutomationAdvanced.selectStorageSize();
    }
    @Test(priority = 11)
    public void selectColorTest(){
        webAutomationAdvanced.selectColor();
    }
    @Test(priority = 12)
    public void enterQuantityTest(){
        webAutomationAdvanced.EnterQuantity();
    }
    @Test(priority = 13)
    public void enterAddressTest(){
        webAutomationAdvanced.enterAddress("123 Protea Street");
    }
    @Test(priority = 14)
    public void nextButtonTest(){
        webAutomationAdvanced.nextButton();
    }




}
