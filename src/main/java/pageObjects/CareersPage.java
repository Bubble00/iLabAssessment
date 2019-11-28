package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CareersPage {
    WebDriver driver;
    public CareersPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[contains(@class,'vc_btn3-container')]/a")
    List<WebElement> locationLinks;

    public SACareersPage getSACareersPage(String location){
        for (WebElement locationLink:locationLinks) {
            if(locationLink.getText().equals(location)){
                locationLink.click();
                break;
            }
        }
        return new SACareersPage(driver);
    }


}
