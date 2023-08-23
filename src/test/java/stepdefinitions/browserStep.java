package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import pages.HepsiburadaDenemePage;
import utilities.Driver;

import java.security.Key;

public class browserStep {
    HepsiburadaDenemePage hepsiburadaDenemePage = new HepsiburadaDenemePage();

    @Given("Kullanici gerekli kurulumlari yaparak url baglantisini saglar")
    public void kullanici_gerekli_kurulumlari_yaparak_url_baglantisini_saglar() {
        Driver.getAndroidBrowserDriver().get("https://www.hepsiburada.com");
    }
    @Given("Kullanici arama kutusuna {string} arama yapin")
    public void kullanici_arama_kutusuna_arama_yapsin(String searchText) {
        hepsiburadaDenemePage.searchBox.sendKeys(searchText + Keys.ENTER);
    }

}
