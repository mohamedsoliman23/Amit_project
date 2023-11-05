package StepDefs;

import Pages.LoginLocators;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

import static StepDefs.Browsering.driver;


public class LogInScenario {
    public static LoginLocators log = null;
    @Given("user go to login page")
    public void loginPage() throws InterruptedException {
        log = new LoginLocators();
        log.SignInPage().click();
        Thread.sleep(3000);
    }
    @When("user login with \"valid\" \"d@example.com\" and \"P@ssw0rd\"")
    public void ValidLogin() throws InterruptedException {
        Thread.sleep(6000);
        log.EnterEmail().sendKeys("d@example.com");
        log.EnterPassword().sendKeys("P@ssw0rd");
    }
    @Then("user press on login button")
    public void LoginBtn() throws InterruptedException {

        log.LoginButton().click();
        Thread.sleep(6000);
    }
    @And("user login to the system successfully")
    public void AssertionPhase2(){
        String url = driver.getCurrentUrl();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(url,"http://automationpractice.com/index.php?controller=my-account");
       WebElement myAccount = driver.findElement(By.className("navigation_page"));
        soft.assertEquals(myAccount.isDisplayed(), true);
        soft.assertAll();
    }
    @When("user login with \"invalid\" \"wrong@example.com\" and \"P@ssw0rd\"")
    public void InValidLogin(){
        log.EnterEmail().sendKeys("wrong@example.com");
        log.EnterPassword().sendKeys("P@ssw0rd");
    }
    @And("user could not login to the system")
    public void AssertionPhase3(){
        //WebElement errorMsg = driver.findElement(By.cssSelector("div[class=\"alert alert-danger\"]"));
        WebElement msg = driver.findElement(By.className("alert-danger"));
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(msg.isDisplayed(), true);
        WebElement  signin = driver.findElement(By.className("login"));
        soft.assertEquals(signin.isEnabled(),true);
        soft.assertAll();
    }


    public static LogInScenario login = null;
}

