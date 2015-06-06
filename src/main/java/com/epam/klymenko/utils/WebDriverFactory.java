package com.epam.klymenko.utils;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Liliia_Klymenko on 04-Jun-15.
 */
public class WebDriverFactory {

    private static WebDriver driver;
    static int count = 0;

    public WebDriver getDriver(Capabilities capabilities) {
        if (count==0) {
            return createLocalDriver(capabilities);
        }
        else
            return driver;
    }

    private  WebDriver createLocalDriver(Capabilities capabilities) {
       count    +=1;
        String browserType = capabilities.getBrowserName();
        if (browserType.equals("firefox"))
            return new FirefoxDriver(capabilities);
        if (browserType.startsWith("internet explorer")) {
            DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
            caps.setCapability(
                    InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
                    true);
            System.setProperty("webdriver.ie.driver", "DriversExeLib/IEDriverServer32.exe");
            return new InternetExplorerDriver(caps);
        }
        if (browserType.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "DriversExeLib/chromedriver.exe");
            return new ChromeDriver();
        }
        if (browserType.equals("opera")) {
            System.setProperty("webdriver.opera.driver", "DriversExeLib/operadriver.exe");
            return new OperaDriver();
        }

        throw new Error("Unrecognized browser type: " + browserType);
    }


}
