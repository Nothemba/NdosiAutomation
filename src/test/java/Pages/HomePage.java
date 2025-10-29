package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
        homePagetitle.isDisplayed();
    }

    public void ClickLeaningMaterialButton(){
        clickLeaningMaterial.click();
    }

}
