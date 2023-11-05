package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static StepDefs.Browsering.driver;

public class orderLocators {
    public WebElement ChooseProductType() throws InterruptedException {
        WebElement hoverBtn = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]"));
        Thread.sleep(2000);
        Actions action1 = new Actions(driver);
        Thread.sleep(2000);
        action1.moveToElement(hoverBtn).perform();
        Thread.sleep(1000);
        return driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[2]/a"));
    }
    public WebElement addToCart() throws InterruptedException {
        WebElement hoverButton = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5"));
        Thread.sleep(2000);
        Actions action1 = new Actions(driver);
        Thread.sleep(2000);
        action1.moveToElement(hoverButton).perform();
        Thread.sleep(1000);
        return driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"));

    }
    public WebElement checkOut1(){
        return driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));

    }
    public WebElement inStockassert(){
        return driver.findElement(By.xpath("//*[@id=\"product_2_7_0_744165\"]/td[3]/span"));
    }
    public WebElement checkOut2(){
        return driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
    }
    public WebElement checkOut3(){
        return driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));

    }
    public WebElement checkBox(){
        return driver.findElement(By.cssSelector("input[type=\"checkbox\"]"));
    }
    public WebElement checkOut4(){
        return driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
    }
    public WebElement Payment() throws InterruptedException {
        Thread.sleep(3000);
        return driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a"));
    }
    public WebElement confirmOrder(){
        return driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
    }

}
