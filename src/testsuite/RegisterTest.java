package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utlities.Utility;

public class RegisterTest extends Utility {

        String baseUrl = "https://demo.nopcommerce.com/";

        @Before
        public void setUp(){
            openBrowser(baseUrl);
        }

        @Test
        public void UserShouldNavigateToRegisterPageSuccessfully(){

            // Find the Register tab and click the link
            clickOnElement(By.linkText("Register"));

            //This is from requirement
            String expectedText = "Register";

            // Verify the text Register
            String actualText = getTextFromElement(By.xpath("//div[@class = 'page-title']/h1[contains(text(), 'Register')]"));

            // Verify the text Computers
            Assert.assertEquals(actualText, expectedText);
        }

        @Test
        public void userShouldRegisterAccountSuccessfully(){

            // Find the Register link and click the link
            clickOnElement(By.linkText("Register"));

            // Select the gender radio button and click it
            clickOnElement(By.id("gender-male"));

            // Find the Firstname field and send the firstname
            sendTextToElements(By.id("FirstName"),"Pratik");

            // Find the Lastname field and send the LastName
            sendTextToElements(By.id("LastName"), "Vyas");

            // Find the Date field and send the date
            sendTextToElements(By.name("DateOfBirthDay"), "20");

            // Find the Month field and send the Month
            sendTextToElements(By.name("DateOfBirthMonth"), "December");

            // Find the Year field and send the year
            sendTextToElements(By.name("DateOfBirthYear"), "1999");

            // Find the Email field and send the Email
            sendTextToElements(By.name("Email"), "pratik@example.com");

            // Find the Comapny name field and send the company
            sendTextToElements(By.name("Company"), "ABC Ltd");

            // Find the Newsletter field and send the newsletter
            sendTextToElements(By.name("Newsletter"), "true");

            // Find the Password field and send the password
            sendTextToElements(By.name("Password"), "joejones12345");

            // Find the Confirm password field and send the confirm password
            sendTextToElements(By.name("ConfirmPassword"), "joejones12345");

            // Click on register button
            clickOnElement(By.id("register-button"));

            //This is from requirement
            String expectedText = "Your registration completed";

            String actualText = getTextFromElement(By.xpath("//div[text() = 'Your registration completed']"));

            // Verify the text Your registration completed
            Assert.assertEquals(actualText, expectedText);
        }

        @After
        public void teardown(){
            //  closeBrowser();
        }
    }
