package WxcelWorking;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
public class dataprovider {

	@DataProvider
	public String [][] getdata() throws IOException {
		File excelfile=new File("./src/test/resources/trst6.xlsx");
		System.out.println(excelfile.exists());
		FileInputStream fis=new FileInputStream(excelfile);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("asadraza");
		int noofrows=sheet.getPhysicalNumberOfRows();
		int noofcoloms=sheet.getRow(0).getLastCellNum();
		System.out.println("No of rows"+"  "+noofrows);
		System.out.println("No of rows"+"  "+noofcoloms);
		
		
		String array[][]=new String[noofrows-1][noofcoloms];
		for(int i=0;i<noofrows-1;i++) {
			for(int j=0;j<noofcoloms;j++) {
				DataFormatter df=new DataFormatter();
				array[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
				
			}
			
		}
		
		return array;

	}

}
