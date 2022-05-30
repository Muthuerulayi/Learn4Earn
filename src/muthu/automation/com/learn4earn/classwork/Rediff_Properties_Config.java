package com.learn4earn.classwork;

import java.io.FileInputStream;
import java.util.Properties;

public class Rediff_Properties_Config {

	public static void main(String[] args) throws Exception {

		Properties prop = new Properties();
		//String path = "C:\\Users\\muthu\\eclipse-workspace\\MAVEN_PROJECT_Learn4Earn\\src\\muthu\\automation\\com\\learn4earn\\classwork\\config.properties";
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir") + "\\src\\muthu\\automation\\com\\learn4earn\\classwork\\config.properties";
		FileInputStream ip = new FileInputStream(path);
		prop.load(ip);
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));

	}

}
