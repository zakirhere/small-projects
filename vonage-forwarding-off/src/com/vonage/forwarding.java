package com.vonage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class forwarding extends main {
	
	
	
	public void openForwardingPage() {
		waitForElementToLoad(fwdbutton);
		
		myDriver.findElement(fwdbutton).click();
		
		//Validate that the forward page is visible
	}
	
	public void disableForwarding() {
		waitForElementToLoad(toggleFwd);
		WebElement button = myDriver.findElement(toggleFwd);
		if(button.isSelected()) {
			button.click();
			//Validate that the button is disabled.
		}
		else
		{
			System.out.println("Call forwarding was already disabled. No action performed.");
		}
	}
	
	
}
