package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

import helpers.HCommonHelper;

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
	
	@FindBy(xpath= "//*[@id=\"SelectProductFamily_nextBtn\"]/p")
	WebElement btnProdSig;
	
	/*****Seleccionar plan******/
	@FindBy(xpath= "//*[@id=\"PlanSelection\"]/div/ng-include/div/div/div/div/div[1]/div")
	WebElement btnPlanSelect;
	
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
	
	
	/*****Informacion Personal******/
	//Xpath=//*[@id='java_technologies']/child::li[1]
	//"//div[@class = 'modal-footer slds-modal__footer']/descendant::span[contains(text(),'Guardar')]"
	@FindBy(xpath="//div[@class = 'slds-modal__content slds-p-around--medium vloc-modal-content slds-is-relative']/descendant::span=contains(text(),'Nombre'" )	
	WebElement txtConyNombre;
	
	@FindBy(xpath="//*[@id=\"GetCustomerInfo_nextBtn\"]/p")
	WebElement btnSiguiente;
	
	
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
		sigProd();
	}
	
	public void selecPlan()
	{
		planSelect();
		planSig();
	}
	
	public void selecPersona()
	{
		personaSelect();	
		personaSig();
	}
	
	public void configuracion()
	{
		configSig();
	}
	
	public void prima()
	{
		primaFrec();
		primaSig();
	}
	
	public void informacionConyuge()
	{
		conyNombre();
	}
	
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
	
	private void conyuge()
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
	}
	
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
		click(btnAlfaMedical);
	}
	
	private void sigProd()
	{
		click(btnProdSig);
	}

	private void planSelect()
	{
		HCommonHelper.waiter("medium");
		click(btnPlanSelect);
	}
	
	private void planSig()
	{
		click(btnPlanSig);
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
		click(btnPrimaSig);
	}
}
