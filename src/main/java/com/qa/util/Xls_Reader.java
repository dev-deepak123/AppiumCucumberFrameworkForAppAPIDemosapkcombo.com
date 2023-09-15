package com.qa.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader {
	
	public String path;
	public FileInputStream fis = null;
	public FileOutputStream fileOut = null;
	private XSSFWorkbook workbook = null;
	public XSSFSheet sheet = null;
	
	
	
	public Xls_Reader(String path) {
		
				this.path = path;
				try {
					fis = new FileInputStream(path);
					workbook = new XSSFWorkbook(fis);
					sheet = workbook.getSheetAt(0);
					fis.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

}
