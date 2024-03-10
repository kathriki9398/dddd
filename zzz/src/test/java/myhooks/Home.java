package myhooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;



public class Home {

	
	@Before("@Smoke")
	public void stepu1brwer() {
		System.out.println("lauchn chrome browser");
	}
	
	
//@Before(order=2)
//		public void setup() {
//			System.out.println("open finel");
//		}

//		@After(order=2)
//		public void tearDown() {
//			System.out.println("close the brwoser");
//		}
		@After(order=1)
	public void logout() {
		System.out.println("close logout brwoser");
	}
		
		@BeforeStep
		public void takessc() {
			System.out.println("take sth sevehso");
		}
		
		@AfterStep
		public void refresh() {
			System.out.println("referesh the page");
		}
}
