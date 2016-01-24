package target.test;

import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage extends BasePage{

	public LogInPage(WebDriver driver) {
		super(driver);}
	
		
		public WebElement emailAddress;
		public WebElement password;
		public WebElement loginButton;
		
		
		public WebElement emailAddress(){
			emailAddress = driver.findElement(By.id("logonId"));
			return emailAddress; 
		}

		public WebElement password(){
			password = driver.findElement(By.id("logonPassword"));
			return password;
		}//*[@id='SignInBtn']
		
		public WebElement loginButton(){
			loginButton = driver.findElement(By.xpath("//*[@id='loginForm']/fieldset/div[4]/button"));
			return loginButton;}
		
			
		
			//public void userId(String userEmailAddress, String userPassword){
				//emailAddress().sendKeys(userEmailAddress);
				//password().sendKeys(userPassword);
				//loginButton().click();
				//delayFor(2000);
				//}

			public void userId(java.lang.String userEmailAddress, java.lang.String userPassword) {
				emailAddress().sendKeys(userEmailAddress);
				password().sendKeys(userPassword);}
			
			public void clickloginButton(){
				loginButton().click();
				delayFor(2000);
				
				
			}
			}


