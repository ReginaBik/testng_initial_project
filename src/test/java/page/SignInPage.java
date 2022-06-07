package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SignInPage {
    public SignInPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='header-signin']")
    public WebElement signInLink;

    @FindBy(xpath = "//p[@class='sds-page-section__title--sub signup-block']")
    public WebElement newUserQuestionHeader;

    @FindBy(css = "p[class='sds-helper-text']")
    public WebElement passwordWarning;

    @FindBy(css = "h1[class = 'sds-heading--1 sds-page-section__title' ]")
    public WebElement signInHeading;

    @FindBy(id = "email")
    public WebElement emailInputBox;

    @FindBy(css = "label[for='email']")
    public WebElement emailInputLabel;

    @FindBy(id = "password")
    public WebElement passwordInputBox;

    @FindBy(css = "label[for='password']")
    public WebElement passwordInputLabel;

    @FindBy(xpath = "//a[@href='/forgot_password/?email='] ")
    public WebElement passwordHelperQuestion;

    @FindBy(css = "div[class='sds-disclaimer ']")
    public WebElement termsDisclaimer;

    @FindBy(xpath = "//button[@class = 'sds-button']")
    public WebElement signInButton;

    @FindBy(css = "h3[class = 'social-title sds-heading--3']")
    public WebElement socialConnectHeader;

    @FindBy(xpath = "//li[@class='social-link']/a")
    public List<WebElement> socialMedia;

    @FindBy(css = "a[class='sds-button google-button']")
    public WebElement signInWithGoogleLink;


}
