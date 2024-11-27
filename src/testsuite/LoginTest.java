package testsuite;
/**
 *userSholdLoginSuccessfullyWithValid
 * Credentials()
 * * Enter “standard_user” for the username
 * * Enter “secret_sauce” for the password
 * * Click on the ‘Login’ button
 * * Verify the text “Products
 */


/**
 * verifyThatSixProductsAreDisplayedOnPage()
 * * Enter “standard_user” for the username
 * * Enter “secret_sauce” for the password
 * * Click on the ‘Login’ button
 * * Verify that six products are displayed
 * on page
 */

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {

    String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){

        //Enter “standard_user” for the username
        sendTextToElement(By.id("user-name"),"standard_user");
        //Enter “password” for the password
        sendTextToElement(By.id("password"),"secret_sauce");
        //Click on the ‘Login’ button
        clickOnElement(By.id("login-button"));
        //Verify the text “Products
        String expectedText=getTextFromElement(By.xpath("//span[@class='title']"));
        Assert.assertEquals("invalid text;",expectedText,"Products");


    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){

        //* Enter “standard_user” for the username
        sendTextToElement(By.id("user-name"),"standard_user");
        //Enter “secret_sauce” for the password
        sendTextToElement(By.id("password"),"secret_sauce");
        //Click on the ‘Login’ button
        clickOnElement(By.id("login-button"));
        //Verify that six products are display edon page
        Assert.assertEquals("user can not see six product in display:", 6,
                driver.findElements(By.className("inventory_item")).size());






    }







    @After
    public void tearDown() {
        closeBrowser();
    }

}




