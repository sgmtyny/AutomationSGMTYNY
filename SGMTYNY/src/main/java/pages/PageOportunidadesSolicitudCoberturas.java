package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helpers.HCommonHelper;
import helpers.HOportunidadesSolicitudHelper;

public class PageOportunidadesSolicitudCoberturas extends BasePage {
	@FindBy(xpath = "//iframe[@title = 'accessibility title']")
	WebElement frame;	
	@FindBy(xpath ="//*[@id=\"OnlytoAlfaMedicalFlex\"]/div/div/div/child[4]/div/ng-form/div/label/span")
	WebElement radioCoberturaVIH;
	@FindBy(xpath ="//*[@id=\"OnlytoAlfaMedicalFlex\"]/div/div/div/child[1]/div/ng-form/div/label/span")
	WebElement radioCoberturaSETA;
	@FindBy(xpath ="//*[@id=\"OnlytoAlfaMedicalFlex\"]/div/div/div/child[2]/div/ng-form/div/label/span")
	WebElement radioCoberturaSETB;
	@FindBy(xpath ="//*[@id=\"OnlytoAlfaMedicalFlex\"]/div/div/div/child[3]/div/ng-form/div/label/span")
	WebElement radioCoberturaAsistenciaExtr;
	@FindBy(xpath ="//*[@id=\"OnlytoAlfaMedicalFlex\"]/div/div/div/child[5]/div/ng-form/div/label/span")
	WebElement radioCoberturaReduFranquicia;
	@FindBy(xpath ="//*[@id=\"OnlytoAlfaMedicalFlex\"]/div/div/div/child[6]/div/ng-form/div/label/span")
	WebElement radioCoberturaFallecimiento;
	@FindBy(xpath ="//*[@id=\"OnlytoAlfaMedicalFlex\"]/div/div/div/child[7]/div/ng-form/div/label/span")
	WebElement radioCoberturaDentalPremium;
	
