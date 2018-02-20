import Helpers.Base;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestsExecution extends Base {

    public PersonalizationWizard personalizationWizard;
    public Login login;

    public TestsExecution() {
      login = PageFactory.initElements(driver,Login.class);
      personalizationWizard = PageFactory.initElements(driver,PersonalizationWizard.class);
    }


    @Before
    public void openBrowser() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver, 10); // explicitly - method is called for selected element
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS); //implicitly - for one driver within the driver life
        login.goToMainPage();
        login.fillInEmailField();
        login.fillInPasswordField();
        login.clickOnSubmitButton();

    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
    @Test
    public void test_wizard() throws InterruptedException {
        personalizationWizard.Open();
        personalizationWizard.ChangeEnv();
    }


}
