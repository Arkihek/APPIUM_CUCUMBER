package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserDriver;

public class BookingPage {

    public BookingPage(){
        PageFactory.initElements((WebDriver) BrowserDriver.getAndroidBrowserDriver(),this);
    }

    @FindBy(xpath = "(//*[@class='bk-icon -iconset-close'])[1]")
    public WebElement cookiesDecline;

    @FindBy(xpath = "(//span[@class='eedba9e88a'])[1]")
    public WebElement headerMobileMenuButton;

    @FindBy(xpath = "(//button[@data-testid='header-mobile-menu-currency-picker-menu-item'])[1]")
    public WebElement paraBirimi;

    @FindBy(xpath = "//*[text()='Euro']")
    public WebElement euroButton;

    @FindBy(xpath = "(//div[@class='aaee4e7cd3 e7a57abb1e fb60b9836d'])[2]")
    public WebElement languageMenu;

    @FindBy(xpath = "//*[text()='Türkçe']")
    public WebElement turkceLanguage;

    @FindBy(xpath = "//*[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "(//div[@class='abf093bdfe d86cee9b25'])[1]")
    public WebElement rateResult;

}
