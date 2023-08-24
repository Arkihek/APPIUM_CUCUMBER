package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BookingPage;
import utilities.BrowserDriver;

public class bookingStep {
    BookingPage bookingPage = new BookingPage();
    Actions actions = new Actions(BrowserDriver.getAndroidBrowserDriver());

    @Given("Kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String url) {
        BrowserDriver.getAndroidBrowserDriver().get(url);
    }
    @Given("Cookies`i kabul eder")
    public void cookies_i_kabul_eder() throws InterruptedException {
        if (bookingPage.cookiesDecline.isDisplayed()){
            bookingPage.cookiesDecline.click();
        }
    }
    @Given("sag ust uc cizgi menuye tiklar")
    public void sag_ust_uc_cizgi_menuye_tiklar() throws InterruptedException {
        Thread.sleep(1000);
        bookingPage.headerMobileMenuButton.click();
    }
    @Given("para birimi bolumunde degisiklik yaparak euro secer")
    public void para_birimi_bolumunde_degisiklik_yaparak_euro_secer() {
        bookingPage.paraBirimi.click();
        bookingPage.euroButton.click();
    }
    @Given("sag ust uc cizgi menuye tekrardan tiklar")
    public void sag_ust_uc_cizgi_menuye_tekrardan_tiklar() throws InterruptedException {
        Thread.sleep(3000);
        bookingPage.headerMobileMenuButton.click();
    }
    @Given("dil i cestina olarak degistirir")
    public void dil_i_turkce_olarak_degistirir() throws InterruptedException {
        Thread.sleep(1000);
        bookingPage.languageMenu.click();

        actions.moveToElement(bookingPage.turkceLanguage).perform();
        Thread.sleep(1000);
        bookingPage.turkceLanguage.click();
    }
    @Given("arama bolume {string} yazilir ve arama yapilir")
    public void arama_bolume_antalya_yazilir_ve_arama_yapilir(String searchText) throws InterruptedException {
        bookingPage.searchBox.sendKeys(searchText);
        Thread.sleep(1000);
        actions.sendKeys(Keys.ENTER).perform();


    }
    @Given("gelen otel puanin {double} den yuksek oldugu dogrulanir")
    public void gelen_otel_puanin_den_yuksek_oldugu_dogrulanir(Double double1) throws InterruptedException {
        Thread.sleep(2000);
        String rateResult = bookingPage.rateResult.getText();
        rateResult = rateResult.replaceAll(",",".");
        Assert.assertTrue(Double.parseDouble(rateResult)>double1);

    }
    @Given("uygulama kapatilir")
    public void uygulama_kapatilir() {
        BrowserDriver.getAndroidBrowserDriver().close();
    }
}
