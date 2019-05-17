package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helpers.HCommonHelper;
import helpers.HOportunidadesSolicitudHelper;

public class PageOportunidadesSolicitudDesignacionBeneficios  extends BasePage {

	@FindBy(xpath = "//iframe[@title = 'accessibility title']")
	WebElement frame;
	@FindBy(xpath = "//*[@id=\"AdditionalBeneForTitular|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioAgregarBeneficiario;
	@FindBy(xpath = "//*[@id=\"AdditionalBeneForTitular|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioSucesionLegal;
	String strId = HOportunidadesSolicitudHelper.getIDFigura();
	String strMyXPath = "//*[@id=\"NumberOfFigureBOIP\"]/option["+strId+"]";
	@FindBy(xpath = "//*[@id=\"NamesBOIP\"]")
	WebElement txtBeneficiarioNombre;
	@FindBy(xpath = "//*[@id=\"PaternalLastNameBOIP\"]")
	WebElement txtBeneficiarioAP;
	@FindBy(xpath = "//*[@id=\"MaternalLastNameBOIP\"]")
	WebElement txtBeneficiarioAM;
	@FindBy(xpath = "//*[@id=\"DateOfBirthBOIP\"]")
	WebElement txtBeneficiarioFechaNa;
	@FindBy(xpath = "//*[@id=\"RelationshipWithTheApplicantBOIP\"]")
	WebElement txtBeneficiarioRelacion;
	@FindBy(xpath = "//*[@id=\"PercentageBOIP\"]")
	WebElement txtBeneficiarioPorcentaje;
	@FindBy(xpath = "//*[@id=\"BeneficiariesOfInsuredPerson\"]/div/div/div[2]/child[9]/div/ng-form/div/label/span")
	WebElement chbxBeneficiarioAFaltaDe;
	
	@FindBy(xpath = "//*[@id=\"IPOtherBeneName\"]")
	WebElement txtNombreAFaltaDe;
	@FindBy(xpath = "//*[@id=\"IPOtherBenePaternalLastName\"]")
	WebElement txtAPaternoAFaltaDe;
	@FindBy(xpath = "//*[@id=\"IPOtherBeneMaternalLastName\"]")
	WebElement txtAMaternoFaltaDe;
	@FindBy(xpath = "//*[@id=\"IPOtherBeneDOB\"]")
	WebElement txtFechaAFaltaDe;
	@FindBy(xpath = "//*[@id=\"IPOtherBeneRelationshipName\"]")
	WebElement txtRelacionAfaltaDe;
	
	
	@FindBy(xpath = "//*[@id=\"NumberOfFigureBen\"]")
	WebElement txtNoFiguraB;
	@FindBy(xpath = "//*[@id=\"AddressBen\"]")
	WebElement txtCalleB;
	@FindBy(xpath = "//*[@id=\"ExtBen\"]")
	WebElement txtExtB;
	@FindBy(xpath = "//*[@id=\"IntBen\"]")
	WebElement txtIntB;
	@FindBy(xpath = "//*[@id=\"CologneorfractionationBen\"]")
	WebElement txtColoniaB;
	@FindBy(xpath = "//*[@id=\"DelegationorMunicipalityBen\"]")
	WebElement txtDelegacionB;
	@FindBy(xpath = "//*[@id=\"CityBen\"]")
	WebElement txtCiudadB;
	String strNEdo = HOportunidadesSolicitudHelper.getEstado();
	String strtxtEdoB = "//*[@id=\"CityorStateBen\"]/option["+strNEdo+"]";
	String strNPais = HOportunidadesSolicitudHelper.getPais();
	String strtxtPaisB = "//*[@id=\"CountryBen\"]/option["+strNPais+"]";	
	@FindBy(xpath = "//*[@id=\"PostalCodeBen\"]")
	WebElement txtCPB;
	@FindBy(xpath = "//*[@id=\"PoliticallyExposedPerson|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioPPEY;
	@FindBy(xpath = "//*[@id=\"PoliticallyExposedPerson|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioPPEN;
	@FindBy(xpath = "//*[@id=\"ApplicantPPE|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioPPESolicitanteY;
	@FindBy(xpath = "//*[@id=\"ApplicantPPE|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioPPESolicitanteN;
	@FindBy(xpath = "//*[@id=\"InsuredPersonPPE|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioPPEPAsegurarY;
	@FindBy(xpath = "//*[@id=\"InsuredPersonPPE|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioPPEPAsegurarN;
	@FindBy(xpath = "//*[@id=\"PositionoftheApplicantPPE\"]")
	WebElement txtPPECSolicitante;
	@FindBy(xpath = "//*[@id=\"PositionoftheInsuredPPE\"]")
	WebElement txtPPECPAsegurar;
	@FindBy(xpath = "//*[@id=\"NamesPPE\"]")
	WebElement txtPPENombre;
	@FindBy(xpath = "//*[@id=\"PaternallastnamePPE\"]")
	WebElement txtPPEAP;
	@FindBy(xpath = "//*[@id=\"MaternallastnamePPE\"]")
	WebElement txtPPEAM;
	@FindBy(xpath = "//*[@id=\"DateofbirthPPE\"]")
	WebElement txtPPEFechaN;
	String strPPENacionalidad = "//*[@id=\"NationalityofthePPE\"]/option["+ strNPais +"]";		
	@FindBy(xpath = "//*[@id=\"RelationshipwiththeapplicantPPE\"]")
	WebElement txtPPERelacion;
	@FindBy(xpath = "//*[@id=\"ThirdPartyApplicant|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioTerceroSolicitanteY;
	@FindBy(xpath = "//*[@id=\"ThirdPartyApplicant|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioTerceroSolicitanteN;
	@FindBy(xpath = "//*[@id=\"ThirdPartyInsured|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioTerceroPAsegurarY;
	@FindBy(xpath = "//*[@id=\"ThirdPartyInsured|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioTerceroPAsegurarN;
	@FindBy(xpath = "//*[@id=\"DesignationOfBeneficiaries_nextBtn\"]")
	WebElement btnContinuar;
	
	String strAgregarBeneficiarios  =HOportunidadesSolicitudHelper.getBeneficiarioNombreDB();
	String strBeneficiarioNombreDB =HOportunidadesSolicitudHelper.getBeneficiarioNombreDB();
	String strBeneficiarioAPDB = HOportunidadesSolicitudHelper.getBeneficiarioAPDB();
	String strBeneficiarioAMDB = HOportunidadesSolicitudHelper.getBeneficiarioAMDB();
	String strBeneficiarioFECHANDB = HOportunidadesSolicitudHelper.getBeneficiarioFECHANDB();
	String strBeneficiarioRelacionDB = HOportunidadesSolicitudHelper.getBeneficiarioRelacionDB();
	String strBeneficiarioPorcentajeDB = HOportunidadesSolicitudHelper.getBeneficiarioPorcentajeDB();	
	String strAFaltaDe = HOportunidadesSolicitudHelper.getAFaltaDe();	
	String strAFaltaNombreDB = HOportunidadesSolicitudHelper.getAFaltaNombreDB();
	String strAFaltaAPDB = HOportunidadesSolicitudHelper.getAFaltaAPDB();
	String strAFaltaAMDB =HOportunidadesSolicitudHelper.getAFaltaAMDB();
	String strAFaltaFECHANDB = HOportunidadesSolicitudHelper.getAFaltaFECHANDB();
	String strAFaltaRelacionDB = HOportunidadesSolicitudHelper.getAFaltaRelacionDB();
	String strCalleB = HOportunidadesSolicitudHelper.getCalleB();
	String strNoExtB = HOportunidadesSolicitudHelper.getNoExtB();
	String strNoIntB = HOportunidadesSolicitudHelper.getNoIntB();
	String strColoniaB = HOportunidadesSolicitudHelper.getColoniaB();
	String strDelegacionB =HOportunidadesSolicitudHelper.getDelegacionB();
	String strCiudadB =HOportunidadesSolicitudHelper.getCiudadB();
	String strEstadoB = HOportunidadesSolicitudHelper.getEstadoB();
	String strPaisB = HOportunidadesSolicitudHelper.getPaisB();
	String strCPB = HOportunidadesSolicitudHelper.getCPB();
	String strPPE = HOportunidadesSolicitudHelper.getPPE();
	String strPPESolicitante = HOportunidadesSolicitudHelper.getPPESolicitante();	
	String strPPEPAsegurar = HOportunidadesSolicitudHelper.getPPEPAsegurar();
	String strPPENombre = HOportunidadesSolicitudHelper.getPPENombre();
	String strPPEAP = HOportunidadesSolicitudHelper.getPPEAP();
	String strPPEAM = HOportunidadesSolicitudHelper.getPPEAM();
	String strPPEFNacimiento = HOportunidadesSolicitudHelper.getPPEFNacimiento();
	String strPPERelacion = HOportunidadesSolicitudHelper.getPPERelacion();
	String strPPECSolicitante = HOportunidadesSolicitudHelper.getPPECSolicitante();
	String strPPECPAsegurar = HOportunidadesSolicitudHelper.getPPECPAsegura();
	String strTSolicitante = HOportunidadesSolicitudHelper.getTSolicitante();
	String strTPAsegurar = HOportunidadesSolicitudHelper.getTPAsegurar();
	
	public PageOportunidadesSolicitudDesignacionBeneficios(WebDriver driver) {
		super(driver);
	}
	
	public void listaAsegurados()
	{
		beneficiarios();
		setNoFigura();
		setCalle();
		setNoExt();
		setNoInt();
		setColonia();
		setDelegacion();
		setCiudad();
		setEstado();
		setPais();
		setCP();
		clickPPE();
		clickTSolicitante();
		clickTPAsegurar();
		clickContinuar();
	}
	private void clickContinuar()
	{
		click(btnContinuar);
	}
	private void clickTPAsegurar()
	{
		if(strTPAsegurar.equals("NO"))
		{
			click(radioTerceroPAsegurarN);			
		}
		else
		{
			click(radioTerceroPAsegurarY);
		}
	}
	private void clickTSolicitante()
	{
		if(strTSolicitante.equals("NO"))
		{
			click(radioTerceroSolicitanteN);			
		}
		else
		{
			click(radioTerceroSolicitanteY);
		}
	}
	private void clickPPE()
	{
		if(strPPE.equals("NO"))
		{
			click(radioPPEN);
		}
		else
		{
			click(radioPPEY);
			clickPPESolicitante();
			clickPPEPAsegurar();
			setPPENombre();
			setPPEAP();
			setPPEAM();
			setPPEFechaN();
			clickPPENacionalidad();
			setPPERelacion();
		}
	}
	private void setPPERelacion()
	{
		sendKeys(txtPPERelacion, strPPERelacion);
	}
	private void clickPPENacionalidad()
	{
		WebElement txtPPENacionalidad = getElementByXpathContainsText(strPPENacionalidad);			
		click(txtPPENacionalidad);
	}
	private void setPPEFechaN()
	{
		sendKeys(txtPPEFechaN, strPPEFNacimiento);
	}
	private void setPPEAM()
	{
		sendKeys(txtPPEAM, strPPEAM);
	}
	private void setPPEAP()
	{
		sendKeys(txtPPEAP, strPPEAP);
	}
	private void setPPENombre()
	{
		sendKeys(txtPPENombre, strPPENombre);
	}
	private void clickPPEPAsegurar()
	{
		if (strPPEPAsegurar.equals("NO"))
		{
			click(radioPPEPAsegurarN);
		}
		else
		{
			click(radioPPEPAsegurarY);
			setPPECPAsegurar();
		}
	}
	private void setPPECPAsegurar()
	{
		sendKeys(txtPPECPAsegurar, strPPECPAsegurar);
	}
	private void clickPPESolicitante()
	{
		if (strPPESolicitante.equals("NO"))
		{
			click(radioPPESolicitanteN);
		}
		else
		{
			click(radioPPESolicitanteY);
			setPPECSolicitante();
		}
	}
	private void setPPECSolicitante()
	{
		sendKeys(txtPPECSolicitante, strPPECSolicitante);
	}
	private void setCP()
	{
		sendKeys(txtCPB, strCPB);
	}
	private void setPais()
	{
		WebElement txtPaisB = getElementByXpathContainsText(strtxtPaisB);			
		click(txtPaisB);
		//sendKeys(txtPaisB, strPaisB);
	}
	private void setEstado()
	{
		WebElement txtEdoB = getElementByXpathContainsText(strtxtEdoB);			
		click(txtEdoB);
		//sendKeys(txtEdoB, strEstadoB);
	}
	private void setCiudad()
	{
		sendKeys(txtCiudadB, strCiudadB);
	}
	private void setDelegacion()
	{
		sendKeys(txtDelegacionB, strDelegacionB);
	}
	private void setColonia()
	{
		sendKeys(txtColoniaB, strColoniaB);
	}
	private void setNoInt()
	{
		sendKeys(txtIntB, strNoIntB);
	}
	private void setNoExt()
	{
		sendKeys(txtExtB, strNoExtB);
	}
	private void setCalle()
	{
		sendKeys(txtCalleB, strCalleB);
	}
	private void setNoFigura()
	{
		click(txtNoFiguraB);
		HCommonHelper.waiter("medium");
		downEnter(txtNoFiguraB);
	}
	private void beneficiarios()
	{

		HCommonHelper.waiter("high");
		refreshPage();
		HCommonHelper.waiter("high");
		swithToFrame(frame);
		if(strAgregarBeneficiarios.equals("NO"))
		{
			click(radioSucesionLegal);
		}
		else
		{
			click(radioAgregarBeneficiario);
			setBeneficiarioNoFigura();
			setBeneficiarioNombre();
			setBeneficiarioAP();
			setBeneficiarioAM();
			setBeneficiarioFN();
			setBeneficiarioRelacion();
			setBeneficiarioPorcentaje();
			//clickAfaltaDe();
		}
	}
	private void clickAfaltaDe()
	{
		if(strAFaltaDe.equals("YES"))
		{

			if(!chbxBeneficiarioAFaltaDe.isSelected())
			{
				click(chbxBeneficiarioAFaltaDe);
			}			
			setAFDNombre();
			setAFDAP();
			setAFDAM();
			setAFDFN();
			setAFDParentesco();
		}
	}
	private void setAFDParentesco()
	{
		sendKeys(txtRelacionAfaltaDe, strAFaltaRelacionDB);
	}
	private void setAFDFN()
	{
		sendKeys(txtFechaAFaltaDe, strAFaltaFECHANDB);
	}
	private void setAFDAM()
	{
		sendKeys(txtAMaternoFaltaDe, strAFaltaAMDB);
	}
	private void setAFDAP()
	{
		sendKeys(txtAPaternoAFaltaDe, strAFaltaAPDB);
	}
	private void setAFDNombre()
	{
		sendKeys(txtNombreAFaltaDe, strAFaltaNombreDB);
	}
	private void setBeneficiarioPorcentaje()
	{
		sendKeys(txtBeneficiarioPorcentaje, strBeneficiarioPorcentajeDB);
	}
	private void setBeneficiarioRelacion()
	{
		sendKeys(txtBeneficiarioRelacion, strBeneficiarioRelacionDB);
	}
	private void setBeneficiarioFN()
	{
		sendKeys(txtBeneficiarioFechaNa, strBeneficiarioFECHANDB);
	}
	private void setBeneficiarioAM()
	{
		sendKeys(txtBeneficiarioAM, strBeneficiarioAMDB);
	}
	private void setBeneficiarioAP()
	{
		sendKeys(txtBeneficiarioAP, strBeneficiarioAPDB);
	}
	private void setBeneficiarioNombre()
	{
		sendKeys(txtBeneficiarioNombre, strBeneficiarioNombreDB);
	}
	private void setBeneficiarioNoFigura()
	{
		WebElement txtBeneficiarioNoFigura = getElementByXpathContainsText(strMyXPath);			
		click(txtBeneficiarioNoFigura);
		/*HCommonHelper.waiter("medium");
		downEnter(txtBeneficiarioNoFigura);*/
	}
	

}
