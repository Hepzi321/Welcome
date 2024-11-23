package org.testing;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyTest {
	public static void main(String[] args) throws IOException {
		
		
			File f = new File(System.getProperty("user.dir")+ "\\src\\test\\resources\\ConfigFile\\config.properties");
		FileReader fr = new FileReader(f);
			Properties prop = new Properties();
			
			prop.load(fr);
			
			System.out.println(prop.getProperty("browser"));
			
			System.out.println(prop.getProperty("testUrl"));
			
		

}
}
	
