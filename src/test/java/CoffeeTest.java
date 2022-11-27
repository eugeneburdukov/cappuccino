import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.net.MalformedURLException;
import java.net.URL;

public class CoffeeTest {


    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver;
        DesiredCapabilities capabilities = new DesiredCapabilities();


        driver = new RemoteWebDriver(new URL("http://localhost:4445/ui/index.html#/"), capabilities);
    }

    //    public void setup(String browserType) throws MalformedURLException {
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//
//        if (browserType.equalsIgnoreCase("chrome")) {
//            capabilities.setBrowserName(BrowserType);
//        }
//    }
}
