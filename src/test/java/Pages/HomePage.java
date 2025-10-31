package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class HomePage {

    WebDriver driver;
    @FindBy(id = "overview-hero")
    WebElement homePagetitle;

    @FindBy(id = "nav-btn-practice")
    WebElement clickLeaningMaterial;

    public void homePage(WebDriver driver){
        this.driver = driver;
    }

    public void verifyHomepageIsDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(homePagetitle));
        homePagetitle.isDisplayed();
    }

    public void ClickLeaningMaterialButton(){
        clickLeaningMaterial.click();
    }

}
