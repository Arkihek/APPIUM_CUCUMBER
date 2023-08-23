package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HepsiburadaDenemePage {
    public HepsiburadaDenemePage() {
        PageFactory.initElements((WebDriver) Driver.getAndroidBrowserDriver(), this);
    }
    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

}
