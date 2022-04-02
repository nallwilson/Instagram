package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    private final WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }
    public void fillSearch(String accountName) throws InterruptedException {
        WebElement searchbar = driver.findElement(By.xpath("//input[@type = \"text\"]"));
        searchbar.sendKeys(accountName);
        Thread.sleep(2000);
    }
    public void clickSearch() throws InterruptedException {
        WebElement searchIcon = driver.findElement(By.xpath("//a[@class = \"-qQT3\"]"));
        searchIcon.click();
        Thread.sleep(5000);
    }
    public void searchResult(String accountName){
        String url = driver.getCurrentUrl();
        String fidela = "https://www.instagram.com/"+accountName+"/";

        if(url.equalsIgnoreCase(fidela)){
            System.out.println("you are on "+accountName+"'s ig");
        }
    }
}
