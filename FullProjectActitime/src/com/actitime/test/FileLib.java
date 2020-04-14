package com.actitime.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


/**
 * This is generic class
 * @author singh
 *
 */
public class FileLib 
{
	/**
	 * 
	 * @param Key
	 * @return
	 * @throws Exception
	 */
	public String getPropertyFileData(String Key) throws Exception
	{ 
		FileInputStream fis=new FileInputStream("./Data/commondata.properties");
		Properties p=new Properties();
		p.load(fis);
		String value=p.getProperty(Key);
		return value;
	 }
	
	/**
	 * 
	 * @param path
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws Exception
	 * @throws IOException
	 */
	public String getExcelData(String path,String sheetname,int row,int cell) throws Exception, IOException
	{
	FileInputStream fis=new FileInputStream(path);
	Workbook wb=WorkbookFactory.create(fis);
	String data=wb.getSheet(sheetname).getRow(row).getCell(cell).toString();
	return data;
	}
	
 /**
  * 
  * @param path
  * @param sheetname
  * @param row
  * @param cell
  * @param value
  * @throws EncryptedDocumentException
  * @throws IOException
  */
	public void setExcelData(String path,String sheetname,int row,int cell,String value) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(value);
		FileOutputStream fos=new FileOutputStream(path);
		wb.write(fos);
		wb.close();
		
	}
}
