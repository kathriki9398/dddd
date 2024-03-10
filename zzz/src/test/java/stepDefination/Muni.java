package stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Muni {
	

@Given("enter the id into the field")
public void enter_the_id_into_the_field() {
    System.out.println("manage>>>>>>>>>>.");
}


@Then("Enter the password into the fied")
public void enter_the_password_into_the_fied() {
   System.out.println("Muni>>>>....");
}



}
