package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement Firstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement Lastname;

	@FindBy(xpath="//input[@id='input-email']")
	WebElement Email;

	@FindBy(xpath="//input[@id='input-password']")
	WebElement Password;

	@FindBy(xpath="//input[@name='agree']")
	WebElement Agree;

	@FindBy(xpath="//button[normalize-space()='Continue']")
	WebElement ContinueOk;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement textVerify;
	
	public void sendFirstname(String fname) {
	Firstname.sendKeys(fname);
	}
	
	public void sendLastname(String lname) {
		Lastname.sendKeys(lname);
	}
	
	public void sendEmail(String email) {
		Email.sendKeys(email);
	}
	
	public void password(String pw) {
		Password.sendKeys(pw);
		}
	
	public void ClickAgree() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", Agree);
	}
	
	public void continueOk() {
		ContinueOk.click();
	}
	
	public String teXtVerify()
	{
		try {
		return(textVerify.getText());
		}
		catch(Exception e) {
			return (e.getMessage());
		}
	}


}
