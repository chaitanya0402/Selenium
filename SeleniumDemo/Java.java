package SeleniumDemo;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
public class Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path1="D:\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("Chaitanyabm");
		driver.findElement(By.id("password")).sendKeys("Leeminhoo123@");
		driver.findElement(By.id("login")).click();
		Select dropDown=new Select(driver.findElement(By.id("location")));   
		dropDown.selectByIndex(3);
		driver.close();

	}

}
