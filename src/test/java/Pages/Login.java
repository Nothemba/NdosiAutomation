package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

    WebDriver driver;

    @FindBy(id = "login-heading")
    WebElement loginPageTitle;

    @FindBy(id = "login-email")
    WebElement loginEmailField;

    @FindBy(id = "login-password")
    WebElement loginPassword;

    public Login(WebDriver driver){
        this.driver = driver;
    }

    public void verifyLoginPageIsDisplayed(){
        loginPageTitle.isDisplayed();
    }

    public void EnterEmail(){
        loginEmailField.sendKeys("nothemba@gmail.com");
    }

    public  void EnterPassord(){
        loginPassword.sendKeys("12345678");
    }
}
