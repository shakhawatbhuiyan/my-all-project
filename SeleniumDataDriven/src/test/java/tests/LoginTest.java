package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.LoginClass;
import util.BrowserFactory;
import util.ExcelReader;

public class LoginTest {

	ExcelReader reader = new ExcelReader("./data/ezceldemo.xlsx");
	String username = reader.getCellData("sheet1", "user",2);
	String password = reader.getCellData("sheet1", "password", 2);

	@Test
	public void TechfiosLogin() {
		WebDriver driver = BrowserFactory.startBrowser();
		LoginClass loginwebsite = PageFactory.initElements(driver, LoginClass.class);
		loginwebsite.login(username, password);
		driver.close();
		driver.quit();

	}
}
