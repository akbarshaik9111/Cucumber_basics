package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginAdminTest {
	
	@Given("Admin on the login page")
	public void admin_on_the_login_page() {
		System.out.println("Admin should be on the login page");
	}
	
	@When("Admin fill the username as {string} and password as {string}")
	public void admin_fill_the_username_and_password(String username, String password) {
		System.out.println("Admin should enter user name and password: "+username+" : "+password);
	}
	
	@When("click on Login button")
	public void click_on_login_button() {
		System.out.println("Should be click on Login/Submit button");
	}
	
	@Then("Should be navigate to home page")
	public void should_be_navigate_to_home_page() {
		System.out.println("Should enter Dashboard page");
	}
	
	@Then("should display the ministatement and check balance links")
	public void should_display_the_ministatement_and_check_balance_links() {
		System.out.println("After successfull navigation, should display mini statement and balance links");
	}
}
