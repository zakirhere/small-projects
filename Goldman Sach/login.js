

var webdriver = require('selenium-webdriver');

var driver = new webdriver.Builder().
withCapabilities(webdriver.Capabilities.chrome()).
build();

var tLogin = webdriver.By.id('login');
var tPassword = webdriver.By.id('passwd');
var tSubmit = webdriver.By.id('submit');


	


driver.quit();


var entervalues = function() {
	driver.get('https://login.gs.com/vpn/index.html');
	driver.findElement(webdriver.By.id('login')).sendKeys('zakirhere');
	driver.findElement(webdriver.By.id('submit')).click();	
};


  /* 

var webdriver = require('selenium-webdriver');

var driver = new webdriver.Builder().
   withCapabilities(webdriver.Capabilities.chrome()).
   build();

   var tLogin = webdriver.By.id('login');
   var tPassword = webdriver.By.id('passwd');
   var tSubmit = webdriver.By.id('submit');

try
   {
	    driver.get('https://login.gs.com/vpn/index.html'); 
		driver.findelement(webdriver.By.id('login')).SendKeys('zakirhere');
	   	
	   
	   driver.findelement(tPassword).sendKeys('12345');
	   driver.findelemtnt(tSubmit).click().then(function() {
		   setTimeout(function() { console.log("waiting for 3 sec"); }, 3000);
	   }); 
   	   
   }
catch(error)
   {
	   console.log("exception found: " + error);
   }
   
   
//driver.quit();
		
		*/