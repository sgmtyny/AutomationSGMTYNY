package helpers;

import java.io.IOException;

import pages.PageOportunidadesSolicitudCuestionarioMedico;

//import pages.getDefectoVisualAuditivo;

/**
 * @author Abraham Galindo
 * @date 12/04/2019
 * 
 */
public class HOportunidadesSolicitudHelper {
	static String[] arrPaises = {"AFGANISTAN","ALEMANIA","ALGERIA","ANGUILA","ANTARTIDA","ANTIGUA Y BARBUDA","ANTILLAS NEERLANDESAS","Arabia Saudita","ARCHIPIÉLAGO DE SVALBARD","ARGENTINA","ARMENIA","ARUBA","ASCENCIÓN","AUSTRALIA","AUSTRIA","AZERBAIJÁN","BANGLADESH","BARBADOS","BÉLGICA","BELICE","BENIN","BERMUDAS","BIELORRUSIA","BOLIVIA","BOSNIA Y HERZEGOVINA","BOTSUANA","BRASIL","BRECHOU (ISLA DEL CANAL)","BRUNEI DARUSSALAM","BULGARIA","BURKINA FASO","BURMA","BURUNDI","BUTÁN","CAMERÚN","CAMPIONE D ITALIA","CANADA","CHAD","CHILE","CHINA","CLIPPERTON","COLOMBIA","COMMONWEALTH DE DOMINICA","COMMONWEALTH DE LAS BAHAMAS","COMORAS","CONGO","COREA DEL NORTE","COREA DEL SUR","COSTA DE MARFIL","CROACIA","CUBA","DINAMARCA","E.U.A","ECUADOR","EGIPTO","EL SALVADOR","EMIRATOS ÁRABES UNIDOS","ERITREA","ESLOVAQUIA","ESLOVENIA","ESPAÑA","ESTADO DE BAHRAIN","ESTADO DE KUWAIT","ESTADO DE QATAR","ESTADO INDEPENDIENTE DE SAMOA OCCIDENTAL","ESTADO LIBRE ASOCIADO DE PUERTO RICO","ESTONIA","ETIOPÍA","FILIPINAS","FINLANDIA","FIYI","FRANCIA","GABÓN","GAMBIA","GEORGIA","GEORGIA DEL SUR E ISLAS SANDWICH DEL SUR","GHANA","GIBRALTAR","GRANADA","GRECIA","GROENLANDIA","GUADALUPE","GUAM","GUATEMALA","GUAYANA FRANCESA","GUERNESEY","GUINEA","GUINEA ECUATORIAL","GUINEA-BISSAU","HAITI","HOLANDA","HONG KONG","HUNGARIA","INDIA","INDONESIA","IRAN","IRAQ","IRLANDA","ISLA ALDERNEY","ISLA BOUVET","ISLA CAIMÁN","ISLA DE CHRISTMAS","ISLA DE GUEMESEY","ISLA DE NORFOIK","ISLA DE SAN PEDRO Y MIGUELÓN","ISLA DEL HOMBRE","ISLA GREAT SARK","ISLA HERM","ISLA JERSEY","ISLA LITTLE","ISLA QESHM","ISLANDIA","ISLAS ÅLAND","ISLAS AZORES","ISLAS CANARIAS","ISLAS COOK","ISLAS DE COCOS O KELLING","ISLAS FEROE","ISLAS HEARD Y MCDONALD","ISLAS MALVINAS","ISLAS MARIANAS DEL NORTE","ISLAS MENORES ALEJADAS DE LOS ESTADOS UNIDOS","ISLAS PACIFICO","ISLAS SALOMÓN","ISLAS TURCAS Y CAICOS","ISLAS VÍRGENES BRITÁNICAS","ISLAS VÍRGENES DE ESTADOS UNÍDOS DE AMÉRICA","ISRAEL","ITALIA","JAMAICA","JAPÓN","JETHOU LIHOU (ISLA DEL CANAL).","JORDANIA","KAZAJSTÁN","KENIA","KIRIBATÍ","LABUÁN","LAOS","LESOTHO","LETONIA","LIBANO","LIBIA","LITUANIA","LUXEMBURGO, GRAN DUCADO DE","MACAO","MACEDONIA","MADAGASCAR","MADEIRA","MALASIA","MALAWI","MALI","MALTA","MARRUECOS","MARTINICA","MAURITANIA","MAYOTTE","MEXICO","MICRONESIA","MOLDAVIA","MONGOLIA","MONTENEGRO","MONTSERRAT","MOZAMBIQUE","MYANMAR (BIRMANIA).","NAMIBIA","NEPAL","NEVIS","NICARAGUA","NÍGER","NIGERIA","NÍUE","NO DECLARADO BE","NORUEGA","NUEVA CALEDONIA","NUEVA ZELANDA","OMÁN","OTROS","PAKISTÁN","PALAOS","PAPUA NUEVA GUINEA","PARAGUAY","PATAU","PERU","PÍTCAIM","POIÍNESIA FRANCESA","POLONIA","PORTUGAL","PRINCIPADO DE ANDORRA","PRINCÍPADO DE LIECHTENSTEIN","PRINCIPADO DE MÓNACO","REÍNO DE SWAZILANDIA","REINO DE TONGA","REINO HACHEMITA DE JORDANÍA","REINO UNIDO (INGLATERRA)","REPÚBLICA CENTROAFRICANA","REPÚBLICA CHECA","REPÚBLICA DE ALBANIA","REPÚBLICA DE ANGOLA","REPÚBLICA DE CABO VERDE","REPÚBLICA DE CHIPRE","REPÚBLICA DE COSTA RICA","REPÚBLICA DE DJIBOUTI","REPÚBLICA DE GUYANA","REPÚBLICA DE HONDURAS","REPÚBLICA DE LAS ISLAS MARSHALL","REPÚBLICA DE LIBERIA","REPÚBLICA DE MALDIVAS","REPÚBLICA DE MAURICIO","REPÚBLICA DE NAURU","REPÚBLICA DE PANAMÁ","REPÚBLICA DE SEYCHELLES","REPÚBLICA DE TRINÍDAD Y TOBAGO","REPÚBLICA DE TÚNEZ","REPÚBLICA DE VANUATU","REPÚBLICA DEL YEMEN","REPÚBLICA DEMOCRÁTICA DEL CONGO","REPÚBLICA DOMINICANA","REPÚBLICA ORIENTAL DEL URUGUAY","REPÚBLICA SOCIALISTA DEMOCRÁTICA DE SRI LANKA","REUNION","RUANDA","RUMANÍA","RUSIA","SAHARA OCCIDENTAL","SAMOA AMERICANA","SAN KITTS","SAN VICENTE Y LAS GRANADINAS","SANTA ELENA","SANTA LUCÍA","SANTA SEDE / ESTADO DE LA CIUDAD DEL VATICANO","SAO TOME Y PRINCIPE","SARK (ISLA DEL CANAL)","SENEGAL","SERBIA","SERENÍSIMA REPÚBLICA DE SAN MARINO","SIERRA LEONA","SINGAPUR","SIRIA","SOMALIA","SUAZILANDIA","SUDAN","SUECIA","SUIZA","SURÁFRICA","SURINAM","TAILANDIA","TAIWÁN","TANZANIA","TAYIKISTÁN","TERRITORIO BRITANICO DEL OCEANO INDICO","TERRITORIOS AUSTRALES FRANCESES","TERRITORIOS PALESTINOS","TIMOR ORIENTAL","TOGO","TOKELAU","TRIESTE","TRISTÁN DE CUNHA","TURKMENISTÁN","TURQUÍA","TUVALU","UCRANIA","UGANDA","UZBEKISTÁN","VENEZUELA","VIETNAM","WALLIS Y FUTUNA","ZAMBIA","ZIMBABUE","ZONA ESPECIAL CANARIA","ZONA LIBRE OSTRAVA"};
	static String[] arrECivil = {"Casado","Soltero","Viudo","Union","Divorciado","Juridico"};
	static String[] arrStates = {"AGUASCALIENTES","BAJA CALIFORNIA","BAJA CALIFORNIA SUR","CAMPECHE", "COAHUILA", "COLIMA", "CHIAPAS", "CHIHUAHUA", "CIUDAD DE MEXICO", "DURANGO", "GUANAJUATO", "GUERRERO", "HIDALGO", "JALISCO", "MEXICO", "MICHOACAN", "MORELOS", "NAYARIT", "NUEVO LEON", "OAXACA", "PUEBLA", "QUERETARO", "QUINTANA ROO", "SAN LUIS POTOSI", "SINALOA", "SONORA","TABASCO","TAMAULIPAS","TLAXCALA","VERACRUZ","YUCATAN","ZACATECAS"};
	static String[] arrOrigenB = {"RENTAS DE INMUEBLES","NEGOCIO PROPIO Y/O DIVIDENDOS","OBSEQUIOS","RIFAS","SORTEOS O PREMIOS","DONACIONES","OTROS","SUELDO, COMISIONES Y/O HONORARIOS","HERENCIAS","PENSIONES","INTERESES O DIVIDENDOS","REMESAS","APUESTAS"};
	static String[] arrCoberturaAMF = {"SETA", "SETB", "CASISTENCIAEXTRANJERO", "CVIH", "CREDUCCIONFRANQUICIA","CPROTECCIONFALLECIMIENTO","CDENTALPREMIUM"};
	static String[] arrCoberturaAM = {"COBERTURAEXTRANJERO","COBERTURAFALLECIMIENTO","COBERTURACATASTROFICASEXTRANJERO","COBERTURAELIMINACIONDEDUCIBLE","COBERTURAVIH","COBERTURADENTALPREMIUM","COBERTURAASISTENCIAEXTRANJERO"};
	static String[] arrCoberturaGral = {"COBERTURAESTUDIANTES","AMCASHDIAGNOSTICO"};
	static String[] arrIncremento = {"0%","25%","50%"};
	static String[] arrCoaseguro = {"10%","15%","20%","25%"};
	
