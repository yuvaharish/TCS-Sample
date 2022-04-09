package org.projectName.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tcs.aig.sample.BaseClass;

public class HomePage extends BaseClass{
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//*[@title='home'])[1]")
	private WebElement home;
	@FindBy(xpath="(//*[@role='combobox'])[1]")
	private WebElement cityName;
	@FindBy(xpath="(//*[@type='search'])[5]")
	private WebElement searchCity;
	@FindBy(xpath="(//*[@class='ladda-label'])[1]")
	private WebElement search;
	public WebElement getHome() {
		return home;
	}
	public WebElement getCityName() {
		return cityName;
	}
	public WebElement getSearchCity() {
		return searchCity;
	}
	public WebElement getSearch() {
		return search;
	}
	
}
