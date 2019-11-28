package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utility;

import java.util.List;

public class SACareersPage {
    WebDriver driver;

    public SACareersPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(@class,'wpjb-job-list')]/div")
    List<WebElement> currentOpenings;

    @FindBy(xpath = "//div[contains(@class,'wpjb-job-list')]//span[contains(@class,'wpjb-line-major')]")
    List<WebElement> jobLinks;

    @FindBy(xpath = "//a[contains(text(),'Apply Online')]")
    WebElement applyOnlineButton;

    @FindBy(xpath = "//input[@id='applicant_name']")
    WebElement nameInputField;

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailAddressInputField;

    @FindBy(xpath = "//input[@id='phone']")
    WebElement phoneInputField;

    @FindBy(xpath = "//input[@type='submit' and @value='Send Application']")
    WebElement submitButton;

    @FindBy(xpath = "//ul[contains(@class,'errors')]/li")
    List<WebElement> uploadFileError;

    public void selectJobOpening() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(currentOpenings.size()>0){
            //currentOpenings.get(0).click();
            jobLinks.get(0).click();
            //driver.findElement(By.xpath("//div[contains(@class,'wpjb-job-list')]//span[contains(@class,'wpjb-line-major')]")).click();
        }
    }

    public void clickApplyOnlineButton(){
        applyOnlineButton.click();
    }

    public void populateName(String name){
        nameInputField.sendKeys(name);
    }

    public void populateEmailAddress(String emailAddress){
        emailAddressInputField.sendKeys(emailAddress);
    }

    public void populatePhoneNumber(){
        String number = Utility.autoGenerate();
        phoneInputField.sendKeys(number);
        submitButton.click();
    }

    public String getUploadFileErrorMessage(){
        if (uploadFileError.size()>0) {
            return uploadFileError.get(0).getText();
        }
        return null;
    }
}
