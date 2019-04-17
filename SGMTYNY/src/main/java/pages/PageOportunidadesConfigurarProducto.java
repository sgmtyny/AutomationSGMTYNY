package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

import helpers.HCommonHelper;
import helpers.HConfigrarProductoHelper;

public class PageOportunidadesConfigurarProducto extends BasePage{
	
/*****Informacion Personal******/
	@FindBy(xpath = "//iframe[@title = 'accessibility title']")
	WebElement frame;
	
	@FindBy(xpath = "//*[text() = 'Necesidad']")
	WebElement btnBaseEn;
	
	@FindBy(xpath = "//*[text() = 'Producto']")
	WebElement btnBaseEn1;
	
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
			
			@FindBy(xpath= "//*[@id=\"ConfigureCoveragesLife_nextBtn\"]/p	")
			WebElement btnPlanSig1;
			
			@FindBy(xpath= "//*[@id=\"a2n0R000000XYm0QAG-46\"]/div[1]/div/child[1]/div/ng-form/div/label/span")
			WebElement chbxDeducible;
			
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

	/*****Configuracion******/
	@FindBy(xpath= "//*[@id=\"ConfigureCoverages_nextBtn\"]/p")
	WebElement btnConfigSig;
	
	/*****Prima total******/
	@FindBy(xpath= "//*[@id=\"PaymentFrequency\"]")
	WebElement listFrecuencia;
	
	@FindBy(xpath= "//*[@id=\"FinalPremiumCalculation_nextBtn\"]/p")	
	WebElement btnPrimaSig;
	
	@FindBy(xpath= "//*[@id=\"FinalPremiumCalculationLife_nextBtn\"]/p")	
	WebElement btnPrimaSig1;
	
	
	
	/*****Informacion Personal******/
	//Xpath=//*[@id='java_technologies']/child::li[1]
	//"//div[@class = 'modal-footer slds-modal__footer']/descendant::span[contains(text(),'Guardar')]"
	@FindBy(xpath="//div[@class = 'slds-modal__content slds-p-around--medium vloc-modal-content slds-is-relative']/descendant::span=contains(text(),'Nombre'" )	
	WebElement txtConyNombre;
	
	@FindBy(xpath="//*[@id=\"GetCustomerInfo_nextBtn\"]/p")
	WebElement btnSiguiente;
	
	String strProducto = HConfigrarProductoHelper.selectProducto();
	String strPlan=HConfigrarProductoHelper.selectPlan(strProducto);
	String strLiquidacion="";
	String strIngreso="";
	
	
	public PageOportunidadesConfigurarProducto (WebDriver driver) {
		super(driver);
	}
	
	@Test
	public void informacionPersonal() 
	{
		baseEn();
		region();
		//postal();
		fumas();
		pref();
		ingre();
		trabInd();
	//	conyuge();
		siguiente();
	}	
	
	public void selecProducto()
	{
		seleProd();
	}
	
	public void selecPlan()
	{	
		selePlan();	
		planSig();
		switch (strProducto)
		{
		case "AlfaMedical":
			continuar1();
			break;
		case "AlfaMedicalFlex":
			continuar1();
			break;
		case "ImaginaSer":
			continuar2();
			break;
		}
		
		
	}
	
	
	
	////////////////////////////////////////////////*******************************/////////////////////////
	public void continuar1() 
	{
		personaSelect();	
		personaSig();
		configSig();
		primaFrec();
		primaSig();
		//conyNombre();
	}
	
	public void continuar2() 
	{
		plansig1();
		dedu();
		liq();
		liqSig();
		primaSig();
	}
	
	
	
	/*******************************************Private Actions******************************/
	
	private void baseEn()
	{
		HCommonHelper.waiter("low");
		refreshPage();
		HCommonHelper.waiter("medium");
		swithToFrame(frame);
		if (HCommonHelper.baseEn() == 0)
		{
			click(btnBaseEn1);
		}else
		{
			click(btnBaseEn);
		}
		
	}
	
	private void region()
	{
		String strState=HCommonHelper.mexicosStates();
		sendKeys(btnStates,strState);
	}
	
	private void postal() 
	{
		String strZipCode=HCommonHelper.postalCode();
		sendKeys(txtZipCode,strZipCode);
	}
	
	private void fumas()
	{
		if (HCommonHelper.baseEn() == 0)
		{
			click(radioSmokSi);
		}else
		{
			click(radioSmokNo);
		}
	}
	
	private void pref()
	{
		if (HCommonHelper.baseEn() == 0)
		{
			click(radioPrefSi);
		}else
		{
			click(radioPrefNo);
		}
	}
	
