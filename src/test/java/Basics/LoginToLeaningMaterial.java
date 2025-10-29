package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginToLeaningMaterial {

    WebDriver driver;

    @BeforeTest
    public void lauchBrowser() {
        driver = new ChromeDriver();

    }

    @Test(priority = 1)
    public void startBrowser() {
        driver.get("https://www.ndosiautomation.co.za/");
        driver.manage().window().maximize();
    }

    @Test(priority = 2)
    public void learningMaterial() throws InterruptedException {
        driver.findElement(By.id("nav-btn-practice")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void Email() {
        driver.findElement(By.id("login-email")).sendKeys("nothemba@gmail.com");


    }

    @Test(priority = 4)
    public void Password() {
        driver.findElement(By.id("login-password")).sendKeys("12345678");

    }

    @Test(priority = 5)
    public void Login() throws InterruptedException {
        driver.findElement(By.id("login-submit")).click();

    }
    @Test(priority = 6)
    public void WebAutomationB() throws InterruptedException {

        new WebDriverWait(driver, Duration.ofSeconds(10)).until(
                ExpectedConditions.elementToBeClickable(By.id("tab-btn-password"))
        );


    }

    @Test (priority = 7)
    public void  personalDetails() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.id("name")).sendKeys("Nothemba Tsheme");
        driver.findElement(By.id("email")).sendKeys("nothemba@gmail.com");
        driver.findElement(By.id("age")).sendKeys("24");

        WebElement dropdown = driver.findElement(By.id("gender"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Female");

        WebElement CDropdown = driver.findElement(By.id("country"));
        Select select1 = new Select(CDropdown);
        select1.selectByVisibleText("South Africa");

        WebElement EDropdown = driver.findElement(By.id("experience"));
        Select select2 = new Select(EDropdown);
        select2.selectByValue("beginner");

    }

    @Test (priority = 8)
    public void Skills(){
        driver.findElement(By.id("skill-java")).click();
    }
    @Test (priority = 9)
    public  void Comment(){
        driver.findElement(By.name("comments")).sendKeys("Hey I want to learn more");
    }
    @Test (priority = 10)
    public  void Terms(){
        driver.findElement(By.id("terms")).click();
    }
    @Test (priority = 11 )
    public  void  Submit(){
        driver.findElement(By.id("submit-btn")).click();
    }

//    @AfterTest
//    public void closeBrouse() {
//        driver.close();
//    }
}



