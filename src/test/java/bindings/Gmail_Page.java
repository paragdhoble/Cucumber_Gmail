package bindings;

import common_methods.Reuseable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class Gmail_Page extends Reuseable {
     WebDriver driver;


    @Given("^Chrome Browser launch$")
    public void that_i_am_on_the_shopping_website() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Parag\\Software\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://accounts.google.com/signin");
        driver.manage().window().maximize();
    }

    @When("^I am on the Gmail Login and Enter the UserId and Password$")
    public void i_add_an_item_to_the_basket() throws Throwable {
        driver.findElement(By.id ("identifierId")).click();
        driver.findElement(By.id ("identifierId")).sendKeys("002test.automation@gmail.com");
        driver.findElement(By.id ("identifierNext")).click();
        Thread.sleep(500);
        driver.findElement(By.name("password")).isSelected();
        driver.findElement(By.name("password")).sendKeys("xxxx");
        Thread.sleep(500);
        driver.findElement(By.id("passwordNext")).click();
        Thread.sleep(10000);
        TakeScreenShot(driver);
    }

    @Then("^I am able to Login Gmail$")
    public void i_can_view_the_item_in_my_basket() throws Throwable {
        driver.get("https://mail.google.com/mail/u/0/#inbox");
        Thread.sleep(1000);
        TakeScreenShot(driver);

        driver.quit();
    }


}