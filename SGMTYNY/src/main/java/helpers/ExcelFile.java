package helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile {
	
	static String StrPath = Hproperties.leerPath();
	static String[][] strContenidoCelda;
	static int intRows=0;
	static int intColum=0;
	//static String strContenidoCelda = "";
	private final static String path = StrPath +"\\Recursos\\Datos\\";
	static FileInputStream fileInputStream;
	static XSSFWorkbook book;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;
	static File file;
	private static Row actualRow;
	private static Cell actualCell;
	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH;mm;ss");
	Date date = new Date();
	private String actualDate;
	
	
	private static Boolean existsSheet(String sheetName) {
		Boolean existance = false;
		int i = 0;
		
		while(i < book.getNumberOfSheets()) {
			
			if(book.getSheetAt(i).getSheetName().equals(sheetName)) {
				existance = true;
				i = book.getNumberOfSheets();
			}else {
				i++;
			}	
		}
		return existance;
	}
	
	public static String[][] readExcel(String fileName,String sheetName) throws IOException {
		file = new File(path + fileName);		
		if(file.exists()){
			fileInputStream = new FileInputStream(file);
			book = new XSSFWorkbook(fileInputStream);
				if(existsSheet(sheetName)) {
					
				sheet = book.getSheet(sheetName);

				intRows=sheet.getPhysicalNumberOfRows();
				intColum=sheet.getRow(0).getLastCellNum();				
				
				strContenidoCelda = new String[intRows][intColum];
							
				for (int i = 0; i<intRows; i++)
				{
					row = sheet.getRow(i);
					for (int j = 0; j<intColum; j++)
					{
						cell = row.getCell(j);
						strContenidoCelda[i][j]=cell.getStringCellValue();
					}					
				}								
					book.close();
				}
		}	
		else {System.out.println("No existe");}
	return strContenidoCelda;
	}
	public void writeOnExcel(String fileName) throws IOException {
		file = new File(path + fileName);
		if(file.exists()){
			fileInputStream = new FileInputStream(file);
			book = new XSSFWorkbook(fileInputStream);
			actualDate = dateFormat.format(date);
			System.out.println("Actual date-time: " + actualDate);
			System.out.println(book.getNumberOfSheets());
			
			sheet = book.createSheet("T_"+actualDate);
			
			Object[][] datatypes = {
					{"Datatype","Type", "Size(in bytes)"},
					{"int","primitive",2},
					{"String", "Non-Primitive", "No fixed size"},
					{"float", "Primitive", 4}
			};
			System.out.println("Creating excel sheet...");
			int rowNumber=0;
			for (Object[] datatype: datatypes) {
				Row row = sheet.createRow(rowNumber++);
				int colNumber = 0;
				
				for (Object field:datatype) {
					Cell cell = row.createCell(colNumber++);
					if(field instanceof String) {
						cell.setCellValue((String)field);
					}else if(field instanceof Integer) {
						cell.setCellValue((Integer)field);
					}
				}
			}
			FileOutputStream outputStream = new FileOutputStream(file);
			book.write(outputStream);
			System.out.println(book.getNumberOfSheets());
			book.close();
		}
	}
}
