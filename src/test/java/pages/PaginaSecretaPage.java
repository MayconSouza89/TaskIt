package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaSecretaPage {
	
	WebDriver driver;
	
	public PaginaSecretaPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="me")
	WebElement msgValidacao;
	
	public String validaMsgSucesso() throws InterruptedException {
		
		Thread.sleep(1000);
		
		String msgSucesso = msgValidacao.getText();
		
		return msgSucesso;
	}

}
