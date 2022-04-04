package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    private final WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void instagramPage() {
        driver.get("https://www.instagram.com/");
        load();
    }
    public void fillUserName(String username){
        WebElement usernameWe = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        usernameWe.sendKeys(username);
    }
    public void fillPassword(String password){
        WebElement passwordWe = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        passwordWe.sendKeys(password);
    }
    public void clickLogin() {
        WebElement loginButton = driver.findElement(By.xpath("//button[@type = \"submit\"]"));
        loginButton.click();
        load();
    }
    public void loginResult() {
        String title = driver.getTitle();
        String ig = "instagram";

        if(title.equalsIgnoreCase(ig)){
            System.out.println("you successfully logged in");
        }
        else {
            System.out.println("login was not successful");
        }
    }
    public void load() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException ex) {
            //ToCatchOrNot
        }
    }
}
