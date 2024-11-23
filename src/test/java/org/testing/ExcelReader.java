package org.testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelReader {
	
	public void getData() throws FileNotFoundException
	{
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Data\\InputData.xlsx");
	
	//Step 1
		FileInputStream fis = new FileInputStream(f);//Reading the file
	//step 2
		
		WorkbookFactory.create(fis);
	
	}

}
