package utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserDriver {

    private static AndroidDriver browserDriver;

    static final String TELEFONADI = "PIXEL2";
    static final String ANDROIDVERSION = "10.0";
    static final String PLATFORM = "Android";
    static final String OTOMASYON_ISMI = "UiAutomator2";

    public static AndroidDriver getAndroidBrowserDriver() {
        URL appiumServerURL = null;
        try {
            appiumServerURL = new URL("http:127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if (browserDriver == null) {

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, TELEFONADI);
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, ANDROIDVERSION);
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM);
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, OTOMASYON_ISMI);

           // caps.setCapability("appPackage", "com.android.chrome");
           // caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");


            caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
            caps.setCapability("chromedriverExecutable", "C:\\Users\\ihsan\\IdeaProjects\\Appium_Cucumber\\driverBrowser\\chromedriver.exe");

            caps.setCapability(MobileCapabilityType.NO_RESET, false);

            if (ConfigReader.getProperty("platformName").equals("Android")) {

                assert appiumServerURL != null;
                browserDriver = new AndroidDriver<>(appiumServerURL, caps);
                browserDriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

            } else {

                throw new UnsupportedOperationException("Invalid Platform Name ");

            }
        }

        return browserDriver;
    }

    public static void quitAppiumDriver() {

        if (browserDriver != null) {

            browserDriver.closeApp();
            browserDriver = null;

        }
    }
}
