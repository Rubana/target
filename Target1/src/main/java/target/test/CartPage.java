package target.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class CartPage extends BasePage{

	public CartPage(WebDriver driver) {
		super(driver);
		
	}
	
	public WebElement strollers;
	public WebElement selectProduct;
	public WebElement chooseItem;
	public WebElement selectColor;
	public WebElement addToCart;
	public WebElement cheakOutButton;
	public WebElement cheakOut;
	public WebElement signinButton;
	
	
	public WebElement strollers(){
		strollers=driver.findElement(By.xpath("//*[@id='leftNavShopLinks']/div[1]/ul/li[2]/a"));
		return strollers;
	}
	 public WebElement selectProduct(){
		 selectProduct=driver.findElement(By.xpath("//*[@id='signpost_row_2']/div/div/div[1]/div[1]/a"));
		 return selectProduct;
		 
	 }
	 public WebElement chooseItem(){
		 chooseItem=driver.findElement(By.xpath("//*[@id='prodTitle-medium-1-2']"));
		 return chooseItem;
		 
	 }
	
	 public WebElement selectColor(){
		 selectColor=driver.findElement(By.xpath("//*[@id='Byler']"));
		 return selectColor;
		 
	 }
	 
	 public WebElement addToCart(){
		 addToCart=driver.findElement(By.xpath("//*[@id='addToCart']"));
		 return addToCart;
		 
	 }
	 public WebElement cheakOutButton(){
		 cheakOutButton=driver.findElement(By.xpath("//*[@id='checkOutLink']/span"));
		 return cheakOutButton;
		 
	 }
	 
	 public WebElement cheakOut(){
		 cheakOut=driver.findElement(By.xpath("//*[@id='cartCheckout-2']/span"));
		 return cheakOut;
		 
	 }
	 
	 public WebElement signinButton(){
		 signinButton=driver.findElement(By.xpath("//*[@id='SignInBtn']"));
		 return signinButton;
		 
	 } 
	 
	
	 
	
	 
	 
	 
	public void clickStrollers(){
		
		
		jsClick(strollers());
		delayFor(3000);
	}
		
	
	public void clickProduct(){
		jsClick(selectProduct());
		chooseItem().click();
		jsClick(selectColor());
		addToCart().click();
		cheakOutButton().click();
		cheakOut().click();
		
		
	}
	
	public void clickSigninButton(){
		signinButton().click();
	}
	
	
	
	
	
	
	
	/*public WebElement allBaby;
	
	
	public WebElement allBaby(){
		allBaby = driver.findElement(By.xpath("//*[@id='MainMenu']/li[2]/div/div/ul[1]/li/ul/li[1]/a"));
		return allBaby; 
	}
	
	public void clickBaby(){
		
		allBaby().click();
	}*/

}
