package StepDefs;

import Pages.SearchLocators;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static StepDefs.Browsering.driver;

public class SearchScenario {
    SearchLocators search = null;
    @Given("go to search bar and enter dress")
    public void EnterSearchInput(){
        search = new SearchLocators();
        search.SearchBar().sendKeys("Dress");
    }
    @When("select the Summer Dresses > Printed Summer")
    public void selectDressType() throws InterruptedException {
       // search.SearchOutput().add(driver.findElement(new By.ByClassName("ac_even")));
        search.searchoutput().click();

    }
    @Then ("Verify your search output")
    public void verifySearchChoice(){
        String dressType = driver.findElement(By.cssSelector("h1[itemprop=\"name\"]")).getText();
        Assert.assertEquals(dressType,"Printed Summer Dress");
    }
}
