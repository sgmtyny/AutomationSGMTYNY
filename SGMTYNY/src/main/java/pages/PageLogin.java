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
		sendKeys(txUserName, Hproperties.strUser);
	}
	
	private void inputPsw() {
		sendKeys(txPassword,Hproperties.strPsw);
	}
	
	private void clickEnter() {
		click(btnLogin);
	}	
	
}
