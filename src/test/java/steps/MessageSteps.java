package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import method.MessageMethod;

public class MessageSteps {
    private MessageMethod message;

    @Before
    public void init(){
        message = new MessageMethod(Utility.getWebDriver());
    }
    @When("user click direct message icon")
    public void the_user_click_direct_message_icon() throws InterruptedException {
        message.clickMessageIcon();
    }
    @Then("user should be on direct message page")
    public void the_user_should_be_on_direct_message_page() {
        message.messagePage();
    }

    @When("message someone with {string}")
    public void message_someone_with(String chat) throws InterruptedException {
        message.chooseAccountToMessage();
        message.typingMessage(chat);
        message.clickSend();
    }
    @Then("{string} should have been sent")
    public void the_user_should_have_sent(String chat) {
       message.notification(chat);
    }

}
