package org.projectName.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tcs.aig.sample.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="email")
	private WebElement email;
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="(//*[@class='ladda-label'])[1]")
	private WebElement login;
	
	public WebElement getLogin() {
		return login;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	

}
