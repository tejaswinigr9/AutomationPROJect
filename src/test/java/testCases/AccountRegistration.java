package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class AccountRegistration extends BaseClass {
	@Test
	public void registration() throws InterruptedException {
		logger.info("*** starting registration***");
		HomePage hp=new HomePage(driver);
		logger.info("**clicking on my account menu**");
		hp.ClickMyAccount();
		logger.info("***clicking on register***");
		hp.ClickRegister();
		logger.info("**entering all fields**");
		RegistrationPage rp=new RegistrationPage(driver);
		rp.sendFirstname(randomString());
		rp.sendLastname(randomString());
		rp.sendEmail(randomString()+"@gmail.com");
		rp.password(randomAlphaNumeric());
		Thread.sleep(2000);
		rp.ClickAgree();
		Thread.sleep(2000);
		rp.continueOk();
		String act_text=rp.teXtVerify();
		Assert.assertEquals(act_text, "Your Account Has Been Created!","registration is not succesfull");
		logger.info("***account registration completed***");
	}

}
