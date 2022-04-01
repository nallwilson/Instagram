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

    @After
    public void teardown(){
        driver.quit();
    }
}
