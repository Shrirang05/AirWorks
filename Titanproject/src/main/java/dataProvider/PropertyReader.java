package dataProvider;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

	private static Properties prop;
	
	
public static void main(String[] args) {
	
	   prop = new Properties();
		    try(InputStream fis = new FileInputStream("config.properties"))
		    	 {
		        prop.load(fis);
		    }
		    catch(Exception e) {
		        System.out.println("Unable to find the specified properties file");
		        e.printStackTrace();
		        return;
		    }
		System.out.println(prop.get(prop)); 
	}
}

