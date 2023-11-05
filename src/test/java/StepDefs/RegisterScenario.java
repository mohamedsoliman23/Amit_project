package StepDefs;

import Pages.RegisterLocators;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import static StepDefs.Browsering.driver;

public class RegisterScenario {
    RegisterLocators register = null;
@Given("user go to register page")
    public void OpenSigninPage(){
    register = new RegisterLocators();
    register.SignInPage().click();
}
    @When("user enter email \"d@example.com\" field")

    public void enterEmail(){
        register.enterEmail().sendKeys("d@example.com");
    }
    @Then("click on create account")
    public void createAccount(){
        register.createAccountButton().click();
    }
    @When ("user select gender type")
    public void ChooseGender() {
        register.genderID().click();

    }
    @And("user enter first name \"automation\" and last name \"tester\"")
    public void EnterUserName(){
        register.firstName().sendKeys("automation");
        register.lastName().sendKeys("tester");
    }
    @And("user fills Password fields \"P@ssw0rd\" \"P@ssw0rd\"")
    public void enterPass(){
        register.Password().sendKeys("P@ssw0rd");
    }
    @And("user enter date of birth")
    public void EnterBirthDate(){
        Select day = new Select(register.Days());
        day.selectByValue("19");
        Select month = new Select(register.Months());
        month.selectByValue("10");
        Select year = new Select(register.Years());
        year.selectByValue("1994");
    }
    @And("enter rest fields")
    public void enterTheRestField(){
        register.Address().sendKeys("Makram Ebid");
        register.City().sendKeys("Nasr City");
        Select state = new Select(register.State());
        state.selectByValue("32");
        register.PostCode().sendKeys("12345");
        Select country = new Select(register.Country());
        country.selectByValue("21");
        register.PhoneNumber().sendKeys("0122548665");
        register.AddressAlias().sendKeys("Clorado USA");
    }
    @Then("user clicks on register button")
    public void ConfirmRegister(){
        register.RegisterButton().click();
    }
    @And("Assert Register Successfully")
    public void AssertionPhase1(){
        SoftAssert soft = new SoftAssert();
        WebElement LogoutButton = driver.findElement(By.cssSelector("a[class=\"logout\"]"));
        soft.assertTrue(LogoutButton.isDisplayed());
        soft.assertEquals(driver.findElement(By.className("navigation_page")).isDisplayed(),true);
        soft.assertAll();


    }

}
