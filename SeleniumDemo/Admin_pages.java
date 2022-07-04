package SeleniumDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Admin_pages {
  @Test
  public void admin() throws InterruptedException{
	  String path1="D:\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\itctesting15\\Desktop\\BookStore website\\Admin.html");
		driver.findElement(By.id("username")).sendKeys("Formget");
		driver.findElement(By.id("password")).sendKeys("Formget@123");
	    driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("bookname")).sendKeys("Java");
		driver.findElement(By.id("price")).sendKeys("200");
		WebElement chooseFile= driver.findElement(By.id("img"));
		Thread.sleep(2000);
		chooseFile.sendKeys("C:\\Users\\itctesting15\\Desktop\\BookStore website\\addbooks.jpeg");
		Thread.sleep(2000);
		driver.findElement(By.id("add-btn")).click();

	}
  
  @BeforeMethod
  public void beforeMethod() {
	  String path1="D:\\chromedriver_win32\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver=new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
