package bdd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import bdd.selenium.BaseSelenium;
import bdd.selenium.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends BaseSelenium {
	
	@When("I try to login with {string} and {string}")
	public void i_try_to_login_with_and(String user, String password) {
		this.waitForLoadName("j_username");

		WebDriver driver = DriverManager.get();

		WebElement element = driver.findElement(By.name("j_username"));
		element.sendKeys(user);

		driver.findElement(By.name("j_password")).sendKeys(password);

		element.submit();
	}

	@Then("I should see page with title {string}")
	public void i_should_see_page_with_title(String title) {
		WebDriver driver = DriverManager.get();

		new WebDriverWait(driver, 10L).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return d.getTitle().toLowerCase().startsWith(title);
			}
		});		
	}
	
	
	@After()
	public void closeBrowser() {
		//close();
	}	
}
