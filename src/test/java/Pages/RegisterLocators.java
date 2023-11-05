package Pages;

import StepDefs.Browsering;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefs.Browsering.driver;

public class RegisterLocators {
Browsering browser = null;
public WebElement SignInPage(){

    return driver.findElement(By.className("login"));
}
    public WebElement enterEmail( ){

        return driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
    }
    public WebElement createAccountButton(){

        return driver.findElement(By.cssSelector("i[class=\"icon-user left\"]"));
    }
    public WebElement genderID(){


        return driver.findElement(By.id("id_gender2"));
    }
    public WebElement firstName(){

        return driver.findElement(By.id("customer_firstname"));
    }
    public WebElement lastName(){

        return driver.findElement(By.id("customer_lastname"));
    }
    public WebElement Password(){
        return driver.findElement(By.id("passwd"));
    }

    public  WebElement Days(){
        return driver.findElement(By.cssSelector("select[id=\"days\"]"));
    }
    public  WebElement Months(){
        return driver.findElement(By.id("months"));
    }
    public  WebElement Years(){
        return driver.findElement(By.id("years"));
    }
    public  WebElement Address(){
        return driver.findElement(By.id("address1"));
    }
    public  WebElement City(){
        return driver.findElement(By.id("city"));
    }
    public  WebElement State(){
        return driver.findElement(By.id("id_state"));
    }
    public  WebElement PostCode(){
        return driver.findElement(By.id("postcode"));
    }

    public  WebElement Country(){
        return driver.findElement(By.id("id_country"));
    }
    public WebElement PhoneNumber(){
        return driver.findElement(By.id("phone_mobile"));
    }
    public WebElement AddressAlias(){
        return driver.findElement(By.id("alias"));
    }
    public WebElement RegisterButton(){
        return driver.findElement(By.id("submitAccount"));
    }
}
