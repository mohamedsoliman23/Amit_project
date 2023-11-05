package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.nio.file.WatchEvent;
import java.util.List;

import static StepDefs.Browsering.driver;
public class SearchLocators {
    public WebElement SearchBar(){
        return driver.findElement(By.id("search_query_top"));
    }
//    public List<WebElement> SearchOutput(){
//        return driver.findElements(By.xpath("//*[@id=\"category\"]/div[2]/ul"));
//    }
    public WebElement searchoutput() throws InterruptedException {
        Thread.sleep(4000);
        return  driver.findElement(By.className("ac_even"));
    }
}
