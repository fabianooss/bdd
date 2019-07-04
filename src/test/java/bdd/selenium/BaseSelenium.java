package bdd.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseSelenium {
	
	public BaseSelenium() {
		
	}
	

	public WebElement waitForLoadId(String id) {
		WebDriver driver = DriverManager.get();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		return wait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
	}
	
	public WebElement waitForLoadName(String name) {
		WebDriver driver = DriverManager.get();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		return wait.until(ExpectedConditions.elementToBeClickable(By.name(name)));
	}
	
	public WebElement waitForLoadXpath(String xpath) {
		WebDriver driver = DriverManager.get();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
	}
	
	
	
	public void open() {
		DriverManager.get().get("http://localhost:8080/gestum");
	}
	
	public void close() {
		DriverManager.close();
	}
	
	public void loginWithValidUser() {
		this.waitForLoadName("j_username");
		
		WebDriver driver = DriverManager.get();
		
		WebElement element = driver.findElement(By.name("j_username"));
		element.sendKeys("admin");

		driver.findElement(By.name("j_password")).sendKeys("admin");
		element.submit();
	}
	
	
	
	

}
