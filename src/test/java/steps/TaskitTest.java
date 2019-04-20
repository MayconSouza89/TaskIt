package steps;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


import managers.DriverManager;
import pages.PaginaInicialPage;
import pages.PaginaSecretaPage;

public class TaskitTest {
	
	WebDriver driver;
	DriverManager dm = new DriverManager();
	
	PaginaInicialPage login;
	PaginaSecretaPage pageSecret;
	
	
	@Before
	public void conectar() {
		driver = dm.selectBrowser("chrome");
		login = new PaginaInicialPage(driver);
		pageSecret = new PaginaSecretaPage(driver);
		
		driver.get("http://www.juliodelima.com.br/taskit/");
	} 
	
	@Test
	public void cadastrarUsuario() throws InterruptedException {
		login.cadastroUsuario("TesteTaskit", "teste@teste", "123456");
		Assert.assertEquals("Hi, TesteTaskit", pageSecret.validaMsgSucesso());
	}
	
	
	@Test
	public void realizarLogin() throws InterruptedException {
		login.realizarLogin("teste@teste", "123456");
		
		System.out.println(pageSecret.validaMsgSucesso());
		Assert.assertEquals("Hi, TesteTaskit", pageSecret.validaMsgSucesso());
		
	}
	
}
