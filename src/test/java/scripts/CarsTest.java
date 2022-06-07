package scripts;

import org.testng.annotations.Test;

public class CarsTest {

    /*Test Case 1: Validate Cars.com Sign in page form
Given user navigates to “https://www.cars.com/”
When user clicks on top right “Sign In” link
Then user should be navigated to “Sign in” page
And user should be able to see heading1 as "Sign in"
And user should be able to see paragraph under “Sign in” header as “New to
Cars.com? Sign up. Are you a dealer?”
And user should be able to see Email input box with “Email” label and enabled
And user should be able to see Password input box with “Password” label and
enabled
And user should be able to see warning under Password input box as “Minimum of
eight characters”
And user should be able to a link as “Forgot password?” under the Password input
box
And user should be able see “By signing in to your profile, you agree to our  Privacy
Statement  and  Terms of Service.” Text
And user should be able to “Sign in” button with its text and be displayed and
enabled
Test Case 2: Validate Cars.com Sign in page social media section
Given user navigates to “https://www.cars.com/”
When user clicks on top right “Sign In” link
Then user should be navigated to “Sign in” page
And user should be able to see headings as "Connect with social"
And user should be able to “Sign in with Facebook” link with its text and be
displayed and enabled
And user should be able to “Sign in with Google” link with its text and be displayed
and enabled
And user should be able to “Sign in with Apple” link with its text and be displayed
and enabled
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
