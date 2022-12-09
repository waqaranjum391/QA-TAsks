package WxcelWorking;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelWrite {

	
		public static void main(String[] args) throws IOException {
			XSSFWorkbook workbook1=new XSSFWorkbook();
			XSSFSheet sheet1=workbook1.createSheet("asadraza");
			sheet1.createRow(0);
			sheet1.getRow(0).createCell(0).setCellValue("asad");
			sheet1.getRow(0).createCell(1).setCellValue("asad123");
			
			File fil=new File("C:\\Users\\4391\\eclipse-workspace\\ExcelFiles\\trst76.xlsx");
			FileOutputStream fos=new FileOutputStream(fil);
			workbook1.write(fos);
			//workbook1.close();
			
		

	}

}
