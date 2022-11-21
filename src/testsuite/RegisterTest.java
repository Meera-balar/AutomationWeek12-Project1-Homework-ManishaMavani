package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;
import org.junit.Assert;

public class RegisterTest extends Utility {
    //Url stored into baseUrl
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void UserShouldNavigateToRegisterPageSuccessfully(){
        //Click on Register button
        clickOnElement(By.xpath("//div[@class = 'header-links']/ul/li[1]/a[text() ='Register']"));
        //This is from requirement
        String expectedText = "Register";
        // Find the register text element and get the text
        String actualText = getTextFromElement(By.xpath("//div[@class = 'header-links']/ul/li[1]/a[text() ='Register']"));
        //Validate actual and expected message
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        //Click on Register button
        clickOnElement(By.xpath("//div[@class = 'header-links']/ul/li[1]/a[text() ='Register']"));
        //Click on radio button
        clickOnElement(By.xpath("//input[@id='gender-female']"));
        //Enter FirstName
        sendTextToElement(By.xpath("//input[@id='FirstName']"),"Meera");
        //Enter LastName
        sendTextToElement(By.xpath("//input[@id='LastName']"),"Mavani");
        //Select day
        sendTextToElement(By.xpath("//select[@name = 'DateOfBirthDay']"),"30");
        //Select month
        sendTextToElement(By.xpath("//select[@name = 'DateOfBirthMonth']"),"7");
        //Select year
        sendTextToElement(By.xpath("//select[@name = 'DateOfBirthYear']"),"1995");
        //Enter Email
        sendTextToElement(By.xpath("//input[@id = 'Email']"),"MeeraMavani25@gmail.com");
        //Enter Password
        sendTextToElement(By.xpath("//input[@id = 'Password']"),"123456Meera");
        //Enter Confirm Password
        sendTextToElement(By.xpath("//input[@id = 'ConfirmPassword']"),"123456Meera");
        //Click on register button
        clickOnElement(By.xpath("//button[@id = 'register-button']"));
        String expectedMessage = "Your registration completed";
        String actualMessage = getTextFromElement(By.xpath("//div[text()= 'Your registration completed']"));
        //verify actual equals expected
        Assert.assertEquals(expectedMessage,actualMessage);
    }
    @After
    public void tearDown(){
        //This method close the web browser
        closeBrowser();
    }
}
