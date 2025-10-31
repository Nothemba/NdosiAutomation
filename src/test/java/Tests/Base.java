package Tests;

import Pages.HomePage;
import Pages.Login;
import Pages.LearningPage;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class Base {

BrowserFactory browserFactory = new BrowserFactory();
final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.ndosiautomation.co.za/");
HomePage homePage = PageFactory.initElements(driver, HomePage.class);
Login login = PageFactory.initElements(driver, Login.class);
LearningPage webAumationAdvanced = PageFactory.initElements(driver, LearningPage.class );


}
