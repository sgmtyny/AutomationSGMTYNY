package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helpers.HCommonHelper;
import helpers.HOportunidadesSolicitudHelper;

public class PageOportunidadesSolicitudDatosSolicitante extends BasePage {
	@FindBy(xpath = "//iframe[@title = 'accessibility title']")
	WebElement frame;	
	@FindBy(xpath ="//*[@id=\"Personaldataofthecontractingparty\"]")
	WebElement lnkDatosPSolicitante;	
	@FindBy(xpath ="//*[@id=\"DateofbirthConstitution\"]")
	WebElement txtFecha;
	@FindBy(xpath ="//*[@id=\"Occupationorprofession\"]")
	WebElement txtOcupacion;
	@FindBy(xpath ="//*[@id=\"Activitydescription\"]")
	WebElement txtDescripcion;
	@FindBy(xpath ="//*[@id=\"Sex|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioSexoM;
	@FindBy(xpath ="//*[@id=\"Sex|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioSexoF;
	@FindBy(xpath ="//*[@id=\"Address\"]")
	WebElement txtCalle;
	@FindBy(xpath ="//*[@id=\"Ext\"]")
	WebElement txtNExt;
	@FindBy(xpath ="//*[@id=\"Int\"]")
	WebElement txtNInt;
	@FindBy(xpath ="//*[@id=\"Cologneorfractionation\"]")
	WebElement txtColonia;
	@FindBy(xpath ="//*[@id=\"DelegationorMunicipality\"]")
	WebElement txtDelegacion;
	@FindBy(xpath ="//*[@id=\"City\"]")
	WebElement txtCiudad;		
	@FindBy(xpath ="//*[@id=\"Country\"]")
	WebElement txtPais;
	@FindBy(xpath ="//*[@id=\"PostalCode\"]")
	WebElement txtCP;
	@FindBy(xpath ="//*[@id=\"Email\"]")
	WebElement txtEmail;
	@FindBy(xpath ="//*[@id=\"Homephone\"]")
	WebElement txtTelefonoP;
	@FindBy(xpath ="//*[@id=\"Officephone\"]")
	WebElement txtTelefonoO;
	@FindBy(xpath ="//*[@id=\"Personalphone\"]")
	WebElement txtTelefonoM;
	@FindBy(xpath ="//*[@id=\"ChooseIdentification|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioRFC;
	@FindBy(xpath ="//*[@id=\"RFC\"]")
	WebElement txtRFC;
	@FindBy(xpath ="//*[@id=\"ChooseIdentification|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioCURP;
	@FindBy(xpath ="//*[@id=\"CURP\"]")
	WebElement txtCURP;
	@FindBy(xpath ="//*[@id=\"AnnualIncome\"]")
	WebElement txtIngresos;
	@FindBy(xpath ="//*[@id=\"Portalregistration|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioAltaPortalY;
	@FindBy(xpath ="//*[@id=\"Portalregistration|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioAltaPortalN;
	
	
	@FindBy(xpath ="//*[@id=\"Personalinformationoftheinsured\"]")
	WebElement lnkDatosPPAsegurarTitular;
	@FindBy(xpath ="//*[@id=\"Thesolicitanisthepersontobeinsured|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioPersonaPorAsegurarY;
	@FindBy(xpath ="//*[@id=\"Thesolicitanisthepersontobeinsured|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioPersonaPorAsegurarN;
	@FindBy(xpath ="//*[@id=\"HeightApplicant\"]")
	WebElement txtEstatura;
	@FindBy(xpath ="//*[@id=\"WeightApplicant\"]")
	WebElement txtPeso;
	@FindBy(xpath ="//*[@id=\"RelationshipwiththeApplicantApplicant\"]")
	WebElement txtRelacion;
	@FindBy(xpath ="//*[@id=\"NameofthecompanyoragencyforwhichthefigureworksApplicant\"]")
	WebElement txtNombreEmpresa;
	@FindBy(xpath ="//*[@id=\"PhysicalworkplaceApplicant\"]")
	WebElement txtLugarEmpresa;
	@FindBy(xpath ="//*[@id=\"TypeofbusinessApplicant\"]")
	WebElement txtGiro;
	@FindBy(xpath ="//*[@id=\"ApplicantPersonalInformation_nextBtn\"]/p")
	WebElement btnGuardarContinuar;
	
	
	
	String strNPais = HOportunidadesSolicitudHelper.getPais();
	String strXpathPais="//*[@id=\"CountryofbirthConstitution\"]/option["+ strNPais +"]";
	String strXpathNati="//*[@id=\"Nationality\"]/option["+ strNPais +"]";
	String strSexo ="MASCULINO";
	String strECivil = HOportunidadesSolicitudHelper.getECivil();
	String strXpathECivil="//*[@id=\"CivilStatus\"]/option["+ strECivil +"]";
	String strEstado = HOportunidadesSolicitudHelper.getEstado();
	String strXpathEstado="//*[@id=\"CityorState\"]/option["+ strEstado +"]";
	String strPais = "//*[@id=\"Country\"]/option["+ strNPais +"]";
	String strOrigenB = HOportunidadesSolicitudHelper.getOrigenB();
	String strXpathOrigenB = "//*[@id=\"Wealthorigin\"]/option["+strOrigenB+"]";	
	
	String strFecha="01-01-1990";
	String strOcupacion = "ALBAÑIL";
	String strDOcupacion = "CONSTRUCCION DE EDIFICIO";
	String strCalle = "Calle numero 1";
	String strNExt = "137";
	String strNInt = "137";
	String strColonia = "Los perales";
	String strDelegacion = "Los perales";
	String strMunicipio = "Los perales";
	String strCiudad = "Los perales";
	String strCP="73080";
	String strEmail="alguno@hotmail.com";
	String strTelefonoP="5513669678";
	String strTelefonoO="5513498989";
	String strTelefonoM="5522158197";
	String strRFCOCURP = "RFC";
	String strRFCCURP = "GABA891118HN7";
	String strIngresos = "50000";
	String strAltaPortal = "SI";
	
	String strPersonaPorAsegurar = "SI";
	String strEstatura = "1.90";
	String strPeso = "85";
	String strRelacionCS="PADRE";
	String strNombreEmpresa="DELOITTE";
	String strLugarFisico="QUERETARO";
	String strGiro="CONSULTORIA";
	
	public PageOportunidadesSolicitudDatosSolicitante(WebDriver driver) {
		super(driver);
	}
	
	public void DatosPersonalesSolicitante()
	{
		clickDatosSolicitante();
		//setFecha();
		setPaisOrigen();
		setNacionalidad();
		setOcupacion();
		setDescripcion();
		setSexo();
		setEdoCivil();
		setCalle();
		setNumExt();
		setNumInt();
		setColonia();
		setDelegacion();
		setCiudad();
		setEstado();
		setPais();
		setCP();
		setCorreo();
		setTelefonoP();
		setTelefonoO();
		setTelefonoM();
		setRFCOCURP();
		setRFCCURP();
		setOrigenPatrimonio();
		setIngresosAnuales();
		setAltaPortal();
	}
	public void DatosPersonalesPorAsegurarTitular()
	{
		clickDatosPPAsegurarTitular();
		setSolicitantePPAsegurar();
		if(strPersonaPorAsegurar.equals("SI"))
		{
			setEstatura();
			setPeso();
		//	setRelacion();
			setNombreEmpresa();
			setLugarEmpresa();
			setGiroEmpresa();
			clickContinuar();
		}else
		{
			
		}
	}
	private void clickContinuar()
	{
		click(btnGuardarContinuar);
	}
	private void setGiroEmpresa()
	{
		txtGiro.clear();
		sendKeys(txtGiro, strGiro);
	}
	private void setLugarEmpresa()
	{
		txtLugarEmpresa.clear();
		sendKeys(txtLugarEmpresa, strLugarFisico);
	}
	private void setNombreEmpresa()
	{
		txtNombreEmpresa.clear();
		sendKeys(txtNombreEmpresa, strNombreEmpresa);
	}
	private void setRelacion()
	{
		txtRelacion.clear();
		sendKeys(txtRelacion,strRelacionCS);
	}
	private void setPeso()
	{
		txtPeso.clear();
		sendKeys(txtPeso, strPeso);
	}
	private void setEstatura()
	{
		txtEstatura.clear();
		sendKeys(txtEstatura,strEstatura);
	}
	private void setSolicitantePPAsegurar()
	{
		if(strPersonaPorAsegurar.equals("SI"))
		{
			click(radioPersonaPorAsegurarY);
		}else
		{
			click(radioPersonaPorAsegurarN);
		}
	}
	private void clickDatosPPAsegurarTitular()
	{
		click(lnkDatosPPAsegurarTitular);
	}
	private void setAltaPortal()
	{
		if(strAltaPortal.equals("SI"))
		{
			click(radioAltaPortalY);
		}else
		{
			click(radioAltaPortalN);
		}
	}
	private void setIngresosAnuales()
	{
		txtIngresos.clear();
		sendKeys(txtIngresos, strIngresos);
	}	
	private void setOrigenPatrimonio()
	{
		WebElement txtOrigenB = getElementByXpathContainsText(strXpathOrigenB);			
		click(txtOrigenB);
	}
	private void setRFCCURP()
	{
		if(strRFCOCURP.equals("RFC"))
		{
			txtRFC.clear();
			sendKeys(txtRFC, strRFCCURP);
		}
		else
		{
			txtCURP.clear();
			sendKeys(txtCURP, strRFCCURP);
		}
	}
	private void setRFCOCURP()
	{
		if(strRFCOCURP.equals("RFC"))
		{
			click(radioRFC);
		}
		else
		{
			click(radioCURP);
		}
	}
	private void setTelefonoM()
	{
		txtTelefonoM.clear();
		sendKeys(txtTelefonoM,strTelefonoM);
	}
	private void setTelefonoO()
	{
		txtTelefonoO.clear();
		sendKeys(txtTelefonoO,strTelefonoO);
	}
	private void setTelefonoP()
	{
		txtTelefonoP.clear();
		sendKeys(txtTelefonoP,strTelefonoP);
	}
	
	private void setCorreo()
	{
		txtEmail.clear();
		sendKeys(txtEmail,strEmail);
	}
	private void setCP()
	{
		txtCP.clear();
		sendKeys(txtCP,strCP);
	}
	private void setPais()
	{
		WebElement txtPais = getElementByXpathContainsText(strPais);			
		click(txtPais);		
	}
	private void setEstado()
	{
		HCommonHelper.waiter("low");
		WebElement txtEstado = getElementByXpathContainsText(strXpathEstado);			
		click(txtEstado);
	}
	private void setCiudad()
	{
		txtCiudad.clear();
		sendKeys(txtCiudad, strCiudad);
	}
	private void setDelegacion()
	{
		txtDelegacion.clear();
		sendKeys(txtDelegacion, strDelegacion);
	}
	private void setColonia()
	{
		txtColonia.clear();
		sendKeys(txtColonia, strColonia);
	}
	private void setNumInt()
	{
		txtNInt.clear();
		sendKeys(txtNInt, strNInt);
	}
	private void setNumExt()
	{
		txtNExt.clear();
		sendKeys(txtNExt, strNExt);
	}
	
	private void setCalle()
	{
		txtCalle.clear();
		sendKeys(txtCalle,strCalle);
	}
	
	private void setEdoCivil()
	{
		HCommonHelper.waiter("low");
		WebElement txtECivil = getElementByXpathContainsText(strXpathECivil);			
		click(txtECivil);		
	}
	
	private void setSexo()
	{
		if(strSexo.equals("MASCULINO"))
		{
			click(radioSexoM);
		}else
		{
			click(radioSexoF);
		}
		
	}
	private void setDescripcion()
	{
		txtDescripcion.clear();
		sendKeys(txtDescripcion,strDOcupacion);
	}
	
	private void setOcupacion()
	{	
		txtOcupacion.clear();
		sendKeys(txtOcupacion,strOcupacion);
	}
	
	private void setNacionalidad()
	{	
		WebElement txtNacionalidad = getElementByXpathContainsText(strXpathNati);			
		click(txtNacionalidad);
	}
	
	private void setPaisOrigen()
	{			
		WebElement txtPais = getElementByXpathContainsText(strXpathPais);			
		click(txtPais);
		
	}
	private void setFecha()
	{	HCommonHelper.waiter("low");
		txtFecha.clear();
		sendKeys(txtFecha,strFecha);
	}
	private void clickDatosSolicitante()
	{	HCommonHelper.waiter("high");
		refreshPage();
		HCommonHelper.waiter("high");
		swithToFrame(frame);
		click(lnkDatosPSolicitante);
	}
}
