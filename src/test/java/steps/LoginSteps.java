package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.When;

import page.LoginPage;

public class LoginSteps {
    private LoginPage page;

    @Before
    public void init(){
        page = new LoginPage(Utility.getWebDriver());
    }

    @When("user login with {string} and {string}")
    public void user_login_with_and(String username, String password) throws InterruptedException {

        page.fillUserName(username);
        page.fillPassword(password);
        page.clickLogin();
    }
}
