package utilities;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

class XLUtils{
	FileInputStream fis1=new FileInputStream("C:\\Users\\Hp\\OneDrive\\Documents\\mscontact.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(fis1);
	XSSFSheet sheet = workbook.getSheetAt(0);
	
	Iterator<Row> row=sheet.iterator();
	Row firstRow = row.next();
	Row secondRow= row.next();
	Row thirdRow= row.next();
	
	Iterator<Cell> cell=firstRow.cellIterator();
	cell.next();
	
	String Name=cell.next().getStringCellValue();
	
	Iterator<Cell> cell1=secondRow.cellIterator();
	cell1.next();
	
	String Email=cell1.next().getStringCellValue();
	
	Iterator<Cell> cell2=thirdRow.cellIterator();
	cell2.next();
	
	String Message=cell2.next().getStringCellValue();
	
	con.getcName().sendKeys(Name);
	
	con.getcEmail().sendKeys(Email);
	
	con.getcMessage().sendKeys(Message);
	
	con.getcSubmit().click();
}