package managers;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import enums.DriverType;


public class WebDriverManager {
    private WebDriver driver;
    private static DriverType driverType;
    private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
    private static final String FIREFOX_DRIVER_PROPERTY = "webdriver.gecko.driver";

    public WebDriverManager() {
        driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
    }

    public WebDriver getDriver() {
        if(driver == null) driver = createDriver();
        return driver;
    }

    private WebDriver createDriver() {
        switch (driverType) {
            case FIREFOX :
                System.setProperty(FIREFOX_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigReader().getDriverPath());
                driver = new FirefoxDriver();
                break;
            case CHROME :
                System.setProperty(CHROME_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigReader().getDriverPath());
                driver = new ChromeDriver();
                break;
        }
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
        return driver;
    }

    public void closeDriver() {
        driver.close();
        driver.quit();
    }

}