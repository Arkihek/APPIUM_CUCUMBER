package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.Driver;

public class browserStep {

    @Given("Kullanici gerekli kurulumlari yaparak url baglantisini saglar")
    public void kullanici_gerekli_kurulumlari_yaparak_url_baglantisini_saglar() {
        Driver.getAndroidBrowserDriver().get("https://www.facebook.com");
    }

}
