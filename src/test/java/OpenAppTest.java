import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class OpenAppTest {

    public static void main(String[] args) throws MalformedURLException {
        AppiumDriver driver;

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName","VIVO Y15");
        cap.setCapability("udid","U47TLZUOIZDIEAKR");
        cap.setCapability("platformName","Android");
        cap.setCapability("automationName","UiAutomator2");
        cap.setCapability("platformVersion","9");
        cap.setCapability("appPackage","com.saucelabs.mydemoapp.rn");
        cap.setCapability("appActivity","com.saucelabs.mydemoapp.rn.MainActivity");
       URL url = new URL("http://127.0.0.1:6000/wd/hub");
       driver = new AppiumDriver(url,cap);
    }
}
