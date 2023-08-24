Feature: Kullanici booking sitesini test eder

  @browser
  Scenario: Kullanici ilgili adimlari takip ederek site icerisindeki gorevleri yerine getirir

    * Kullanici "https://www.booking.com" sayfasina gider
    * Cookies`i kabul eder
    * sag ust uc cizgi menuye tiklar
    * para birimi bolumunde degisiklik yaparak euro secer
    * sag ust uc cizgi menuye tekrardan tiklar
    * dil i cestina olarak degistirir
    * arama bolume "newyork" yazilir ve arama yapilir
    * gelen otel puanin 7.0 den yuksek oldugu dogrulanir
    * uygulama kapatilir