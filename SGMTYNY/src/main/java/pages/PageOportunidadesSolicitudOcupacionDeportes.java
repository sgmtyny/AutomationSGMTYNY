package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helpers.HCommonHelper;
import helpers.HOportunidadesSolicitudHelper;

public class PageOportunidadesSolicitudOcupacionDeportes extends BasePage {
	
	@FindBy(xpath = "//iframe[@title = 'accessibility title']")
	WebElement frame;	
	@FindBy(xpath = "//*[@id=\"SC9Question1Applicable|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioExpuestoY;
	@FindBy(xpath = "//*[@id=\"SC9Question1Applicable|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioExpuestoN;
	@FindBy(xpath = "//*[@id=\"SC9Question1Figure\"]")
	WebElement txtFigura1;
	@FindBy(xpath = "//*[@id=\"SC9Question1Specification\"]")
	WebElement txtEspecifica1;
	@FindBy(xpath = "//*[@id=\"SC9Question2Applicable|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioDeportePY;
	@FindBy(xpath = "//*[@id=\"SC9Question2Applicable|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioDeportePN;
	@FindBy(xpath = "//*[@id=\"SC9Question2Figure\"]")
	WebElement txtFigura2;
	@FindBy(xpath = "//*[@id=\"SC9Question2Specification\"]")
	WebElement txtEspecifica2;
	@FindBy(xpath = "//*[@id=\"SC9Question2Sports\"]")
	WebElement txtDeporte;
	@FindBy(xpath = "//*[@id=\"SC9Question2SportsProfile|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioCDAficionado;
	@FindBy(xpath = "//*[@id=\"SC9Question2SportsProfile|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioCDProfesional;
	@FindBy(xpath = "//*[@id=\"SC9Question2SportsProfile|0\"]/div/div[1]/label[3]/span[1]")
	WebElement radioCDInstructor;
	@FindBy(xpath = "//*[@id=\"SC9Question2SportsProfile|0\"]/div/div[1]/label[4]/span[1]")
	WebElement radioCDOtro;
	@FindBy(xpath = "//*[@id=\"SC9Question2OtherSportsProfile\"]")
	WebElement txtCDOtro;
	@FindBy(xpath = "//*[@id=\"SC9Question2SportsPracticeType|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioSolo;
	@FindBy(xpath = "//*[@id=\"SC9Question2SportsPracticeType|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioGrupo;
	@FindBy(xpath = "//*[@id=\"SC9Question2SportsTraining|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioCapacitacionY;
	@FindBy(xpath = "//*[@id=\"SC9Question2SportsTraining|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioCapacitacionN;
	@FindBy(xpath = "//*[@id=\"SC9Question2PraticeDuration\"]")
	WebElement txtLugarCapacitacion;
	@FindBy(xpath = "//*[@id=\"SC9Question2PracticeFrequency\"]")
	WebElement txtFrecuenciaPractica;
	@FindBy(xpath = "//*[@id=\"SC9Question2PracticeStartDate\"]")
	WebElement txtFechaPractica;
	@FindBy(xpath = "//*[@id=\"SC9Question2PracticePlace\"]")
	WebElement txtLugarPractica;
	@FindBy(xpath = "//*[@id=\"SC9Question2ClubMembership|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioClubN;
	@FindBy(xpath = "//*[@id=\"SC9Question2ClubMembership|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioClubY;
	@FindBy(xpath = "//*[@id=\"SC9Question2ClubName\"]")
	WebElement txtNombreClub;
	@FindBy(xpath = "//*[@id=\"SC9Question2RequiredLicense|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioLicenciaN;
	@FindBy(xpath = "//*[@id=\"SC9Question2RequiredLicense|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioLicenciaY;
	@FindBy(xpath = "//*[@id=\"SC9Question2ValidOfficeLicense|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioLVigenteN;
	@FindBy(xpath = "//*[@id=\"SC9Question2ValidOfficeLicense|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioLVigenteY;
	@FindBy(xpath = "//*[@id=\"SC9Question2ReceivedSponsership|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioPatrocinioN;
	@FindBy(xpath = "//*[@id=\"SC9Question2ReceivedSponsership|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioPatrocinioY;
	@FindBy(xpath = "//*[@id=\"SC9Question2Reason\"]")
	WebElement txtRazonSocial;
	@FindBy(xpath = "//*[@id=\"SC9Question2Motto\"]")
	WebElement txtMotivo;
	@FindBy(xpath = "//*[@id=\"SC9Question2PracticeAccident|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioAccidenteN;
	@FindBy(xpath = "//*[@id=\"SC9Question2PracticeAccident|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioAccidenteY;
	@FindBy(xpath = "//*[@id=\"SC9Question2AccidentDate\"]")
	WebElement txtFechaAccidente;
	@FindBy(xpath = "//*[@id=\"SC9Question2AccidentActualStatus\"]")
	WebElement txtEdoActual;
	@FindBy(xpath = "//*[@id=\"SC9Question2AccidentDetail\"]")
	WebElement txtTipoLesion;
	@FindBy(xpath = "//*[@id=\"SC9Question2OtherDetail\"]")
	WebElement txtInfoExtra;
	@FindBy(xpath = "//*[@id=\"SC9Quest2RiskCoverForBasicCoverage|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioCoberturaBasicaN;
	@FindBy(xpath = "//*[@id=\"SC9Quest2RiskCoverForBasicCoverage|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioCoberturaBasicaY;
	//@FindBy(xpath = "//*[@id=\"SC9Question2\"]/div/div/div[2]/child[27]/div/ng-form/div/label/span")
	@FindBy(xpath = "//*[@id=\"SC9Question2MotorcycleQuestionnaire\"]")
	WebElement chbxMotociclismo;
	@FindBy(xpath = "//*[@id=\"SC9Question2License|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioLicenciaMotoN;
	@FindBy(xpath = "//*[@id=\"SC9Question2License|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioLicenciaMotoY;
	@FindBy(xpath = "//*[@id=\"SC9Question2LicenseNumber\"]")
	WebElement txtNoLicenciaMoto;
	@FindBy(xpath = "//*[@id=\"SC9Question2ExpirationDate\"]")
	WebElement txtExpiracionLicMoto;
	@FindBy(xpath = "//*[@id=\"SC9Question2Owner|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioPropietarioMotoN;
	@FindBy(xpath = "//*[@id=\"SC9Question2Owner|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioPropietarioMotoY;
	@FindBy(xpath = "//*[@id=\"SC9Question2Brand\"]")
	WebElement txtMarcaMoto;
	@FindBy(xpath = "//*[@id=\"SC9Question2Model\"]")
	WebElement txtModeloMoto;
	@FindBy(xpath = "//*[@id=\"SC9Question2Capacity\"]")
	WebElement txtCCMoto;
	@FindBy(xpath = "//*[@id=\"SC9Question2Transport|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioTransporteMotoN;
	@FindBy(xpath = "//*[@id=\"SC9Question2Transport|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioTransporteMotoY;
	@FindBy(xpath = "//*[@id=\"SC9Question2OnlyTransport\"]")
	WebElement txtSoloTransporte;
	@FindBy(xpath = "//*[@id=\"SC9Question2DailyWork\"]")
	WebElement txtComoParteTrabajo;
	@FindBy(xpath = "//*[@id=\"SC9Question2Recreation|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioRecreativoN;
	@FindBy(xpath = "//*[@id=\"SC9Question2Recreation|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioRecreativoY;
	@FindBy(xpath = "//*[@id=\"SC9Question2Walk\"]")
	WebElement txtSoloPaseo;
	@FindBy(xpath = "//*[@id=\"SC9Question2Frequency\"]")
	WebElement txtFrecuenciaMoto;
	@FindBy(xpath = "//*[@id=\"SC9Question2ClubOrGroup\"]")
	WebElement txtClubMoto;
	@FindBy(xpath = "//*[@id=\"SC9Question2MotoSports|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioCompetenciasMotoN;
	@FindBy(xpath = "//*[@id=\"SC9Question2MotoSports|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioCompetenciasMotoY;
	@FindBy(xpath = "//*[@id=\"SC9Question2SportsExperience|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioAmateurMoto;
	@FindBy(xpath = "//*[@id=\"SC9Question2SportsExperience|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioProfesionalMoto;
	@FindBy(xpath = "//*[@id=\"SC9Question2SportsExperienceType|0\"]/div/div[1]/ul/li[1]/label/span[1]")
	WebElement chbxCircuitoCerrado;
	@FindBy(xpath = "//*[@id=\"SC9Question2SportsExperienceType|0\"]/div/div[1]/ul/li[2]/label/span[1]")
	WebElement chbxCampoTraviesa;
	@FindBy(xpath = "//*[@id=\"SC9Question2SportsExperienceType|0\"]/div/div[1]/ul/li[3]/label/span[1]")
	WebElement chbxCarretera;
	@FindBy(xpath = "//*[@id=\"SC9Question2SportsExperienceType|0\"]/div/div[1]/ul/li[4]/label/span[1]")
	WebElement chbxOtros;
	@FindBy(xpath = "//*[@id=\"SC9Question2SportsSpecification\"]")
	WebElement txtEspecificaOtros;
	@FindBy(xpath = "//*[@id=\"SC9Question2SportsEvents\"]")
	WebElement txtNoEventos;
	@FindBy(xpath = "//*[@id=\"SC9Question2MaxSpeed\"]")
	WebElement txtVelocidadMax;
	@FindBy(xpath = "//*[@id=\"SC9Question2Sponrsorship|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioPatrocinioMotoY;
	@FindBy(xpath = "//*[@id=\"SC9Question2Sponrsorship|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioPatrocinioMotoN;
	@FindBy(xpath = "//*[@id=\"SC9Question2motorcycleSponrsorship\"]")
	WebElement txtMontoPatrocinio;
	@FindBy(xpath = "//*[@id=\"SC9Question2SponsorName\"]")
	WebElement txtNombrePatrocinador;
	@FindBy(xpath = "//*[@id=\"SC9Question2Accident|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioAccidenteMotoY;
	@FindBy(xpath = "//*[@id=\"SC9Question2Accident|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioAccidenteMotoN;
	@FindBy(xpath = "//*[@id=\"SC9Question2CurrentStatus\"]")
	WebElement txtDescripcionAccidenteMoto;
	@FindBy(xpath = "//*[@id=\"SC9Question2AdditionInfo\"]")
	WebElement txtInfoExtraMoto;
	@FindBy(xpath = "//*[@id=\"SC9Question3Applicable|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioVuelasY;
	@FindBy(xpath = "//*[@id=\"SC9Question3Applicable|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioVuelasN;
	@FindBy(xpath = "//*[@id=\"SC9Question3Figure\"]")
	WebElement txtFiguraVuelas;
	@FindBy(xpath = "//*[@id=\"SC9Question3Specification\"]")
	WebElement txtEspecificaVuelas;
	@FindBy(xpath = "//*[@id=\"OccupationSportsOtherActivities_nextBtn\"]")
	WebElement btnContinuar;
	
	
	
	
	
	String strExpuesto = HOportunidadesSolicitudHelper.getExpuesto();
	String strEspecifica1 =  HOportunidadesSolicitudHelper.getEspecifica1();
	String strDeporteP = HOportunidadesSolicitudHelper.getDeporteP();
	String strEspecifica2 =  HOportunidadesSolicitudHelper.getEspecifica2();
	String strTipoDeporte =  HOportunidadesSolicitudHelper.getTipoDeporte();
	String strCalidad =  HOportunidadesSolicitudHelper.getCalidad();
	String strOtro =  HOportunidadesSolicitudHelper.getOtro();
	String strSolo = HOportunidadesSolicitudHelper.getSolo();
	String strCapacitacion = HOportunidadesSolicitudHelper.getCapacitacion();
	String strLCapacitacion = HOportunidadesSolicitudHelper.getLCapacitacion();
	String strFrecuencia = HOportunidadesSolicitudHelper.getFrecuencia();
	String strFechaPractica = HOportunidadesSolicitudHelper.getFechaPractica();
	String strLugarPractica = HOportunidadesSolicitudHelper.getLugarPractica();
	String strMiembroClub = HOportunidadesSolicitudHelper.getClub();
	String strNombreClub = HOportunidadesSolicitudHelper.getNombreClub();
	String strLicencia = HOportunidadesSolicitudHelper.getLicencia();
	String strLVigente = HOportunidadesSolicitudHelper.getLVigente();
	String strPatrocinio = HOportunidadesSolicitudHelper.getPatrocinio();
	String strRazonSocial = HOportunidadesSolicitudHelper.getRazonSocial();
	String strMotivo = HOportunidadesSolicitudHelper.getMotivo();
	String strAccidente = HOportunidadesSolicitudHelper.getAccidente();
	String strFechaAccidente = HOportunidadesSolicitudHelper.getFechaAccidente();
	String strEdoAccidente = HOportunidadesSolicitudHelper.getEdoAccidente();
	String strDescripcionAccidente = HOportunidadesSolicitudHelper.getDescripcionAccidente();
	String strInfoExtra = HOportunidadesSolicitudHelper.getInfoExtra();
	String strCoberturaBasica = HOportunidadesSolicitudHelper.getCoberturaExtra();
	String strCuestionarioMoto = HOportunidadesSolicitudHelper.getCuestionarioMoto();
	String strLicenciaMoto =  HOportunidadesSolicitudHelper.getLicenciaMoto();
	String strNoLicMoto = HOportunidadesSolicitudHelper.geNumeroLicMoto();
	String strExpiracionMoto = HOportunidadesSolicitudHelper.getFechaExpiracionMoto();
	String strPropietarioMoto = HOportunidadesSolicitudHelper.getPropietarioMoto();
	String strMarcaMoto = HOportunidadesSolicitudHelper.getMarcaMoto();
	String strModeloMoto = HOportunidadesSolicitudHelper.getModeloMoto();
	String strCCMoto = HOportunidadesSolicitudHelper.getCCMoto();
	String strTransporteMoto = HOportunidadesSolicitudHelper.getUsoTransporte();
	String strSoloTransporteMoto = HOportunidadesSolicitudHelper.getSoloTransporte();
	String strTrabajoCotidiano = HOportunidadesSolicitudHelper.getTrabajoCotidiano();
	String strRecreativo = HOportunidadesSolicitudHelper.getUsoRecreativo();
	String strSoloPaseo = HOportunidadesSolicitudHelper.getSoloPaseo();
	String strFrecuenciamoto = 	HOportunidadesSolicitudHelper.getSoloPaseo();
	String strClubMoto = HOportunidadesSolicitudHelper.getNombreClubMoto();
	String strCompetenciasMoto = HOportunidadesSolicitudHelper.getParticipaCompetencias();
	String strAmateur = HOportunidadesSolicitudHelper.getAmateurProfesional();
	String strPista = HOportunidadesSolicitudHelper.getPista();
	String strVelocidadMax = HOportunidadesSolicitudHelper.getVelocidad();
	String strEventosAnio = HOportunidadesSolicitudHelper.getEventosAnio();
	String strPatrocinioMoto = HOportunidadesSolicitudHelper.getPatrocinioMoto();
	String strMontoPatrocinioMoto = HOportunidadesSolicitudHelper.getMontoPatrocinioMoto();
	String strNombrePatrocinadorMoto = HOportunidadesSolicitudHelper.getPatrocinadorMoto();
	String strAccidenteMoto = HOportunidadesSolicitudHelper.getAccidenteMoto();
	String strDescripcionAccidentemoto = HOportunidadesSolicitudHelper.getAccidentemotoDescripcion();
	String strInfoExtraMoto = HOportunidadesSolicitudHelper.getInfoExtraMoto();
	String strVuelas = HOportunidadesSolicitudHelper.getVuelas();
	String strVuelasCuales = HOportunidadesSolicitudHelper.getVuelasCuales();
	String strEspecificaOtros = HOportunidadesSolicitudHelper.getOtroPista();
	
	
	public PageOportunidadesSolicitudOcupacionDeportes(WebDriver driver) {
		super(driver);
	}

	public void cuestionario()
	{
		clickExpuesto();
		clickDeportePeligroso();
		clickCoberturaBasica();
		clickVuela();
		clickContinuar();
	}
	private void clickContinuar()
	{
		click(btnContinuar);
	}
	private void clickVuela()
	{
		if(strVuelas.equals("NO"))
		{
			click(radioVuelasN);
		}else
		{
			click(radioVuelasY);
			setFiguraVuelas();
			setVuelasCuales();
		}
	}
	private void clickCoberturaBasica()
	{
		if(strCoberturaBasica.equals("NO"))
		{
			click(radioCoberturaBasicaN);
		}else
		{
			click(radioCoberturaBasicaY);
			cuestionarioMotociclismo();
		}
		
	}
	private void cuestionarioMotociclismo()
	{
		if((strCuestionarioMoto.equals("YES")) &&(strDeporteP.equals("YES")))
		{
			HCommonHelper.waiter("medium");
			
			if(!chbxMotociclismo.isSelected())
			{
				click(chbxMotociclismo);
			}				
			clickTieneslicencia();
			clickPropietarioMoto();
			clickTransPorte();
			clickRecreativo();
			clickCompetencias();
			clickPistas();
			setEventosPAnio();
			setVelocidadMX();
			clickPatrocinioMoto();
			clickAccidenteMoto();
			setInfoExtraMoto();
			
		}
	}
	private void setInfoExtraMoto()
	{
		sendKeys(txtInfoExtraMoto,strInfoExtraMoto);
	}
	private void clickAccidenteMoto()
	{
		if(strAccidenteMoto.equals("NO"))
		{
			click(radioAccidenteMotoN);
		}
		else
		{
			click(radioAccidenteMotoY);
			setDescripcionAccidenteMoto();
		}
	}
	private void clickPatrocinioMoto()
	{
		if(strPatrocinioMoto.equals("NO"))
		{
			click(radioPatrocinioMotoN);
		}
		else
		{
			click(radioPatrocinioMotoY);
			setNombrePatrocinador();
			setMontoPatrocinado();
		}
	}
	private void clickPistas()
	{
		switch(strPista)
		{
		case "CIRCUITOCERRADO":
			click(chbxCircuitoCerrado);
			break;
		case "CAMPOTRAVIESA":
			click(chbxCampoTraviesa);
			break;
		case "CARRETERA":
			click(chbxCarretera);
			break;
		case "OTROS":
			click(chbxOtros);
			setEspecifico();			
			break;
		}
	}
	private void clickCompetencias()
	{
		if(strCompetenciasMoto.equals("NO"))
		{
			click(radioCompetenciasMotoN);
		}
		else
		{
			click(radioCompetenciasMotoY);
			if (strAmateur.equals("YES"))
			{
				click(radioAmateurMoto);
			}
			else
			{
				click(radioProfesionalMoto);
			}
		}
	}
	private void clickRecreativo()
	{
		if(strRecreativo.equals("NO"))
		{
			click(radioRecreativoN);
		}
		else
		{
			click(radioRecreativoY);
			setSoloPaseo();
			setFrecuenciaMoto();
			setClubMoto();
		}
	}
	private void clickTransPorte()
	{
		if(strTransporteMoto.equals("NO"))
		{
			click(radioTransporteMotoN);
		}
		else
		{
			click(radioTransporteMotoY);			
			setSoloTransporte();
			setParteTrabajo();
		}
	}
	private void clickPropietarioMoto()
	{
		if(strPropietarioMoto.equals("NO"))
		{
			click(radioPropietarioMotoN);
		}
		else
		{
			click(radioPropietarioMotoY);
			setMarcaMoto();
			HCommonHelper.waiter("low");
			setModeloMoto();
			HCommonHelper.waiter("low");
			setCCMoto();
		}
	}
	
	
	
	private void setEspecifico()
	{
		sendKeys(txtEspecificaOtros,strEspecificaOtros);
	}
	private void setVuelasCuales()
	{
		sendKeys(txtEspecificaVuelas,strVuelasCuales);
	}
	private void setFiguraVuelas()
	{
		click(txtFiguraVuelas);
		HCommonHelper.waiter("medium");
		downEnter(txtFiguraVuelas);
	}
	private void setDescripcionAccidenteMoto()
	{
		sendKeys(txtDescripcionAccidenteMoto,strDescripcionAccidentemoto);
	}
	private void setMontoPatrocinado()
	{
		sendKeys(txtMontoPatrocinio,strMontoPatrocinioMoto);
	}
	private void setNombrePatrocinador()
	{
		sendKeys(txtNombrePatrocinador,strNombrePatrocinadorMoto);
	}
	private void setVelocidadMX()
	{
		sendKeys(txtVelocidadMax,strVelocidadMax);
	}
	private void setEventosPAnio()
	{	
		HCommonHelper.waiter("low");
		sendKeys(txtNoEventos,strEventosAnio);
	}
	private void setParteTrabajo()
	{
		sendKeys(txtComoParteTrabajo,strTrabajoCotidiano);
	}
	private void setSoloTransporte()
	{
		sendKeys(txtSoloTransporte,strSoloTransporteMoto);
	}
	private void setClubMoto()
	{
		sendKeys(txtClubMoto,strClubMoto);
	}
	private void setFrecuenciaMoto()
	{
		sendKeys(txtFrecuenciaMoto,strFrecuenciamoto);
	}
	private void setSoloPaseo()
	{
		sendKeys(txtSoloPaseo,strSoloPaseo);
	}
	
	private void setCCMoto()
	{
		sendKeys(txtCCMoto,strCCMoto);
	}
	private void setModeloMoto()
	{
		sendKeys(txtModeloMoto,strModeloMoto);
	}
	private void setMarcaMoto()
	{
		sendKeys(txtMarcaMoto,strMarcaMoto);
	}
	private void clickTieneslicencia()
	{
		if(strLicencia.equals("NO"))
		{
			click(radioLicenciaMotoN);
		}
		else
		{
			click(radioLicenciaMotoY);
			setNoLicenciaMoto();
			setExpiracionLicenciaMoto();
		}
	}
	private void setExpiracionLicenciaMoto()
	{
		sendKeys(txtExpiracionLicMoto,strExpiracionMoto);
	}
	private void setNoLicenciaMoto()
	{
		sendKeys(txtNoLicenciaMoto,strNoLicMoto);
	}
	private void clickDeportePeligroso()
	{
		if(strDeporteP.equals("NO"))
		{
			click(radioDeportePN);
		}else
		{
			click(radioDeportePY);
			set2NoFigura();
			set2Especifica();
			set2TipoDeporte();
			set2Calidad();
			clickSolo();	
			clickCapacitacion();		
			setFrecuenciaPractica();
			setFechaPractica();
			setLugarPractica();
			clickClub();
			clickLicencia();
			clickPatrocinio();	
			clickAccidente();
		}
		
	}
	private void clickAccidente()
	{
		if(strPatrocinio.equals("NO"))
		{
			click(radioAccidenteN);
		}else
		{
			click(radioAccidenteY);
			setFechaAccidente();
			setEdoAccidente();
			setDescripcionAccidente();
			setInfoAccidente();
		}
	}
	private void clickPatrocinio()
	{
		if(strPatrocinio.equals("NO"))
		{
			click(radioPatrocinioN);
		}else
		{
			click(radioPatrocinioY);
			setRazonSocial();
			setMotivo();
		}
	}
	private void setInfoAccidente()
	{
		sendKeys(txtInfoExtra,strInfoExtra);
	}
	private void setDescripcionAccidente()
	{
		sendKeys(txtTipoLesion,strDescripcionAccidente);
	}
	private void setEdoAccidente()
	{
		sendKeys(txtEdoActual,strEdoAccidente);
	}
	private void setFechaAccidente()
	{
		sendKeys(txtFechaAccidente,strFechaAccidente);
	}
	private void setMotivo()
	{
		sendKeys(txtMotivo,strMotivo);
	}
	private void setRazonSocial()
	{
		sendKeys(txtRazonSocial,strRazonSocial);
	}	
	private void clickLicencia()
	{
		if(strLicencia.equals("NO"))
		{
			click(radioLicenciaN);
		}else
		{
			click(radioLicenciaY);
			clickLVigetne();
		}
	}	
	private void clickLVigetne()
	{
		if(strLVigente.equals("NO"))
		{
			click(radioLVigenteN);
		}else
		{
			click(radioLVigenteY);			
		}
	}
	private void clickClub()
	{
		if(strMiembroClub.equals("NO"))
		{
			click(radioClubN);
		}else
		{
			click(radioClubY);
			setClub();
		}
	}
	private void setClub()
	{
		sendKeys(txtNombreClub,strNombreClub);
	}
	private void clickExpuesto()
	{
		HCommonHelper.waiter("high");
		refreshPage();
		HCommonHelper.waiter("high");
		swithToFrame(frame);
		
		if(strExpuesto.equals("NO"))
		{
			click(radioExpuestoN);
		}else
		{
			click(radioExpuestoY);
			set1NoFigura();
			set1Especifica();
		}
		
	}
	
	private void clickCapacitacion() 
	{
		if(strCapacitacion.equals("NO"))
		{
			click(radioCapacitacionN);
		}	
		else
		{
			click(radioCapacitacionY);
			setLugarCapacitacion();
		}
	}
	private void setFrecuenciaPractica()
	{
		sendKeys(txtFrecuenciaPractica, strFrecuencia);
	}
	private void setLugarCapacitacion()
	{
		sendKeys(txtLugarCapacitacion, strLCapacitacion);
	}
	private void setFechaPractica()
	{
		sendKeys(txtFechaPractica, strFechaPractica);
	}
	private void setLugarPractica()
	{
		sendKeys(txtLugarPractica, strLugarPractica);
	}	
	private void clickSolo()
	{
		if(strSolo.equals("SOLO"))
		{
			click(radioSolo);
		}
		else
		{
			click(radioGrupo);
		}
	}
	private void set2Calidad()
	{
		switch (strCalidad)
		{
		case "AFICIONADO":
			click(radioCDAficionado);
			break;
		case "PROFESIONAL":
			click(radioCDProfesional);
			break;
		case "INSTRUCTOR":
			click(radioCDInstructor);
			break;
		case "OTRO":
			click(radioCDOtro);
			setOtro();
			break;
		}
	}
	private void setOtro()
	{
		sendKeys(txtCDOtro, strOtro);
	}
	private void set2TipoDeporte()
	{
		sendKeys(txtDeporte, strTipoDeporte);
	}
	private void set2Especifica()
	{
		sendKeys(txtEspecifica2,strEspecifica2);
	}
	private void set2NoFigura()
	{
		click(txtFigura2);
		HCommonHelper.waiter("medium");
		downEnter(txtFigura2);
	}
	
	private void set1Especifica()
	{
		sendKeys(txtEspecifica1,strEspecifica1);
	}
	private void set1NoFigura()
	{
		click(txtFigura1);
		HCommonHelper.waiter("medium");
		downEnter(txtFigura1);
	}
}
