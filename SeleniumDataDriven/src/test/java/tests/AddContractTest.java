package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.ContactPage;
import pages.DashboardPage;
import pages.LoginClass;
import util.BrowserFactory;
import util.ExcelReader;

public class AddContractTest {
	//String username;
	//String password;

	ExcelReader reader = new ExcelReader("./data/ezceldemo.xlsx");
	String username = reader.getCellData("sheet1", "user",2);
	String Password = reader.getCellData("sheet1", "password", 2);
	String FullName = reader.getCellData("sheet1", "Name", 2);
	String CompanyName = reader.getCellData("sheet1", "Company", 2);
	String Email = reader.getCellData("sheet1", "email", 2);
	
	@Test
	public void AddingContact() {
		WebDriver driver = BrowserFactory.startBrowser();

		LoginClass loginwebsite = PageFactory.initElements(driver, LoginClass.class);
		loginwebsite.login(username,Password);

		String expectedTittle = "Dashbord- TechFios Test Application - Billing";
		String actualTittle = loginwebsite.getPageTittle();
		// Assert.assertEquals(expectedTittle, actualTittle);

		DashboardPage Dashboard = PageFactory.initElements(driver, DashboardPage.class);
		Dashboard.ClickAddContact();

		ContactPage Contact = PageFactory.initElements(driver, ContactPage.class);
		Contact.FillupContactForm( FullName, CompanyName, Email);

		//driver.close();
		//driver.quit();
	}

}
