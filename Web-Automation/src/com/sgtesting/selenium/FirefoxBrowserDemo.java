package com.sgtesting.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserDemo
{
	private static WebDriver fBrowser=null;
	public static void main(String[] args) 
	{
		launchFireBrowser();
		navigate();
	}
	private static void launchFireBrowser()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\geckodriver.exe");
			fBrowser = new FirefoxDriver();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			fBrowser.get("http://localhost:83/login.do;jsessionid=2r76vfnmmtgi7");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
