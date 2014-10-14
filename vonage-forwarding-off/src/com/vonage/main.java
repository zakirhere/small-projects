package com.vonage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class main {

	static WebDriver myDriver;
	protected static String VONAGEURL = "https://secure.vonage.com/m/#/login";
	private static By Signout = By.id("");
	
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
		myDriver.findElement(Signout).click();
		//Validate that the sign out was successful.
	}
}
