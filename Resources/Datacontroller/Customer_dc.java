package Datacontroller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Customer_dc 
{
	static FileInputStream fi = null;  
	static Workbook wb = null;
	static Sheet sh = null;
	static Row rw = null;
	static Cell c = null;
	
	
	public static Object[][] create_customer(String filename, String sheetname) throws IOException
	{
		fi = new FileInputStream(".\\Resources\\Testdata\\" + filename + ".xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet(sheetname);
//		System.out.println(sh.getLastRowNum()+1);
//		System.out.println(sh.getRow(0).getLastCellNum());
		Object [][] obj = new Object[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
		
		
		for(int i = 0; i <= sh.getLastRowNum()-1; i++)
		{
			for(int j = 0; j <= sh.getRow(0).getLastCellNum()-1; j++)
			{
				obj[i][j] = sh.getRow(i+1).getCell(j).getStringCellValue();
			}
		}
		return obj;
		
	}
	
//	public static void main(String[] args) throws IOException {
//		Customer_dc.create_customer("customer", "createcustomer");
//	}

}
