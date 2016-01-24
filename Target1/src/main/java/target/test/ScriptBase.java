package target.test;



import java.io.File;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;





	
	public class ScriptBase {
		protected WebDriver driver ;
		protected AppPage tarGet;
		
		
		
		@BeforeMethod
		public void setUp() throws Exception {
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			//driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
			driver.navigate().to("http://www.target.com/");
		}
		
		
		

	

	
		
		
		/*@BeforeMethod
		@Parameters("browser")
		public void verifytitle(String browserName){
			if(browserName.equalsIgnoreCase("firefox")){
				driver = new FirefoxDriver();
			}
			else if(browserName.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver","/Users/rubanaislam/Documents/driver/chromedriver");

				driver = new ChromeDriver();
			}*/
		
		
		
		
		
	

		
	
		
		@AfterMethod
		public void tearDown() throws Exception{
			
			driver= null;
			tarGet = null;
			//driver.close();
			//driver.quit();
		}
		
		public AppPage tarGet(){
			if(tarGet == null){
				tarGet = new AppPage(driver);
			}
			
			return tarGet;
		


	}

	}

