package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.SearchPage;


public class SearchSteps {
    private SearchPage search;

    @Before
    public void init(){
        search = new SearchPage(Utility.getWebDriver());
    }
    @When("user enter {string} in search bar")
    public void user_enter_in_search_bar(String accountName) {
        search.fillSearch(accountName);
        search.clickSearch();
    }
    @Then("user should be on {string}'s instagram")
    public void user_should_be_on_fidela_s_instagram(String accountName) {
        search.searchResult(accountName);
    }
}
