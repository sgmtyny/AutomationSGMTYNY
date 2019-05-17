package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helpers.HCommonHelper;
import helpers.HOportunidadesSolicitudHelper;

public class PageOportunidadesSolicitudFirmaAutografaDigital extends BasePage {

	@FindBy(xpath = "//iframe[@title = 'accessibility title']")
	WebElement frame;

	@FindBy(xpath = "//*[@id=\"DeviceSig\"]")
	WebElement txtDispositivo1;
	@FindBy(xpath = "//*[@id=\"DeviceSig\"]")
	WebElement txtDispositivo2;
	@FindBy(xpath = "//*[@id=\"SaveAsDraft|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioEnBorrador;
	@FindBy(xpath = "//*[@id=\"SaveAsDraft|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioCompletada;
	@FindBy(xpath = "//*[@id=\"ElectronicScreen_nextBtn\"]")
	WebElement btnContinuar;
	String strEstatus = HOportunidadesSolicitudHelper.getEstatus();
	
	public PageOportunidadesSolicitudFirmaAutografaDigital(WebDriver driver) {
		super(driver);
	}
	
	public void informacion()
	{HCommonHelper.waiter("high");
	refreshPage();
	HCommonHelper.waiter("high");
	swithToFrame(frame);
		clickDispositivo();
		clickEstatus();
		clickContinuar();
	}
	private void clickContinuar()
	{
		click(btnContinuar);
	}
	private void clickEstatus() 
	{
		if(strEstatus.equals("BORRADOR"))
		{
			click(radioEnBorrador);
		}
		else
		{
			click(radioCompletada);
		}
	}
	private void clickDispositivo()
	{
		
	}
}
