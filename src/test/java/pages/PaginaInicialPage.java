package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaInicialPage {
	
	WebDriver driver;
	
	public PaginaInicialPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Sign in")
	WebElement signin;
	
	@FindBy(xpath="//input[@placeholder='Please, tell us your login']")
	WebElement login;
	
	@FindBy(xpath="//input[@placeholder='Excuse me, can you tell us a secret?']")
	WebElement password;
	
	@FindBy(linkText = "SIGN IN")
	WebElement btn_signin;
	
	@FindBy(id="signup")
	WebElement btn_cadastrar;
	
	@FindBy(xpath="//input[@placeholder='Tell us what is your name']")
	WebElement nomeUsuario;
	
	@FindBy(xpath="//input[@placeholder=\"It's time to create a login\"]")
	WebElement LoginUsuario;
	
	@FindBy(xpath="//input[@placeholder='Take care, it need to be remembered']")
	WebElement senhaUsuario;
	
	@FindBy(linkText="SAVE")
	WebElement btn_save;
	
	public PaginaInicialPage realizarLogin(String email, String senha) throws InterruptedException {
		Thread.sleep(2000);
		signin.click();
		login.sendKeys(email);
		password.sendKeys(senha);
		btn_signin.click();
		
		return this;		
	}
	
	public PaginaInicialPage cadastroUsuario(String nome, String login, String senha) throws InterruptedException {
		Thread.sleep(2000);
		btn_cadastrar.click();
		nomeUsuario.sendKeys(nome);
		LoginUsuario.sendKeys(login);
		senhaUsuario.sendKeys(senha);
		btn_save.click();		
		
		return this;
	}
	
	
	
	

}
