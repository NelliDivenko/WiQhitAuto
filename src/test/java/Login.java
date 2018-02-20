import Helpers.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static Helpers.Constants.correctEmail;
import static Helpers.Constants.correctPass;


public class Login extends BaseTest {

    public Login(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//input[@id='UserLogin_username']")
    private WebElement emailField;


    @FindBy(xpath = "//input[@id='UserLogin_password']")
    private WebElement passwordField;

    @FindBy(className = "preloader")
    private WebElement preloader;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submitButton;



    public void goToMainPage() {
        driver.get("http://app.wiqhit.hysdev.com/en/");
    }
    public void fillInEmailField() {
       waitForElement(emailField);
        emailField.sendKeys(correctEmail);
        Assert.assertEquals(emailField.getCssValue("border-color"), "rgb(102, 175, 233)");
    }

    public void fillInPasswordField() {
        waitForElement(passwordField);
        Assert.assertEquals(passwordField.getCssValue("border-color"), "rgb(204, 204, 204) rgb(108, 108, 108) rgb(108, 108, 108)");
        passwordField.sendKeys(correctPass);
    }

        public void clickOnSubmitButton() {
           waitForPageLoading(preloader);
           waitForElement(submitButton);
            submitButton.click();
        }

    }
