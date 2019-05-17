package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helpers.HCommonHelper;
import helpers.HOportunidadesSolicitudHelper;

public class PageOportunidadesSolicitudHistorialMedicoFamiliar  extends BasePage {
	
	@FindBy(xpath = "//iframe[@title = 'accessibility title']")
	WebElement frame;
	@FindBy(xpath = "//*[@id=\"SC11Question1Applicable|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioDiabetesN;
	@FindBy(xpath = "//*[@id=\"SC11Question1Applicable|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioDiabetesY;
	@FindBy(xpath = "//*[@id=\"SC11Question1Figure\"]")
	WebElement txtNoFigura1;
	@FindBy(xpath = "//*[@id=\"SC11Question1ActualStatus\"]")
	WebElement txtEdoActual1;
	@FindBy(xpath = "//*[@id=\"SC11Question1StartDate\"]")
	WebElement txtFechaInicio1;
	@FindBy(xpath = "//*[@id=\"SC11Question1Details\"]")
	WebElement txtDetalles1;
	@FindBy(xpath = "//*[@id=\"SC11Question5Applicable|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioAntiguedadN;
	@FindBy(xpath = "//*[@id=\"SC11Question5Applicable|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioAntiguedadY;
	@FindBy(xpath = "//*[@id=\"SC11Question3Applicable|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioReclamoPagoN;
	@FindBy(xpath = "//*[@id=\"SC11Question3Applicable|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioReclamoPagoY;
	@FindBy(xpath = "//*[@id=\"SC11Question3Figure\"]")
	WebElement txtFigura3;
	@FindBy(xpath = "//*[@id=\"SC11Question3Cause\"]")
	WebElement txtCausa3;
	@FindBy(xpath = "//*[@id=\"SC11Question3Company\"]")
	WebElement txtCompania3;
	@FindBy(xpath = "//*[@id=\"SC11Question3StartDate\"]")
	WebElement txtFecha3;
	@FindBy(xpath = "//*[@id=\"SC11Question3InsuredAmount\"]")
	WebElement txtMonto3;
	@FindBy(xpath = "//*[@id=\"FamilyMedicalRecord_nextBtn\"]")
	WebElement btnContinuar;
	
	
	String strDiabetes = HOportunidadesSolicitudHelper.getDiabetes();
	String strEdoActual1 = HOportunidadesSolicitudHelper.getEdoActualHMF();
	String strFecha1 = HOportunidadesSolicitudHelper.getFecha1HMF();
	String strDetalles1 = HOportunidadesSolicitudHelper.getDetalles1HMF();
	String strAntiguedad = HOportunidadesSolicitudHelper.getAntiguedad();
	String strPolizaGastos = HOportunidadesSolicitudHelper.getPolizaGastos();
	String strCausa3 = HOportunidadesSolicitudHelper.getCausa2HMF();
	String strCompania = HOportunidadesSolicitudHelper.getCompania2HMF();
	String strFecha3 = HOportunidadesSolicitudHelper.gerFecha2HMF();
	String strMonto3 = HOportunidadesSolicitudHelper.getMontoHMF();
	
	public PageOportunidadesSolicitudHistorialMedicoFamiliar(WebDriver driver) {
		super(driver);
	}
	
	public void historialMediocFamiliarCuestionario()
	{	HCommonHelper.waiter("high");
		refreshPage();
		HCommonHelper.waiter("high");
		swithToFrame(frame);
		
		clickAscendendientesDiabetes();
		clickAntiguedad();
		clickPolizaGastos();
		clickContinuar();
	}
	private void clickContinuar()
	{
		click(btnContinuar);
	}
	private void clickPolizaGastos()
	{
		if(strPolizaGastos.equals("NO"))
		{
			click(radioReclamoPagoN);
		}
		else
		{
			click(radioReclamoPagoY);
			setNumeroFigura3();
			setCausa3();
			setCompania3();
			setFecha3();
			setMonto();
		}
	}
	private void setMonto()
	{
		sendKeys(txtMonto3, strMonto3);
	}
	private void setFecha3()
	{
		sendKeys(txtFecha3, strFecha3);
	}
	private void setCompania3()
	{
		sendKeys(txtCompania3, strCompania);
	}
	private void setCausa3()
	{
		sendKeys(txtCausa3, strCausa3);
	}
	private void setNumeroFigura3()
	{
		click(txtFigura3);
		HCommonHelper.waiter("medium");
		downEnter(txtFigura3);
	}
	private void clickAntiguedad()
	{
		if(strAntiguedad.equals("NO"))
		{
			click(radioAntiguedadN);
		}
		else
		{
			click(radioAntiguedadN);
		}
	}
	private void clickAscendendientesDiabetes()
	{
		if(strDiabetes.equals("NO"))
		{
			click(radioDiabetesN);
		}
		else
		{
			click(radioDiabetesY);
			setNumeroFigura1();
			setEdoActual1();
			setFechaInicio1();
			setDetalles1();
		}
	}
	private void setDetalles1()
	{
		sendKeys(txtDetalles1,strDetalles1);
	}
	private void setFechaInicio1()
	{
		sendKeys(txtFechaInicio1,strFecha1);
	}
	private void setEdoActual1()
	{
		sendKeys(txtEdoActual1,strEdoActual1);
	}
	private void setNumeroFigura1()
	{
		click(txtNoFigura1);
		HCommonHelper.waiter("medium");
		downEnter(txtNoFigura1);
	}

}
