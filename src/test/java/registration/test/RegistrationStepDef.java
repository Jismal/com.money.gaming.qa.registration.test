package registration.test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationStepDef extends DriverFactory {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();

    @Given("^I am on home page$")
    public void i_am_on_home_page()  {
        homePage.getCurrentUrl();
    }

    @When("^I click on 'Join now'$")
    public void i_click_on_Join_now()  {
        homePage.startRegistrationJOIN_NOW();
    }

    @When("^I select a valid title from the dropdown$")
    public void i_select_a_valid_title_from_the_dropdown()  {
        registrationPage.selectTitle();
    }

    @When("^I enter <firsts Name>, <surName>$")
    public void i_enter_firsts_Name_surName()  {
        registrationPage.fillName();
    }

    @When("^I click on the tick box 'I accept the Terms and Conditions and certify that I am over the age of (\\d+)\\.'$")
    public void i_click_on_the_tick_box_I_accept_the_Terms_and_Conditions_and_certify_that_I_am_over_the_age_of(int arg1) throws Throwable {
        registrationPage.selectTickBox();
    }

    @When("^I click on JOIN NOW button$")
    public void i_click_on_JOIN_NOW_button()  {
        registrationPage.join();
    }

    @Then("^I should get a message text 'This field is required'$")
    public void i_should_get_a_message_text_This_field_is_required()  {
        registrationPage.verifyDOB_error();
    }
}
