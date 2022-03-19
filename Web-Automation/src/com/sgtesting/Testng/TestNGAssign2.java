package com.sgtesting.Testng;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssign2 
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
	/*	private static void minimizeInfoWindow()
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
		} */

	@Test(priority=4)
	private static void createUser()
	{
		try
		{
			log.info("Create User Initiated");
			oBrowser.findElement(By.className("gettingStartedShortcutsLabel")).click();
			oBrowser.findElement((By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]"))).click();
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user1");
			oBrowser.findElement(By.name("lastName")).sendKeys("auto");
			oBrowser.findElement(By.name("email")).sendKeys("user1auto@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("user1auto");
			oBrowser.findElement(By.name("password")).sendKeys("user1auto");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user1auto");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(4000);
			String str = oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).getText();
			String exp = "auto, user1";
			Assert.assertEquals(str, exp, "No Create User");
			log.info("User Created");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=5)
	private static void modifyUser()
	{
		try
		{
			log.info("Modify User Initiated");
			oBrowser.findElement(By.xpath("//span[text()='auto, user1']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).clear();
			oBrowser.findElement(By.name("firstName")).sendKeys("user11");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(5000);
			String str = oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).getText();
			String exp = "auto, user11";
			Assert.assertEquals(str, exp, "No Create User");
			log.info("Modified User");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	@Test(priority=6)
	private static void deleteUser()
	{
		try
		{
			log.info("Delete User Initiated");
			oBrowser.findElement(By.xpath("//span[text()='auto, user1']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(3000);
			Alert oAlert = oBrowser.switchTo().alert();
			String content = oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(3000);
			String str = oBrowser.getTitle();
			String exp = "actiTIME - User List";
			Assert.assertEquals(str, exp, "No Delete User");
			log.info("User Deleted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=6)
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
