package com.vonage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class main {

	static WebDriver myDriver;
	protected static String VONAGEURL = "https://secure.vonage.com/m/#/login";
	protected static By Signout = By.id("");
	protected static By fwdbutton = By.linkText("Call Forwarding");
	protected static By toggleFwd = By.id("callForwarding");
	protected static By username = By.name("username");
	protected static By password = By.name("password");
	protected static By submit = By.cssSelector(".btn.btn-primary.login");
	
	public static void main(String[] args) {
		main mainTest = new main();
		mainTest.startWebDriver();
		
		login loginTest = new login();
		loginTest.launchVonage();
		loginTest.loginVonage();
		
		forwarding forwardingTest = new forwarding();
		forwardingTest.openForwardingPage();
		forwardingTest.disableForwarding();

		mainTest.signout();
		mainTest.closeWebDriver();
	}

	public void startWebDriver() {
		myDriver = new FirefoxDriver();
		
		if(myDriver == null)
			System.out.println("NO WEBDRIVER INSTANCE FOUND TO START");
		
	}
	
	public void closeWebDriver() {
		if(myDriver != null) {
			myDriver.close();
			
		}
		else
			System.out.println("NO WEBDRIVER INSTANCE FOUND TO CLOSE");
	}
	
	public void signout() {
		/// There is no direct way to signout, so skipping this step

		//myDriver.findElement(Signout).click();
		
		/// Validate that the sign out was successful.
	}

	public boolean waitForElementToLoad(By elem) {
		
		for(int i=0; i<30; i++) {
			try {
				if(myDriver.findElement(elem).getSize() != null 
						&& myDriver.findElement(elem).isDisplayed()) {
					return true;
				}
			}
			catch (Exception e) {
				System.out.println("TEMP: Element not found. Waited (in sec): " + i*2);
			}
			addDelay(2000);
		}
		System.out.println("ERROR: Unable to find the element: " + elem.toString());
		if(!myDriver.findElement(elem).isDisplayed())
			System.out.println("ERROR: Element exists but not visible: " + elem.toString());
			
		return false;
			
	}
	
	public void addDelay(int duration) {
		try {
			Thread.sleep(duration);
		}
		catch (Exception e) {
			
		}
	}


}
