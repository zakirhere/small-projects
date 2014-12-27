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
	
	
	public otp_details(WebDriver clsDriver) {
		this.myDriver = clsDriver;
	}
	
	public void launchOTPpage() {
		//Store the current window handle
		String winHandleBefore = myDriver.getWindowHandle();

		//Perform the click operation that opens new window

		//Switch to new window opened
		for(String winHandle : myDriver.getWindowHandles()){
			myDriver.switchTo().window(winHandle);
		}

		// Perform the actions on new window

		//Close the new window, if that window no more required

		//Switch back to original browser (first window)

	//	myDriver.switchTo().window(winHandleBefore);

		//continue with original browser (first window)
		
//		System.out.println(myDriver.getWindowHandle().length());
//		myDriver.switchTo().frame(sURL1);
	}
	
	public void enterFormOTP() {
		myDriver.findElement(tStandardID).sendKeys("zkwdb9v");
		myDriver.findElement(tPassword).sendKeys("ready3go");
	}
	
	public void clickLogon() {
		myDriver.findElement(bOTP).click();
		myDriver.close();
	}
}
