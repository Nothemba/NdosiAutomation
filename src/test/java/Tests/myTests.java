package Tests;

import org.testng.annotations.Test;


public class myTests extends Base{
    @Test
    public void DisplayHomePageTest() {
        homePage.verifyHomepageIsDisplayed();
    }

    @Test(dependsOnMethods = {"DisplayHomePageTest"})
    public void ClickLeaningMaterialButtonTest() {
        homePage.ClickLeaningMaterialButton();
    }

    @Test(dependsOnMethods = {"ClickLeaningMaterialButtonTest"})
    public void verifyLoginPageIsDisplayedTest() {
        login.verifyLoginPageIsDisplayed();
    }

    @Test(dependsOnMethods = {"verifyLoginPageIsDisplayedTest"})
    public void EnterEmailTest() {
        login.EnterEmail("nothemba@gmail.com");
    }

    @Test(dependsOnMethods = {"EnterEmailTest"})
    public void EnterPasswordTest() {
        login.EnterPassword("12345678");
    }

    @Test(dependsOnMethods = {"EnterPasswordTest"})
    public void ClickLoginButton() {
        login.ClickLoginButton();
    }

    @Test(dependsOnMethods = {"ClickLoginButton"})
    public void welcomeMessageTest() {
        learningPage.verifyWelcomeMessage();
    }

    @Test(dependsOnMethods = {"welcomeMessageTest"})
    public void clickWebAdvancedTest() {
        learningPage.clickWebAdvanced();
    }

    @Test(dependsOnMethods = {"clickWebAdvancedTest"})
    public void SelectDeviceTest() {
        webAutomationAdvanced.deviceType();
    }

    @Test(dependsOnMethods = {"SelectDeviceTest"})
    public void selectDeviceTypeTest() {
        webAutomationAdvanced.Brand();
    }

    @Test(dependsOnMethods = {"selectDeviceTypeTest"})
    public void selectStorageSizeTest() {
        webAutomationAdvanced.selectStorageSize();
    }

    @Test(dependsOnMethods = {"selectStorageSizeTest"})
    public void selectColorTest() {
        webAutomationAdvanced.selectColor();
    }

    @Test(dependsOnMethods = {"selectColorTest"})
    public void enterQuantityTest() {
        webAutomationAdvanced.EnterQuantity();
    }

    @Test(dependsOnMethods = {"enterQuantityTest"})
    public void enterAddressTest() {
        webAutomationAdvanced.enterAddress("123 Protea Street");
    }

    @Test(dependsOnMethods = {"enterAddressTest"})
    public void nextButtonTest() {
        webAutomationAdvanced.nextButton();
    }



}