	static String[] arrCMedico = {"YES","NO"};
	
	static int intPais = 0;
	static String strPais = "AFGANISTAN";
	static String strNPais = "";
	
	static int intCivil = 0;
	static String NCivil = "Viudo";
	static String strNCivil = "";
	
	static int intEstado = 0;
	static String strEstado = "AGUASCALIENTES";
	static String strNEstado = "";
	
	static int intOrigenB = 0;
	static String strOrigenB = "RENTAS DE INMUEBLES";
	static String strNOrigenB = "";
	static int intCobertura=0;
	static String strCobertura="";
	static int intIncremento=0;
	static String strIncremento=""; 
	static int intCoaseguro=0;
	static String strCoaseguro=""; 
	
	static int intCMedico = 0;
	static String strCMedico="";
	static String strEdoActual = "SALUDABLE";
	
	static String strFechaInicio = HCommonHelper.getDate();	
	static String strDetalles = "NO SE PRESENTAN DETALLES EN LA ENFERMEDAD";
	static String strClase = "TODO TIPO";
	static String strPrimerCrisisAsma = "30-04-2019";
	static String strFrecuenciaCrisisAsma = "DIARIO";
	static String strDuracionCrisisAsma = "24 horas";
	static String strUltimaCrisisAsma = "HOY";
	static String strCuantasCrisisEsteAnio = "20";
	static String strTratamientoAsma = "INHALADOR";
	static String strTipoTratamientoAsma = "DOBLE INHALADOR";
	static String strFechaHospitalizacion = "30-04-2018";
	static String strTiempoHospitalizacion = "2 AÑOS";
	static String strInformacionExtra = "NO HAY INFORMACION EXTRA";
	
