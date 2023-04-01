package com.orangeHRM.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
Properties pro;
	
	public ReadConfig(){
		
	File sr= new File("./Configuration/config.properties");
	
	try {
		
		FileInputStream des = new FileInputStream(sr);
		pro =new Properties();
		pro.load(des);
		}catch(Exception e) {
	
		System.out.println("Exception is " + e.getMessage());
	}
	}
	
	public String get_Url() {
		String url=pro.getProperty("burl");
		return url;
	}
	public String getUser_Name() {
		String un=pro.getProperty("uname");
		return un;
	}
	public String getUser_Paass() {
		String ps=pro.getProperty("paswrd");
		return ps;
	}
}
	


