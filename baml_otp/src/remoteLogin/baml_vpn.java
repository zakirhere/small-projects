package remoteLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class baml_vpn {
	public static String sURL = "https://remotepc-us.bankofamerica.com/vpn/index.html"; 
	public static By lnk_token = By.linkText("Click Here to Obtain Virtual Token");
	public static By btn_token = By.cssSelector("#VirtualToken img");
	
	public void launchVPN(WebDriver myDriver) {
		myDriver.get(sURL);
	}
	
	public void obtainVirtualToken(WebDriver myDriver) {
		myDriver.findElement(lnk_token).click();
		myDriver.findElement(btn_token).click();
	}
}
