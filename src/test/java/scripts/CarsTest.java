package scripts;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.SignInPage;
import utilities.Waiters;

public class CarsTest extends Base{

        /*Test Case 1: Validate Cars.com Sign in page form
    Given user navigates to “https://www.cars.com/”
    When user clicks on top right “Sign In” link/done
    Then user should be navigated to “Sign in” page//done
    And user should be able to see heading1 as "Sign in"/done
    And user should be able to see paragraph under “Sign in” header as “New to
    Cars.com? Sign up. Are you a dealer?”//done
    And user should be able to see Email input box with “Email” label and enabled//done
    And user should be able to see Password input box with “Password” label and
    enabled//done
    And user should be able to see warning under Password input box as “Minimum of
    eight characters”//done
    And user should be able to a link as “Forgot password?” under the Password input
    box//done
    And user should be able see “By signing in to your profile, you agree to our  Privacy
    Statement  and  Terms of Service.” Text//done
    And user should be able to “Sign in” button with its text and be displayed and
    enabled//done
    */



    @Test(priority = 1, description = "TC1: Validate Cars.com Sign in page form")
    public void validateSignInPageForm(){
        driver.get("https://www.cars.com/");

        signInPage.signInLink.click();
        Waiters.waitForVisibilityOfElement(driver, signInPage.signInLink, 5);
        Assert.assertTrue(signInPage.signInHeading.isDisplayed());
        Assert.assertEquals(signInPage.newUserQuestionHeader.getText(), "New to Cars.com? Sign up. Are you a dealer?");
        Waiters.waitForVisibilityOfElement(driver, signInPage.emailInputBox, 10);
        Assert.assertTrue(signInPage.emailInputBox.isEnabled());
        Assert.assertTrue(signInPage.passwordInputBox.isDisplayed() && signInPage.passwordInputBox.isEnabled());
        Assert.assertEquals(signInPage.passwordWarning.getText(), "Minimum of eight characters");
        Assert.assertTrue(signInPage.passwordHelperQuestion.isDisplayed() && signInPage.passwordHelperQuestion.isEnabled());
        Assert.assertTrue(signInPage.termsDisclaimer.isDisplayed());
        Assert.assertEquals(signInPage.termsDisclaimer.getText(), "By signing in to your profile, you agree to our  Privacy\n" +
                "Statement  and  Terms of Service.");
        Assert.assertTrue(signInPage.signInButton.isDisplayed() && signInPage.signInButton.isEnabled());

    }
            /*
    Test Case 2: Validate Cars.com Sign in page social media section
    Given user navigates to “https://www.cars.com/”
    When user clicks on top right “Sign In” link//done
    Then user should be navigated to “Sign in” page
    And user should be able to see headings as "Connect with social"//done
    And user should be able to “Sign in with Facebook” link with its text and be
    displayed and enabled
    And user should be able to “Sign in with Google” link with its text and be displayed
    and enabled
    And user should be able to “Sign in with Apple” link with its text and be displayed
    and enabled
    */

    @Test(priority = 2, description = "Test Case 2: Validate Cars.com Sign in page social media section")
    public void validateSocialMediaSection(){
        driver.get("https://www.cars.com/");

        signInPage.signInLink.click();
        Assert.assertEquals(signInPage.socialConnectHeader.getText(), "Connect with social");


    }


        /*
Test Case 3: Validate user cannot sign in to Cars.com with invalid
credentials
Given user navigates to “https://www.cars.com/”
When user clicks on top right “Sign In” link
Then user should be navigated to “Sign in” page
When user enters johndoe@gmail.com to the Email input box
And user enters abcd1234 to the Password input box
And user clicks on the “Sign in” button
Then user should not be logged in and displayed an error message on the top of the
form as below
“We were unable to sign you in.
Your email or password was not recognized. Try again soon.”*/




}
