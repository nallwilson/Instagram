package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;

public class LoginSteps {
    private LoginPage page;

    @Before
    public void init(){
        page = new LoginPage(Utility.getWebDriver());
    }
    @Given("user is on login page")
    public void user_is_on_login_page() {
        page.instagramPage();
    }
    @When("user login with {string} and {string}")
    public void user_login(String username, String password) {
        page.fillUserName(username);
        page.fillPassword(password);
        page.clickLogin();
    }
    @Then("user should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        page.loginResult();
    }
}
