package remoteLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class otp_details {
	public static WebDriver myDriver;
	public String sURL = "https://ssologon-prd.sm.bankofamerica.com/ssoconnect/sendOTP.html";
	public String sURL1 = "*//ssologon-prd.sm.bankofamerica.com/ssoconnect*";
	public By tStandardID = By.id("USER");
	public By tPassword = By.id("PASSWORD");
	public By bOTP = By.className("buttonOTP");
	public By lConfirmation = By.id("confirmationSendOTP");
	
	
	public otp_details(WebDriver clsDriver) {
		myDriver = clsDriver;
	}
	
	public void launchOTPpage() {
		//Switch to new window opened
		for(String winHandle : myDriver.getWindowHandles()){
			myDriver.switchTo().window(winHandle);
		}
		//myDriver.switchTo().Window(myDriver.getWindowHandles().
	}
	
	public void enterFormOTP() {
		myDriver.findElement(tStandardID).sendKeys("zkwdb9v");
		myDriver.findElement(tPassword).sendKeys("ready3go");
	}
	
	public void clickLogon() {
		myDriver.findElement(bOTP).click();
		if(this.validateOTPSuccess() == false) {
			myDriver.close();
		}
	}
	
	public boolean validateOTPSuccess() {
		return myDriver.findElement(tStandardID).isDisplayed();
	}
	
	
	
}
