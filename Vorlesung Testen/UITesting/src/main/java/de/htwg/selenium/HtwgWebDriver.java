package de.htwg.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HtwgWebDriver {
	private WebDriver webDriver;
	
    public HtwgWebDriver() {
    	HtwgWebDriverInitializer wi = new HtwgWebDriverInitializer();
    	this.webDriver = wi.getWebDriver();
    }
    
    public HtwgWebDriver(String arguments) {
    	HtwgWebDriverInitializer wi = new HtwgWebDriverInitializer(arguments);
    	this.webDriver = wi.getWebDriver();    	
    }
	
	public void get(String url) {
    	webDriver.get(url);
    }
	
	public void click(String xpath) throws Exception {

	}
	
	public void input(String xpath, String content) {

	}
	
	public String getTextFromElement(String xpath) {

	}
	
	public boolean pageContains(String text) {
		return webDriver.getPageSource().contains(text);
	}
	
	public void close() {
		webDriver.manage().deleteAllCookies();
		webDriver.close();
	}
	
	public void sleep(long milliSeconds) {
		try {
			Thread.sleep(milliSeconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
