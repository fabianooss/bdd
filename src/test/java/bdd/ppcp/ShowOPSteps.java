package bdd.ppcp;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import bdd.selenium.BaseSelenium;
import bdd.selenium.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.en.Then;

public class ShowOPSteps extends BaseSelenium {
	
	@Then("I see all ops")
	public void i_see_all_ops() {
		WebDriver driver = DriverManager.get();

		Assert.assertNotNull("Botão consulta", waitForLoadId("consulta"));
		
		Assert.assertNotNull("Botão novo", waitForLoadId("novo"));
		
		Assert.assertEquals("Titulo página", "Ordem de Produção", driver.getTitle());
		
		List<WebElement> colunas = driver.findElements(By.className("ag-header-cell-text"));
		
		Assert.assertEquals("Quantidade colunas visíveis", 10, colunas.size());
		
	}
	
	@After
	public void closeBroser() {
		this.close();
	}


}
