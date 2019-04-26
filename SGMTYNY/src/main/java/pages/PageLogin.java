package pages;

import java.util.ArrayList;

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
	public ArrayList<String> paso = new ArrayList();
	public ArrayList<String> status = new ArrayList();		
	
	public PageLogin(WebDriver driver) {
		super(driver);
	}	
	
	public void launchHome() {
		try {
			driver.get(url);		
			paso.add("Lanzando pagina");
			status.add("OK");			
		}
		catch (Exception e) {
			status.add("FAILED");
	    }		
					
	}		
		
	@Test
	public void inputUsuario() {
		inputUser();			
	}	
	public void inputContrasenia() {
		inputPsw();		
	}	
	public void clickEntrar() {
		clickEnter();
	}	
	
	private void inputUser() {
		try {
			paso.add("Ingresando Usuario");
			sendKeys(txUserName, Hproperties.strUser);
			status.add("OK");			
		}
		catch (Exception e) {
			status.add("FAILED");
	    }			
	}
	private void inputPsw() {
		try {
			paso.add("Ingresando Contraseña");
			sendKeys(txPassword,Hproperties.strPsw);
			status.add("OK");			
		}
		catch (Exception e) {
			status.add("FAILED");
		}		
	}	
	private void clickEnter() {
		try {
			paso.add("Dando click a Entrar");
			click(btnLogin);
			status.add("OK");						
		}
		catch (Exception e) {
			status.add("FAILED");
		}				
	}	
	
}
