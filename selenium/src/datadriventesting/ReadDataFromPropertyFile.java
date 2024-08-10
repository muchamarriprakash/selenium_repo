package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile 

{
	public static void main(String[] args) throws IOException
	
	{
		//step:1 create fileinputstream object
		FileInputStream fis = new FileInputStream("./Testdata/commondata.properties");
		
		//step:2 create respective file type object
		Properties prop = new Properties();
		
		//step:3 call read methods
		prop.load(fis);
		String url = prop.getProperty("url");
		String EMAIL = prop.getProperty("email");
		
		System.out.println(url);
		System.out.println(EMAIL);
	}

}
