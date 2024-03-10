package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ZZ {
	

	@Given("user got home")
	public void user_got_home() {
	   System.out.println("step1");
	}


	@Then("use ente password")
	public void use_ente_password() {
	   System.out.println("step2");
	   

	}	

	@Then("use enter id")
	public void use_enter_id() {
	    System.out.println("step3");
	}

	




}
