package com.vivoSense.stepDefs;

import com.vivoSense.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LibraryStepDefs {

    @Given("I logged Library api as a {string}")
    public void i_logged_library_api_as_a(String string) {

    }
    @Given("Accept header is {string}")
    public void accept_header_is(String string) {

    }
    @Given("Request Content Type header is {string}")
    public void request_content_type_header_is(String string) {

    }
    @Given("I create a random {string} as request body")
    public void i_create_a_random_as_request_body(String string) {

    }
    @When("I send POST request to {string} endpoint")
    public void i_send_post_request_to_endpoint(String string) {

    }
    @Then("status code should be {int}")
    public void status_code_should_be(Integer int1) {

    }
    @Then("Response Content type is {string}")
    public void response_content_type_is(String string) {

    }
    @Then("the field value for {string} path should be equal to {string}")
    public void the_field_value_for_path_should_be_equal_to(String string, String string2) {

    }
    @Then("{string} field should not be null")
    public void field_should_not_be_null(String string) {

    }

    @Given("I logged in Library UI as {string}")
    public void i_logged_in_library_ui_as(String usertype) {

        LoginPage loginPage = new LoginPage();
        loginPage.login(usertype);

    }
    @Given("I navigate to {string} page")
    public void i_navigate_to_page(String string) {

    }

    @Then("UI, Database and API created book information must match")
    public void ui_database_and_api_created_book_information_must_match() {

    }
}
