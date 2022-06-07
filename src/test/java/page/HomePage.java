package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage(WebDriver driver){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Sign In")
    public WebElement signInLink;
}
