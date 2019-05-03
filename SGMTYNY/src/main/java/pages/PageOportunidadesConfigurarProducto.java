package pages;

import java.io.IOException;

import org.apache.xpath.axes.WalkingIterator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

import helpers.HCommonHelper;
import helpers.HOportunidadesConfigurarProductoHelper;

public class PageOportunidadesConfigurarProducto extends BasePage{
	
/*****Informacion Personal******/
	@FindBy(xpath = "//iframe[@title = 'accessibility title']")
	WebElement frame;	
	@FindBy(xpath = "//*[text() = 'Necesidad']")
	WebElement btnBaseEnNed;	
	@FindBy(xpath = "//*[text() = 'Producto']")
	WebElement btnBaseEnProd;	
	@FindBy(xpath = "//*[@id=\"a2n0R000000bnlMQAQ-5\"]/div[1]/div/child[10]/div/ng-form/div/label/span")
	WebElement chbxIgualAsegurado;
	@FindBy(xpath = "//*[@id=\"GenderApplicant|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radioSexMasculino;
	@FindBy(xpath = "//*[@id=\"GenderApplicant|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radioSexFemenino;
	
	@FindBy(xpath = "//*[@id=\"RegionApplicant\"]")
	WebElement btnStates;	
	@FindBy(xpath="//*[@id=\"ZipCodeApplicant\"]")
	WebElement txtZipCode;	
	@FindBy(xpath= "//*[@id=\"SmokerApplicant|0\"]/div/div[1]/label[1]/span[2]")
	WebElement radioSmokSi;	
	@FindBy(xpath= "//*[@id=\"SmokerApplicant|0\"]/div/div[1]/label[2]/span[2]")
	WebElement radioSmokNo;	
	@FindBy(xpath= "//*[@id=\"preferredApplicant|0\"]/div/div[1]/label[1]/span[2]")
	WebElement radioPrefSi;	
	@FindBy(xpath= "//*[@id=\"preferredApplicant|0\"]/div/div[1]/label[2]/span[2]")
	WebElement radioPrefNo;	
	@FindBy(xpath= "//*[@id=\"AnnualIncomeApplicant\"]")
	WebElement txtIngreso;	
	@FindBy(xpath="//*[@id=\"a2n0R000000XYm0QAG-5\"]/div[1]/div/child[28]/div/ng-form/div/label/span")
	WebElement chbxTrabInd;	
	@FindBy(xpath= "//*[@id=\"a2n0R000000XYm0QAG-5\"]/div[1]/div/child[37]/div/div[3]/div/div")
	WebElement imgConyuge;	
	/*****Seleccionar producto******/
	@FindBy(xpath= "//*[@id=\"FamilySelection\"]/div/ng-include/div/div/div/div/div[1]/div")
	WebElement btnAlfaMedical;
	@FindBy(xpath= "//*[@id=\"FamilySelection\"]/div/ng-include/div/div/div/div/div[2]/div")
	WebElement btnAlfaMedicalFlex;
	@FindBy(xpath= "//*[@id=\"FamilySelection\"]/div/ng-include/div/div/div/div/div[3]/div")
	WebElement btnImaginaSer;
	@FindBy(xpath= "//*[@id=\"FamilySelection\"]/div/ng-include/div/div/div/div/div[4]/div")
	WebElement btnNuevoPlenitud;
	@FindBy(xpath= "//*[@id=\"FamilySelection\"]/div/ng-include/div/div/div/div/div[5]/div")
	WebElement btnOrvi99;
	@FindBy(xpath= "//*[@id=\"FamilySelection\"]/div/ng-include/div/div/div/div/div[6]/div")
	WebElement btnRealiza;
	@FindBy(xpath= "//*[@id=\"FamilySelection\"]/div/ng-include/div/div/div/div/div[7]/div")
	WebElement btnStarDotal;
	@FindBy(xpath= "//*[@id=\"FamilySelection\"]/div/ng-include/div/div/div/div/div[8]/div")
	WebElement btnStarTemporal;
	
	
	@FindBy(xpath= "//*[@id=\"SelectProductFamily_nextBtn\"]/p")
	WebElement btnProdSig;
	
	/*****Seleccionar plan******/
	@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/ul/li/input")
	WebElement chbxPeso;	
			/***AlfaMedical***/
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[1]/div")
			WebElement btnPlanIntegro;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[2]/div")
			WebElement btnPlanPleno;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[3]/div")
			WebElement btnPlanPractico;
			
			/***AlfaMedicalFlex***/			
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[1]/div")
			WebElement btnPesoFlexA;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[2]/div")
			WebElement btnPesoFlexB;
			
			/***ImaginaSer***/			
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[1]/div")
			WebElement btnDolar55PU;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[2]/div")
			WebElement btnUDI55PU;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[3]/div")
			WebElement btnUDI55PN;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[4]/div")
			WebElement btnDolar55PN;			
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[5]/div")
			WebElement btnDolar60PU;			
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[6]/div")
			WebElement btnUDI60PU;			
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[7]/div")
			WebElement btnUDI60PN;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[8]/div")
			WebElement btnDolar60PN;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[9]/div")
			WebElement btnDolar65PU;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[10]/div")
			WebElement btnUDI65PU;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[11]/div")
			WebElement btnUDI65PN;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[12]/div")
			WebElement btnDolar65PN;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[13]/div")
			WebElement btnDolar70PU;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[14]/div")
			WebElement btnUDI70PU;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[15]/div")
			WebElement btnUDI70PN;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[16]/div")
			WebElement btnDolar70PN;
			
			/***NuevoPlenitud***/			
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[1]/div")
			WebElement btnUDINP55P15;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[2]/div")
			WebElement btnUDINP55PN;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[3]/div")
			WebElement btnDOLARNP55PN;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[4]/div")
			WebElement btnUDINP60P15;			
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[5]/div")
			WebElement btnUDINP60PN;			
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[6]/div")
			WebElement btnDOLARNP60PN;			
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[7]/div")
			WebElement btnUDINP65P15;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[8]/div")
			WebElement btnUDINP65PN;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[9]/div")
			WebElement btnDOLARNP65PN;
			
			/***Orvi 99***/	
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[1]/div")
			WebElement btnDOLARORV60;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[2]/div")
			WebElement btnUDIORVTP;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[3]/div")
			WebElement btnDOLARORVTP;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[4]/div")
			WebElement btnUDITPM;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[5]/div")
			WebElement btnDOLARTPM;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[6]/div")
			WebElement btnDOLARORV1;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[7]/div")
			WebElement btnUDIORV10P;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[8]/div")
			WebElement btnDOLARORV10P;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[9]/div")
			WebElement btnDOLARORV15P;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[10]/div")
			WebElement btnUDIORV20P;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[11]/div")
			WebElement btnDOLARORV20P;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[12]/div")
			WebElement btnDOLARORV20PM;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[13]/div")
			WebElement btnDOLARORV6P;
			
			/***Realiza***/	
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[1]/div")
			WebElement btnUDIREALIZA;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[2]/div")
			WebElement btnDOLARREALIZA;
			
			/***Star dotal***/	
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[1]/div")
			WebElement btnDOLARSD10;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[2]/div")
			WebElement btnUDISD10;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[3]/div")
			WebElement btnDOLARSD15;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[4]/div")
			WebElement btnDOLARSD20;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[5]/div")
			WebElement btnUDISD20;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[6]/div")
			WebElement btnDOLARSD5;
			
			/***Star temporal***/	
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[1]/div")
			WebElement btnDOLARST65;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[2]/div")
			WebElement btnDOLARST1R;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[3]/div")
			WebElement btnDOLARST10;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[4]/div")
			WebElement btnUDIST10;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[5]/div")
			WebElement btnUDIST20;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[6]/div")
			WebElement btnDOLARST20;
			@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[7]/div")
			WebElement btnDOLARST5;
			
			@FindBy(xpath= "//*[@id=\"ConfigureCoveragesLife_nextBtn\"]/p	")
			WebElement btnPlanSig1;
			
			@FindBy(xpath= "//*[@id=\"a2n0R000000XYm0QAG-46\"]/div[1]/div/child[1]/div/ng-form/div/label/span")
			WebElement chbxDeducible;
			@FindBy(xpath= "//*[@id=\"ApplicationInformation_nextBtn\"]/p")
			WebElement btnDeducibleSig;
			
			
			@FindBy(xpath= "//*[@id=\"Settlement\"]")
			WebElement listLiquidacion;
			
			@FindBy(xpath= "//*[@id=\"TypeOfIncome\"]")
			WebElement listTipoIngreso;
			
			@FindBy(xpath= "//*[@id=\"WarrantyYears\"]")
			WebElement listAniosGarantia;
			
			@FindBy(xpath= "//*[@id=\"Cobeneficiary\"]")
			WebElement txtCobeneficiario;
			
			@FindBy(xpath= "//*[@id=\"ApplicationInformation_nextBtn\"]/p")
			WebElement btnSigLiq;
			
			
	@FindBy(xpath= "//*[@id=\"SelectProductPlan_nextBtn\"]/p")
	WebElement btnPlanSig;
	
	/*****Seleccionar personas******/
	@FindBy(xpath= "//*[@id=\"AseguradoSelectionHealthPrimary\"]/div/ng-include/div/table/tbody/tr/th[1]/label/span")
	WebElement chbxSeleAse;
	@FindBy(xpath= "	//*[@id=\"AseguradoSelectionHealth_nextBtn\"]/p")
	WebElement btnPersonaSig;
	
	@FindBy(xpath= "//*[@id=\"AseguradoSelection\"]/div/ng-include/div/table/tbody/tr/th[1]/label/span")
	WebElement chbxSeleAseOrvi;
	@FindBy(xpath= "//*[@id=\"Occupation\"]")
	WebElement txtOcupacionOrvi;
	@FindBy(xpath= "//*[@id=\"AseguradoScreen_nextBtn\"]")
	WebElement btnPersonaSigOrvi;

	/*****Configuracion******/
	@FindBy(xpath= "//*[@id=\"ConfigureCoverages_nextBtn\"]/p")	
	WebElement btnConfigSig;
	@FindBy(xpath= "//*[@id=\"ConfigureCoveragesLife_nextBtn\"]")	
	WebElement btnConfigSigOrvi;
	
	/*****Prima total******/
	@FindBy(xpath= "//*[@id=\"PaymentFrequency\"]")	
	WebElement listFrecuencia;
	@FindBy(xpath= "//*[@id=\"PaymentFrequencyLife\"]")	
	WebElement listFrecuenciaLife;
	@FindBy(xpath= "//*[@id=\"FinalPremiumCalculation_nextBtn\"]/p")	
	WebElement btnPrimaSig;
	@FindBy(xpath= "//*[@id=\"FinalPremiumCalculationLife_nextBtn\"]/p")	
	WebElement btnPrimaSigLife;
	
	@FindBy(xpath= "//*[@id=\"FinalPremiumCalculationLife_nextBtn\"]/p")	
	WebElement btnPrimaSig1;
	
	@FindBy(xpath="//*[@id=\"ApplicationInformation_nextBtn\"]/p")
	WebElement btnInfoSig;
	
	/*****Informacion Personal******/
	//Xpath=//*[@id='java_technologies']/child::li[1]
	//"//div[@class = 'modal-footer slds-modal__footer']/descendant::span[contains(text(),'Guardar')]"
	@FindBy(xpath="//div[@class = 'slds-modal__content slds-p-around--medium vloc-modal-content slds-is-relative']/descendant::span=contains(text(),'Nombre'" )	
	WebElement txtConyNombre;
	@FindBy(xpath="//*[@id=\"GetCustomerInfo_nextBtn\"]/p")
	WebElement btnSiguiente;
	
	
	String strBaseEn = HOportunidadesConfigurarProductoHelper.conBaseEn();
	String strIgualAsegurado = HOportunidadesConfigurarProductoHelper.igualAsegurado();
	String strState=HOportunidadesConfigurarProductoHelper.estado();
	String strZipCode=HOportunidadesConfigurarProductoHelper.cp();
	String strSexo=HOportunidadesConfigurarProductoHelper.sexo();
	String strFumas = HOportunidadesConfigurarProductoHelper.fumas();
	String strPreferente = HOportunidadesConfigurarProductoHelper.preferente();
	String strIngresoAnual = HOportunidadesConfigurarProductoHelper.ingresoAnual();
	String strTrabajadorInd = HOportunidadesConfigurarProductoHelper.trabajadorIndependiente();
	String strProducto = HOportunidadesConfigurarProductoHelper.selectProducto();
	String strPlan=HOportunidadesConfigurarProductoHelper.selectPlan(strProducto);
	String strPrimaFrecuencia = HOportunidadesConfigurarProductoHelper.primaFrecuencia();
	String strAniosGarantia = HOportunidadesConfigurarProductoHelper.primaFrecuenciaAniosG();
	static String strHoja="InformacionPersonal";
	String strLiquidacion="";
	String strIngreso="";
	
	public PageOportunidadesConfigurarProducto (WebDriver driver) {
		super(driver);
	}
	
	@Test
	public void informacionPersonal() 
	{
		HOportunidadesConfigurarProductoHelper.readExcelForOportunityProductConfiguration(strHoja);
		iPBaseEn();
		iPIgualAlAsegurado();
		iPRegion();
		iPPostal();
		iPSexo();
		iPFumas();
		iPPreferente();
		iPIngresosAnual();
		iPTrabajadorInd();
//		iPconyuge();
		iPsiguiente();
	}	
	
	public void selecProducto()
	{
		selectProd();
	}
	
	public void selecPlan()
	{	
		selectPlan();	
		planSig();
		continuar();		
	}
	
	
	
	

	
	
	
	/*******************************************Private Actions******************************/
	/************Informacion Personal*************/
	private void iPBaseEn()
	{		
		HCommonHelper.waiter("low");
		refreshPage();
		HCommonHelper.waiter("medium");
		swithToFrame(frame);
		if (strBaseEn.equals("PRODUCTO"))
		{
			click(btnBaseEnProd);
		}else
		{
			click(btnBaseEnNed);
		}		
	}	
	private void iPIgualAlAsegurado()
	{
		if (strIgualAsegurado.equals("NO"))		
			{
				click(chbxIgualAsegurado);
			}
	}
	private void iPRegion()
	{	
		//click(btnStates);
		sendKeys(btnStates,strState);
	}		
	private void iPPostal() 
	{
		txtZipCode.clear();
		sendKeys(txtZipCode,strZipCode);
	}		
	private void iPSexo() 
	{
		if (strSexo.equals("MASCULINO"))
		{
			click(radioSexMasculino);
		}
		else
		{
			click(radioSexFemenino);
		}
	}		
	private void iPFumas()
	{
		if (strFumas.equals("SI"))
		{
			click(radioSmokSi);
		}else
		{
			click(radioSmokNo);
		}
	}	
	private void iPPreferente()
	{
		if (strPreferente.equals("SI"))
		{
			click(radioPrefSi);
		}else
		{
			click(radioPrefNo);
		}
	}	
	private void iPIngresosAnual()
	{		
		txtIngreso.clear();		
		sendKeys(txtIngreso,strIngresoAnual);
	}	
	private void iPTrabajadorInd()
	{
		if (strTrabajadorInd.equals("SI"))
		{
			click(chbxTrabInd);
		}		
	}	
/*	private void iPConyuge()
	{
		if (HCommonHelper.baseEn() == 0)
		{
			click(imgConyuge);
			informacionConyuge();
		}else
		{
			click(imgConyuge);
			informacionConyuge();
		}		
	}*/
/*	private void iPConyNombre()
	{
		sendKeys(txtConyNombre, "Abraham");
	}*/
	private void iPsiguiente()
	{
		click(btnSiguiente);
	}
	
	/************Seleccionar producto y Plan*************/
	
	private void selectProd()
	{
		switch(strProducto)
		{
			case "ALFA MEDICAL":
				click(btnAlfaMedical);
				break;	
			case "ALFA MEDICAL FLEX":
				click(btnAlfaMedicalFlex);
				break;
			case "IMAGINA SER":
				click(btnImaginaSer);
				break;
			case "NUEVO PLENITUD":
				click(btnNuevoPlenitud);
				break;
			case "ORVI 99":
				click(btnOrvi99);
				break;
			case "REALIZA":
				click(btnRealiza);
				break;
			case "STAR DOTAL":
				click(btnStarDotal);
				break;
			case "STAR TEMPORAL":
				click(btnStarTemporal);
				break;
		}	
		HCommonHelper.waiter("low");
		click(btnProdSig);
	}	
	private void selectPlan() 
	{
		switch (strProducto)
		{
			case "ALFA MEDICAL":
				alfaMedical();
				break;
			case "ALFA MEDICAL FLEX":
				alfaMedicalFlex();
				break;
			case "IMAGINA SER":
				imaginaSerPlan();
				break;
			case "NUEVO PLENITUD":
				nuevoPlenitudPlan();
				break;
			case "ORVI 99":
				orvi99();
				break;
			case "REALIZA":
				realiza();
				break;
			case "STAR DOTAL":
				starDotal();
				break;
			case "STAR TEMPORAL":
				starTemporal();
				break;			
		}		
	}	
	
	/************Productos*************/
	private void starTemporal()
	{
		HCommonHelper.waiter("medium");
		switch (strPlan)
		{
		case "DOLARST65":
			click(btnDOLARST65);
			break;
		case "DOLARST1":
			click(btnDOLARST1R);
			break;
		case "DOLARST10":
			click(btnDOLARST10);
			break;
		case "UDIST10":
			click(btnUDIST10);
			break;
		case "UDIST20":
			click(btnUDIST20);
			break;
		case "DOLARST20":
			click(btnDOLARST20);
			break;
		case "DOLARST5R":
			click(btnDOLARST5);
			break;
		}
	}	
	private void starDotal()
	{
		HCommonHelper.waiter("medium");
		switch (strPlan)
		{
		case "DOLARSD10":
			click(btnDOLARSD10);
			break;
		case "UDISD10":
			click(btnUDISD10);
			break;
		case "DOLARSD15":
			click(btnDOLARSD15);
			break;
		case "DOLARSD20":
			click(btnDOLARSD20);
			break;
		case "UDISD20":
			click(btnUDISD20);
			break;
		case "DOLARSD5":
			click(btnDOLARSD5);
			break;
		}		
	}	
	private void realiza()
	{
		HCommonHelper.waiter("medium");
		switch (strPlan)
		{
		case "UDIREALIZA":
			click(btnUDIREALIZA);
			break;
		case  "DOLARREALIZA":
			click(btnDOLARREALIZA);	
			break;
		}
	}	
	private void orvi99()
	{
		HCommonHelper.waiter("medium");
		switch (strPlan)
		{
		case	"DOLARORV60":
			click(btnDOLARORV60);
				break;
		case	"UDIORVTP":
			click(btnUDIORVTP);
				break;
		case	"DOLAORVTP":
			click(btnDOLARORVTP);
				break;
		case	"UDIORVTPM":
			click(btnUDITPM);
				break;
		case	"DOLARORVTPM":
			click(btnDOLARTPM);
				break;
		case	"DOLARORV1P":
			click(btnDOLARORV1);
				break;
		case	"UDIORV10P":
			click(btnUDIORV10P);
				break;
		case	"DOLARORV10P":
			click(btnDOLARORV10P);
				break;
		case	"DOLARORV15P":
			click(btnDOLARORV15P);
				break;
		case	"UDIORV20P":
			click(btnUDIORV20P);
				break;
		case	"DOLARORV20P":
			click(btnDOLARORV20P);
				break;
		case	"DOLARORV20PM":
			click(btnDOLARORV20PM);
				break;
		case	"DOLARORV6P":
			click(btnDOLARORV6P);
				break;
		}
	}	
	private void nuevoPlenitudPlan()
	{
		HCommonHelper.waiter("medium");
		switch (strPlan)
		{
		case	"UDINP55P15":
			click(btnUDINP55P15);
				break;
		case	"UDINP55PN":
			click(btnUDINP55PN);
				break;
		case	"DOLARNP55PN":
			click(btnDOLARNP55PN);
				break;
		case	"UDINP60P15":
			click(btnUDINP60P15);
				break;
		case	"UDINP60PN":
			click(btnUDINP60PN);
				break;
		case	"DOLARNP60PN":
			click(btnDOLARNP60PN);
				break;
		case	"UDINP65P15":
			click(btnUDINP65P15);
				break;
		case	"UDINP65PN":
			click(btnUDINP65PN);
				break;
		case	"DOLARNP65PN":
			click(btnDOLARNP65PN);
				break;
		}
	}
	private void imaginaSerPlan()
	{		
		HCommonHelper.waiter("medium");
		switch (strPlan)
		{   
		case	"DOLARIS55PU":
			click(btnDolar55PU);
				break;
		case 	"UDIIS55PU":
			click(btnUDI55PU);
				break;
		case 	"UDIIS55PN":
			click(btnUDI55PN);
				break;
		case 	"DOLARIS55PN":
			click(btnDolar55PN);
				break;
		case 	"DOLARIS60PU":
			click(btnDolar60PU);
				break;
		case 	"UDIIS60PU":
			click(btnUDI60PU);
				break;
		case 	"UDIIS60PN":
			click(btnUDI60PN);
				break;
		case 	 "DOLARIS60PN":
			click(btnDolar60PN);
				break;
		case 	"DOLARIS65PU":
			click(btnDolar65PU);
				break;
		case 	"UDIIS65PN":
			click(btnUDI65PN);
				break;
		case 	"DOLARIS65PN":
			click(btnDolar65PN);
				break;
		case 	"DOLARIS70PU":
			click(btnDolar70PU);
				break;
		case 	 "UDIIS70PU":
			click(btnUDI70PU);
				break;
		case 	"UDIIS70PN":
			click(btnUDI70PN);
				break;
		case 	"DOLARIS70PN":
			click(btnDolar70PN);
				break;
		case 	"UDIIS65PU":
			click(btnUDI65PU);
				break;
		}
	}
	private void alfaMedicalFlex() 
	{
		HCommonHelper.waiter("medium");		
		switch (strPlan) 
		{
			case "PESO AMFLEXA":
				click(btnPesoFlexA);
				break;
			case "PESO AMFLEXB":
				click(btnPesoFlexB);
				break;
		}		
	}	
	private void alfaMedical()
	{
		/*int selector=HCommonHelper.getRandomNumberInRange(0, 2);
				
		if(selector==0)
		{
			click(chbxPeso);
		}else
		{  */
			HCommonHelper.waiter("medium");
			switch (strPlan) 
			{
				case "PESO INTEGRO":
					click(btnPlanIntegro);
					break;
				case "PESO PLENO":
					click(btnPlanPleno);
					break;
				case "PESO PRACTICO":
					click(btnPlanPractico);
					break;
			} 				
	//	}		
	}
	
	
	
	
	
	private void planSig()
	{
		HCommonHelper.waiter("medium");
		click(btnPlanSig);		
	}
	private void plansig1()
	{
		HCommonHelper.waiter("medium");
		click(btnPlanSig1);
	}
	
	/************Configuracion de Plan*************/
	private void dedu()
	{
		/*if((HCommonHelper.getRandomNumberInRange(0, 1))==0)
		{
			click(chbxDeducible);
		}*/
		click(btnDeducibleSig);
	}
	
	private void liq() 
	{
		int selector= HCommonHelper.getRandomNumberInRange(0, 2);
		
		switch (selector) {

		case 0:
		sendKeys(listLiquidacion, "Pago Único");
        break;

        case 1:
        sendKeys(listLiquidacion, "Ingreso vitalicio mensual heredable");
        strLiquidacion = "Ingreso vitalicio mensual heredable";
        perIngrMen();
        break;

        case 2:
        sendKeys(listLiquidacion, "Ingreso vitalicio mensual no heredable");
        break;
		}
		//click();
		
	}	
	private void perIngrMen()
	{
		int selector= HCommonHelper.getRandomNumberInRange(0, 2);
		
		switch (selector) {

		case 0:
		sendKeys(listTipoIngreso, "Período de Garantía");
		strIngreso = "Período de Garantía";
		garantia();
        break;

        case 1:
        sendKeys(listTipoIngreso, "Compartida");
        strIngreso = "Compartida";
        compartida();
        break;
        
        default :
        	sendKeys(listTipoIngreso, "Compartida");
        	 strIngreso = "Compartida";
             compartida();
             break;
		}		
	}	
	private void compartida()
	{
		sendKeys(txtCobeneficiario,"Fulanito");
	}	
	private void garantia()
	{		
			sendKeys(listAniosGarantia, strAniosGarantia);
	}	
	private void liqSig()
	{
		click(btnSigLiq);
	}	
	private void personaSelect()
	{
		HCommonHelper.waiter("medium");
		if((strProducto.equals("ORVI 99")) || (strProducto.equals("STAR DOTAL")) || (strProducto.equals("STAR TEMPORAL")))
		{
			click(chbxSeleAseOrvi);
		}
		else
		{
			click(chbxSeleAse);	
		}		
	}	
	private void personaOcupacion()
	{
		sendKeys(txtOcupacionOrvi,"ALBAÑIL");
	}	
	private void personaSig()
	{
		if((strProducto.equals("ORVI 99")) || (strProducto.equals("STAR DOTAL")) || (strProducto.equals("STAR TEMPORAL")))
		{
			click(btnPersonaSigOrvi);
		}
		else
		{
			click(btnPersonaSig);
		}			
	}
	private void infoSig()
	{
		click(btnInfoSig);
	}
	private void configSig()
	{
		if(strProducto.equals("ORVI 99")|| (strProducto.equals("REALIZA")) || (strProducto.equals("STAR DOTAL")) || (strProducto.equals("STAR TEMPORAL")))
		{
			click(btnConfigSigOrvi);
		}
		else
		{
			click(btnConfigSig);
		}		
	}
	
	private void primaFrec()
	{
		if((strProducto.equals("NUEVO PLENITUD")) || (strProducto.equals("ORVI 99")) || (strProducto.equals("REALIZA")) || (strProducto.equals("STAR DOTAL")) || (strProducto.equals("STAR TEMPORAL"))) 
		{
			sendKeys(listFrecuenciaLife, strPrimaFrecuencia); 
		}
		else
		{
			sendKeys(listFrecuencia, strPrimaFrecuencia); 
		}	
	}
	
	
	
	private void primaSig()
	{
		if (strPlan.equals("IMAGINA SER"))
		{
			click(btnPrimaSig1);
		}else if((strProducto.equals("NUEVO PLENITUD")) || (strProducto.equals("ORVI 99")) || (strProducto.equals("REALIZA")) || (strProducto.equals("STAR DOTAL")) || (strProducto.equals("STAR TEMPORAL")))
		{
			click(btnPrimaSigLife);
		}
		else
		{
			click(btnPrimaSig);
		}			
	}
	
	private void continuar()
	{
		switch (strProducto)
		{
		case "ALFA MEDICAL":
			personaSelect();	
			personaSig();
			configSig();
			primaFrec();
			primaSig();
			break;
		case "ALFA MEDICAL FLEX":
			personaSelect();	
			personaSig();
			configSig();
			primaFrec();
			primaSig();
			break;
		case "IMAGINA SER":
			plansig1();
			dedu();
			liq();
			liqSig();
			primaSig();
			break;
		case "NUEVO PLENITUD":
			plansig1();
			dedu();
			//infoSig();
			primaFrec();
			primaSig();
			break;
		case "ORVI 99":
			personaSelect(); 
			//personaOcupacion();
			personaSig();
			configSig();			
			primaFrec();
			primaSig();
		case "REALIZA":			
			configSig();			
			primaFrec();
			primaSig();			
			break;
		case "STAR DOTAL":	
			personaSelect(); 
			//personaOcupacion();
			personaSig();
			configSig();			
			primaFrec();
			primaSig();			
			break;
		case "STAR TEMPORAL":	
			personaSelect(); 
			//personaOcupacion();
			personaSig();
			configSig();			
			primaFrec();
			primaSig();			
			break;
		}
	}
}
