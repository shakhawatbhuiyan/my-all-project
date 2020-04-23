package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactPage extends BasePage {
	WebDriver driver;

	public ContactPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "account")
	WebElement Name;

	@FindBy(how = How.ID, using = "company")
	WebElement Company;

	@FindBy(how = How.ID, using = "email")
	WebElement Email;

//	@FindBy(how = How.ID, using = "phone")
//	WebElement Phone;
//
//	@FindBy(how = How.ID, using = "address")
//	WebElement Address;
//
//	@FindBy(how = How.ID, using = "city")
//	WebElement City;
//
//	@FindBy(how = How.ID, using = "zip")
//	WebElement Zip;
//
//	@FindBy(how = How.ID, using = "state")
//	WebElement State;
//
	@FindBy(how = How.ID, using = "submit")
	WebElement Submit;

	public void FillupContactForm(String FullName, String company, String email) {

		Name.sendKeys(FullName);
		Company.sendKeys(company);
		Email.sendKeys(email);
		Submit.click();
	}

}
