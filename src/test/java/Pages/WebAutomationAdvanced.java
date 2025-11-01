package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class WebAutomationAdvanced {
    WebDriver driver;

    @FindBy(id = "deviceType")
    WebElement selectDeviceType;

    @FindBy(id = "brand")
    WebElement selectBrand;

    @FindBy(id = "storage-64GB")
    WebElement storageSize;

    @FindBy(id = "color")
    WebElement selectColor;

    @FindBy(id ="quantity")
    WebElement enterQuantityField;
    @FindBy(id = "address")
    WebElement enterAddressField;

    @FindBy(className = "purchase-btn")
    WebElement next;

    public WebAutomationAdvanced(WebDriver driver){
        this.driver = driver;
    }

    public  void deviceType(){

        Select select = new Select(selectDeviceType);
        select.selectByVisibleText("Tablet");
    }

    public  void Brand(){

        Select select = new Select(selectBrand);
        select.selectByVisibleText("Apple");
    }

    public void selectStorageSize(){
        storageSize.click();

    }
    public  void selectColor(){
        Select select = new Select(selectColor);
        select.selectByVisibleText("Gold");
    }
    public void EnterQuantity(){
        enterQuantityField.click();
    }

    public  void enterAddress(String address){
        enterAddressField.sendKeys(address);
    }
    public  void nextButton(){
        next.click();
    }


}
