package com.tcs.aig.sample;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.projectName.pagefactory.HomePage;
import org.projectName.pagefactory.LoginPage;

public class Excuation {
	
	@Test
	public void SamplePHP() {
		BaseClass.loadDriver();
		BaseClass.url("https://www.phptravels.net/login");
		LoginPage l = new LoginPage();
		BaseClass.sendKeys(l.getEmail(), "user@phptravels.com");
		BaseClass.sendKeys(l.getPassword(), "demouser");
		BaseClass.click(l.getLogin());
		HomePage h = new HomePage();
		BaseClass.click(h.getHome());
		BaseClass.click(h.getCityName());
		BaseClass.sendKeys(h.getSearchCity(), "Chennai");
		BaseClass.submit(h.getSearchCity());
		BaseClass.click(h.getSearch());
		
	}
	
	

}