	private void ingre()
	{
		txtIngreso.clear();		
		sendKeys(txtIngreso,String.valueOf(HCommonHelper.getRandomNumberInRange(11000000, 60000000)));
	}
	
	private void trabInd()
	{
		if (HCommonHelper.baseEn() == 0)
		{
			click(chbxTrabInd);
		}		
	}
	
/*	private void conyuge()
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
	
	private void conyNombre()
	{
		sendKeys(txtConyNombre, "Abraham");
	}
	
	private void siguiente()
	{
		click(btnSiguiente);
	}
	
	private void seleProd()
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
		}	
		click(btnProdSig);
	}
	
	
	
	private void selePlan() 
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
				imaginaSer();
				break;
		}		
	}
	
	private void imaginaSer()
	{
		HCommonHelper.waiter("medium");
		switch (HCommonHelper.getRandomNumberInRange(0, 15))
		{
		case	0:
			click(btnDolar55PU);
				break;
		case 	1:
			click(btnUDI55PU);
				break;
		case 	2:
			click(btnUDI55PN);
				break;
		case 	3:
			click(btnDolar55PN);
				break;
		case 	4:
			click(btnDolar60PU);
				break;
		case 	5:
			click(btnUDI60PU);
				break;
		case 	6:
			click(btnUDI60PN);
				break;
		case 	7:
			click(btnDolar60PN);
				break;
		case 	8:
			click(btnDolar65PU);
				break;
		case 	9:
			click(btnUDI65PN);
				break;
		case 	10:
			click(btnDolar65PN);
				break;
		case 	11:
			click(btnDolar70PU);
				break;
		case 	12:
			click(btnUDI70PU);
				break;
		case 	13:
			click(btnUDI70PN);
				break;
		case 	14:
			click(btnDolar70PN);
				break;
		case 	15:
			click(btnUDI65PU);
				break;
		}
	}
	private void alfaMedicalFlex() 
	{
		HCommonHelper.waiter("medium");
		if((HCommonHelper.getRandomNumberInRange(0, 1))==0)
		{
			click(btnPesoFlexA);
		}
		else
		{
			click(btnPesoFlexB);
		}	
	}	
	private void alfaMedical()
	{
		int selector= HCommonHelper.getRandomNumberInRange(0, 2);
		strPlan="";
		
		if(selector==0)
		{
			click(chbxPeso);
		}else
		{
			HCommonHelper.waiter("medium");
			//switch 
			if((HCommonHelper.getRandomNumberInRange(0, 2))==0)
			{
				click(btnPlanIntegro);
			}
			else if((HCommonHelper.getRandomNumberInRange(0, 2))==1)
			{
				click(btnPlanPleno);
			}
			else
			{
				click(btnPlanPractico);
			}	
		}		
	}
	
	private void planSig()
	{
		HCommonHelper.waiter("medium");
		click(btnPlanSig);
		
	}
	
	private void plansig1()
	{
		click(btnPlanSig1);
	}
	
	private void dedu()
	{
		if((HCommonHelper.getRandomNumberInRange(0, 1))==0)
		{
			click(chbxDeducible);
		}
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
		int selector= HCommonHelper.getRandomNumberInRange(0, 5);
		
		switch (selector) {

		case 0:
			sendKeys(listAniosGarantia, "10");
		break;

        case 1:
        	sendKeys(listAniosGarantia, "15");      
		break;
		
        case 2:
            sendKeys(listAniosGarantia, "20");      
    		break;
        case 3:
            sendKeys(listAniosGarantia, "25");      
    		break;
        case 4:
            sendKeys(listAniosGarantia, "30");      
    		break;
		}
	}
	
	private void liqSig()
	{
		click(btnSigLiq);
	}
	
	private void personaSelect()
	{
		click(chbxSeleAse);
	}
	
	private void personaSig()
	{
		click(btnPersonaSig);
	}
	
	private void configSig()
	{
		click(btnConfigSig);
	}
	
	private void primaFrec()
	{
		int selector= HCommonHelper.getRandomNumberInRange(0, 3);
		
		switch (selector) {

		case 0:
		sendKeys(listFrecuencia, "Anual");
        break;

        case 1:
        sendKeys(listFrecuencia, "Semestral");
        break;

        case 2:
        sendKeys(listFrecuencia, "Trimestral");
        break;
        
        case 3:
        sendKeys(listFrecuencia, "Mensual");
        break;
        
        default:
        sendKeys(listFrecuencia, "Anual");
        break;
        
		}		
	}
	
	private void primaSig()
	{
		if (strPlan.equals("ImaginaSer"))
		{
			click(btnPrimaSig1);
		}
		else
		{
			click(btnPrimaSig);
		}	
		
	}
}
