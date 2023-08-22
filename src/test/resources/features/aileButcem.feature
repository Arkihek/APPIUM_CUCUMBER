Feature: Kullanici aile butcem uygulamasindaki fonksiyonlari test eder

  @aile
  Scenario: Kullanici ilgili adimlari takip ederek uygulama ici gorevler yerine getirir

    * Kullanici ilgili kurulumlarini tamamlayarak "com.ailebutcem" ve "com.ailebutcem.MainActivity" ile cihazla baglantisini gerceklestirir
    * ilk ekran ayarlarini yapin ve ardindan "Giriş Yap" login sayfasina ulasin
    * "testfort108@gmail.com" ve "t108t108" bilgilerini girerek kullanici bilgileriyle "Giriş Yap" giris yapin
    * uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin
    * sol kisimdaki menuden hesabim bolumune gidin
    * hesabim sayfasindaki bilgileri degistirerek degisikleri kaydedin
    * ardindan degisiklerin yapildigini dogrulayin
    * kullanici uygulamayi kapatir


  Scenario: Kullanici ilgili adimlari takip ederek uygulama ici gorevler yerine getirir

    * ilk ekran ayarlarini yapin ve ardindan login sayfasina ulasin
    * mail ve password bilgilerini girerek kullanici bilgileriyle giris yapin
    * uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin
    * anasayfadaki arti butonuna tiklayin
    * gelir ekle bolumune tiklayin
    * aciklama,gelir tip, kategori, tarih ve tutari belirleyin ve kaydedin
    * basariyla eklendigini dogrulayin
