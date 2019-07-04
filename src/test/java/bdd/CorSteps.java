package bdd;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import bdd.selenium.BaseSelenium;
import bdd.selenium.DriverManager;
import cucumber.api.java.en.Then;

public class CorSteps extends BaseSelenium {
	
	@Then("vejo todas as cores")
	public void vejo_todas_as_cores() {
		WebDriver driver = DriverManager.get();

		Assert.assertNotNull("Botão consulta", waitForLoadId("consulta"));
		
		Assert.assertNotNull("Botão novo", waitForLoadId("novo"));
		
		Assert.assertEquals("Titulo página", "Cor", driver.getTitle());
		
		List<WebElement> colunas = driver.findElements(By.className("ag-header-cell-text"));
		
		Assert.assertEquals("Quantidade colunas visíveis", 5, colunas.size());
		
	}

}
