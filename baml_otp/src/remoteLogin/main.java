package remoteLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver myDriver;
		myDriver = launchBrowser();
		try
		{
			
			baml_vpn user = new baml_vpn();
			user.launchVPN(myDriver);
			user.obtainVirtualToken(myDriver);
			
			otp_details info = new otp_details(myDriver);
			info.launchOTPpage();
			info.enterFormOTP();
			info.clickLogon();
		}
		catch(Exception ex)
		{
			System.out.println("Exception found");
			myDriver.close();
			
		}
		finally
		{
			System.out.println("Test completed");			
		}
	}

	public static WebDriver launchBrowser() {
		WebDriver myDriver = new FirefoxDriver();
		return myDriver;
	}
}
