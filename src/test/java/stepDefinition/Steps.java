package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProvider.ConfigFileReader;
import managers.FileReaderManager;
import managers.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.CareersPage;
import pageObjects.HomePage;
import pageObjects.SACareersPage;

import java.util.concurrent.TimeUnit;

public class Steps {
    WebDriver driver;
    HomePage homePage;
    CareersPage careersPage;
    SACareersPage saCareersPage;
    ConfigFileReader configFileReader;
    WebDriverManager webDriverManager;

    @Given("user is on Home Page")
    public void userIsOnHomePage() {
        webDriverManager = new WebDriverManager();
        driver = webDriverManager.getDriver();
        homePage = new HomePage(driver);
//        configFileReader = new ConfigFileReader();
//        if (configFileReader.getBrowser().equals("chrome")){
//            System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chrome\\chromedriver.exe");
//            driver = new ChromeDriver();
//        }
//        switch (configFileReader.getBrowser()) {
//            case "chrome" :
//                System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chrome\\chromedriver.exe");
//                driver = new ChromeDriver();
//                break;
//            case "ff" : driver = new FirefoxDriver();
//                break;
//            default: throw new RuntimeException("browser not specified in the Configuration.properties file.");
//        }

//        System.setProperty("webdriver.chrome.driver","C:\\BrowserDriver\\chrome\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        driver.get(configFileReader.getApplicationUrl());
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
//        driver = configFileReader.createDriver(); //ToDo: Create singleton browser instance
//
//        System.setProperty("webdriver.chrome.driver", FileReaderManager.getInstance().getConfigReader().getDriverPath());
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
//        pageObjectManager = new PageObjectManager(driver);
//        homePage = new HomePage(driver);
    }

    @When("he navigate to Careers page")
    public void heNavigateToCareersPage() {
        careersPage = homePage.getCareersPage();
    }

    @And("he choose {string}")
    public void heChoose(String country) {
        saCareersPage = careersPage.getSACareersPage(country);
    }

    @And("he select the first available job")
    public void heSelectTheFirstAvailableJob() {
        saCareersPage.selectJobOpening();
    }

    @And("he select apply online button")
    public void heSelectButton() {
        saCareersPage.clickApplyOnlineButton();
    }

    @And("populate the name {string}")
    public void populateTheName(String name) {
        saCareersPage.populateName(name);
    }

    @And("populate email address {string}")
    public void populateEmailAddress(String emailAddress) {
        saCareersPage.populateEmailAddress(emailAddress);
    }

    @And("populate phone number")
    public void populatePhoneNumber() {
        saCareersPage.populatePhoneNumber();
    }

    @Then("validate text {string}")
    public void validateText(String expectedMessage) {
        String actualMessage = saCareersPage.getUploadFileErrorMessage();
        Assert.assertEquals(expectedMessage,actualMessage);
//        webDriverManager.closeDriver();
    }
}

