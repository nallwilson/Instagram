package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import method.LoginMethod;

public class LoginSteps {
    private LoginMethod page;

    @Before
    public void init(){
        page = new LoginMethod(Utility.getWebDriver());
    }
    @Given("user is on login page")
    public void user_is_on_login_page() throws InterruptedException {
        page.instagramPage();
    }
    @When("user login with {string} and {string}")
    public void user_login(String username, String password) throws InterruptedException {
        page.fillUserName(username);
        page.fillPassword(password);
        page.clickLogin();
    }
    @Then("user should be logged in successfully")
    public void user_should_be_logged_in_successfully() throws InterruptedException {
        page.loginResult();
    }
}
