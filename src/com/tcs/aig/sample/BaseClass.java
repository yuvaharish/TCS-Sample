package com.tcs.aig.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	
	public static void loadDriver() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void url(String url) {
		driver.get(url);
	}
	
	public static void sendKeys(WebElement element,String text) {
		element.sendKeys(text);		
	}
	
	public static void click(WebElement element) {
		element.click();
	}
	public static void close() {
		driver.close();
	}
	
	public static String pro(String key) throws IOException {
		File file=new File("E:\\eclipse\\NewJavaVyravan\\FirstTCS\\src\\com\\tcs\\aig\\sample\\testData.properties");
		FileInputStream fo = new FileInputStream(file);
		Properties po= new Properties();
		po.load(fo);
		String out = po.getProperty(key);
		return out;
	}
	
	public static void submit(WebElement submit) {
		submit.submit();
	}
}
