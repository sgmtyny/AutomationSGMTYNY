package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.PageInicio;
import pages.PageOportunidades;
import pages.PageOportunidadesConfigurarProducto;
import pages.PageOportunidadesSolicitudAcuerdo;
import pages.PageOportunidadesSolicitudAgentePersonaFisica;
import pages.PageOportunidadesSolicitudCoberturas;
import pages.PageOportunidadesSolicitudCuestionarioMedico;
import pages.PageOportunidadesSolicitudDatosSolicitante;
import pages.PageOportunidadesSolicitudDesignacionBeneficios;
import pages.PageOportunidadesSolicitudFirmaAutografaDigital;
import pages.PageOportunidadesSolicitudHistorialMedicoFamiliar;
import pages.PageOportunidadesSolicitudInformacionCobranza;
import pages.PageOportunidadesSolicitudOcupacionDeportes;

public class TOportunidadesSolicitud  extends BaseTest{
	@Test
	public void stepsOportunidadesCotizador() throws IOException  {
		
		strPaso = "Haciendo login";
		Tlogin.stepsLogin();
			
		strPaso="Entrando a Oportunidades";
		PageInicio inicio = new PageInicio(driver);
		
		strPaso = "Creando el page oportunidades";
		PageOportunidades oportunidades = new PageOportunidades(driver);			
		
		strPaso = "Creando el page oportunidades datos del solicitante";
		PageOportunidadesSolicitudDatosSolicitante oportunidadesCDatosSolicitante = new PageOportunidadesSolicitudDatosSolicitante(driver);	
		PageOportunidadesSolicitudCoberturas oportunidadesSCoberturas = new PageOportunidadesSolicitudCoberturas(driver);
		PageOportunidadesSolicitudCuestionarioMedico oportunidadesSCuestionarioMedico = new PageOportunidadesSolicitudCuestionarioMedico(driver);
		PageOportunidadesSolicitudOcupacionDeportes oportunidadesSOcupacion = new PageOportunidadesSolicitudOcupacionDeportes(driver);
		PageOportunidadesSolicitudHistorialMedicoFamiliar oportunidadesSHMedicoFamiliar = new PageOportunidadesSolicitudHistorialMedicoFamiliar(driver);
		PageOportunidadesSolicitudDesignacionBeneficios oportunidadesSDesignacionBeneficiarios = new PageOportunidadesSolicitudDesignacionBeneficios(driver);
		PageOportunidadesSolicitudInformacionCobranza oportunidadesSInformacionCobranza = new PageOportunidadesSolicitudInformacionCobranza(driver);
		PageOportunidadesSolicitudAgentePersonaFisica oportunidadesSAgente = new PageOportunidadesSolicitudAgentePersonaFisica(driver);
		PageOportunidadesSolicitudAcuerdo oportunidadesSAcuerdo = new PageOportunidadesSolicitudAcuerdo(driver);
		PageOportunidadesSolicitudFirmaAutografaDigital oportunidadesSFirma = new PageOportunidadesSolicitudFirmaAutografaDigital(driver);
		
		inicio.clickOportunidades();
		oportunidades.clickOportunidad();
		oportunidades.clickSolicitud();
		oportunidades.clickDatosDelSolicitante();
		oportunidadesCDatosSolicitante.DatosPersonalesSolicitante();
		oportunidadesCDatosSolicitante.DatosPersonalesPorAsegurarTitular();
		/*oportunidadesSCoberturas.coberturasOpcionalesAlfaMedicalFlex();
		oportunidadesSCoberturas.coberturasOpcionalesAlfaMedical();
		oportunidadesSCoberturas.coberturaGeneral();*/
		oportunidadesSCoberturas.coberturaContinuar();
		oportunidadesSCuestionarioMedico.aEnfermedadesCongenitas();
		oportunidadesSCuestionarioMedico.bDefectoVisualAuditivo();
		oportunidadesSCuestionarioMedico.cHospitalizado();
		oportunidadesSCuestionarioMedico.dAntecedentesPatalogicos();
		oportunidadesSCuestionarioMedico.eDeformidad();
		oportunidadesSCuestionarioMedico.fHanPracticado();
		oportunidadesSCuestionarioMedico.gHabitosToxicologicos();
		oportunidadesSCuestionarioMedico.continuar();
		oportunidadesSOcupacion.cuestionario();
		oportunidadesSHMedicoFamiliar.historialMediocFamiliarCuestionario();
		oportunidadesSDesignacionBeneficiarios.listaAsegurados();
		oportunidadesSInformacionCobranza.informacion();
		oportunidadesSAgente.informacion();
		oportunidadesSAcuerdo.informacion();
		oportunidadesSFirma.informacion();
	}

}
