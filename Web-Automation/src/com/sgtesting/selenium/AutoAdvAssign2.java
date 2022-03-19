package com.sgtesting.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoAdvAssign2 
{
	private static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		loginAdmin();
		createUser1();
		//minimizeInfoWindow();
		logout(); 
		loginAsUser1();
		createUser2();
		minimizeInfoWindow();
		logout();
		loginAsUser2();
		createUser3();
		minimizeInfoWindow();
		logout();  
		loginAsUser3();
		logout();
		loginAsUser2();
		modifyPasswordUser3();
		logout();
		loginAsUser3New();
		logout();
		loginAsUser1();
		modifyPasswordUser2();
		logout();
		loginAsUser2New();
		logout();
		loginAdmin();
		modifyPasswordUser1();
		logout();
		loginAsUser1New();
		logout();
		loginAsUser2New();
		deleteUser3();
		logout();
		loginAsUser1New();
		deleteUser2();
		logout();
		loginAdmin();
		deleteUser1();
		logoutAndClose();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser = new ChromeDriver();
			oBrowser.manage().window().maximize();
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
			oBrowser.get("http://localhost:83/login.do;jsessionid=2r76vfnmmtgi7");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginAdmin()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(6000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	} 
	private static void createUser1()
	{
		try
		{
			oBrowser.findElement(By.className("gettingStartedShortcutsLabel")).click();
			Thread.sleep(3000);
			oBrowser.findElement((By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]"))).click();
			Thread.sleep(2000);
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
			Thread.sleep(6000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
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
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginAsUser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user1auto");
			oBrowser.findElement(By.name("pwd")).sendKeys("user1auto");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(8000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(6000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user2");
			oBrowser.findElement(By.name("lastName")).sendKeys("auto");
			oBrowser.findElement(By.name("email")).sendKeys("user2auto@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("user2auto");
			oBrowser.findElement(By.name("password")).sendKeys("user2auto");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user2auto");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginAsUser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user2auto");
			oBrowser.findElement(By.name("pwd")).sendKeys("user2auto");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(8000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user3");
			oBrowser.findElement(By.name("lastName")).sendKeys("auto");
			oBrowser.findElement(By.name("email")).sendKeys("user3auto@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("user3auto");
			oBrowser.findElement(By.name("password")).sendKeys("user3auto");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user3auto");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginAsUser3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user3auto");
			oBrowser.findElement(By.name("pwd")).sendKeys("user3auto");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(8000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyPasswordUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("User3auto");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("User3auto");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginAsUser3New()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User3auto");
			oBrowser.findElement(By.name("pwd")).sendKeys("User3auto");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyPasswordUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).click();  
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("User2auto");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("User2auto");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginAsUser2New()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User2auto");
			oBrowser.findElement(By.name("pwd")).sendKeys("User2auto");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyPasswordUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("User1auto");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("User1auto");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginAsUser1New()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User1auto");
			oBrowser.findElement(By.name("pwd")).sendKeys("User1auto");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();  
			Thread.sleep(3000);           
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(3000);
			Alert oAlert = oBrowser.switchTo().alert();
			String content = oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();  
			Thread.sleep(3000);           
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(3000);
			Alert oAlert = oBrowser.switchTo().alert();
			String content = oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")).click();  
			Thread.sleep(4000);           
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(3000);
			Alert oAlert = oBrowser.switchTo().alert();
			String content = oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutAndClose()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
			oBrowser.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
