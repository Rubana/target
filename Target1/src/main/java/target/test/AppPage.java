package target.test;

import org.openqa.selenium.WebDriver;

public class AppPage extends BasePage {

	
	public AppPage(WebDriver driver) {
		super(driver);
		
	}
	private HomePage homePage;
	private LogInPage logInPage;
	private CartPage cartPage;
	
	
	public HomePage homePage() {
		if (homePage == null) {
			homePage = new HomePage(driver);
		}
		return homePage;
	}
	
	public LogInPage logInPage() {
		if (logInPage == null) {
			logInPage = new LogInPage(driver);
		}
		return logInPage;
	}
	
	public CartPage cartPage() {
		if (cartPage == null) {
			cartPage = new CartPage(driver);
		}
		return cartPage;
	}
}
