package stepdefinitions;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginUserTest {

	@Given("User on the login page")
	public void admin_on_the_login_page() {
		System.out.println("User should be on the login page");
	}

	// With Regex
	@When("^User fill the username as (.+) and password as (.+)$")
	public void user_fill_the_username_and_password(String username, String password) {
		System.out.println("User should enter user name and password: " + username + " : " + password);
	}

	// Without Regex
	/*
	 * @When("User fill the username as {string} and password as {string}") public
	 * void user_fill_the_username_and_password(String username, String password) {
	 * System.out.println("User should enter user name and password: "
	 * +username+" : "+password); }
	 */

	@Given("User on the practice page")
	public void user_on_the_pratice_page() {
		System.out.println("User should be on signup page..!");
	}

	@When("User signup into application")
	public void user_signup_into_application(List<String> data) {
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
	}

	@When("click on Signup button")
	public void click_on_signup_button() {
		System.out.println("User should be clicked on signup button");
	}

	@Then("Should display the confirmation message")
	public void should_display_the_confirmation_message() {
		System.out.println("Should display the success message");
	}

	@Given("setup entries in database")
	public void setup_entries_in_database() {
		System.out.println("********************");
		System.out.println("Get the details from the database");
	}

	@When("launch the browser from the config variables")
	public void launch_the_browser_from_the_config_variables() {
		System.out.println("lanuch the browser and application");
	}

	@When("hit the home page url of bankding site")
	public void hit_the_home_page_url_of_banking_site() {
		System.out.println("Clicking on banking url");
	}
}