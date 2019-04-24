package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import helpers.*;



public class PageLogin extends BasePage{	
	@FindBy(xpath="//*[@id=\"username\"]")
	WebElement txUserName;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement txPassword;
	
	@FindBy(xpath="//*[@id=\"Login\"]")
	WebElement btnLogin;
		
	private String url = Hproperties.strUrl;
	public int pasos = 0;
	public String[] paso = {};
	
			
	
	public PageLogin(WebDriver driver) {
		super(driver);
	}
	
	public void hacerLogin() {
		try 
		{
			
			inputUser();
			inputPsw();
			clickEnter();
			
		}
		catch(Exception e)
		{
			
		}
	}
	
	public void launchHome() {
		driver.get(url);
		paso[pasos] = "Ingresando Usuario";
		pasos = pasos ++;
		
	}
		
		
	
	@Test
	public void inputUsuario() {
		paso[pasos] = "Ingresando Usuario";
		pasos = pasos ++;
		inputUser();
	}
	
	public void inputContrasenia() {
		paso[pasos] = "Ingresando Contraseña";
		pasos = pasos ++;
		inputPsw();
	}
	
	public void clickEntrar() {
		paso[pasos] = "Dando click a Entrar";
		pasos = pasos ++;
		clickEnter();
	}

	
	
	
	private void inputUser() {
		sendKeys(txUserName, Hproperties.strUser);
	}
	
	private void inputPsw() {
		sendKeys(txPassword,Hproperties.strPsw);
	}
	
	private void clickEnter() {
		click(btnLogin);
	}	
	
}
