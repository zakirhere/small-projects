package remoteLogin;

import javax.swing.text.html.Option;

import org.eclipse.jdt.internal.compiler.flow.FinallyFlowContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class main {
	public static String sURL = "https://remotepc-us.bankofamerica.com/vpn/index.html"; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver myDriver;
		myDriver = launchBrowser();
		try
		{
			
			baml_vpn user = new baml_vpn();
			user.obtainVirtualToken(myDriver);
			user.obtainVirtualToken(myDriver);
			
			otp_details info = new otp_details();
			info.launchOTPpage(myDriver);
			info.enterFormOTP(myDriver);
			info.clickLogon(myDriver);
		}
		catch(Exception ex)
		{
			
			
		}
		finally
		{
			System.out.println("Test completed");			
			myDriver.close();
		}
	}

	public static WebDriver launchBrowser() {
		WebDriver myDriver = new FirefoxDriver();
		myDriver.get(sURL);
		return myDriver;
	}
}
