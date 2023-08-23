package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class AileButcemPage {
    public AileButcemPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)), this);
    }

    @FindBy(xpath = "//*[@text='E-mail Adresi']")
    private MobileElement eMailBox;

    @FindBy(xpath = "//*[@text='Şifre']")
    private MobileElement sifreBox;

    @FindBy(xpath = "//*[@text='Başarıyla giriş yapıldı.']")
    public MobileElement basariliGirisKontrol;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement nameBox;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public MobileElement surnameBox;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[3]")
    public MobileElement cityBox;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[4]")
    public MobileElement ageBox;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[5]")
    public MobileElement jobBox;


    public void ilkEkranGecmeMethodu(String tiklanacakText) {
        for (int i = 0; i < 6; i++) {
            ReusableMethods.screenScrool(850, 850, 1000, 200, 850);
        }
        ReusableMethods.scrollWithUiScrollableClick(tiklanacakText);
    }

    public void logInMethod(String email, String password, String tiklanacakText) throws InterruptedException {

        eMailBox.sendKeys(email);
        sifreBox.sendKeys(password);
        ReusableMethods.scrollWithUiScrollableClick(tiklanacakText);
        Thread.sleep(500);
    }

    public void boxClear() throws InterruptedException {
        nameBox.clear();
        surnameBox.clear();
        cityBox.clear();
        ageBox.clear();
        jobBox.clear();
        Thread.sleep(1000);
    }

    public void editBoxes(String name, String surname, String city, String age, String job) throws InterruptedException {
        nameBox.sendKeys(name);
        surnameBox.sendKeys(surname);
        cityBox.sendKeys(city);
        ageBox.sendKeys(age);
        jobBox.sendKeys(job);
        Thread.sleep(1000);
    }

    public void assertionMethod(String name, String surname, String city, String age, String job) {
        Assert.assertTrue(nameBox.getText().contains(name));
        Assert.assertTrue(surnameBox.getText().contains(surname));
        Assert.assertTrue(cityBox.getText().contains(city));
        Assert.assertTrue(ageBox.getText().contains(age));
        Assert.assertTrue(jobBox.getText().contains(job));
    }


}
