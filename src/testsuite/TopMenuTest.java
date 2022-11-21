package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {
    //Url stored into baseUrl
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        //click on computer tab
        clickOnElement(By.xpath("//div[@class = 'header-menu' ]/ul[1]/li[1]//a[text() = 'Computers ']"));
        String expectedMessage = "Computers";
        // Find the Computer text get the text
        String actualMessage = getTextFromElement(By.xpath("//div[@class = 'header-menu' ]/ul[1]/li[1]//a[text() = 'Computers ']"));
        //Validate actual and expected message
        Assert.assertEquals(expectedMessage,actualMessage);

    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        //click on Electronics tab
        clickOnElement(By.xpath("//div[@class = 'header-menu']/ul[1]/li[2]/a[text()='Electronics ']"));
        String expectedMessage = "Electronics";
        // Find the Electronics text get the text
        String actualMessage = getTextFromElement(By.xpath("//div[@class = 'header-menu']/ul[1]/li[2]/a[text()='Electronics ']"));
        //Validate actual and expected message
        Assert.assertEquals("Text match ",expectedMessage,actualMessage);

    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        //click on Apparel tab
        clickOnElement(By.xpath("//div[@class = 'header-menu']/ul[1]/li[3]/a[text()='Apparel ']"));
        String expectedMessage = "Apparel";
        // Find the Apparel text get the text
        String actualMessage = getTextFromElement(By.xpath("//div[@class = 'header-menu']/ul[1]/li[3]/a[text()='Apparel ']"));
        //Validate actual and expected message
        Assert.assertEquals("Text match ",expectedMessage,actualMessage);

    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        //click on Digital downloads tab
        clickOnElement(By.xpath("//div[@class = 'header-menu']/ul[1]/li[4]/a[text() = 'Digital downloads ']"));
        String expectedMessage = "Digital downloads";
        // Find the Digital downloads text get the text
        String actualMessage = getTextFromElement(By.xpath("//div[@class = 'header-menu']/ul[1]/li[4]/a[text() = 'Digital downloads ']"));
        //Validate actual and expected message
        Assert.assertEquals("Text match ",expectedMessage,actualMessage);

    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        //click on Books tab
        clickOnElement(By.xpath("//div[@class = 'header-menu']/ul[1]/li[5]/a[text() = 'Books ']"));
        String expectedMessage = "Books";
        // Find the Books text get the text
        String actualMessage = getTextFromElement(By.xpath("//div[@class = 'header-menu']/ul[1]/li[5]/a[text() = 'Books ']"));
        //Validate actual and expected message
        Assert.assertEquals("Text match ",expectedMessage,actualMessage);

    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        //click on Jewelry tab
        clickOnElement(By.xpath("//div[@class = 'header-menu']/ul[1]/li[6]/a[text() = 'Jewelry ']"));
        String expectedMessage = "Jewelry";
        // Find the Jewelry text get the text
        String actualMessage = getTextFromElement(By.xpath("//div[@class = 'header-menu']/ul[1]/li[6]/a[text() = 'Jewelry ']"));
        //Validate actual and expected message
        Assert.assertEquals("Text match ",expectedMessage,actualMessage);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfull(){
        //click on Gift Cards tab
        clickOnElement(By.xpath("//div[@class = 'header-menu']/ul[1]/li[7]/a[text() = 'Gift Cards ']"));
        String expectedMessage = "Gift Cards";
        // Find the Gift Cards text get the text
        String actualMessage = getTextFromElement(By.xpath("//div[@class = 'header-menu']/ul[1]/li[7]/a[text() = 'Gift Cards ']"));
        //Validate actual and expected message
        Assert.assertEquals("Text match ",expectedMessage,actualMessage);

    }
    @After
    public void tearDown(){
        //This method close the web browser
       closeBrowser();
    }
}
