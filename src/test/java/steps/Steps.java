package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Steps {
    static WebDriver driver;

    @Before
    public void setup(){
        driver = Utility.getWebDriver();
    }

    @When("user click direct message icon")
    public void the_user_click_direct_message_icon() throws InterruptedException {
        WebElement dm = driver.findElement(By.xpath("//a[@href = \"/direct/inbox/\"]"));
        dm.click();
        Thread.sleep(2000);
    }
    @Then("user should be on direct message page")
    public void the_user_should_be_on_direct_message_page() {
        String url = driver.getCurrentUrl();
        String dmIcon = "https://www.instagram.com/direct/inbox/";

        if(url.equalsIgnoreCase(dmIcon)){
            System.out.println("you are on direct message page");
        }
    }
    @When("user click ronaldwilsonnn on list")
    public void the_user_click_ronaldwilsonnn_on_list() throws InterruptedException {
        WebElement notNow = driver.findElement(By.xpath("//button[@class = \"aOOlW   HoLwm \"]"));
        notNow.click();
        Thread.sleep(2000);
        WebElement ronald = driver.findElement(By.xpath("//a[@class = \"-qQT3 rOtsg\"]"));
        ronald.click();
        Thread.sleep(2000);
    }
    @When("type {string}")
    public void type(String chat) throws InterruptedException {
        WebElement chatRonald = driver.findElement(By.xpath("//textarea[@placeholder = \"Message...\"]"));
        chatRonald.sendKeys(chat);
        Thread.sleep(2000);
    }
    @When("click send")
    public void click_send() {
        WebElement send = driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div/div[3]/button"));
        send.click();
    }
    @Then("user should have sent {string}")
    public void the_user_should_have_sent(String chat) {
        System.out.println("you have sent " + chat);
    }
    @After
    public void teardown(){
        driver.quit();
    }
}
