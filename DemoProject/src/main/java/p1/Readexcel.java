package p1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel {

	public static void main(String[] args) throws  IOException  {
		FileInputStream fis=new FileInputStream(new File("C:\\Users\\ACER\\Desktop\\Stud.xlsx"));  
		 
		XSSFWorkbook wb=new XSSFWorkbook(fis);   
		
		XSSFSheet sheet=wb.getSheetAt(0);  
		
		FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();  
		for(Row row: sheet)       
		{  
		for(Cell cell: row)     
		{  System.out.println(cell);
		}
		System.out.println();  
		}  
		}  
		
	}


