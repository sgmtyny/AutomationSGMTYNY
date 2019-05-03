package helpers;

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
	static String strPais = "MEXICO";
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
	
	/*Datos Personales*/
	public static String getPais()
	{
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
		//strCobertura = arrCoberturaAMF[intCobertura];
		strCobertura = "CVIH";
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
	
}