	@FindBy(xpath ="//*[@id=\"IncrementCHMQOa|0\"]/div/div[1]/label[1]/span[1]n")
	WebElement radioIncremento0AMF;
	@FindBy(xpath ="//*[@id=\"IncrementCHMQOa|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioIncremento25AMF;
	@FindBy(xpath ="//*[@id=\"IncrementCHMQOa|0\"]/div/div[1]/label[3]/span[1]")
	WebElement radioIncremento50AMF;
	
	@FindBy(xpath ="//*[@id=\"Coinsurance|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioCoaseguro10;
	@FindBy(xpath ="//*[@id=\"Coinsurance|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioCoaseguro15;
	@FindBy(xpath ="//*[@id=\"Coinsurance|0\"]/div/div[1]/label[3]/span[1]")
	WebElement radioCoaseguro20;
	@FindBy(xpath ="//*[@id=\"Coinsurance|0\"]/div/div[1]/label[4]/span[1]")
	WebElement radioCoaseguro25;
	
	@FindBy(xpath ="//*[@id=\"AlfaMedical\"]/div/div/div/child[6]/div/ng-form/div/label/span")
	WebElement radioCoberturaExtranjero;
	@FindBy(xpath ="//*[@id=\"AlfaMedical\"]/div/div/div/child[7]/div/ng-form/div/label/span")
	WebElement radioCoberturaPFallecimiento;
	@FindBy(xpath ="//*[@id=\"AlfaMedical\"]/div/div/div/child[8]/div/ng-form/div/label/span")
	WebElement radioCoberturaCastatroficasExtranjero;
	@FindBy(xpath ="//*[@id=\"AlfaMedical\"]/div/div/div/child[10]/div/ng-form/div/label/span")
	WebElement radioCoberturaEliminacionDeducible;
	@FindBy(xpath ="//*[@id=\"AlfaMedical\"]/div/div/div/child[11]/div/ng-form/div/label/span")
	WebElement radioCoberturaVIHAM;
	@FindBy(xpath ="//*[@id=\"AlfaMedical\"]/div/div/div/child[12]/div/ng-form/div/label/span")
	WebElement radioCoberturaDentalPremiumAM;
	@FindBy(xpath ="//*[@id=\"AlfaMedical\"]/div/div/div/child[9]/div/ng-form/div/label/span")
	WebElement radioCoberturaAsistenciaExtranjero;
	
	@FindBy(xpath ="//*[@id=\"IncrementCHMQAM|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioIncremento0AM;
	@FindBy(xpath ="//*[@id=\"IncrementCHMQAM|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioIncremento25AM;
	@FindBy(xpath ="//*[@id=\"IncrementCHMQAM|0\"]/div/div[1]/label[3]/span[1]")
	WebElement radioIncremento50AM;
	
	@FindBy(xpath ="//*[@id=\"GeneralCoverage\"]/div/div/div[2]/child[1]/div/ng-form/div/label/span")
	WebElement radioCoberturaEstudiantes;
	@FindBy(xpath ="//*[@id=\"GeneralCoverage\"]/div/div/div[2]/child[2]/div/ng-form/div/label/span")
	WebElement radioAMCashDiagnostico;
	
	@FindBy(xpath ="//*[@id=\"Coverages_nextBtn\"]")
	WebElement btnContinuar;
	
	
	String strProducto = "";
	String strCobertura = HOportunidadesSolicitudHelper.getCoberturaAlfaMedicalFlex();
	String strIncrementoCHMQ = HOportunidadesSolicitudHelper.getIncrementoCHMQ();
	String strCoaseguro= HOportunidadesSolicitudHelper.getCoaseguro();
	String strCoberturaAM = HOportunidadesSolicitudHelper.getCoberturaAlfaMedical();
	String strCoberturaGeneral = HOportunidadesSolicitudHelper.getCoberturaGeneral();
			
	public PageOportunidadesSolicitudCoberturas(WebDriver driver) {
		super(driver);
	}
	
	public void coberturas()
	{
		switch(strProducto)
		
		{
		case "AlfaMedicalFlex":
			coberturasOpcionalesAlfaMedicalFlex();
			break;	
		case "AlfaMedical":
			coberturasOpcionalesAlfaMedical();
			break;	
		}
	}
	public void coberturaContinuar()
	{HCommonHelper.waiter("high");
	refreshPage();
	HCommonHelper.waiter("high");
	swithToFrame(frame);
		clickContinuar();
	}
	public void coberturaGeneral()
	{
		setCoberturasGenerales();
	}
	public void coberturasOpcionalesAlfaMedical()
	{
		setCoaseguros();
		setCoberturaAM();
		setIncrementoCHMQAM();
	}
	public void coberturasOpcionalesAlfaMedicalFlex()
	{
		setCoberturaAMF();
		setIncrementoCHMQ();
	}
	private void clickContinuar()
	{
		click(btnContinuar);
	}
	private void setCoberturasGenerales()
	{
		switch(strCoberturaGeneral)		
		{
		case "COBERTURAESTUDIANTES":
			click(radioCoberturaEstudiantes);
			break;	
		case "AMCASHDIAGNOSTICO":
			click(radioAMCashDiagnostico);
			break;
		}
		
	}
	private void setIncrementoCHMQAM()
	{
		switch(strIncrementoCHMQ)
		
		{
		case "0%":
			click(radioIncremento0AM);
			break;	
		case "25%":
			click(radioIncremento25AM);
			break;
		case "50%":
			click(radioIncremento50AM);
			break;
		}		
		
	}
	private void setCoberturaAM()
	{
		switch(strCoberturaAM)
		{
		case "COBERTURAEXTRANJERO":
			click(radioCoberturaExtranjero);
			break;	
		case "COBERTURAFALLECIMIENTO":
			click(radioCoberturaPFallecimiento);
			break;
		case "COBERTURACATASTROFICASEXTRANJERO":
			click(radioCoberturaCastatroficasExtranjero);
			break;
		case "COBERTURAELIMINACIONDEDUCIBLE":
			click(radioCoberturaEliminacionDeducible);
			break;
		case "COBERTURAVIH":
			click(radioCoberturaVIHAM);
			break;
		case "COBERTURADENTALPREMIUM":
			click(radioCoberturaDentalPremiumAM);
			break;
		case "COBERTURAASISTENCIAEXTRANJERO":
			click(radioCoberturaAsistenciaExtranjero);
			break;
		}
	}
	
	private void setCoaseguros()
	{
		switch(strCoaseguro)
		
		{
		case "10%":
			click(radioCoaseguro10);
			break;	
		case "15%":
			click(radioCoaseguro15);
			break;
		case "20%":
			click(radioCoaseguro20);
			break;
		case "25%":
			click(radioCoaseguro25);
			break;
		}		
	}
	
	private void setIncrementoCHMQ()
	{
		switch(strIncrementoCHMQ)
	
		{
		case "0%":
			click(radioIncremento0AMF);
			break;	
		case "25%":
			click(radioIncremento25AMF);
			break;
		case "50%":
			click(radioIncremento50AMF);
			break;
		}		
	}
	private void setCoberturaAMF() 
	{
		HCommonHelper.waiter("medium");
		refreshPage();
		HCommonHelper.waiter("medium");
		swithToFrame(frame);
		switch(strCobertura)
		{
		case "SETA":
			click(radioCoberturaSETA);
			break;	
		case "SETB":
			click(radioCoberturaSETB);
			break;
		case "CASISTENCIAEXTRANJERO":
			click(radioCoberturaAsistenciaExtr);
			break;
		case "CVIH":
			click(radioCoberturaVIH);
			break;
		case "CREDUCCIONFRANQUICIA":
			click(radioCoberturaReduFranquicia);
			break;
		case "CPROTECCIONFALLECIMIENTO":
			click(radioCoberturaFallecimiento);
			break;
		case "CDENTALPREMIUM":
			click(radioCoberturaDentalPremium);
			break;
		}
		
	}
}
