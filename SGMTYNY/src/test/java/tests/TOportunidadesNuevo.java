package tests;

import java.io.IOException;
import org.testng.annotations.Test;

import helpers.HCommonHelper;
import helpers.HReporte;
import pages.PageLogin;
import pages.*;

import java.io.File;
import tests.BaseTest;

public class TOportunidadesNuevo extends BaseTest{
	
	@Test
	public void stepsOportunidades() throws IOException  {
		
		strPaso = "Haciendo login";
		Tlogin.stepsLogin();
			
	//	strPaso="Entrando a Oportunidades";
		PageInicio inicio = new PageInicio(driver);
		
		//strPaso = "Creando el page oportunidades";
		PageOportunidades oportunidades = new PageOportunidades(driver);	
		//strPaso = "Creando el page oportunidades";
		PageOportunidadesNuevo oportunidadesNuev = new PageOportunidadesNuevo(driver);
		
		//HReporte.tomarCaptura(driver, "TOportunidadesNuevo", HCommonHelper.getDateHour());
		inicio.clickOportunidades();
		oportunidades.clickNuevo();
		oportunidadesNuev.putName();
		oportunidadesNuev.putNameRelation();
		oportunidadesNuev.selectStage();
		oportunidadesNuev.selectDate();
		oportunidadesNuev.selectSource();
		oportunidadesNuev.selectActivity();
		oportunidadesNuev.selectActivityDat();
		oportunidadesNuev.selectInteres();
		oportunidadesNuev.inputNotes();
		oportunidadesNuev.clickOpen();	
		
	}	
}
