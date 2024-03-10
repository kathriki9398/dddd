package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
WebDriver driver ;
	By txt_username_loing=By.id("email");
	
	By txt_password =By.id("pass");
	By login=By.id("loginbutton");
	
	public Login(WebDriver driver) {
		this.driver=driver;
		
	}
	public void enterUsername(String username) {
		
		driver.findElement(txt_username_loing).sendKeys(username);
		
	}
	public void password(String password) {
		
		driver.findElement(txt_password).sendKeys(password);
	}
	public void clickLogin() {
		driver.findElement(login).click();
		
	}
	public void logivaliduser(String username,String password) {
	
		driver.findElement(txt_username_loing).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		
		driver.findElement(login).click();
		
	}
	
}
