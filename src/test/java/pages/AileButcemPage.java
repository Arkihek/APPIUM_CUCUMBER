package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class AileButcemPage {
    public AileButcemPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)) , this);
    }

    @FindBy(xpath = "//*[@text='E-mail Adresi']")
    private MobileElement eMailBox;
    @FindBy(xpath = "//*[@text='Şifre']")
    private MobileElement sifreBox;

    public void ilkEkranGecmeMethodu(String tiklanacakText){
        for (int i = 0; i < 6; i++) {
            ReusableMethods.screenScrool(850,850,1000,200,850);
        }
        ReusableMethods.scrollWithUiScrollable(tiklanacakText);
    }

    public void logInMethod(String email, String password,String tiklanacakText) throws InterruptedException {

        eMailBox.sendKeys(email);
        sifreBox.sendKeys(password);
        ReusableMethods.scrollWithUiScrollable(tiklanacakText);
        Thread.sleep(500);
    }



}
