package test.target;


import org.testng.annotations.Test;
import org.testng.annotations.Test;

import target.test.ScriptBase;


public class logintest extends ScriptBase {
	
	@Test
	public void logInTestCasePositive1() {
		tarGet().homePage().clickloginlink();
		tarGet().logInPage().userId("shahran205@hotmail.com","rubana123");
		tarGet().logInPage().clickloginButton();
		tarGet().homePage().varifyLoginSuccess("Hi Guest");

	}

	

}
