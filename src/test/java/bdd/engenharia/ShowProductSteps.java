package bdd.engenharia;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import bdd.selenium.BaseSelenium;
import bdd.selenium.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.en.Then;

public class ShowProductSteps extends BaseSelenium {
	

	@Then("I see all products")
	public void i_see_all_products() {
		WebDriver driver = DriverManager.get();

		Assert.assertNotNull("Botão consulta", waitForLoadId("consulta"));
		
		Assert.assertNotNull("Botão novo", waitForLoadId("novo"));
		
		Assert.assertEquals("Titulo página", "Produto", driver.getTitle());
		
		List<WebElement> colunas = driver.findElements(By.className("ag-header-cell-text"));
		
		Assert.assertEquals("Quantidade colunas visíveis", 8, colunas.size());
		
		Assert.assertEquals("Coluna Código", "Código", colunas.get(0).getText());
		Assert.assertEquals("Coluna Código alternativo", "Código alternativo", colunas.get(1).getText());
		
		
		
	}	
	
	@After
	public void closeBrowser() {
		//super.close();
	}

}
