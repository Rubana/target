
package target.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	public WebElement loginLink;
	public WebElement userName;
	public WebElement babyAndkids;
	
	public WebElement allBaby;
	
	public WebElement loginLink(){
		loginLink = driver.findElement(By.xpath("//*[@id='OpenLoginPopup']"));
		return loginLink; 
	}
	
	public WebElement userName(){
		userName = driver.findElement(By.xpath("//*[@id='OpenLogedinPopup']"));
		return userName;
	}
	public WebElement babyAndkids(){
		babyAndkids = driver.findElement(By.xpath("//*[@id='MainMenu']/li[2]/span/a"));
		return babyAndkids;
	}
	
	public WebElement allBaby(){
		allBaby = driver.findElement(By.xpath("//*[@id='MainMenu']/li[2]/div/div/ul[1]/li[1]/a"));
		return allBaby; 
	}
	
	
/*public WebElement babyAndkids(){
		
		WebElement select = driver.findElement(By.xpath("//*[@id='MainMenu']/li[2]/span/a"));
		Select dropDown = new Select(select);           
		String selected = dropDown.getFirstSelectedOption().getText();
		if(selected.equals("all baby")){
		    //already selected; 
		    //do stuff
		}
		List<WebElement> Options = dropDown.getOptions();
		for(WebElement option:Options){
		    if(option.getText().equals("all baby")) {
		      option.click(); //select option here;       
		    }               
		}
		return babyAndkids;
	
	}*/
	
	
	public void clickloginlink(){
		loginLink().click();
	}
	
	public boolean varifyLoginSuccess(String expectedMsg){
		String errortext = userName().getText();
		Assert.assertEquals(expectedMsg, errortext );
	
	    return true;
	
}
	
	public void clickBabyLink(){
		babyAndkids().click();
		
	}
public void clickBaby(){
		
		allBaby().click();
	}

}
