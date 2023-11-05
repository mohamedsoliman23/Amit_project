package StepDefs;

import Pages.orderLocators;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import static StepDefs.Browsering.driver;
import static StepDefs.LogInScenario.login;
public class MakeOrderScenario {
    orderLocators hover = null;
    @Given("Login with valid email and password")
    public void Login_with_valid_email_and_password() throws InterruptedException {
        login = new LogInScenario();
        login.loginPage();
        login.ValidLogin();
        login.LoginBtn();
      //  throw new io.cucumber.java.PendingException();
    }
@And("go to Women category and select blouse")
    public void go_to_Women_category_and_select_blouse() {
        hover = new orderLocators();
        try {
            hover.ChooseProductType().click();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Then("Assert navigate page contain category name")
    public void AssertProduct(){
        Assert.assertEquals(driver.findElement(By.className("category-name")).getText(),"Blouses");
    }
    @When("click on go to cart")
    public void goToCart() throws InterruptedException {
        hover.addToCart().click();
        Thread.sleep(3000);
    }
    @And ("click on Proceed to check out")
    public void Check1(){
        hover.checkOut1().click();
    }
    @Then ("check if the product in stock")
    public void assertStock(){
        Assert.assertEquals(hover.inStockassert().getText(), "In stock");
    }
    @And ("Click on proceed to checkout twice")
    public void Check2(){
        hover.checkOut2().click();
        hover.checkOut3().click();
    }
    @And ("Click on check box and proceed to checkout")
    public void Check3() throws InterruptedException {
        hover.checkBox().click();
        hover.checkOut4().click();
        Thread.sleep(3000);
    }
    @And ("Click on Pay by bank")
    public void payment() throws InterruptedException {
        hover.Payment().click();
    }
    @And ("Click on Confirm")
    public void confirmation(){
        hover.confirmOrder().click();
    }
    @Then("Assert completing the order by specific word \"Complete\"")
    public void assertConfirmation(){
        WebElement complete = driver.findElement(By.className("alert-success"));
        Assert.assertTrue(complete.isDisplayed(),"your order confirmed");
    }


}
