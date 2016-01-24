package test.target;

import org.testng.annotations.Test;

import target.test.ScriptBase;

public class targetcarttest extends ScriptBase {
	
	
	@Test
	public void cartTest(){
		tarGet().homePage().clickBabyLink();
		tarGet().homePage().clickBaby();
		tarGet().cartPage().clickStrollers();
		tarGet().cartPage().clickProduct();
		tarGet().logInPage().userId("shahran205@hotmail.com","rubana123");
		tarGet().cartPage().clickSigninButton();
	}
	
	

}
