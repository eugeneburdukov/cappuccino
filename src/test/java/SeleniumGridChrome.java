import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGridChrome {

    WebDriver driver;
    String baseUrl, nodeURLlocal, nodeURLRemote;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        baseUrl = "https://www.eolymp.com";
        nodeURLlocal = "http://192.168.1.231:4445";
        nodeURLRemote = "http://3.21.52.134:4445";
        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setBrowserName("chrome");
        driver = new RemoteWebDriver(new URL(nodeURLlocal), capability);
    }

    @AfterTest
    public void afterTest0() {
        driver.quit();
    }

    @Test
    public void simpleTest() {
        driver.get(nodeURLlocal);
        Allure.addAttachment("Screenshot from grid - chrome", new ByteArrayInputStream(((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.BYTES)));
        Assert.assertEquals(driver.getTitle(), driver.getTitle());
    }
}