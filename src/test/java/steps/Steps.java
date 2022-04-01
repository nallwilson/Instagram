package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;


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
