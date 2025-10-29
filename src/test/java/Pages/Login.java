package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.beans.Visibility;
import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class Login {

    WebDriver driver;

    @FindBy(id = "login-heading")
    WebElement loginPageTitle;

    @FindBy(id = "login-email")
    WebElement loginEmailField;

    @FindBy(id = "login-password")
    WebElement loginPassword;

    @FindBy(id = "login-submit")
    WebElement submitForm;

    public Login(WebDriver driver){
        this.driver = driver;
    }

    public void verifyLoginPageIsDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(loginPageTitle));
        loginPageTitle.isDisplayed();

    }

    public void EnterEmail(String email){
        loginEmailField.sendKeys(email);
    }

    public  void EnterPassword(String password){
        loginPassword.sendKeys(password);
    }

    public void ClickLoginButton(){
        submitForm.click();
    }
}
