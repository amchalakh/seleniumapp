package com.edusol.mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	public static WebDriver driver;
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.gecko.driver","E:\\Softwares\\jars\\Selenium Jars\\geckodriver.exe");
    	driver = new FirefoxDriver();
    	driver.get("http://gmail.com");
    	displayTitle();
       
    }
    public static void displayTitle(){
    	
    	String title = driver.getTitle();
    	System.out.println(title);
    	changeCase(title);
    	
    }
    public static void changeCase(String t){
    	System.out.println(t.toUpperCase());
    }
}
