package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LearningPage {
    WebDriver driver;

    @FindBy(id = "practice-heading")
    WebElement welcomeMessage;

    @FindBy(id = "tab-btn-web")
    WebElement clickWebAutomationAdvanced;

    public LearningPage(WebDriver driver){
        this.driver = driver;
    }

    public void verifyWelcomeMessage(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(welcomeMessage));
        welcomeMessage.isDisplayed();

    }

    public void clickWebAdvanced(){
        clickWebAutomationAdvanced.click();
    }


}
