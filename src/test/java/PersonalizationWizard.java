import Helpers.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalizationWizard extends BaseTest {

    public PersonalizationWizard(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[@id='envSwitcher']")
    private WebElement envSwitcher;

    @FindBy (xpath = "//tr[@data-url='/en/personalizations/index/?switchAccount=1687']")
    public WebElement selectEnv;

    @FindBy(xpath = "//div[@id='env_modal']")
    private WebElement envModal;

    @FindBy(xpath = "//div[@class='main-header']")
    private WebElement dashboard;

    @FindBy(className = "preloader")
    private WebElement preloader;


    public void Open(){
        waitForElement(dashboard);
        driver.get("http://app.wiqhit.hysdev.com/en/personalizations/");
        waitForElementIsNotVisible(preloader);
    }

    public void ChangeEnv(){
        envSwitcher.click();
        waitForElement(envModal);
        selectEnv.click();
    }

}
