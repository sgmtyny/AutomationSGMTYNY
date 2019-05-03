package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helpers.HCommonHelper;
import helpers.HOportunidadesSolicitudHelper;

public class PageOportunidadesSolicitudCuestionarioMedico extends BasePage {
	
	@FindBy(xpath = "//iframe[@title = 'accessibility title']")
	WebElement frame;	
	
	@FindBy(xpath ="//*[@id=\"SC10Question1Applicable|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radio1CorazonCirculacionN;
	@FindBy(xpath ="//*[@id=\"SC10Question1Applicable|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radio1CorazonCirculacionY;
		@FindBy(xpath ="//*[@id=\"SC10Question1Figure\"]")
		WebElement txtA1NoFigura;
		@FindBy(xpath ="//*[@id=\"SC10Question1ActualStatus\"]")
		WebElement txtA1EdoActual;
		@FindBy(xpath ="//*[@id=\"SC10Question1StartDate\"]")
		WebElement txtA1FechaInicio;
		@FindBy(xpath ="//*[@id=\"SC10Question1Details\"]")
		WebElement txtA1Detalles;
		
	@FindBy(xpath ="//*[@id=\"SC10Question2Applicable|0\"]/div/div[1]/label[2]/span[1]")
	WebElement radio2AparatoRespiratorioN;
	@FindBy(xpath ="//*[@id=\"SC10Question2Applicable|0\"]/div/div[1]/label[1]/span[1]")
	WebElement radio2AparatoRespiratorioY;
		@FindBy(xpath ="//*[@id=\"SC10Question2Figure\"]")
		WebElement txtA2NoFigura;
		@FindBy(xpath ="//*[@id=\"SC10Question2ActualStatus\"]")
		WebElement txtA2EdoActual;
		@FindBy(xpath ="//*[@id=\"SC10Question2StartDate\"]")
		WebElement txtA2FechaInicio;
		@FindBy(xpath ="//*[@id=\"SC10Question2Details\"]")
		WebElement txtA2Detalles;
		@FindBy(xpath ="//*[@id=\"SC10Question2\"]/div/div/div[2]/child[7]/div/ng-form/div/label/span")
		WebElement radio2Asma;
			@FindBy(xpath ="//*[@id=\"SC10Question2AsthmaAttackDate\"]")
			WebElement txtPrimerCrisisAsma;
			@FindBy(xpath ="//*[@id=\"SC10Question2AsthmaFrequency\"]")
			WebElement txtPromedioCrisisAsma;
			@FindBy(xpath ="//*[@id=\"SC10Question2AsthmaDuration\"]")
			WebElement txtDuracionCrisisAsms;
			@FindBy(xpath ="//*[@id=\"SC10Question2AsthmaLastAttackDate\"]")
			WebElement txtUltimaCrisisAsma;
			@FindBy(xpath ="//*[@id=\"SC10Question2FrequencyLastYear\"]")
			WebElement txtCrisisUltimoAnio;
			@FindBy(xpath ="//*[@id=\"SC10Question2Treatment\"]")
			WebElement txtTratamientoAsma;
			@FindBy(xpath ="//*[@id=\"SC10Question2TreatmentTime|0\"]/div/div[1]/label[1]/span[1]")
			WebElement radioTratamientoSemanasY;
			@FindBy(xpath ="//*[@id=\"SC10Question2TreatmentTime|0\"]/div/div[1]/label[2]/span[1]")
			WebElement radioTratamientoSemanasN;
			@FindBy(xpath ="//*[@id=\"SC10Question2TreatmentDetail\"]")
			WebElement txtTipoTratamientoAsma;
			@FindBy(xpath ="//*[@id=\"SC10Question2Hospitlization|0\"]/div/div[1]/label[1]/span[1]")
			WebElement radioHospitalizadoY;
			@FindBy(xpath ="//*[@id=\"SC10Question2Hospitlization|0\"]/div/div[1]/label[2]/span[1]")
			WebElement radioHospitalizadoN;
			@FindBy(xpath ="//*[@id=\"SC10Question2Date\"]")
			WebElement txtFechaHospitalizacion;
			@FindBy(xpath ="//*[@id=\"SC10Question2Time\"]")
			WebElement txtTiempoHospitalizacion;
			@FindBy(xpath ="//*[@id=\"SC10Question2OtherDetails\"]")
			WebElement txtInformacionExtra;
		
		@FindBy(xpath ="//*[@id=\"SC10Question3Applicable|0\"]/div/div[1]/label[2]/span[1]")
		WebElement radio3DigestivoN;
		@FindBy(xpath ="//*[@id=\"SC10Question3Applicable|0\"]/div/div[1]/label[1]/span[1]")
		WebElement radio3DigestivoY;
			@FindBy(xpath ="//*[@id=\"SC10Question3Figure\"]")
			WebElement txtA3NoFigura;
			@FindBy(xpath ="//*[@id=\"SC10Question3ActualStatus\"]")
			WebElement txtA3EdoActual;
			@FindBy(xpath ="//*[@id=\"SC10Question3StartDate\"]")
			WebElement txtA3FechaInicio;
			@FindBy(xpath ="//*[@id=\"SC10Question3Details\"]")
			WebElement txtA3Detalles;
			
		@FindBy(xpath ="//*[@id=\"SC10Question4Applicable|0\"]/div/div[1]/label[2]/span[1]")
		WebElement radio4GeniturianoN;
		@FindBy(xpath ="//*[@id=\"SC10Question4Applicable|0\"]/div/div[1]/label[1]/span[1]")
		WebElement radio4GeniturianoY;
			@FindBy(xpath ="//*[@id=\"SC10Question4Figure\"]")
			WebElement txtA4NoFigura;
			@FindBy(xpath ="//*[@id=\"SC10Question4ActualStatus\"]")
			WebElement txtA4EdoActual;
			@FindBy(xpath ="//*[@id=\"SC10Question4StartDate\"]")
			WebElement txtA4FechaInicio;
			@FindBy(xpath ="//*[@id=\"SC10Question4Details\"]")
			WebElement txtA4Detalles;
			
		@FindBy(xpath ="//*[@id=\"SC10Question5Applicable|0\"]/div/div[1]/label[2]/span[1]")
		WebElement radio5EndocrinoN;
		@FindBy(xpath ="//*[@id=\"SC10Question5Applicable|0\"]/div/div[1]/label[1]/span[1]")
		WebElement radio5EndocrinoY;
			@FindBy(xpath ="//*[@id=\"SC10Question5Figure\"]")
			WebElement txtA5NoFigura;
			@FindBy(xpath ="//*[@id=\"SC10Question5ActualStatus\"]")
			WebElement txtA5EdoActual;
			@FindBy(xpath ="//*[@id=\"SC10Question5StartDate\"]")
			WebElement txtA5FechaInicio;
			@FindBy(xpath ="//*[@id=\"SC10Question5Details\"]")
			WebElement txtA5Detalles;

		@FindBy(xpath ="//*[@id=\"SC10Question6Applicable|0\"]/div/div[1]/label[2]/span[1]")
		WebElement radio6NerviosoN;
		@FindBy(xpath ="//*[@id=\"SC10Question6Applicable|0\"]/div/div[1]/label[1]/span[1]")
		WebElement radio6NerviosoY;
			@FindBy(xpath ="//*[@id=\"SC10Question6Figure\"]")
			WebElement txtA6NoFigura;
			@FindBy(xpath ="//*[@id=\"SC10Question6ActualStatus\"]")
			WebElement txtA6EdoActual;
			@FindBy(xpath ="//*[@id=\"SC10Question6StartDate\"]")
			WebElement txtA6FechaInicio;
			@FindBy(xpath ="//*[@id=\"SC10Question6Details\"]")
			WebElement txtA6Detalles;
			
		@FindBy(xpath ="//*[@id=\"SC10Question7Applicable|0\"]/div/div[1]/label[2]/span[1]")
		WebElement radio7EsqueleticoN;
		@FindBy(xpath ="//*[@id=\"SC10Question7Applicable|0\"]/div/div[1]/label[1]/span[1]")
		WebElement radio7EsqueleticoY;
			@FindBy(xpath ="//*[@id=\"SC10Question7Figure\"]")
			WebElement txtA7NoFigura;
			@FindBy(xpath ="//*[@id=\"SC10Question7ActualStatus\"]")
			WebElement txtA7EdoActual;
			@FindBy(xpath ="//*[@id=\"SC10Question7StartDate\"]")
			WebElement txtA7FechaInicio;
			@FindBy(xpath ="//*[@id=\"SC10Question7Details\"]")
			WebElement txtA7Detalles;
		@FindBy(xpath ="//*[@id=\"SC10Question8Applicable|0\"]/div/div[1]/label[2]/span[1]")
		WebElement radio8TumoresN;
		@FindBy(xpath ="//*[@id=\"SC10Question8Applicable|0\"]/div/div[1]/label[1]/span[1]")
		WebElement radio8TumoresY;
			@FindBy(xpath ="//*[@id=\"SC10Question8Figure\"]")
			WebElement txtA8NoFigura;
			@FindBy(xpath ="//*[@id=\"SC10Question8ActualStatus\"]")
			WebElement txtA8EdoActual;
			@FindBy(xpath ="//*[@id=\"SC10Question8StartDate\"]")
			WebElement txtA8FechaInicio;
			@FindBy(xpath ="//*[@id=\"SC10Question8Details\"]")
			WebElement txtA8Detalles;
		@FindBy(xpath ="//*[@id=\"SC10Question9Applicable|0\"]/div/div[1]/label[2]/span[1]")
		WebElement radio9Enfermedad8DiasN;
		@FindBy(xpath ="//*[@id=\"SC10Question9Applicable|0\"]/div/div[1]/label[1]/span[1]")
		WebElement radio9Enfermedad8DiasY;
			@FindBy(xpath ="//*[@id=\"SC10Question9Figure\"]")
			WebElement txtA9NoFigura;
			@FindBy(xpath ="//*[@id=\"SC10Question9ActualStatus\"]")
			WebElement txtA9EdoActual;
			@FindBy(xpath ="//*[@id=\"SC10Question9StartDate\"]")
			WebElement txtA9FechaInicio;
			@FindBy(xpath ="//*[@id=\"SC10Question9Details\"]")
			WebElement txtA9Detalles;
			
		@FindBy(xpath ="//*[@id=\"SC10Question11Applicable|0\"]/div/div[1]/label[2]/span[1]")
		WebElement radioDefVisualAuditivoN;
		@FindBy(xpath ="//*[@id=\"SC10Question11Applicable|0\"]/div/div[1]/label[1]/span[1]")
		WebElement radioDefVisualAuditivoY;
			@FindBy(xpath ="//*[@id=\"SC10Question11Figure\"]")
			WebElement txtB1NoFigura;
			@FindBy(xpath ="//*[@id=\"SC10Question11ActualStatus\"]")
			WebElement txtB1EdoActual;
			@FindBy(xpath ="//*[@id=\"SC10Question11StartDate\"]")
			WebElement txtB1FechaInicio;
			@FindBy(xpath ="//*[@id=\"SC10Question11Details\"]")
			WebElement txtB1Detalles;
		@FindBy(xpath ="//*[@id=\"SC10Question12Applicable|0\"]/div/div[1]/label[2]/span[1]")
		WebElement radioCHospitalizadoN;
		@FindBy(xpath ="//*[@id=\"SC10Question12Applicable|0\"]/div/div[1]/label[1]/span[1]")
		WebElement radioCHospitalizadoY;
			@FindBy(xpath ="//*[@id=\"SC10Question12Figure\"]")
			WebElement txtC1NoFigura;
			@FindBy(xpath ="//*[@id=\"SC10Question12ActualStatus\"]")
			WebElement txtC1EdoActual;
			@FindBy(xpath ="//*[@id=\"SC10Question12StartDate\"]")
			WebElement txtC1FechaInicio;
			@FindBy(xpath ="//*[@id=\"SC10Question12Details\"]")
			WebElement txtC1Detalles;
	
		@FindBy(xpath ="//*[@id=\"SC10Question13Applicable|0\"]/div/div[1]/label[2]/span[1]")
		WebElement radioDAfeccionN;
		@FindBy(xpath ="//*[@id=\"SC10Question13Applicable|0\"]/div/div[1]/label[1]/span[1]")
		WebElement radioDAfeccionY;
			@FindBy(xpath ="//*[@id=\"SC10Question13Figure\"]")
			WebElement txtD1NoFigura;
			@FindBy(xpath ="//*[@id=\"SC10Question13ActualStatus\"]")
			WebElement txtD1EdoActual;
			@FindBy(xpath ="//*[@id=\"SC10Question13StartDate\"]")
			WebElement txtD1FechaInicio;
			@FindBy(xpath ="//*[@id=\"SC10Question13Details\"]")
			WebElement txtD1Detalles;		
			
		@FindBy(xpath ="//*[@id=\"SC10Question14Applicable|0\"]/div/div[1]/label[2]/span[1]")
		WebElement radioDTratamientoN;
		@FindBy(xpath ="//*[@id=\"SC10Question14Applicable|0\"]/div/div[1]/label[1]/span[1]")
		WebElement radioDTratamientoY;
			@FindBy(xpath ="//*[@id=\"SC10Question14Figure\"]")
			WebElement txtD2NoFigura;
			@FindBy(xpath ="//*[@id=\"SC10Question14ActualStatus\"]")
			WebElement txtD2EdoActual;
			@FindBy(xpath ="//*[@id=\"SC10Question14StartDate\"]")
			WebElement txtD2FechaInicio;
			@FindBy(xpath ="//*[@id=\"SC10Question14Details\"]")
			WebElement txtD2Detalles;

		@FindBy(xpath ="//*[@id=\"SC10Question15Applicable|0\"]/div/div[1]/label[2]/span[1]")
		WebElement radioDSIDAN;
		@FindBy(xpath ="//*[@id=\"SC10Question15Applicable|0\"]/div/div[1]/label[1]/span[1]")
		WebElement radioDSIDAY;
			@FindBy(xpath ="//*[@id=\"SC10Question15Figure\"]")
			WebElement txtD3NoFigura;
			@FindBy(xpath ="//*[@id=\"SC10Question15ActualStatus\"]")
			WebElement txtD3EdoActual;
			@FindBy(xpath ="//*[@id=\"SC10Question15StartDate\"]")
			WebElement txtD3FechaInicio;
			@FindBy(xpath ="//*[@id=\"SC10Question15Details\"]")
			WebElement txtD3Detalles;
				
		@FindBy(xpath ="//*[@id=\"SC10Question16Applicable|0\"]/div/div[1]/label[2]/span[1]")
		WebElement radioDIntervencionQN;
		@FindBy(xpath ="//*[@id=\"SC10Question16Applicable|0\"]/div/div[1]/label[1]/span[1]")
		WebElement radioDIntervencionQY;
			@FindBy(xpath ="//*[@id=\"SC10Question16Figure\"]")
			WebElement txtD4NoFigura;
			@FindBy(xpath ="//*[@id=\"SC10Question16ActualStatus\"]")
			WebElement txtD4EdoActual;
			@FindBy(xpath ="//*[@id=\"SC10Question16StartDate\"]")
			WebElement txtD4FechaInicio;
			@FindBy(xpath ="//*[@id=\"SC10Question16Details\"]")
			WebElement txtD4Detalles;
					
		@FindBy(xpath ="//*[@id=\"SC10Question17Applicable|0\"]/div/div[1]/label[2]/span[1]")
		WebElement radioDPIntervencionQN;
		@FindBy(xpath ="//*[@id=\"SC10Question17Applicable|0\"]/div/div[1]/label[1]/span[1]")
		WebElement radioDPIntervencionQY;
			@FindBy(xpath ="//*[@id=\"SC10Question17Figure\"]")
			WebElement txtD5NoFigura;
			@FindBy(xpath ="//*[@id=\"SC10Question17ActualStatus\"]")
			WebElement txtD5EdoActual;
			@FindBy(xpath ="//*[@id=\"SC10Question17StartDate\"]")
			WebElement txtD5FechaInicio;
			@FindBy(xpath ="//*[@id=\"SC10Question17Details\"]")
			WebElement txtD5Detalles;
			
		@FindBy(xpath ="//*[@id=\"SC10Question18Applicable|0\"]/div/div[1]/label[2]/span[1]")
		WebElement radioEDeformidadN;
		@FindBy(xpath ="//*[@id=\"SC10Question18Applicable|0\"]/div/div[1]/label[1]/span[1]")
		WebElement radioEDeformidadY;
			@FindBy(xpath ="//*[@id=\"SC10Question18Figure\"]")
			WebElement txtE1NoFigura;
			@FindBy(xpath ="//*[@id=\"SC10Question18ActualStatus\"]")
			WebElement txtE1EdoActual;
			@FindBy(xpath ="//*[@id=\"SC10Question18StartDate\"]")
			WebElement txtE1FechaInicio;
			@FindBy(xpath ="//*[@id=\"SC10Question18Details\"]")
			WebElement txtE1Detalles;			

		@FindBy(xpath ="//*[@id=\"SC10Question19Applicable|0\"]/div/div[1]/label[2]/span[1]")
		WebElement radioFElectrocardiogramasN;
		@FindBy(xpath ="//*[@id=\"SC10Question19Applicable|0\"]/div/div[1]/label[1]/span[1]")
		WebElement radioFElectrocardiogramasY;
			@FindBy(xpath ="//*[@id=\"SC10Question19Figure\"]")
			WebElement txtF1NoFigura;
			@FindBy(xpath ="//*[@id=\"SC10Question19ActualStatus\"]")
			WebElement txtF1EdoActual;
			@FindBy(xpath ="//*[@id=\"SC10Question19StartDate\"]")
			WebElement txtF1FechaInicio;
			@FindBy(xpath ="//*[@id=\"SC10Question19Details\"]")
			WebElement txtF1Detalles;
				
		@FindBy(xpath ="//*[@id=\"SC10Question20Applicable|0\"]/div/div[1]/label[2]/span[1]")
		WebElement radioFPruebasLaboratorioN;
		@FindBy(xpath ="//*[@id=\"SC10Question20Applicable|0\"]/div/div[1]/label[1]/span[1]")
		WebElement radioFPruebasLaboratorioY;
			@FindBy(xpath ="//*[@id=\"SC10Question20Figure\"]")
			WebElement txtF2NoFigura;
			@FindBy(xpath ="//*[@id=\"SC10Question20ActualStatus\"]")
			WebElement txtF2EdoActual;
			@FindBy(xpath ="//*[@id=\"SC10Question20StartDate\"]")
			WebElement txtF2FechaInicio;
			@FindBy(xpath ="//*[@id=\"SC10Question20Details\"]")
			WebElement txtF2Detalles;
					
		@FindBy(xpath ="//*[@id=\"SC10Question21Applicable|0\"]/div/div[1]/label[2]/span[1]")
		WebElement radioFRadiografiasN;
		@FindBy(xpath ="//*[@id=\"SC10Question21Applicable|0\"]/div/div[1]/label[1]/span[1]")
		WebElement radioFRadiografiasY;
			@FindBy(xpath ="//*[@id=\"SC10Question21Figure\"]")
			WebElement txtF3NoFigura;
			@FindBy(xpath ="//*[@id=\"SC10Question21ActualStatus\"]")
			WebElement txtF3EdoActual;
			@FindBy(xpath ="//*[@id=\"SC10Question21StartDate\"]")
			WebElement txtF3FechaInicio;
			@FindBy(xpath ="//*[@id=\"SC10Question21Details\"]")
			WebElement txtF3Detalles;
			
		@FindBy(xpath ="//*[@id=\"SC10Question37Applicable|0\"]/div/div[1]/label[2]/span[1]")
		WebElement radioGFumasN;
		@FindBy(xpath ="//*[@id=\"SC10Question37Applicable|0\"]/div/div[1]/label[1]/span[1]")
		WebElement radioGFumasY;
			@FindBy(xpath ="//*[@id=\"SC10Question37Figure\"]")
			WebElement txtG1NoFigura;
			@FindBy(xpath ="//*[@id=\"SC10Question37ClassQtyFrequency\"]")
			WebElement txtG1Clase;
			
			
		@FindBy(xpath ="//*[@id=\"SC10Question38Applicable|0\"]/div/div[1]/label[2]/span[1]")
		WebElement radioGAlcoholN;
		@FindBy(xpath ="//*[@id=\"SC10Question38Applicable|0\"]/div/div[1]/label[1]/span[1]")
		WebElement radioGAlcoholY;
			@FindBy(xpath ="//*[@id=\"SC10Question38Figure\"]")
			WebElement txtG2NoFigura;
			@FindBy(xpath ="//*[@id=\"SC10Question38ClassQtyFrequency\"]")
			WebElement txtG2Clase;
			
					
		@FindBy(xpath ="//*[@id=\"SC10Question39Applicable|0\"]/div/div[1]/label[2]/span[1]")
		WebElement radioGDrogasN;
		@FindBy(xpath ="//*[@id=\"SC10Question39Applicable|0\"]/div/div[1]/label[1]/span[1]")
		WebElement radioGDrogasY;
			@FindBy(xpath ="//*[@id=\"SC10Question39Figure\"]")
			WebElement txtG3NoFigura;
			@FindBy(xpath ="//*[@id=\"SC10Question39ClassQtyFrequency\"]")
			WebElement txtG3Clase;
			
					
		@FindBy(xpath ="//*[@id=\"SC10Question23Applicable|0\"]/div/div[1]/label[2]/span[1]")
		WebElement radioGAbandonoHabitoN;
		@FindBy(xpath ="//*[@id=\"SC10Question23Applicable|0\"]/div/div[1]/label[1]/span[1]")
			WebElement radioGAbandonoHabitoY;
			@FindBy(xpath ="//*[@id=\"SC10Question23Figure\"]")
			WebElement txtG4NoFigura;
			@FindBy(xpath ="//*[@id=\"SC10Question23ClassQtyFrequency\"]")
			WebElement txtG4Clase;
			@FindBy(xpath ="//*[@id=\"SC10Question23StartDate\"]")
			WebElement txtG4FechaInicio;
			
		@FindBy(xpath ="//*[@id=\"MedicalQuestionnaire_nextBtn\"]")
		WebElement btnGuardar;	

			
	public static boolean aniomenos = true;
	public static boolean mesmas = false;
	String strDelcorazonCirculacion = HOportunidadesSolicitudHelper.getEnfermedadCorazonCirculacion();
	String strA1EdoActual = HOportunidadesSolicitudHelper.getEdoActual();
	String strA1Fechainicio = HOportunidadesSolicitudHelper.getFechaInicio();
	String strA1Detalles = HOportunidadesSolicitudHelper.getDetalles();
	
	String strA2EdoActual = HOportunidadesSolicitudHelper.getEdoActualA2();
	String strA2Fechainicio = HOportunidadesSolicitudHelper.getFechaInicioA2();
	String strA2Detalles = HOportunidadesSolicitudHelper.getDetallesA2();
	String strAAparatoRespiratorio = HOportunidadesSolicitudHelper.getApartaroRespiratorio();
	String strACuestionarioAsma = HOportunidadesSolicitudHelper.getCAsma();
		String strAPrimerCrisisAsma = HOportunidadesSolicitudHelper.getAPrimerCrisisAsma();
		String strAFrecuenciaCrisisAsma = HOportunidadesSolicitudHelper.getAFrecuenciaCrisisAsma();
		String strADuracionCrisisAsma = HOportunidadesSolicitudHelper.getADuracionCrisisAsma();
		String strAUltimaCrisisAsma = HOportunidadesSolicitudHelper.getAUltimaCrisisAsma();
		String strACuantasCrisisAsmaUltimoAnio = HOportunidadesSolicitudHelper.getACuantasCrisisAsmaUltimoAnio();
		String strATratamientoAsma = HOportunidadesSolicitudHelper.getATratamientoAsma();
		String strATrataamientoSemanasAsma = HOportunidadesSolicitudHelper.getATratamientoSemanasAsma();
		String strATipoTratamientoAsma = HOportunidadesSolicitudHelper.getTipoTratamientoAsma();
		String strAHospitalizadoAsma = HOportunidadesSolicitudHelper.getAHospitalizadoAsma();
		String strAFechaHospitalizacionAsma=HOportunidadesSolicitudHelper.getFechaHospitalizacion();
		String strATiempoHospitalizacionAsma = HOportunidadesSolicitudHelper.getTiempoHospitalizacion();
		String strAInformacionExtra = HOportunidadesSolicitudHelper.getInformacionExtra();
	
	String strEnfermedadesDigestivas = HOportunidadesSolicitudHelper.getEnfermedadesDigestivas();
	String strA3EdoActual = HOportunidadesSolicitudHelper.getEdoActualA3();
	String strA3Fechainicio = HOportunidadesSolicitudHelper.getFechaInicioA3();
	String strA3Detalles = HOportunidadesSolicitudHelper.getDetallesA3();
	
	String strEnfermedadesGenitouriano = HOportunidadesSolicitudHelper.getEnfermedadesGenitouriano();
	String strA4EdoActual = HOportunidadesSolicitudHelper.getEdoActualA4();
	String strA4Fechainicio = HOportunidadesSolicitudHelper.getFechaInicioA4();
	String strA4Detalles = HOportunidadesSolicitudHelper.getDetallesA4();
	
	String strEnfermedadesEndocrino = HOportunidadesSolicitudHelper.getEnfermedadesEndocrino();
	String strA5EdoActual = HOportunidadesSolicitudHelper.getEdoActualA5();
	String strA5Fechainicio = HOportunidadesSolicitudHelper.getFechaInicioA5();
	String strA5Detalles = HOportunidadesSolicitudHelper.getDetallesA5();
	
	String strEnfermedadesNervioso = HOportunidadesSolicitudHelper.getEnfermedadesNervioso();
	String strA6EdoActual = HOportunidadesSolicitudHelper.getEdoActualA6();
	String strA6Fechainicio = HOportunidadesSolicitudHelper.getFechaInicioA6();
	String strA6Detalles = HOportunidadesSolicitudHelper.getDetallesA6();
	
	String strEnfermedadesEsqueletico = HOportunidadesSolicitudHelper.getEnfermedadesEsqueletico();
	String strA7EdoActual = HOportunidadesSolicitudHelper.getEdoActualA7();
	String strA7Fechainicio = HOportunidadesSolicitudHelper.getFechaInicioA7();
	String strA7Detalles = HOportunidadesSolicitudHelper.getDetallesA7();
	
	String strEnfermedadesTumores = HOportunidadesSolicitudHelper.getEnfermedadesTumores();
	String strA8EdoActual = HOportunidadesSolicitudHelper.getEdoActualA8();
	String strA8Fechainicio = HOportunidadesSolicitudHelper.getFechaInicioA8();
	String strA8Detalles = HOportunidadesSolicitudHelper.getDetallesA8();
	
	String strEnfermedadesEnfermedad8Dias = HOportunidadesSolicitudHelper.getEnfermedadesEnfermedad8Dias();
	String strA9EdoActual = HOportunidadesSolicitudHelper.getEdoActualA9();
	String strA9Fechainicio = HOportunidadesSolicitudHelper.getFechaInicioA9();
	String strA9Detalles = HOportunidadesSolicitudHelper.getDetallesA9();
	
	String strDefectoVisualAuditivo = HOportunidadesSolicitudHelper.getDefectoVisualAuditivo();
	String strB1EdoActual = HOportunidadesSolicitudHelper.getEdoActualB1();
	String strB1Fechainicio = HOportunidadesSolicitudHelper.getFechaInicioB1();
	String strB1Detalles = HOportunidadesSolicitudHelper.getDetallesB1();
	
	String strCHospitalizado = HOportunidadesSolicitudHelper.getCHospitalizado();
	String strC1EdoActual = HOportunidadesSolicitudHelper.getEdoActualC1();
	String strC1Fechainicio = HOportunidadesSolicitudHelper.getFechaInicioC1();
	String strC1Detalles = HOportunidadesSolicitudHelper.getDetallesC1();
	
	String strDAfeccion = HOportunidadesSolicitudHelper.getDAfeccion();
	String strD1EdoActual = HOportunidadesSolicitudHelper.getEdoActualD1();
	String strD1Fechainicio = HOportunidadesSolicitudHelper.getFechaInicioD1();
	String strD1Detalles = HOportunidadesSolicitudHelper.getDetallesD1();
	
	String strDTratamiento = HOportunidadesSolicitudHelper.getDTratamientoActual();
	String strD2EdoActual = HOportunidadesSolicitudHelper.getEdoActualD2();
	String strD2Fechainicio = HOportunidadesSolicitudHelper.getFechaInicioD2();
	String strD2Detalles = HOportunidadesSolicitudHelper.getDetallesD2();
	
	String strDSIDA = HOportunidadesSolicitudHelper.getDSIDA();
	String strD3EdoActual = HOportunidadesSolicitudHelper.getEdoActualD3();
	String strD3Fechainicio = HOportunidadesSolicitudHelper.getFechaInicioD3();
	String strD3Detalles = HOportunidadesSolicitudHelper.getDetallesD3();
	
	String strDIntervencionQuirurjica = HOportunidadesSolicitudHelper.getDIntervencionQuirurgica();
	String strD4EdoActual = HOportunidadesSolicitudHelper.getEdoActualD4();
	String strD4Fechainicio = HOportunidadesSolicitudHelper.getFechaInicioD4();
	String strD4Detalles = HOportunidadesSolicitudHelper.getDetallesD4();
	
	String strDPIntervencionQuirurjica = HOportunidadesSolicitudHelper.getDPIntervencionQuirurjica();
	String strD5EdoActual = HOportunidadesSolicitudHelper.getEdoActualD5();
	String strD5Fechainicio = HOportunidadesSolicitudHelper.getFechaInicioD5();
	String strD5Detalles = HOportunidadesSolicitudHelper.getDetallesD5();
	
	String strEDeformidad = HOportunidadesSolicitudHelper.getEDeformidad();
	String strE1EdoActual = HOportunidadesSolicitudHelper.getEdoActualE1();
	String strE1Fechainicio = HOportunidadesSolicitudHelper.getFechaInicioE1();
	String strE1Detalles = HOportunidadesSolicitudHelper.getDetallesE1();
	
	String strFElectrocardiogramas = HOportunidadesSolicitudHelper.getFElectrocardiogramas();
	String strF1EdoActual = HOportunidadesSolicitudHelper.getEdoActualF1();
	String strF1Fechainicio = HOportunidadesSolicitudHelper.getFechaInicioF1();
	String strF1Detalles = HOportunidadesSolicitudHelper.getDetallesF1();
	
	String strFPruebasLaboratorio = HOportunidadesSolicitudHelper.getFPruebasLaboratorio();
	String strF2EdoActual = HOportunidadesSolicitudHelper.getEdoActualF2();
	String strF2Fechainicio = HOportunidadesSolicitudHelper.getFechaInicioF2();
	String strF2Detalles = HOportunidadesSolicitudHelper.getDetallesF2();
	
	String strFRadiografias = HOportunidadesSolicitudHelper.getFUltrasonidos();
	String strF3EdoActual = HOportunidadesSolicitudHelper.getEdoActualF3();
	String strF3Fechainicio = HOportunidadesSolicitudHelper.getFechaInicioF3();
	String strF3Detalles = HOportunidadesSolicitudHelper.getDetallesF3();
	
	String strGFumas = HOportunidadesSolicitudHelper.getGFumas();
	String strG1Clase = HOportunidadesSolicitudHelper.getClaseG1();
	
	String strGAlcohol = HOportunidadesSolicitudHelper.getGAlcohol();
	String strG2Clase = HOportunidadesSolicitudHelper.getClaseG2();
	
	String strGDrogas = HOportunidadesSolicitudHelper.getFUltrasonidos();
	String strG3Clase = HOportunidadesSolicitudHelper.getClaseG3();
	
	String strGAbandonoHabito = HOportunidadesSolicitudHelper.getGAbandonoHabito();
	String strG4Clase = HOportunidadesSolicitudHelper.getClaseG4();
	String strG4Fechainicio = HOportunidadesSolicitudHelper.getFechaInicioG4();
	
	
	public PageOportunidadesSolicitudCuestionarioMedico(WebDriver driver) {
		super(driver);
	}
	
	public void aEnfermedadesCongenitas()
	{
		clickDelCorazonCirculacion();
		clickAparatoRespiratorio();
		clickEnfermedadesDigestivas();
		clickEnfermedadesGenitouriano();
		clickEnfermedadesEndocrino();
		clickEnfermedadesNervioso();
		clickEnfermedadesEsqueletico();
		clickEnfermedadesTumores();
		clickEnfermedad8Dias();
	}
	public void bDefectoVisualAuditivo()
	{
		clickDefectoVisualAuditivo();
	}
	public void cHospitalizado()
	{
		clickHospitalizadoC1();
	}
	public void dAntecedentesPatalogicos()
	{
		clickPadeceAffeccion();
		clickEstaTratamiento();
		clickPadeceSIDA();
		clickIntervencionQuirurgica();
		clickPendienteIQuirurgica();		
	}
	public void eDeformidad()
	{
		clickDefromidad();
	}
	public void fHanPracticado()
	{
		clickElectrocardiogramas();
		clickPruebasLaboratorio();
		clickRadiografias();
	}
	public void gHabitosToxicologicos()
	{
		clickFumas();//+++++++++
		clickAlcohol();//+++++++++
		clickDrogas();//+++++++++
		clickAbandonoHabito();
	}
	public void continuar()
	{
		clickContinuar();
	}
	
	private void clickDelCorazonCirculacion()
	{	HCommonHelper.waiter("high");
		refreshPage();
		HCommonHelper.waiter("medium");
		swithToFrame(frame);
		if (strDelcorazonCirculacion.equals("NO"))
		{
			click(radio1CorazonCirculacionN);
		}
		else
		{
			click(radio1CorazonCirculacionY);
			set1NoFigura();
			set1EdoActual();
			set1FechaInicio();
			set1Detalles();				
		}
	}
	private void clickAparatoRespiratorio()
	{	
		if (strDelcorazonCirculacion.equals("NO"))
		{
			click(radio2AparatoRespiratorioN);
		}
		else
		{
			click(radio2AparatoRespiratorioY);
			setA2NoFigura();
			setA2EdoActual();
			setA2FechaInicio();
			setA2Detalles();
			if(strACuestionarioAsma.equals("YES"))
			{
				clickCuestionarioAsma();
				setPrimerCrisisAsma();
				setFrecuenciaCrisisAsma();
				setDuracionCrisisAsma();
				setUltimaCrisisAsma();
				setCuantasCrisisAsmaAnio();
				setTratamientoAsma();
				clickTratamientoSemanas();
				clickHospitalizadoAsma();
				setInformacionExtra();
			}
						
		}
	}
	private void clickEnfermedadesDigestivas() 
	{
		if (strEnfermedadesDigestivas.equals("NO"))
		{
			click(radio3DigestivoN);
		}
		else
		{
			click(radio3DigestivoY);
			setA3NoFigura();
			setA3EdoActual();
			setA3FechaInicio();
			setA3Detalles();
		}
		
	}
	private void clickEnfermedadesGenitouriano() 
	{
		if (strEnfermedadesGenitouriano.equals("NO"))
		{
			click(radio4GeniturianoN);
		}
		else
		{
			click(radio4GeniturianoY);
			setA4NoFigura();
			setA4EdoActual();
			setA4FechaInicio();
			setA4Detalles();
		}
		
	}
	private void clickEnfermedadesEndocrino() 
	{
		if (strEnfermedadesEndocrino.equals("NO"))
		{
			click(radio5EndocrinoN);
		}
		else
		{
			click(radio5EndocrinoY);
			setA5NoFigura();
			setA5EdoActual();
			setA5FechaInicio();
			setA5Detalles();
		}
		
	}
	private void clickEnfermedadesNervioso()
	{
		if (strEnfermedadesNervioso.equals("NO"))
		{
			click(radio6NerviosoN);
		}
		else
		{
			click(radio6NerviosoY);
			setA6NoFigura();
			setA6EdoActual();
			setA6FechaInicio();
			setA6Detalles();
		}
	}
	private void clickEnfermedadesEsqueletico()
	{
		if (strEnfermedadesEsqueletico.equals("NO"))
		{
			click(radio7EsqueleticoN);
		}
		else
		{
			click(radio7EsqueleticoY);
			setA7NoFigura();
			setA7EdoActual();
			setA7FechaInicio();
			setA7Detalles();
		}
	}
	private void clickEnfermedadesTumores()
	{
		if (strEnfermedadesTumores.equals("NO"))
		{
			click(radio8TumoresN);
		}
		else
		{
			click(radio8TumoresY);
			setA8NoFigura();
			setA8EdoActual();
			setA8FechaInicio();
			setA8Detalles();
		}
	}
	private void clickEnfermedad8Dias()
	{
		if (strEnfermedadesEnfermedad8Dias.equals("NO"))
		{
			click(radio9Enfermedad8DiasN);
		}
		else
		{
			click(radio9Enfermedad8DiasY);
			setA9NoFigura();
			setA9EdoActual();
			setA9FechaInicio();
			setA9Detalles();
		}
	}
	private void clickDefectoVisualAuditivo()
	{
		if (strDefectoVisualAuditivo.equals("NO"))
		{
			click(radioDefVisualAuditivoN);
		}
		else
		{
			click(radioDefVisualAuditivoY);
			setB1NoFigura();
			setB1EdoActual();
			setB1FechaInicio();
			setB1Detalles();
		}
	}
	private void clickHospitalizadoC1()
	{
		if (strCHospitalizado.equals("NO"))
		{
			click(radioCHospitalizadoN);
		}
		else
		{
			click(radioCHospitalizadoY);
			setC1NoFigura();
			setC1EdoActual();
			setC1FechaInicio();
			setC1Detalles();
		}
	}
	private void clickPadeceAffeccion()
	{
		if (strDAfeccion.equals("NO"))
		{
			click(radioDAfeccionN);
		}
		else
		{
			click(radioDAfeccionY);
			setD1NoFigura();
			setD1EdoActual();
			setD1FechaInicio();
			setD1Detalles();
		}	
	}
	private void clickEstaTratamiento()
	{
		if (strDTratamiento.equals("NO"))
		{
			click(radioDTratamientoN);
		}
		else
		{
			click(radioDTratamientoY);
			setD2NoFigura();
			setD2EdoActual();
			setD2FechaInicio();
			setD2Detalles();
		}	
	}
	private void clickPadeceSIDA()
	{
		if (strDSIDA.equals("NO"))
		{
			click(radioDSIDAN);
		}
		else
		{
			click(radioDSIDAY);
			setD3NoFigura();
			setD3EdoActual();
			setD3FechaInicio();
			setD3Detalles();
		}	
	}
	private void clickIntervencionQuirurgica()
	{
		if (strDIntervencionQuirurjica.equals("NO"))
		{
			click(radioDIntervencionQN);
		}
		else
		{
			click(radioDIntervencionQY);
			setD4NoFigura();
			setD4EdoActual();
			setD4FechaInicio();
			setD4Detalles();
		}	
	}
	private void clickPendienteIQuirurgica()
	{
		if (strDPIntervencionQuirurjica.equals("NO"))
		{
			click(radioDPIntervencionQN);
		}
		else
		{
			click(radioDPIntervencionQY);
			setD5NoFigura();
			setD5EdoActual();
			setD5FechaInicio();
			setD5Detalles();
		}	
	}
	private void clickDefromidad()
	{
		if (strEDeformidad.equals("NO"))
		{
			click(radioEDeformidadN);
		}
		else
		{
			click(radioEDeformidadY);
			setE1NoFigura();
			setE1EdoActual();
			setE1FechaInicio();
			setE1Detalles();
		}
	}
	private void clickElectrocardiogramas()
	{
		if (strFElectrocardiogramas.equals("NO"))
		{
			click(radioFElectrocardiogramasN);
		}
		else
		{
			click(radioFElectrocardiogramasY);
			setF1NoFigura();
			setF1EdoActual();
			setF1FechaInicio();
			setF1Detalles();
		}
	}
	private void clickPruebasLaboratorio()
	{
		if (strFPruebasLaboratorio.equals("NO"))
		{
			click(radioFPruebasLaboratorioN);
		}
		else
		{
			click(radioFPruebasLaboratorioY);
			setF2NoFigura();
			setF2EdoActual();
			setF2FechaInicio();
			setF2Detalles();
		}
	}
	private void clickRadiografias()
	{
		if (strFRadiografias.equals("NO"))
		{
			click(radioFRadiografiasN);
		}
		else
		{
			click(radioFRadiografiasY);
			setF3NoFigura();
			setF3EdoActual();
			setF3FechaInicio();
			setF3Detalles();
		}
	}
	private void clickFumas()
	{
		if (strGFumas.equals("NO"))
		{
			click(radioGFumasN);
		}
		else
		{
			click(radioGFumasY);
			setG1NoFigura();
			setG1Clase();
		}
	}
	private void clickAlcohol()
	{
		if (strGAlcohol.equals("NO"))
		{
			click(radioGAlcoholN);
		}
		else
		{
			click(radioGAlcoholY);
			setG2NoFigura();
			setG2Clase();
		}
	}
	private void clickDrogas()
	{
		if (strGDrogas.equals("NO"))
		{
			click(radioGDrogasN);
		}
		else
		{
			click(radioGDrogasY);
			setG3NoFigura();
			setG3Clase();
		}
	}
	private void clickAbandonoHabito()
	{
		if (strGAbandonoHabito.equals("NO"))
		{
			click(radioGAbandonoHabitoN);
		}
		else
		{
			click(radioGAbandonoHabitoY);
			setG4NoFigura();
			setG4Clase();
			setG4FechaInicio();
			
		}
	}	
	private void setG4FechaInicio()
	{
		txtG4FechaInicio.clear();
		sendKeys(txtG4FechaInicio,strG4Fechainicio);
	}
	private void setG4Clase()
	{
		sendKeys(txtG4Clase,strG4Clase);
	}
	private void setG4NoFigura()
	{
		click(txtG4NoFigura);
		HCommonHelper.waiter("medium");
		downEnter(txtG4NoFigura);
	}
	private void setG3Clase()
	{
		sendKeys(txtG3Clase,strG3Clase);
	}
	private void setG3NoFigura()
	{
		click(txtG3NoFigura);
		HCommonHelper.waiter("medium");
		downEnter(txtG3NoFigura);
	}
	private void setG2Clase()
	{
		sendKeys(txtG2Clase,strG2Clase);
	}
	private void setG2NoFigura()
	{
		click(txtG2NoFigura);
		HCommonHelper.waiter("medium");
		downEnter(txtG2NoFigura);
	}
	private void setG1Clase()
	{
		sendKeys(txtG1Clase,strG1Clase);
	}
	private void setG1NoFigura()
	{
		click(txtG1NoFigura);
		HCommonHelper.waiter("medium");
		downEnter(txtG1NoFigura);
	}
	private void setF3Detalles()
	{
		sendKeys(txtF3Detalles,strF3Detalles);
	}
	private void setF3FechaInicio()
	{
		txtF3FechaInicio.clear();
		sendKeys(txtF3FechaInicio,strF3Fechainicio);
	}
	private void setF3EdoActual()
	{
		sendKeys(txtF3EdoActual,strF3EdoActual);
	}
	private void setF3NoFigura()
	{
		click(txtF3NoFigura);
		HCommonHelper.waiter("medium");
		downEnter(txtF3NoFigura);
	}
	private void setF2Detalles()
	{
		sendKeys(txtF2Detalles,strF2Detalles);
	}
	private void setF2FechaInicio()
	{
		txtF2FechaInicio.clear();
		sendKeys(txtF2FechaInicio,strF2Fechainicio);
	}
	private void setF2EdoActual()
	{
		sendKeys(txtF2EdoActual,strF2EdoActual);
	}
	private void setF2NoFigura()
	{
		click(txtF2NoFigura);
		HCommonHelper.waiter("medium");
		downEnter(txtF2NoFigura);
	}
	private void setF1Detalles()
	{
		sendKeys(txtF1Detalles,strF1Detalles);
	}
	private void setF1FechaInicio()
	{
		txtF1FechaInicio.clear();
		sendKeys(txtF1FechaInicio,strF1Fechainicio);
	}
	private void setF1EdoActual()
	{
		sendKeys(txtF1EdoActual,strF1EdoActual);
	}
	private void setF1NoFigura()
	{
		click(txtF1NoFigura);
		HCommonHelper.waiter("medium");
		downEnter(txtF1NoFigura);
	}
	private void setE1Detalles()
	{
		sendKeys(txtE1Detalles,strE1Detalles);
	}
	private void setE1FechaInicio()
	{
		txtE1FechaInicio.clear();
		sendKeys(txtE1FechaInicio,strE1Fechainicio);
	}
	private void setE1EdoActual()
	{
		sendKeys(txtE1EdoActual,strE1EdoActual);
	}
	private void setE1NoFigura()
	{
		click(txtE1NoFigura);
		HCommonHelper.waiter("medium");
		downEnter(txtE1NoFigura);
	}
	private void setD5Detalles()
	{
		sendKeys(txtD5Detalles,strD5Detalles);
	}
	private void setD5FechaInicio()
	{
		txtD5FechaInicio.clear();
		sendKeys(txtD5FechaInicio,strD5Fechainicio);
	}
	private void setD5EdoActual()
	{
		sendKeys(txtD5EdoActual,strD5EdoActual);
	}
	private void setD5NoFigura()
	{
		click(txtD5NoFigura);
		HCommonHelper.waiter("medium");
		downEnter(txtD5NoFigura);
	}
	private void setD4Detalles()
	{
		sendKeys(txtD4Detalles,strD4Detalles);
	}
	private void setD4FechaInicio()
	{
		txtD4FechaInicio.clear();
		sendKeys(txtD4FechaInicio,strD4Fechainicio);
	}
	private void setD4EdoActual()
	{
		sendKeys(txtD4EdoActual,strD4EdoActual);
	}
	private void setD4NoFigura()
	{
		click(txtD4NoFigura);
		HCommonHelper.waiter("medium");
		downEnter(txtD4NoFigura);
	}
	private void setD3Detalles()
	{
		sendKeys(txtD3Detalles,strD3Detalles);
	}
	private void setD3FechaInicio()
	{
		txtD3FechaInicio.clear();
		sendKeys(txtD3FechaInicio,strD3Fechainicio);
	}
	private void setD3EdoActual()
	{
		sendKeys(txtD3EdoActual,strD3EdoActual);
	}
	private void setD3NoFigura()
	{
		click(txtD3NoFigura);
		HCommonHelper.waiter("medium");
		downEnter(txtD3NoFigura);
	}
	private void setD2Detalles()
	{
		sendKeys(txtD2Detalles,strD2Detalles);
	}
	private void setD2FechaInicio()
	{
		txtD2FechaInicio.clear();
		sendKeys(txtD2FechaInicio,strD2Fechainicio);
	}
	private void setD2EdoActual()
	{
		sendKeys(txtD2EdoActual,strD2EdoActual);
	}
	private void setD2NoFigura()
	{
		click(txtD2NoFigura);
		HCommonHelper.waiter("medium");
		downEnter(txtD2NoFigura);
	}
	
	private void setD1Detalles()
	{
		sendKeys(txtD1Detalles,strD1Detalles);
	}
	private void setD1FechaInicio()
	{
		txtD1FechaInicio.clear();
		sendKeys(txtD1FechaInicio,strD1Fechainicio);
	}
	private void setD1EdoActual()
	{
		sendKeys(txtD1EdoActual,strD1EdoActual);
	}
	private void setD1NoFigura()
	{
		click(txtD1NoFigura);
		HCommonHelper.waiter("medium");
		downEnter(txtD1NoFigura);
	}
		
	
	private void setC1Detalles()
	{
		sendKeys(txtC1Detalles,strC1Detalles);
	}
	private void setC1FechaInicio()
	{
		txtC1FechaInicio.clear();
		sendKeys(txtC1FechaInicio,strC1Fechainicio);
	}
	private void setC1EdoActual()
	{
		sendKeys(txtC1EdoActual,strC1EdoActual);
	}
	private void setC1NoFigura()
	{
		click(txtC1NoFigura);
		HCommonHelper.waiter("medium");
		downEnter(txtC1NoFigura);
	}
	private void setB1Detalles()
	{
		sendKeys(txtB1Detalles,strB1Detalles);
	}
	private void setB1FechaInicio()
	{
		txtB1FechaInicio.clear();
		sendKeys(txtB1FechaInicio,strB1Fechainicio);
	}
	private void setB1EdoActual()
	{
		sendKeys(txtB1EdoActual,strB1EdoActual);
	}
	private void setB1NoFigura()
	{
		click(txtB1NoFigura);
		HCommonHelper.waiter("medium");
		downEnter(txtB1NoFigura);
	}
	private void setA9Detalles()
	{
		sendKeys(txtA9Detalles,strA9Detalles);
	}
	private void setA9FechaInicio()
	{
		txtA9FechaInicio.clear();
		sendKeys(txtA9FechaInicio,strA9Fechainicio);
	}
	private void setA9EdoActual()
	{
		sendKeys(txtA9EdoActual,strA9EdoActual);
	}
	private void setA9NoFigura()
	{
		click(txtA9NoFigura);
		HCommonHelper.waiter("medium");
		downEnter(txtA9NoFigura);
	}
	private void setA8Detalles()
	{
		sendKeys(txtA8Detalles,strA8Detalles);
	}
	private void setA8FechaInicio()
	{
		txtA8FechaInicio.clear();
		sendKeys(txtA8FechaInicio,strA8Fechainicio);
	}
	private void setA8EdoActual()
	{
		sendKeys(txtA8EdoActual,strA8EdoActual);
	}
	private void setA8NoFigura()
	{
		click(txtA8NoFigura);
		HCommonHelper.waiter("medium");
		downEnter(txtA8NoFigura);
	}
	private void setA7Detalles()
	{
		sendKeys(txtA7Detalles,strA7Detalles);
	}
	private void setA7FechaInicio()
	{
		txtA7FechaInicio.clear();
		sendKeys(txtA7FechaInicio,strA7Fechainicio);
	}
	private void setA7EdoActual()
	{
		sendKeys(txtA7EdoActual,strA7EdoActual);
	}
	private void setA7NoFigura()
	{
		click(txtA7NoFigura);
		HCommonHelper.waiter("medium");
		downEnter(txtA7NoFigura);
	}
	private void setA6Detalles()
	{
		sendKeys(txtA6Detalles,strA6Detalles);
	}
	private void setA6FechaInicio()
	{
		txtA6FechaInicio.clear();
		sendKeys(txtA6FechaInicio,strA6Fechainicio);
	}
	private void setA6EdoActual()
	{
		sendKeys(txtA6EdoActual,strA6EdoActual);
	}
	private void setA6NoFigura()
	{
		click(txtA6NoFigura);
		HCommonHelper.waiter("medium");
		downEnter(txtA6NoFigura);
	}
	private void setA5Detalles()
	{
		sendKeys(txtA5Detalles,strA5Detalles);
	}
	private void setA5FechaInicio()
	{
		txtA5FechaInicio.clear();
		sendKeys(txtA5FechaInicio,strA5Fechainicio);
	}
	private void setA5EdoActual()
	{
		sendKeys(txtA5EdoActual,strA5EdoActual);
	}
	private void setA5NoFigura()
	{
		click(txtA5NoFigura);
		HCommonHelper.waiter("medium");
		downEnter(txtA5NoFigura);
	}
	private void setA4Detalles()
	{
		sendKeys(txtA4Detalles,strA4Detalles);
	}
	private void setA4FechaInicio()
	{
		txtA4FechaInicio.clear();
		sendKeys(txtA4FechaInicio,strA4Fechainicio);
	}
	private void setA4EdoActual()
	{
		sendKeys(txtA4EdoActual,strA4EdoActual);
	}
	private void setA4NoFigura()
	{
		click(txtA4NoFigura);
		HCommonHelper.waiter("medium");
		downEnter(txtA4NoFigura);
	}
	private void setA3Detalles()
	{
		sendKeys(txtA3Detalles,strA3Detalles);
	}
	private void setA3FechaInicio()
	{
		txtA3FechaInicio.clear();
		sendKeys(txtA3FechaInicio,strA3Fechainicio);
	}
	private void setA3EdoActual()
	{
		sendKeys(txtA3EdoActual,strA3EdoActual);
	}
	private void setA3NoFigura()
	{
		click(txtA3NoFigura);
		HCommonHelper.waiter("medium");
		downEnter(txtA3NoFigura);
	}
	private void set1Detalles()
	{
		sendKeys(txtA1Detalles,strA1Detalles);
	}	
	private void set1FechaInicio()
	{
		txtA1FechaInicio.clear();
		sendKeys(txtA1FechaInicio,strA1Fechainicio);
	}
	private void set1EdoActual()
	{
		sendKeys(txtA1EdoActual,strA1EdoActual);
	}
	private void set1NoFigura()
	{
		click(txtA1NoFigura);
		HCommonHelper.waiter("medium");
		downEnter(txtA1NoFigura);
	}
	private void setInformacionExtra()
	{
		sendKeys(txtInformacionExtra, strAInformacionExtra);
	}
	private void clickHospitalizadoAsma()
	{
		if(strAHospitalizadoAsma.equals("No"))
		{
			click(radioHospitalizadoN);
		}else
		{
			click(radioHospitalizadoY);
			setFechaHospitalizacion();
			setTiempoHospitalizacion();			
		}
	}
	private void setTiempoHospitalizacion()
	{
		sendKeys(txtTiempoHospitalizacion, strATiempoHospitalizacionAsma);
	}
	private void setFechaHospitalizacion()
	{
		sendKeys(txtFechaHospitalizacion, strAFechaHospitalizacionAsma);
	}
	private void clickTratamientoSemanas()
	{
		if(strATrataamientoSemanasAsma.equals("NO"))
		{
			click(radioTratamientoSemanasN);
		}else
		{
			click(radioTratamientoSemanasY);
			setTipoTratamientoAsma();
		}
		
	}
	private void setTipoTratamientoAsma()
	{
		sendKeys(txtTipoTratamientoAsma, strATipoTratamientoAsma);
	}
	private void setTratamientoAsma()
	{
		sendKeys(txtTratamientoAsma, strATratamientoAsma);
	}
	private void setCuantasCrisisAsmaAnio()
	{
		sendKeys(txtCrisisUltimoAnio, strACuantasCrisisAsmaUltimoAnio);
	}
	private void setUltimaCrisisAsma()
	{
		sendKeys(txtUltimaCrisisAsma, strAUltimaCrisisAsma);
	}
	private void setDuracionCrisisAsma()
	{
		sendKeys(txtDuracionCrisisAsms, strADuracionCrisisAsma);
	}
	private void setFrecuenciaCrisisAsma()
	{
		sendKeys(txtPromedioCrisisAsma, strAFrecuenciaCrisisAsma);
	}
	private void setPrimerCrisisAsma()
	{
		sendKeys(txtPrimerCrisisAsma,strAPrimerCrisisAsma);
	}
	private void clickCuestionarioAsma()
	{
		click(radio2Asma);
	}
	private void setA2Detalles()
	{
		sendKeys(txtA2Detalles,strA2Detalles);
	}
	private void setA2FechaInicio()
	{
		txtA2FechaInicio.clear();
		sendKeys(txtA2FechaInicio,strA2Fechainicio);
	}
	private void setA2EdoActual()
	{
		sendKeys(txtA2EdoActual,strA2EdoActual);
	}
	private void setA2NoFigura()
	{
		click(txtA2NoFigura);
		HCommonHelper.waiter("medium");
		downEnter(txtA2NoFigura);
	}
	
	private void clickContinuar()
	{
		click(btnGuardar);
	}

}
