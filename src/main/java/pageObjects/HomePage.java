package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    //private CareersPage careersPage;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "CAREERS")
    WebElement careersLink;

    public CareersPage getCareersPage(){
        careersLink.click();
        return new CareersPage(driver);
    }
}
