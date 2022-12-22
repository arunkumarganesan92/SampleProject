package org.testngsample;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	public static WebDriver driver;
  @Test(priority = 1,enabled = false  )
  public void browserLaunch() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.com");
	  System.out.println("browserLaunch");
  }
  @Test(priority = 2)
  public void login() {
	  driver.findElement(By.id("search")).sendKeys("red",Keys.ENTER);;
	  System.out.println("login");
  }

  @Test(priority = 3)
  public void search() {
	  System.out.println("search");
  }

  @Test(priority = 4)
  public void mobileclick() {
	  System.out.println("mobileclick");
  }

  @Test(priority = 5)
  public void addtocart() {
	  System.out.println("addtocart");
  }

  @Test(priority = 6)
  public void buynow() {
	  System.out.println("buynow");
  }

}
