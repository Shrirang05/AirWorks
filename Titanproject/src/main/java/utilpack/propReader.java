package utilpack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class propReader
{
	static  FileReader reader;
		 private static Properties prop;
		
		 public static String init_prop(String key)
		 {
								
			try {
				reader = new FileReader("./src/test/resources/propertiesFiles/config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 prop=new Properties();
			 try {
				prop.load(reader);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		 
			return  prop.getProperty(key);
		}
	
		 public static String ExcelStringValueReader (String sheet, int r, int c) throws IOException
		 {
			 FileInputStream file = new FileInputStream ("C:\\Users\\Shrirang.ladda\\Desktop\\TestData.xlsx");
			 XSSFWorkbook book =  new XSSFWorkbook(file);
			 String value = book.getSheet(sheet).getRow(r).getCell(c).getStringCellValue();
			 return value;	
			 
		 }
		 
		 
		 public static String ExcelIntValueReader (String sheet, int r, int c) throws IOException
		 {
			 FileInputStream file = new FileInputStream ("C:\\Users\\Shrirang.ladda\\Desktop\\TestData.xlsx");
			 XSSFWorkbook book =  new XSSFWorkbook(file);
			 int var1 = (int) book.getSheet(sheet).getRow(r).getCell(c).getNumericCellValue();
			 String var = Integer.toString(var1);
			 return var;	
		 }
		 
		 
		  public static String ExcelDatePicker (String sheet, int r, int c) throws IOException
		 {
			 FileInputStream file = new FileInputStream ("C:\\Users\\Shrirang.ladda\\Desktop\\TestData.xlsx");
			 XSSFWorkbook book =  new XSSFWorkbook(file);
			 String date = book.getSheet(sheet).getRow(r).getCell(c).getStringCellValue();
			 String d[] = date.split("\"");
			 String de = d[1];
			 return de;
		}
		 
		 
		 public static void main(String[] args) throws IOException 
		 {
			System.out.println(propReader.ExcelIntValueReader("data",15,1));
			
		 }
	
    
    
   
    
    
    
}