	static String[] arrCuestionario = {"YES","NO"}; 
	static String[] arrCalidad = {"AFICIONADO","PROFESIONAL","INSTRUCTOR","OTRO"};
	static String[] arrSolo = {"SOLO","GRUPO"}; 
	static String[] arrAmateurProf = {"AMATEUR","PROFESIONAL"};
	static String[] arrPista = {"CIRCUITOCERRADO", "CAMPOTRAVIESA", "CARRETERA", "CARRETERA"};
	static int intCuestionario = 0;	
	static String strCuestionario = "";
	static String strEspecifica = "ESPECIFICACION";
	static String strTipoDeporte = "PARACAIDISMO";
	static String strOtro = "TODO EN UNO";
	static String strLCapacitacion = "MEXICO";
	static String strFrecuencia = "DIARIO";
	static String strFechaPractica = "02/05/1990";
	static String strLugarPractica = "MEXICO";
	static String strNombreClub = "CLUB PARACAIDISMO";
	static String strRazonSocial = "DELOITTE";
	static String strMotivo = "PROMOCION";
	static String strFechaAccidente = "30-04-2018";
	static String strInfoExtra = "SIN INFO EXTRA";
	static String strDescripcionAccidente = "CAIDA DE MOTO";
	static String strEdoAccidente = "CURADO";
	static String strModeloMoto   = "2018";
	static String strMarcaMoto     = "ITALICA";
	static String strFechaExpiracion  = "30-04-2018";
	static String strNumeroLicenciaMoto = "30-04-2018";
	static String strCCMoto = "220";
	static String strTrabajo = "TRABAJO";
	static String strSoloTransporte = "TRANSPORTE";
	static String strSoloPaseo = "PASEO";
	static String strFrecuenciaUsoMoto = "DIARIO";
	static String strNombreClubMoto = "HARLEY";
	static String strOtroPista = "CARRETERA";
	static String strVelocidad = "200KM/H";
	static String strEventosAnio = "12";
	static String strMontoPatrocinioMoto = "80000";
	static String strPatrocinadorMoto = "DELOITTE";
	static String strAccidenteMotoDescripcion = "CAIDA";
	static String strInfoExtraMoto = "NO HAY INFO EXTRA";
	static String strVuelasCuales = "AVION DE PAPEL";

	static String strCausaHMF = "ACCIDENTE";
	static String strCompaniaHMF = "MONTERREY";
	static String strMontoCobertura = "50000";
	
	static String strBeneficiarioNombreDB = "JUANITO";
	static String strBeneficiarioAPDB = "PEREZ";
	static String strBeneficiarioAMDB = "GOMEZ";
	static String strIDNoFigura = "2";
	static String strBeneficiarioFECHANDB = "05-06-1990";
	static String strBeneficiarioRelacionDB = "HIJO";
	static String strBeneficiarioPorcentajeDB = "100";	
	static String strAFaltaNombreDB = "PEDRO";
	static String strAFaltaAPDB = "PEREZ";
	static String strAFaltaAMDB = "GOMEZ";
	static String strAFaltaFECHANDB = "05-06-1980";
	static String strAFaltaRelacionDB = "HIJO";
	static String strCalleB = "INSURGENTES SUR";
	static String strNoExtB = "3579";
	static String strNoIntB = "3579";
	static String strColoniaB = "COLONIA";
	static String strDelegacionB = "DELEGACION";	
	static String strCiudadB = "CMDX";
	static String strEstadoB = "PUEBLA";
	static String strPaisB = "MEXICO";
	static String strCPB = "14000";
	static String strPPENombre = "JUAN";
	static String strPPEAP = "GOMEZ";
	static String strPPEAM = "JIMENEZ";
	static String strPPEFNacimiento = "05-06-1990";
	static String strPPENacionalidad = "MEXICO";
	static String strPPERelacion = "TIO";
	static String strPPECSolicitante = "PRESIDENTE";
	static String strPPECPAsegurar = "PRESIDENTE";
	
	static String[] arrConductoP = {"CARGOAUTOMATICO","MODODIRECTO","AGENTE"};
	static String[] arrFormaP = {"MENSUAL","TRIMESTRAL","SEMESTRAL","ANUAL"};
	static String[] arrDiaCobro = {"SUBSECUENTE1","SUBSECUENTE16","OTRO","NOAPLICA"};
	static String[] arrTarjetas = {"CLABE","TARJETA","NOAPLICA"};
	static String[] arrBanco = {"ABN Amro Bank","ACTINVER","Afirme"};
	static String[] arrTipoTarjeta = {"DEBITO","CREDITO"};
	static String[] arrEstatus = {"BORRADOR","COMPLETADA"};
	static String strOtroDiaCobro = "15";
	static String strFechaTentativaCI = "29-09-2020";
	static String strCLABE = "123456789987654321";
	static String strBanco = "ACTINVER";
	static int intBanco = 0;
	static String strNBanco="";
	static String strNumTarjetaCredito = "1234567899876543";
	static String strNumTarjetaDebito = "1234567899876543";
	
	static String strCANombre = "Juan";
	static String strCAAP = "Perez";
	static String strCAAM = "Gomez";
	static String strCATMovil = "5522158197";
	static String strCAEmail = "juan@alguno.com.mx";
	static String strCAFechaNac = "15-05-1985";
	static String strCARFCCURP = "RFC";
	static String strCARFC = "GABA891118HN7";
	static String strCACURP = "GAB891118HNPLL00";
	static String strCANACIONALIDAD = "MEXICO";
	static String strCACALLE = "INSURGENTES SUR";
	static String strCAEXT = "3579";
	static String strCAINT = "10";
	static String strCAColonia = "COLONIA";
	static String strCADelegacion = "TLALPAN";
	static String strCACiudad = "CDMX";
	static String strCAEdo = "PUEBLA";
	static String strCACP = "73080";
	static String strCANoSerie = "50";
	
