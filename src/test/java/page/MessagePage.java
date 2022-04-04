package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class MessagePage {
    private final WebDriver driver;

    public MessagePage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickMessageIcon() {
        WebElement dm = driver.findElement(By.xpath("//a[@href = \"/direct/inbox/\"]"));
        dm.click();
        delay();
    }
    public void messagePageResult(){
        String url = driver.getCurrentUrl();
        String dmIcon = "https://www.instagram.com/direct/inbox/";

        if(url.equalsIgnoreCase(dmIcon)){
            System.out.println("you are on direct message page");
        }
    }
    public void chooseAccountToMessage() {
        WebElement notNow = driver.findElement(By.xpath("//button[@class = \"aOOlW   HoLwm \"]"));
        notNow.click();
        delay();
        WebElement ronald = driver.findElement(By.xpath("//a[@class = \"-qQT3 rOtsg\"]"));
        ronald.click();
        delay();
    }
    public void typingMessage(String chat) {
        WebElement chatRonald = driver.findElement(By.xpath("//textarea[@placeholder = \"Message...\"]"));
        chatRonald.sendKeys(chat);
        delay();
    }
    public void clickSend(){
        WebElement send = driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div/div[3]/button"));
        send.click();
    }
    public void notification(String chat){
        System.out.println("you have sent " + chat);
    }

    public void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ex) {
            //ToCatchOrNot
        }
    }

}
