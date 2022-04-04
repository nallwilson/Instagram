package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SearchPage {
    private final WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }
    public void fillSearch(String accountName) {
        WebElement searchbar = driver.findElement(By.xpath("//input[@type = \"text\"]"));
        searchbar.sendKeys(accountName);
        delay();
    }
    public void clickSearch() {
        WebElement searchIcon = driver.findElement(By.xpath("//a[@class = \"-qQT3\"]"));
        searchIcon.click();
        load();
    }
    public void searchResult(String accountName){
        String url = driver.getCurrentUrl();
        String fidela = "https://www.instagram.com/"+accountName+"/";

        if(url.equalsIgnoreCase(fidela)){
            System.out.println("you are on "+accountName+"'s ig");
        }
    }
    public void load() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException ex) {
            //ToCatchOrNot
        }
    }
    public void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ex) {
            //ToCatchOrNot
        }
    }
}
