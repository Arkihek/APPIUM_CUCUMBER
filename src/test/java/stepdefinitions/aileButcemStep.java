package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.AileButcemPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class aileButcemStep {

    AileButcemPage aileButcemPage = new AileButcemPage();

    @Given("Kullanici ilgili kurulumlarini tamamlayarak cihazla baglantisini gerceklestirir")
    public void kullanici_ilgili_kurulumlarini_tamamlayarak_ve_cihazla_baglantisini_gerceklestirir() throws InterruptedException {
        Driver.getAndroidDriver();
        Thread.sleep(2000);
    }
    @Given("Kullanici ilgili kurulumlarini tamamlayarak {string} ve {string} ile cihazla baglantisini gerceklestirir")
    public void kullanici_ilgili_kurulumlarini_tamamlayarak_ve_cihazla_baglantisini_gerceklestirir(String appPackage, String appActivity) throws InterruptedException {
        Driver.getAndroidDriver2(appPackage,appActivity);
        Thread.sleep(2000);
    }
    @Given("ilk ekran ayarlarini yapin ve ardindan {string} login sayfasina ulasin")
    public void ilk_ekran_ayarlarini_yapin_ve_ardindan_login_sayfasina_ulasin(String tiklanacakText) throws InterruptedException {
        aileButcemPage.ilkEkranGecmeMethodu(tiklanacakText);
    }
    @Given("{string} ve {string} bilgilerini girerek kullanici bilgileriyle {string} giris yapin")
    public void mail_ve_password_bilgilerini_girerek_kullanici_bilgileriyle_giris_yapin(String email, String password,String tiklanacakText) throws InterruptedException {
        aileButcemPage.logInMethod(email,password,tiklanacakText);
    }
    @Given("uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamaya_kullanici_bilgileriyle_giris_yapildigini_dogrulayin() {
        Assert.assertTrue(aileButcemPage.basariliGirisKontrol.isDisplayed());
    }
    @Given("sol kisimdaki menuden {string} bolumune gidin")
    public void sol_kisimdaki_menuden_hesabim_bolumune_gidin(String tiklanacakText) throws InterruptedException {
        Thread.sleep(5000);
        ReusableMethods.koordinatTiklama(100,120,1000);
        ReusableMethods.scrollWithUiScrollableClick(tiklanacakText);
    }
    @Given("hesabim sayfasindaki bilgileri degistirerek {string} {string} {string} {string} {string} degisikleri kaydedin {string} ve degisiklik olup olmadigi dogrulanir")
    public void hesabim_sayfasindaki_bilgileri_degistirerek_degisikleri_kaydedin(String name, String surname, String city , String age, String job, String kaydetButon) throws InterruptedException {
        aileButcemPage.boxClear();
        aileButcemPage.editBoxes(name,surname,city,age,job);
        ReusableMethods.scrollWithUiScrollableClick(kaydetButon);
        aileButcemPage.assertionMethod(name,surname,city,age,job);
        Thread.sleep(1000);
    }
    @Given("kullanici uygulamayi kapatir")
    public void kullanici_uygulamayi_kapatir() {
        Driver.quitAppiumDriver();
    }

}
