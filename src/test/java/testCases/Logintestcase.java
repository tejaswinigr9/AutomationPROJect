package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class Logintestcase extends BaseClass {
	@Test
	public void login() {
	HomePage hp=new HomePage(driver);
	hp.ClickMyAccount();
	hp.clickLogin();
	
	LoginPage lp=new LoginPage(driver);
	lp.sendEmail(rb.getString("email"));
	lp.sendPassword(rb.getString("password"));
	lp.clickOnLogin();
	}

}
