package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Property {
	public  Properties prop;
	public static WebDriver driver;
	//instance variables
	
	public void loadConfig() {
		try {
			 prop = new Properties();
			 System.out.println("super constructor invokd");
			 FileInputStream fi = new FileInputStream("F:\\COGNIZANT\\Workspace\\Flipkart\\Configration\\config.properties");
			 prop.load(fi);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
