package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@NetBanking")
	public void netBankingSetup() {
		System.out.println("##### Net Banking Setup #####");
		System.out.println("SETUP THE ENTRIES IN NET BANKING DATABASE");
	}
	
	@Before("@Mortgage")
	public void mortgageSetup() {
		System.out.println("##### Mortgage Setup #####");
		System.out.println("SETUP THE ENTRIES IN MORTGAGE DATABASE");
	}
	
	@After
	public void tearDown() {
		System.out.println("Clear the entries");
	}
}
