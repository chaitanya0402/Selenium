package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminPage {

	public static void main(String[] args) throws InterruptedException {
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

}
