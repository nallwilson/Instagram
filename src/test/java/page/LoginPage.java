package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void fillUserName(String username){
        WebElement usernameWe = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        usernameWe.sendKeys(username);
    }
    public void fillPassword(String password){
        WebElement passwordWe = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        passwordWe.sendKeys(password);
    }
    public void clickLogin() throws InterruptedException {
        WebElement loginButton = driver.findElement(By.xpath("//button[@type = \"submit\"]"));
        loginButton.click();
        Thread.sleep(5000);
    }
}
