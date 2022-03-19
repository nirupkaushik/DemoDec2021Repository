package com.sgtesting.Testng;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssign3 
{
	private static WebDriver oBrowser=null;
	private static Logger log = Logger.getLogger("Logger Output");

	@Test(priority=1)
	private static void launchBrowser()
	{
		try
		{
			log.info("Browser Initiated");
			System.setProperty("webdriver.chrome.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser = new ChromeDriver();
			oBrowser.manage().window().maximize();
			Thread.sleep(4000);
			String act = oBrowser.getTitle();
			String exp = "";
			Assert.assertEquals(act, exp, "Browser has not Launched");
			log.info("Browser Launched Successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=2)
	private static void navigate()
	{
		try
		{
			log.info("Navigation Initiated");
			oBrowser.get("http://localhost:83/login.do;jsessionid=2r76vfnmmtgi7");
			Thread.sleep(2000);
			String act = oBrowser.getTitle();
			String exp = "actiTIME - Login";
			Assert.assertEquals(act, exp, "No navigation");
			log.info("URL Navigated");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=3)
	private static void login()
	{
		try
		{
			log.info("Login Initiated");
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(5000);
			String str = oBrowser.findElement(By.xpath("//td[@class='pagetitle']")).getText();
			String exp = "Enter Time-Track";
			Assert.assertEquals(str, exp, "No Login");
			log.info("Logged in Successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	} 
	
	@Test(priority=4)
	private static void minimizeInfoWindow()
	{
		try
		{
			oBrowser.findElement(By.className("gettingStartedShortcutsLabel")).click();
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=5)
	private static void createCustomer()
	{
		try
		{
			log.info("Create Customer Initiated");
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("SG Software Testing");
			oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Provides Training on Software Testing.");
			oBrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
			Thread.sleep(5000);
			String str = oBrowser.findElement(By.xpath("//div[@class='node customerNode selected']")).getText();
			String exp = "SG Software Testing";
			Assert.assertEquals(str, exp, "No Create User");
			log.info("Customer Created ");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=6)
	private static void deleteCustomer()
	{
		try
		{
			log.info("Delete Customer Initiated");
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
			oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(5000);
			String str = oBrowser.findElement(By.xpath("//div[text()='There are no customers or projects']")).getText();
			String exp = "There are no customers or projects";
			Assert.assertEquals(str, exp, "No Delete User");
			log.info("Customer Deleted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=7)
	private static void logoutAndClose()
	{
		try
		{
			log.info("Logout Initiated");
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
			String str = oBrowser.getTitle();
			String exp = "actiTIME - Login";
			Assert.assertEquals(str, exp, "No Logout");
			oBrowser.close();
			log.info("Logged Out Successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
