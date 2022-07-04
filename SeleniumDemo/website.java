package SeleniumDemo;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
public class website
{
	public static void main(String[] args) throws InterruptedException
	{
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
	}}