	static String strLugar = "PUEBLA";
	static String[][] strContenidoCelda;
	
	static boolean exist = ExcelFile.existeArchivo("PageOportunidadesSolicitud.xlsx");
	
	/****************Leer excel para extraccion de datos***********/
	public static String[][] readExcelForOportunitySolicitud(String strHoja) 
	{
		String strArchivo="PageOportunidadesSolicitud.xlsx";			
		
		try {
				strContenidoCelda = ExcelFile.readExcel(strArchivo,strHoja);			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return strContenidoCelda;
	}		
	
	
	/*Datos Personales*/
	public static String getPais()
	{
		String strHoja="DatosPSolicitante";
		if(exist==true)
		{
			strPais = readExcelForOportunitySolicitud(strHoja)[1][0];
		}		
		intPais = arrPaises.length;
		for (int i=0; i<intPais;i++)
		{
			if (strPais.equals(arrPaises[i]))
			{
				strNPais = String.valueOf(i+2);
				break;				
			}
		}
		
		return strNPais;
	}	
	public static String getECivil()
	{
		String strHoja="DatosPSolicitante";
		if(exist==true)
		{
			NCivil = readExcelForOportunitySolicitud(strHoja)[1][5];
		}	
		intCivil = arrECivil.length;
		for (int i=0; i<intCivil;i++)
		{
			if (NCivil.equals(arrECivil[i]))
			{
				strNCivil = String.valueOf(i+2);
				break;				
			}
		}
		return strNCivil;
	}	
	public static String getEstado()
	{
		String strHoja="DatosPSolicitante";
		if(exist==true)
		{
			strEstado = readExcelForOportunitySolicitud(strHoja)[1][12];
		}	
		intEstado = arrStates.length;
		for (int i=0; i<intEstado;i++)
		{
			if (strEstado.equals(arrStates[i]))
			{
				strNEstado = String.valueOf(i+2);
				break;				
			}
		}
		return strNEstado;
	}
	public static String getOrigenB()
	{
		intOrigenB = arrOrigenB.length;
		for (int i=0; i<intOrigenB;i++)
		{
			if (strOrigenB.equals(arrOrigenB[i]))
			{
				strNOrigenB = String.valueOf(i+2);
				break;				
			}
		}
		return strNOrigenB;
	}
	
	/*Coberturas Opcionales*/
	//Alfa Medical Flex
	
	public static String getCoberturaAlfaMedicalFlex()
	{
		intCobertura = HCommonHelper.getRandomNumberInRange(0, 6);
		strCobertura = arrCoberturaAMF[intCobertura];
		return strCobertura;
	}	
	public static String getIncrementoCHMQ()
	{
		intIncremento = HCommonHelper.getRandomNumberInRange(0, 2);
		strIncremento = arrIncremento[intIncremento];		
		return strIncremento;
	}
	
	//Alfa Medical
	public static String getCoaseguro()
	{
		intCoaseguro = HCommonHelper.getRandomNumberInRange(0, 3);
		strCoaseguro = arrCoaseguro[intCoaseguro];		
		return strCoaseguro;
	}
	public static String getCoberturaAlfaMedical()
	{
		intCobertura = HCommonHelper.getRandomNumberInRange(0, 5);
		strCobertura = arrCoberturaAMF[intCobertura];
		strCobertura = "COBERTURAVIH";
		return strCobertura;
	}	
	public static String getCoberturaGeneral()
	{
		intCobertura = HCommonHelper.getRandomNumberInRange(0, 1);
		strCobertura = arrCoberturaGral[intCobertura];
		return strCobertura;
	}
	
	
	/*CUESTIONARIO MEDICO*/
	//ENFERMEDADESCONGENITAS
		//CORAZON	
	public static String getEnfermedadCorazonCirculacion()
	{
		intCMedico = HCommonHelper.getRandomNumberInRange(0, 1);
		strCMedico = arrCMedico[intCMedico];
		
		return strCMedico;
	}
	public static String getApartaroRespiratorio()
	{
		intCMedico = HCommonHelper.getRandomNumberInRange(0, 1);
		strCMedico = arrCMedico[intCMedico];
		
		return strCMedico;
	}
	public static String getEnfermedadesDigestivas()
	{
		intCMedico = HCommonHelper.getRandomNumberInRange(0, 1);
		strCMedico = arrCMedico[intCMedico];
		
		return strCMedico;
	}
	public static String getEnfermedadesGenitouriano()
	{
		intCMedico = HCommonHelper.getRandomNumberInRange(0, 1);
		strCMedico = arrCMedico[intCMedico];
		
		return strCMedico;
	}
	public static String getEnfermedadesEndocrino()
	{
		intCMedico = HCommonHelper.getRandomNumberInRange(0, 1);
		strCMedico = arrCMedico[intCMedico];
		
		return strCMedico;
	}
	public static String getEnfermedadesNervioso()
	{
		intCMedico = HCommonHelper.getRandomNumberInRange(0, 1);
		strCMedico = arrCMedico[intCMedico];
		
		return strCMedico;
	}
	public static String getEnfermedadesEsqueletico()
	{
		intCMedico = HCommonHelper.getRandomNumberInRange(0, 1);
		strCMedico = arrCMedico[intCMedico];
		
		return strCMedico;
	}
	public static String getEnfermedadesTumores()
	{
		intCMedico = HCommonHelper.getRandomNumberInRange(0, 1);
		strCMedico = arrCMedico[intCMedico];
		
		return strCMedico;
	}
	public static String getEnfermedadesEnfermedad8Dias()
	{
		intCMedico = HCommonHelper.getRandomNumberInRange(0, 1);
		strCMedico = arrCMedico[intCMedico];
		
		return strCMedico;
	}
	public static String getDefectoVisualAuditivo()
	{
		intCMedico = HCommonHelper.getRandomNumberInRange(0, 1);
		strCMedico = arrCMedico[intCMedico];
		
		return strCMedico;
	}
	public static String getCHospitalizado()
	{
		intCMedico = HCommonHelper.getRandomNumberInRange(0, 1);
		strCMedico = arrCMedico[intCMedico];
		
		return strCMedico;
	}	
	public static String getDAfeccion()
	{
		intCMedico = HCommonHelper.getRandomNumberInRange(0, 1);
		strCMedico = arrCMedico[intCMedico];
		
		return strCMedico;
	}
	public static String getDTratamientoActual()
	{
		intCMedico = HCommonHelper.getRandomNumberInRange(0, 1);
		strCMedico = arrCMedico[intCMedico];
		
		return strCMedico;
	}
	public static String getDSIDA()
	{
		intCMedico = HCommonHelper.getRandomNumberInRange(0, 1);
		strCMedico = arrCMedico[intCMedico];
		
		return strCMedico;
	}
	public static String getDIntervencionQuirurgica()
	{
		intCMedico = HCommonHelper.getRandomNumberInRange(0, 1);
		strCMedico = arrCMedico[intCMedico];
		
		return strCMedico;
	}
	public static String getDPIntervencionQuirurjica()
	{
		intCMedico = HCommonHelper.getRandomNumberInRange(0, 1);
		strCMedico = arrCMedico[intCMedico];
		
		return strCMedico;
	}
	public static String getEDeformidad()
	{
		intCMedico = HCommonHelper.getRandomNumberInRange(0, 1);
		strCMedico = arrCMedico[intCMedico];
		
		return strCMedico;
	}
	public static String getFElectrocardiogramas()
	{
		intCMedico = HCommonHelper.getRandomNumberInRange(0, 1);
		strCMedico = arrCMedico[intCMedico];
		
		return strCMedico;
	}
	public static String getFPruebasLaboratorio()
	{
		intCMedico = HCommonHelper.getRandomNumberInRange(0, 1);
		strCMedico = arrCMedico[intCMedico];
		
		return strCMedico;
	}
	public static String getFUltrasonidos()
	{
		intCMedico = HCommonHelper.getRandomNumberInRange(0, 1);
		strCMedico = arrCMedico[intCMedico];
		
		return strCMedico;
	}
	public static String getGFumas()
	{
		intCMedico = HCommonHelper.getRandomNumberInRange(0, 1);
		strCMedico = arrCMedico[intCMedico];
		
		return strCMedico;
	}
	public static String getGAlcohol()
	{
		intCMedico = HCommonHelper.getRandomNumberInRange(0, 1);
		strCMedico = arrCMedico[intCMedico];
		
		return strCMedico;
	}
	public static String getGDrogas()
	{
		intCMedico = HCommonHelper.getRandomNumberInRange(0, 1);
		strCMedico = arrCMedico[intCMedico];
		
		return strCMedico;
	}
	public static String getGAbandonoHabito()
	{
		intCMedico = HCommonHelper.getRandomNumberInRange(0, 1);
		strCMedico = arrCMedico[intCMedico];
		
		return strCMedico;
	}
	public static String getCAsma()
	{
		intCMedico = HCommonHelper.getRandomNumberInRange(0, 1);
		strCMedico = arrCMedico[intCMedico];
		
		return strCMedico;
	}
	public static String getAPrimerCrisisAsma()
	{
		return strPrimerCrisisAsma;
	}	
	public static String getAFrecuenciaCrisisAsma()
	{
		return strFrecuenciaCrisisAsma;
	}
	public static String getADuracionCrisisAsma()
	{
		return strDuracionCrisisAsma;
	}
	public static String getAUltimaCrisisAsma()
	{
		return strUltimaCrisisAsma;
	}
	public static String getACuantasCrisisAsmaUltimoAnio()
	{
		return strCuantasCrisisEsteAnio;
	}
	public static String getATratamientoAsma()
	{
		return strTratamientoAsma;
	}
	public static String getATratamientoSemanasAsma()
	{
		intCMedico = HCommonHelper.getRandomNumberInRange(0, 1);
		strCMedico = arrCMedico[intCMedico];
		
		return strCMedico;
	}
	public static String getTipoTratamientoAsma()
	{
		return strTipoTratamientoAsma;
	}
	public static String getAHospitalizadoAsma()
	{
		intCMedico = HCommonHelper.getRandomNumberInRange(0, 1);
		strCMedico = arrCMedico[intCMedico];
		
		return strCMedico;
	}
	public static String getFechaHospitalizacion()
	{
		return strFechaHospitalizacion;
	}
	public static String getTiempoHospitalizacion()
	{
		return strTiempoHospitalizacion;
	}
	public static String getInformacionExtra()
	{
		return strInformacionExtra;
	}
	
	//CORAZON
	public static String getEdoActual()
	{
		return strEdoActual;
	}
	public static String getFechaInicio()
	{
		return strFechaInicio;
	}
	public static String getDetalles()
	{
		return strDetalles;
	}
	//RESPIRATORIAS
	public static String getEdoActualA2()
	{
		return strEdoActual;
	}
	public static String getFechaInicioA2()
	{
		return strFechaInicio;
	}
	public static String getDetallesA2()
	{
		return strDetalles;
	}
	//DIGESTIVAS
	public static String getEdoActualA3()
	{
		return strEdoActual;
	}
	public static String getFechaInicioA3()
	{
		return strFechaInicio;
	}
	public static String getDetallesA3()
	{
		return strDetalles;
	}
	//GENITOURIANO
	public static String getEdoActualA4()
	{
		return strEdoActual;
	}
	public static String getFechaInicioA4()
	{
		return strFechaInicio;
	}
	public static String getDetallesA4()
	{
		return strDetalles;
	}
	//ENDOCRINO
	public static String getEdoActualA5()
	{
		return strEdoActual;
	}
	public static String getFechaInicioA5()
	{
		return strFechaInicio;
	}
	public static String getDetallesA5()
	{
		return strDetalles;
	}	
	//NERVIOSO
	public static String getEdoActualA6()
	{
		return strEdoActual;
	}
	public static String getFechaInicioA6()
	{
		return strFechaInicio;
	}
	public static String getDetallesA6()
	{
		return strDetalles;
	}
	//ESQUELETICO
	public static String getEdoActualA7()
	{
		return strEdoActual;
	}
	public static String getFechaInicioA7()
	{
		return strFechaInicio;
	}
	public static String getDetallesA7()
	{
		return strDetalles;
	}
	//TUMORES
	public static String getEdoActualA8()
	{
		return strEdoActual;
	}
	public static String getFechaInicioA8()
	{
		return strFechaInicio;
	}
	public static String getDetallesA8()
	{
		return strDetalles;
	}
	//ENFERMEDAD8DIAS
	public static String getEdoActualA9()
	{
		return strEdoActual;
	}
	public static String getFechaInicioA9()
	{
		return strFechaInicio;
	}
	public static String getDetallesA9()
	{
		return strDetalles;
	}
	//DEFECTOVISUALAUDITIVO
	public static String getEdoActualB1()
	{
		return strEdoActual;
	}
	public static String getFechaInicioB1()
	{
		return strFechaInicio;
	}
	public static String getDetallesB1()
	{
		return strDetalles;
	}
	//hOSPITALIZADO
	public static String getEdoActualC1()
	{
		return strEdoActual;
	}
	public static String getFechaInicioC1()
	{
		return strFechaInicio;
	}
	public static String getDetallesC1()
	{
		return strDetalles;
	}
	//Antecedesntes Patalogicos
	public static String getEdoActualD1()
	{
		return strEdoActual;
	}
	public static String getFechaInicioD1()
	{
		return strFechaInicio;
	}
	public static String getDetallesD1()
	{
		return strDetalles;
	}
	public static String getEdoActualD2()
	{
		return strEdoActual;
	}
	public static String getFechaInicioD2()
	{
		return strFechaInicio;
	}
	public static String getDetallesD2()
	{
		return strDetalles;
	}
	public static String getEdoActualD3()
	{
		return strEdoActual;
	}
	public static String getFechaInicioD3()
	{
		return strFechaInicio;
	}
	public static String getDetallesD3()
	{
		return strDetalles;
	}
	public static String getEdoActualD4()
	{
		return strEdoActual;
	}
	public static String getFechaInicioD4()
	{
		return strFechaInicio;
	}
	public static String getDetallesD4()
	{
		return strDetalles;
	}
	public static String getEdoActualD5()
	{
		return strEdoActual;
	}
	public static String getFechaInicioD5()
	{
		PageOportunidadesSolicitudCuestionarioMedico.aniomenos = false;
		PageOportunidadesSolicitudCuestionarioMedico.mesmas = true;
		String strFechaPendiente = HCommonHelper.getDate();
		PageOportunidadesSolicitudCuestionarioMedico.mesmas = false;
		return strFechaPendiente;
	}
	public static String getDetallesD5()
	{
		return strDetalles;
	}
	//DEFORMIDAD
	public static String getEdoActualE1()
	{
		return strEdoActual;
	}
	public static String getFechaInicioE1()
	{
		return strFechaInicio;
	}
	public static String getDetallesE1()
	{
		return strDetalles;
	}
	//PRACTICADO
	public static String getEdoActualF1()
	{
		return strEdoActual;
	}
	public static String getFechaInicioF1()
	{
		return strFechaInicio;
	}
	public static String getDetallesF1()
	{
		return strDetalles;
	}
	public static String getEdoActualF2()
	{
		return strEdoActual;
	}
	public static String getFechaInicioF2()
	{
		return strFechaInicio;
	}
	public static String getDetallesF2()
	{
		return strDetalles;
	}
	public static String getEdoActualF3()
	{
		return strEdoActual;
	}
	public static String getFechaInicioF3()
	{
		return strFechaInicio;
	}
	public static String getDetallesF3()
	{
		return strDetalles;
	}
	public static String getClaseG1()
	{
		return strClase;
	}
	public static String getClaseG2()
	{
		return strClase;
	}
	public static String getClaseG3()
	{
		return strClase;
	}
	public static String getClaseG4()
	{
		return strClase;
	}
	public static String getFechaInicioG4()
	{
		return strFechaInicio;
	}
	
	
	/*CUESTIONARIO DE DEPORTES*/
	
	public static String getExpuesto()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];			
		return strCuestionario;
	}
	public static String getDeporteP()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];		
		return strCuestionario;
	}
	public static String getCalidad()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 3);
		strCuestionario = arrCalidad[intCuestionario];		
		return strCuestionario;
	}
	public static String getSolo()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrSolo[intCuestionario];			
		return strCuestionario;
	}	
	public static String getCapacitacion()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];			
		return strCuestionario;
	}	
	public static String getClub()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];		
		return strCuestionario;
	}
	public static String getLicencia()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];		
		return strCuestionario;
	}
	public static String getLVigente()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];		
		return strCuestionario;
	}
	public static String getPatrocinio()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];		
		return strCuestionario;
	}
	public static String getAccidente()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];		
		return strCuestionario;
	}
	public static String getCoberturaExtra()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];		
		return strCuestionario;
	}
	public static String getCuestionarioMoto()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];		
		return strCuestionario;
	}
	public static String getLicenciaMoto()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];		
		return strCuestionario;
	}
	public static String getPropietarioMoto()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];		
		return strCuestionario;
	}
	public static String getUsoTransporte()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];		
		return strCuestionario;
	}
	public static String getUsoRecreativo()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];		
		return strCuestionario;
	}
	public static String getParticipaCompetencias()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];		
		return strCuestionario;
	}
	public static String getAmateurProfesional()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrAmateurProf[intCuestionario];		
		return strCuestionario;
	}
	public static String getPista()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 3);
		strCuestionario = arrPista[intCuestionario];			
		return strCuestionario;
	}
	public static String getPatrocinioMoto()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];		
		return strCuestionario;
	}
	public static String getAccidenteMoto()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];		
		return strCuestionario;
	}
	public static String getVuelas()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];		
		return strCuestionario;
	}
	public static String getVuelasCuales() 
	{
		return strVuelasCuales;
	}
	
	public static String getInfoExtraMoto() 
	{
		return strInfoExtraMoto;
	}
	public static String getAccidentemotoDescripcion() 
	{
		return strAccidenteMotoDescripcion;
	}
	public static String getPatrocinadorMoto() 
	{
		return strPatrocinadorMoto;
	}
	public static String getMontoPatrocinioMoto() 
	{
		return strMontoPatrocinioMoto;
	}
	public static String getEventosAnio() 
	{
		return strEventosAnio;
	}
	public static String getVelocidad() 
	{
		return strVelocidad;
	}
	public static String getOtroPista() 
	{
		return strOtroPista;
	}
	public static String getNombreClubMoto() 
	{
		return strNombreClubMoto;
	}
	public static String getFrecuenciaUsoMoto() 
	{
		return strFrecuenciaUsoMoto;
	}
	public static String getSoloPaseo() 
	{
		return strSoloPaseo;
	}
	public static String getSoloTransporte() 
	{
		return strSoloTransporte;
	}
	public static String getTrabajoCotidiano() 
	{
		return strTrabajo;
	}
	public static String getCCMoto() 
	{
		return strCCMoto ;
	}
	public static String getModeloMoto() 
	{
		return strModeloMoto;
	}
	public static String getMarcaMoto() 
	{
		return strMarcaMoto;
	}
	public static String getFechaExpiracionMoto() 
	{
		return strFechaExpiracion;
	}
	public static String geNumeroLicMoto() 
	{
		return strNumeroLicenciaMoto;
	}
	public static String getInfoExtra() 
	{
		return strInfoExtra;
	}

	public static String getDescripcionAccidente() 
	{
		return strDescripcionAccidente;
	}

	public static String getEdoAccidente() 
	{
		return strEdoAccidente;
	}

	public static String getFechaAccidente() 
	{
		return strFechaAccidente;
	}
	
	
	public static String getRazonSocial() 
	{
		return strRazonSocial;
	}
	public static String getMotivo() 
	{
		return strMotivo;
	}
	public static String getNombreClub() 
	{
		return strNombreClub;
	}
	public static String getLCapacitacion() 
	{
		return strLCapacitacion;
	}
	public static String getFrecuencia() 
	{
		return strFrecuencia;
	}
	public static String getFechaPractica() 
	{
		return strFechaPractica;
	}
	public static String getLugarPractica() 
	{
		return strLugarPractica;
	}
	public static String getOtro() 
	{
		return strOtro;
	}
	public static String getEspecifica2() 
	{
		return strEspecifica;
	}
	public static String getTipoDeporte() 
	{
		return strTipoDeporte;
	}
	public static String getEspecifica1() 
	{
		return strEspecifica;
	}
	
	
	/*******HISTORIAL MEDICO FAMILIAR*************/
	public static String getDiabetes()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];		
		return strCuestionario;
	}
	public static String getAntiguedad()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];		
		return strCuestionario;
	}
	public static String getPolizaGastos()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];		
		return strCuestionario;
	}
	
	
	
	
	public static String getCausa2HMF()
	{
		return strCausaHMF;
	}
	public static String getCompania2HMF()
	{
		return strCompaniaHMF;
	}
	public static String gerFecha2HMF()
	{
		return strFechaInicio;
	}
	public static String getMontoHMF()
	{
		return strMontoCobertura;
	}
	public static String getEdoActualHMF()
	{
		return strEdoActual;
	}
	public static String getFecha1HMF()
	{
		return strFechaInicio;
	}
	public static String getDetalles1HMF()
	{
		return strDetalles;
	}
	
	
	//*********************DESIGNACION BENEFICIARIOS******************//
	public static String getAddBeneficiariosDB()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];		
		return strCuestionario;
	}
	public static String getAFaltaDe()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];		
		return strCuestionario;
	}
	public static String getPPE()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];		
		return strCuestionario;
	}
	public static String getPPESolicitante()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];		
		return strCuestionario;
	}
	public static String getPPEPAsegurar()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];		
		return strCuestionario;
	}
	public static String getTPAsegurar()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];		
		return strCuestionario;
	}
	public static String getTSolicitante()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];		
		return strCuestionario;
	}
	
	
	public static String getBeneficiarioNombreDB()
	{
		return strBeneficiarioNombreDB;
	}
	public static String getBeneficiarioAPDB()
	{
		return strBeneficiarioAPDB;
	}
	public static String getBeneficiarioAMDB()
	{
		return strBeneficiarioAMDB;
	}
	public static String getBeneficiarioFECHANDB()
	{
		return strBeneficiarioFECHANDB;
	}
	public static String getBeneficiarioRelacionDB()
	{
		return strBeneficiarioRelacionDB;
	}
	public static String getBeneficiarioPorcentajeDB()
	{
		return strBeneficiarioPorcentajeDB;
	}
	public static String getAFaltaNombreDB()
	{
		return strAFaltaNombreDB;
	}
	public static String getAFaltaAPDB()
	{
		return strAFaltaAPDB;
	}
	public static String getAFaltaAMDB()
	{
		return strAFaltaAMDB;
	}
	public static String getAFaltaFECHANDB()
	{
		return strAFaltaFECHANDB;
	}
	public static String getAFaltaRelacionDB()
	{
		return strAFaltaRelacionDB;
	}
	public static String getCalleB()
	{
		return strCalleB;
	}
	
	public static String getNoExtB()
	{
		return strNoExtB;
	}
	public static String getNoIntB()
	{
		return strNoIntB;
	}
	public static String getColoniaB()
	{
		return strColoniaB;
	}
	public static String getDelegacionB()
	{
		return strDelegacionB;
	}
	public static String getCiudadB()
	{
		return strCiudadB;
	}
	public static String getEstadoB()
	{
		return strEstadoB;
	}
	public static String getPaisB()
	{
		return strPaisB;
	}
	public static String getCPB()
	{
		return strCPB;
	}
	public static String getIDFigura()
	{
		return strIDNoFigura;
	}
	public static String getPPEAP()
	{
		return strPPEAP;
	}
	public static String getPPEAM()
	{
		return strPPEAM;
	}
	public static String getPPEFNacimiento()
	{
		return strPPEFNacimiento;
	}
	public static String getPPENacionalidad()
	{
		return strPPENacionalidad;
	}
	public static String getPPERelacion()
	{
		return strPPERelacion;
	}
	public static String getPPECSolicitante()
	{
		return strPPECSolicitante;
	}
	public static String getPPECPAsegura()
	{
		return strPPECPAsegurar;
	}
	public static String getPPENombre()
	{
		return strPPENombre;
	}
	
	/*************INFORMACION COBRANZA*************/
	public static String geteConductoPago()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 2);
		strCuestionario = arrConductoP[intCuestionario];		
		return strCuestionario;
	}
	public static String geteFormaPago()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 3);
		strCuestionario = arrFormaP[intCuestionario];			
		return strCuestionario;
	}
	public static String geteCobroInicial()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];	
		return strCuestionario;
	}
	public static String getDiaCobro()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 3);
		strCuestionario = arrDiaCobro[intCuestionario];	
		return strCuestionario;
	}
	public static String getTarjeta()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 2);
		strCuestionario = arrTarjetas[intCuestionario];	
		return strCuestionario;
	}
	public static String getTipoTarjeta()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrTipoTarjeta[intCuestionario];	
		return strCuestionario;
	}
	public static String getBanco()
	{
		intBanco = arrBanco.length;
		for (int i=0; i<intBanco;i++)
		{
			if (strBanco.equals(arrBanco[i]))
			{
				strNBanco = String.valueOf(i+2);
				break;				
			}
		}
		return strNBanco;
	}	
	public static String getCuentahabiente()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0,1);
		strCuestionario = arrCuestionario[intCuestionario];	
		return strCuestionario;
	}
	
	
	
	public static String getCANoSerie()
	{
		return strCANoSerie;
	}
	public static String getCACP()
	{
		return strCACP;
	}
	public static String getCAEdo()
	{
		return strCAEdo;
	}
	public static String getCACiudad()
	{
		return strCACiudad;
	}
	public static String getCADelegacion()
	{
		return strCADelegacion;
	}
	public static String getCAColonia()
	{
		return strCAColonia;
	}
	public static String getCAInt()
	{
		return strCAINT;
	}
	public static String getCAExt()
	{
		return strCAEXT;
	}
	public static String getCACalle()
	{
		return strCACALLE;
	}
	public static String getCANacionalidad()
	{
		return strCANACIONALIDAD;
	}
	public static String getCACURP()
	{
		return strCACURP;
	}
	public static String getCARFC()
	{
		return strCARFC;
	}
	public static String getCARFCCURP()
	{
		return strCARFCCURP;
	}
	public static String getCAFechaNac()
	{
		return strCAFechaNac;
	}
	public static String getCAEmail()
	{
		return strCAEmail;
	}
	public static String getCAMovil()
	{
		return strCATMovil;
	}
	public static String getCAAM()
	{
		return strCAAM;
	}
	public static String getCAAP()
	{
		return strCAAP;
	}
	public static String getCANombre()
	{
		return strCANombre;
	}
	public static String getNumTarjetaDebito()
	{
		return strNumTarjetaDebito;
	}
	public static String getNumTarjetaCredito()
	{
		return strNumTarjetaCredito;
	}
	public static String getDiaCobroOtro()
	{
		return strOtroDiaCobro;
	}
	public static String getFechaTentativa()
	{
		return strFechaTentativaCI;
	}
	public static String getCLABE()
	{
		return strCLABE;
	}
	
	/*******ACUERDO*************/
	public static String getSolicitante()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];		
		return strCuestionario;
	}
	public static String getPAsegurarT()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];		
		return strCuestionario;
	}
	public static String getPAsegurar()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];		
		return strCuestionario;
	}
	public static String getConsentimiento()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrCuestionario[intCuestionario];		
		return strCuestionario;
	}
	public static String getLugar()
	{
		return strLugar;
	}
	
	public static String getEstatus()
	{
		intCuestionario = HCommonHelper.getRandomNumberInRange(0, 1);
		strCuestionario = arrEstatus[intCuestionario];		
		return strCuestionario;
	}
}
