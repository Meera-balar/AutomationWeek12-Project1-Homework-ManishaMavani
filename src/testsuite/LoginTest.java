package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;
import org.junit.Assert;

public class LoginTest extends Utility {
    //Url stored into baseUrl
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        //Click on Login button
        clickOnElement(By.xpath("//a[text() = 'Log in']"));
        //This is from requirement
        String expectedMessage = "Welcome, Please Sign In!";
        // Find the welcome text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//h1[text() = 'Welcome, Please Sign In!']"));
        //Validate actual and expected message
        Assert.assertEquals("Navigate to login page",expectedMessage, actualMessage);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        clickOnElement(By.xpath("//a[text() = 'Log in']"));
        //enter valid email
        sendTextToElement(By.xpath("//input[@id = 'Email']"),"ManishaM123@gmial.com");
        //enter valid password
        sendTextToElement(By.name("Password"), "Mani123456");
        //Click on login button
        clickOnElement(By.xpath("//button[text() = 'Log in']"));
        String expectedButton = "Log out";
        String actualButton = getTextFromElement(By.xpath("//a[text()='Log out']"));
        //verify Log Out button display
        Assert.assertEquals("Log out button is displayed successfully ",expectedButton,actualButton);
    }
    @Test
    public void verifyTheErrorMessage(){
        clickOnElement(By.xpath("//a[text() = 'Log in']"));
        //enter Invalid email
        sendTextToElement(By.xpath("//input[@id = 'Email']"),"abcd@gmail.com");
        //enter Invalid password
        sendTextToElement(By.xpath("//input[@id='Password']"), "123456a");
        //Click on login button
        clickOnElement(By.xpath("//button[text() = 'Log in']"));

        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" + "No customer account found";
        String actualErrorMessage = getTextFromElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        //Verify the error message
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);

    }

    @After
    public void tearDown(){
        //This method close the web browser
        closeBrowser();
    }
}
