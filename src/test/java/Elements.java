import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elements {

    @FindBy(xpath = "//a[@class='logo']")
    private WebElement logo;

    @FindBy(className = "caret")
    private WebElement logOutBtn;

    @FindBy(xpath = "//i[@class='fa fa-fw ti-shift-right']")
    private WebElement logOutLink;

    @FindBy(xpath = "//i[@class='fa fa-fw ti-user']")
    private WebElement userSettings;

    @FindBy(xpath = "//input[@id='Profile_firstname']")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@id='Profile_lastname']")
    private WebElement lastNameField;

    @FindBy(xpath = "//select[@id='Profile_gender']")
    private WebElement profileGender;

    @FindBy(xpath = "//select[@id='Profile_gender']/option[2]")
    private WebElement selectprofileGender;

    @FindBy(xpath = "//*[@id='usersettings-form']/div/div/div[6]/input")
    private WebElement saveUserSettingsBtn;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    private WebElement alert;

    @FindBy(xpath = "//div[@class='container']//input[@id='UserLogin_username']")
    private WebElement emailField;

    @FindBy(xpath = "//div[@class='container']//input[@id='UserLogin_password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//div[@class='icheckbox_minimal-blue']//ins[@class='iCheck-helper']")
    private WebElement checkBoxRememberMe;

    @FindBy(xpath = "//*[@id='authentication']/a")
    private WebElement lostPasswordLink;

    @FindBy(xpath = "//*[@id='authentication']/span/a")
    private WebElement newRegisterLink;

    @FindBy(xpath = "//form[@id='authentication']//small[@id='UserLogin_username_em_']")
    private WebElement errorEmptyEmail;

    @FindBy(xpath = "//form[@id='authentication']//small[@id='UserLogin_password_em_']")
    private WebElement errorEmptyPassword;

    @FindBy(xpath = "//div[@class='form-group col-xs-12 has-error']//small[@class='help-block' and text()='Email/Password is incorrect.']")
    private WebElement getErrorEmailPassword;

    @FindBy(className = "preloader")
    private WebElement preloader;
}

