package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helpers.HCommonHelper;
import helpers.HOportunidadesSolicitudHelper;

public class PageOportunidadesSolicitudInformacionCobranza extends BasePage {

	@FindBy(xpath = "//iframe[@title = 'accessibility title']")
	WebElement frame;

	@FindBy(xpath = "//*[@id=\"PaymentDeliveryMethod|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioCCargoAutomatico;
	@FindBy(xpath = "//*[@id=\"PaymentDeliveryMethod|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioCModoDirecto;
	@FindBy(xpath = "//*[@id=\"PaymentDeliveryMethod|0\"]/div/div[1]/label[3]/span[1]")
	WebElement radioCAgente;
	@FindBy(xpath = "//*[@id=\"PrimePaymentPeriod|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioFMensual;
	@FindBy(xpath = "//*[@id=\"PrimePaymentPeriod|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioFtrimestral;
	@FindBy(xpath = "//*[@id=\"PrimePaymentPeriod|0\"]/div/div[1]/label[3]/span[1]")
	WebElement radioFSemestral;
	@FindBy(xpath = "//*[@id=\"PrimePaymentPeriod|0\"]/div/div[1]/label[4]/span[1]")
	WebElement radioFAnual;
	@FindBy(xpath = "//*[@id=\"a2n0R000000bojFQAQ-2\"]/div[1]/div/child[6]/div/ng-form/div/label/span")
	WebElement chbxCobroInicial;
	@FindBy(xpath = "//*[@id=\"TentativeDate\"]")
	WebElement txtFechaTentativaCI;
	@FindBy(xpath = "//*[@id=\"PrimeDayOfCharge|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioSubsecuente1;
	@FindBy(xpath = "//*[@id=\"PrimeDayOfCharge|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioSubsecuente16;
	@FindBy(xpath = "//*[@id=\"PrimeDayOfCharge|0\"]/div/div[1]/label[3]/span[1]")
	WebElement radioOtro;
	@FindBy(xpath = "//*[@id=\"PrimeDayOfCharge|0\"]/div/div[1]/label[4]/span[1]")
	WebElement radioNoAplica;
	@FindBy(xpath = "//*[@id=\"PrimeOtroDayofCharge\"]")
	WebElement txtOtroDC;
	@FindBy(xpath = "//*[@id=\"PaymentCard|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioTClabe;
	@FindBy(xpath = "//*[@id=\"PaymentCard|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioTTarjeta;
	@FindBy(xpath = "//*[@id=\"PaymentCard|0\"]/div/div[1]/label[3]/span[1]")
	WebElement radioTNA;
	@FindBy(xpath = "//*[@id=\"CLABE\"]")
	WebElement txtClabe;
	
	
	String strBanco = HOportunidadesSolicitudHelper.getBanco();
	String strNBanco = "//*[@id=\"DebitBanks\"]/option["+strBanco+"]";
	String strBancoTC = HOportunidadesSolicitudHelper.getBanco();
	String strNBancoTC = "//*[@id=\"CreditBanks\"]/option["+strBancoTC+"]";
	String strBancoTD = HOportunidadesSolicitudHelper.getBanco();
	String strNBancoTD = "//*[@id=\"DebitBanks\"]/option["+strBancoTC+"]";
	
	@FindBy(xpath = "//*[@id=\"CardType|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioCredito;
	@FindBy(xpath = "//*[@id=\"CardType|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioDebito;
	@FindBy(xpath = "//*[@id=\"OtherCreditCardNo\"]")
	WebElement txtNumTarjetaCredito;
	@FindBy(xpath = "//*[@id=\"OtherDebitCardNo\"]")
	WebElement txtNumTarjetaDebito;
	@FindBy(xpath = "//*[@id=\"AccountHolder|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioCAbienteY;
	@FindBy(xpath = "//*[@id=\"AccountHolder|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioCAbienteN;
	@FindBy(xpath = "//*[@id=\"NumberofFigure\"]")
	WebElement txtNoFigura;

	@FindBy(xpath = "//*[@id=\"NameTP\"]")
	WebElement txtCANombre;
	@FindBy(xpath = "//*[@id=\"PaternalLastNameTP\"]")
	WebElement txtCAAP;
	@FindBy(xpath = "//*[@id=\"MaternalLastNameTP\"]")
	WebElement txtCAAM;
	@FindBy(xpath = "//*[@id=\"TelephoneTP\"]")
	WebElement txtCATMovil;
	@FindBy(xpath = "//*[@id=\"EmailTP\"]")
	WebElement txtCAEmail;
	@FindBy(xpath = "//*[@id=\"DateOfBirthTP\"]")
	WebElement txtFechaNac;
	@FindBy(xpath = "//*[@id=\"ChooseIdentificationTP|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioRFC;
	@FindBy(xpath = "//*[@id=\"ChooseIdentificationTP|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioCURP;
	@FindBy(xpath = "//*[@id=\"RFCTP\"]")
	WebElement txtRFC;
	@FindBy(xpath = "//*[@id=\"CURPTP\"]")
	WebElement txtCURP;
	String strNacionalidad = HOportunidadesSolicitudHelper.getPais();
	String strNNacionalidad= "//*[@id=\"NationalityTP\"]/option["+strNacionalidad+"]";
	@FindBy(xpath = "//*[@id=\"AddressAccountHolder\"]")
	WebElement txtCalle;
	@FindBy(xpath = "//*[@id=\"ExtAccountHolder\"]")
	WebElement txtExt;
	@FindBy(xpath = "//*[@id=\"IntAccountHolder\"]")
	WebElement txtInt;
	@FindBy(xpath = "//*[@id=\"CologneorfractionationAccountHolder\"]")
	WebElement txtColonia;
	@FindBy(xpath = "//*[@id=\"DelegationorMunicipalityAccountHolder\"]")
	WebElement txtDelegacion;
	@FindBy(xpath = "//*[@id=\"CityAccountHolder\"]")
	WebElement txtCiudad;
	@FindBy(xpath = "//*[@id=\"PostalCodeAccountHolder\"]")
	WebElement txtCP;
	@FindBy(xpath = "//*[@id=\"Certificate\"]")
	WebElement txtNoSerie;
	String strEdo = HOportunidadesSolicitudHelper.getEstado();
	String strNEdo= "//*[@id=\"CityorStateAccountHolder\"]/option["+strEdo+"]";
	@FindBy(xpath = "//*[@id=\"CampaniaName\"]")
	WebElement txtCampania;
	@FindBy(xpath = "//*[@id=\"PaymentInformation_nextBtn\"]")
	WebElement btnContinuar;
	
	
	
	String strConductoPago = HOportunidadesSolicitudHelper.geteConductoPago();
	String strFormaPago = HOportunidadesSolicitudHelper.geteFormaPago();
	String strCobroInicial = HOportunidadesSolicitudHelper.geteCobroInicial();
	String strFechaTentativaCI = HOportunidadesSolicitudHelper.getFechaTentativa();
	String strDiaCobro = HOportunidadesSolicitudHelper.getDiaCobro();
	String strDiaCobroOtro = HOportunidadesSolicitudHelper.getDiaCobroOtro();
	String strTarjetaPago = HOportunidadesSolicitudHelper.getTarjeta();
	String strCLABE = HOportunidadesSolicitudHelper.getCLABE();
	String strTipoTarjeta = HOportunidadesSolicitudHelper.getTipoTarjeta();
	String strNumTarjetaCredito = HOportunidadesSolicitudHelper.getNumTarjetaCredito();
	String strNumTarjetaDebito = HOportunidadesSolicitudHelper.getNumTarjetaDebito();
	String strTarjetahabiente = HOportunidadesSolicitudHelper.getCuentahabiente();
	
	 String strCANombre =HOportunidadesSolicitudHelper.getCANombre();
	 String strCAAP = HOportunidadesSolicitudHelper.getCAAP();
	 String strCAAM = HOportunidadesSolicitudHelper.getCAAM();
	 String strCATMovil = HOportunidadesSolicitudHelper.getCAMovil();
	 String strCAEmail = HOportunidadesSolicitudHelper.getCAEmail();
	 String strCAFechaNac = HOportunidadesSolicitudHelper.getCAFechaNac();
	 String strCARFCCURP =  HOportunidadesSolicitudHelper.getCARFCCURP();
	 String strCARFC = HOportunidadesSolicitudHelper.getCARFC();
	 String strCACURP = HOportunidadesSolicitudHelper.getCACURP();
	 String strCANACIONALIDAD =  HOportunidadesSolicitudHelper.getCANacionalidad();
	 String strCACALLE =  HOportunidadesSolicitudHelper.getCACalle();
	 String strCAEXT = HOportunidadesSolicitudHelper.getCAExt();
	 String strCAINT =  HOportunidadesSolicitudHelper.getCAInt();
	 String strCAColonia =  HOportunidadesSolicitudHelper.getCAColonia();
	 String strCADelegacion =  HOportunidadesSolicitudHelper.getCADelegacion();
	 String strCACiudad =  HOportunidadesSolicitudHelper.getCACiudad();
	 String strCAEdo =  HOportunidadesSolicitudHelper.getCAEdo();
	 String strCACP =  HOportunidadesSolicitudHelper.getCACP();
	 String strCANoSerie =  HOportunidadesSolicitudHelper.getCANoSerie();
	
	public PageOportunidadesSolicitudInformacionCobranza(WebDriver driver) {
		super(driver);
		
	}

	public void informacion()
	{	
		conductoPago();	
		clickContinuar();
					
	}
	private void clickContinuar()
	{
		click(btnContinuar);
	}
	private void clickCampania()
	{
		click(txtCampania);
		HCommonHelper.waiter("medium");
		downEnter(txtCampania);
	}
	private void conductoPago()
	{	
		HCommonHelper.waiter("high");
		refreshPage();
		HCommonHelper.waiter("high");
		swithToFrame(frame);
		clickConductoPago();
		
	}
	private void clickConductoPago()
	{
		switch(strConductoPago)
		{
		case "MODODIRECTO":
			click(radioCModoDirecto);
			formaPago();
			break;
		case "AGENTE":
			click(radioCAgente);
			formaPago();
			break;
		case "CARGOAUTOMATICO":
			click(radioCCargoAutomatico);
			formaPago();
			//clickCoboInicial();
			clickDiaCobro();
			clickTarjetaPago();
			clickTarjetahabiente();
			//clickCampania();			
			break;
		}
	}
	private void clickTarjetahabiente()
	{
		if(strTarjetahabiente.equals("YES"))
		{
			click(radioCAbienteY);
			click(txtNoFigura);
			HCommonHelper.waiter("medium");
			downEnter(txtNoFigura);
		}
		else
		{
			click(radioCAbienteN);
			setCANombre();
			setCAAP();
			setCAAM();
			setCATMovil();
			setCAEmail();
			setCAFechaNAc();
			clickRFCCURP();
			setCANacionalidad();
			setCACalle();
			setCAExt();
			setCAInt();
			setCAColonia();
			setCADelegacion();
			setCACiudad();
			setCAEdo();
			setCACP();
			setCANoSerie();
		}
	}
	private void setCANoSerie()
	{
		sendKeys(txtNoSerie, strCANoSerie);
	}
	private void setCACP()
	{
		sendKeys(txtCP, strCACP);
	}
	private void setCAEdo()
	{
		WebElement txtCAEDO = getElementByXpathContainsText(strNEdo);			
		click(txtCAEDO);
	}
	private void setCACiudad()
	{
		sendKeys(txtCiudad, strCACiudad);
	}
	private void setCADelegacion()
	{
		sendKeys(txtDelegacion, strCADelegacion);
	}
	private void setCAColonia()
	{
		sendKeys(txtColonia, strCAColonia);
	}
	private void setCAInt()
	{
		sendKeys(txtInt, strCAINT);
	}
	private void setCAExt()
	{
		sendKeys(txtExt, strCAEXT);
	}
	private void setCACalle()
	{
		sendKeys(txtCalle, strCACALLE);
	}
	private void setCANacionalidad()
	{
		WebElement txtCANacionalidad = getElementByXpathContainsText(strNNacionalidad);			
		click(txtCANacionalidad);
	}
	private void clickRFCCURP()
	{
		if(strCARFCCURP.equals("RFC"))
		{
			click(radioRFC);
			setRFC();
		}
		else
		{
			click(radioCURP);
			setCURP();
		}
	}
	private void setCURP()
	{
		sendKeys(txtCURP, strCACURP);
	}
	private void setRFC()
	{
		sendKeys(txtRFC, strCARFC);
	}
	private void setCAFechaNAc()
	{
		sendKeys(txtFechaNac, strCAFechaNac);
	}
	private void setCAEmail()
	{
		sendKeys(txtCAEmail, strCAEmail);
	}
	private void setCATMovil()
	{
		sendKeys(txtCATMovil, strCATMovil);
	}
	private void setCAAM()
	{
		sendKeys(txtCAAM, strCAAM);
	}
	private void setCAAP()
	{
		sendKeys(txtCAAP, strCAAP);
	}
	private void setCANombre()
	{
		sendKeys(txtCANombre, strCANombre);
	}
	private void clickTarjetaPago()
	{
		switch(strTarjetaPago)
		{
		case "CLABE":
			click(radioTClabe);
			setCLABE();
			clickBanco();
			break;
		case "TARJETA":
			click(radioTTarjeta);
			clickTipoTarjeta();
			break;
		case "NOAPLICA":
			click(radioTNA);			
			break;
		}
	}
	private void clickTipoTarjeta()
	{
		switch(strTipoTarjeta)
		{
		case "CREDITO":
			click(radioCredito);
			clickBancoTC();
			setNumeroTarjetaC();
			break;
		case "DEBITO":
			click(radioDebito);
			clickBancoTD();
			setNumeroTarjetaD();
			break;
		}
	}
	private void clickBancoTC()
	{
		WebElement txtBancoTC = getElementByXpathContainsText(strNBancoTC);			
		click(txtBancoTC);
	}
	private void clickBancoTD()
	{
		WebElement txtBancoTD = getElementByXpathContainsText(strNBancoTD);			
		click(txtBancoTD);
	}
	private void setNumeroTarjetaD()
	{
		sendKeys(txtNumTarjetaDebito, strNumTarjetaDebito);
	}
	private void setNumeroTarjetaC()
	{
		sendKeys(txtNumTarjetaCredito, strNumTarjetaCredito);
	}
	private void clickBanco()
	{
		WebElement txtBanco = getElementByXpathContainsText(strNBanco);			
		click(txtBanco);
	}
	private void setCLABE()
	{
		sendKeys(txtClabe, strCLABE);
	}
	private void clickDiaCobro()
	{
		switch(strDiaCobro)
		{
		case "SUBSECUENTE1":
			click(radioSubsecuente1);
			break;
		case "SUBSECUENTE16":
			click(radioSubsecuente16);
			break;
		case "NOAPLICA":
			click(radioNoAplica);
			break;
		case "OTRO":
			click(radioOtro);
			setOtroDiaCobro();
			break;
		}
	}
	private void setOtroDiaCobro()
	{
		sendKeys(txtOtroDC, strDiaCobroOtro);
	}
	private void clickCoboInicial()
	{
		if(strCobroInicial.equals("YES"))
		{
			click(chbxCobroInicial);
			setFechaTentativa();
		}
	}
	private void setFechaTentativa()
	{
		sendKeys(txtFechaTentativaCI,strFechaTentativaCI);
	}
	private void formaPago()
	{
		clickFormaPago();
	}
	private void clickFormaPago()
	{
		switch(strFormaPago)
		{
		case "MENSUAL":
			click(radioFMensual);
			break;
		case "TRIMESTRAL":
			click(radioFtrimestral);
			break;
		case "SEMESTRAL":
			click(radioFSemestral);
			break;
		case "ANUAL":
			click(radioFAnual);
			break;
		}
	}
}
