package bdd;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import bdd.selenium.BaseSelenium;
import bdd.selenium.DriverManager;
import cucumber.api.java.en.Then;

public class NfsSteps extends BaseSelenium {
	
	@Then("I sse all own nfs")
	public void i_sse_all_own_nfs() {
		WebDriver driver = DriverManager.get();

		Assert.assertNotNull("Botão consulta",  waitForLoadXpath("//button/span[contains(text(), 'Consultar')]"));
		
		Assert.assertNotNull("Botão novo", waitForLoadXpath("//button/span[contains(text(), 'Novo')]"));
		
		Assert.assertEquals("Titulo página", "Nota Fiscal", driver.getTitle());
		
		List<WebElement> colunas = driver.findElements(By.className("ag-header-cell-text"));
		
		Assert.assertEquals("Quantidade colunas visíveis", 8, colunas.size());
		
		List<WebElement> emitentes = driver.findElements(By.xpath("//div[@col-id='emitente.nomeFantasia']"));
		
		for (WebElement el : emitentes) {
			System.out.println(el.getText());
		}
		
	}
	

}
