package WxcelWorking;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class readandprintdata {

	public static void main(String[] args) throws IOException {
		File excelfile=new File("./src/test/resources/trst6.xlsx");
		System.out.println(excelfile.exists());
		FileInputStream fis=new FileInputStream(excelfile);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("asadraza");
		int noofrows=sheet.getPhysicalNumberOfRows();
		int noofcoloms=sheet.getRow(0).getLastCellNum();
		System.out.println("No of rows"+"  "+noofrows);
		System.out.println("No of rows"+"  "+noofcoloms);
		String array[][]=new String[noofrows][noofcoloms];
		for(int i=0;i<noofrows;i++) {
			for(int j=0;j<noofcoloms;j++) {
				DataFormatter df=new DataFormatter();
				array[i][j]=df.formatCellValue(sheet.getRow(i).getCell(j));
				
			}
			
		}
		for(int i=0;i<noofrows;i++) {
			for(int j=0;j<noofcoloms;j++) {
				System.out.println(array[i][j]);
			}
			System.out.println();
			
		}
		workbook.close();
		fis.close();

	
	}

}
