package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.Driver;

public class denemeStep {

    public denemeStep() {
    }

    @Given("Kullanici ilgili kurulumlari tamamlayarak cihazla baglantisini gerceklestirir")
    public void kullanici_ilgili_kurulumlari_tamamlayarak_cihazla_baglantisini_gerceklestirir() {
        Driver.getAndroidDriver();
    }
}
