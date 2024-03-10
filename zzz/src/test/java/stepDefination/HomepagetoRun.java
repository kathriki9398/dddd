package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepagetoRun {

	
	
	
	
	
	

@Given("user is on Application ladnding page")
public void user_is_on_application_ladnding_page() {
  System.out.println(">>>>>user is o application laoding page");
}

@When("user cliks on Sign in button")
public void user_cliks_on_sign_in_button() {
  System.out.println(">>>>>>user clikds on sign in buton>>>>>>>>.");
}



@Then("use is displyed login screen")
public void use_is_displyed_login_screen() {
    System.out.println("user is disopyaed loing screen mangemetn thingking login >>>>>>>>>");
}



	
	
}
