Feature: Kullanici booking sitesini test eder

  Scenario: Kullanici ilgili adimlari takip ederek site icerisindeki gorevleri yerine getirir

    * Kullanici "https://www.booking.com" sayfasina gider
    * Cookies`i kabul eder
    * sag ust uc cizgi menuye tiklar
    * para birimi bolumunde degisiklik yaparak euro secer
    * sag ust uc cizgi menuye tiklar
    * dil i turkce olarak degistirir
    * arama bolume antalya yazilir ve arama yapilir
    * gelen otel puanin 7 den yuksek oldugu dogrulanir
    * uygulama kapatilir