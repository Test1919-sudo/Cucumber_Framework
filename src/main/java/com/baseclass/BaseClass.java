package com.baseclass;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BaseClass 
{
	public static WebDriver driver;
	public static Properties config;
	
	public BaseClass()
	{
		String propertyFilePath = "E:\\KaminiV3\\Cucumber_Framework\\src\\main\\java\\com\\config\\config.properties";
		
		FileInputStream fis = null;
			
		config = new Properties();
			
		try
		{
			System.out.println("loading >> "+propertyFilePath);
				
			fis = new FileInputStream(propertyFilePath);
				
			config.load(fis);
				
			fis.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		} 
		
	}
	
	public static void initialization(String url)
	{
		String browserName = config.getProperty("browser");	
		  try
			{
				if(browserName.equalsIgnoreCase("Chrome"))
				{
					System.setProperty("webdriver.chrome.driver", "E:\\KaminiV3\\Cucumber_Framework\\Drivers\\chromedriver.exe");
					driver = new ChromeDriver();
					//
				}
				else if(browserName.equalsIgnoreCase("firefox"))
				{
					System.setProperty("webdriver.gecko.driver", "E:\\KaminiV3\\Cucumber_Framework\\Drivers\\geckodriver.exe");
					driver = new FirefoxDriver();
				}
				else if(browserName.equalsIgnoreCase("IE"))
				{
					driver = new InternetExplorerDriver();
				}
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}  
		    driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(config.getProperty(url));
	}

//	public static void getTitle()
//	{
//		try
//		{
//			driver.getTitle();
//		}
//		catch(Exception e) 
//		{
//			e.printStackTrace();
//		}
//	}

}
