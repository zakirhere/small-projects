package com.vonage;

import org.openqa.selenium.By;

public class login extends main{

	private static By username = By.name("username");
	private static By password = By.name("password");
	private static By submit = By.className("btn btn-primary login");
	
	public void launchVonage() {
		myDriver.get(VONAGEURL);
		
		//validate the login page is loaded
	}
	
	public void loginVonage() {
		myDriver.findElement(username).sendKeys("8582014053");
		myDriver.findElement(password).sendKeys("S@ranzara143");
		myDriver.findElement(submit).click();
		
		//Validate that account is logged in
	}
	
}
