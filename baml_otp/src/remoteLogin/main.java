package remoteLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
			System.out.println("Exception found. " + ex.getMessage());
			
		}
		finally
		{
			System.out.println("Test completed");			
			myDriver.close();
		}
	}

	public static WebDriver launchBrowser() {
		//WebDriver myDriver = new FirefoxDriver();
		String libPath = System.getProperty("user.dir") + "/../../zak_library/chromedriver";
		System.setProperty("webdriver.chrome.driver", libPath);
		WebDriver myDriver = new ChromeDriver();
			
		return myDriver;
	}
}
