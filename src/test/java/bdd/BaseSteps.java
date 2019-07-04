package bdd;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import bdd.selenium.BaseSelenium;
import bdd.selenium.DriverManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class BaseSteps extends BaseSelenium {
	
	@Given("I open Gestum Application")
	public void i_navigate_to_the_Gestum_application() {
		open();
	}
	
	@Given("que sou um usuário logado")
	public void login() {
		this.loginWithValidUser();
	}
	
	
	@Given("I am a valid user")
	public void loginWithValidUser() {
		this.open();
		
		this.waitForLoadName("j_username");
		WebDriver driver = DriverManager.get(); 
		
		WebElement element = driver.findElement(By.name("j_username"));
		element.sendKeys("admin");

		driver.findElement(By.name("j_password")).sendKeys("admin");
		element.submit();
	}
	
	@When("I click on menu {string}")
	public void i_click_on_menu(String menu) {
		String xpath = String.format("//a[contains(text(), '%s')]", menu);
		WebElement element = super.waitForLoadXpath(xpath);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.get();  
		js.executeScript(String.format("$('#%s').click();", element.getAttribute("id")));
		js.executeScript(String.format("$('#%s').mouseover();", element.getAttribute("id")));
	}

	@When("I click on submenu {string}")
	public void i_click_on_submenu(String subMenu) {
		String xpath = String.format("//a[contains(text(), '%s')]", subMenu);
		WebElement el = super.waitForLoadXpath(xpath);
		el.click();
	}
	
	
	@When("clico no menu {string}")
	public void clico_no_menu(String menu) {
		this.i_click_on_menu(menu);
	}

	@When("clico no submenu {string}")
	public void clico_no_submenu(String subMenu) {
		this.i_click_on_submenu(subMenu);
	}
	

}
