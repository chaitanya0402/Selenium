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

public class NewTest2 {
  @Test
  public void tstmd() {
	  String path1="D:\\chromedriver_win32\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver=new ChromeDriver();
		//driver.get("file:///C:/Users/itctesting15/Desktop/Library%20website/Admin.html");
		//driver.findElement(By.id("username")).sendKeys("Formget");
		//driver.findElement(By.id("password")).sendKeys("Formget@123");
	    //driver.findElement(By.id("submit")).click();
		driver.get("file:///C:/Users/itctesting15/Desktop/Library%20website/student1.html");
		driver.findElement(By.className("loginbtn")).click();
		driver.findElement(By.className("toggle-btn2")).click();
		driver.findElement(By.id("First1")).sendKeys("Chaitanya");
		driver.findElement(By.id("Last1")).sendKeys("BM");
		driver.findElement(By.id("email1")).sendKeys("Lee@gmail");
		driver.findElement(By.id("pswd1")).sendKeys("Lee123456");
		driver.findElement(By.id("pswd2")).sendKeys("Lee123456");
		driver.findElement(By.id("female")).click();
		driver.findElement(By.id("check")).click();
		WebElement selected= driver.findElement(By.id("check"));
		boolean a= selected.isSelected();
		System.out.println(a);
		if(a ==false)
		{
			System.out.println("Yes your check box is selected");
		}
		
		driver.findElement(By.id("res")).click();
		
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
