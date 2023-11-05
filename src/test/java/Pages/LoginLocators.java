package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefs.Browsering.driver;

public class LoginLocators {
    public WebElement SignInPage(){

        return driver.findElement(By.className("login"));
    }
    public WebElement EnterEmail(){
        return driver.findElement(By.id("email"));
    }
    public WebElement EnterPassword(){
        return driver.findElement(By.id("passwd"));
    }
    public WebElement LoginButton(){
        return driver.findElement(By.id("SubmitLogin"));
    }
}
