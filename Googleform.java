import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Googleform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\prasa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Virat");
		driver.findElement(By.name("email")).sendKeys("virat18@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("kohli");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement Staticdropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(Staticdropdown);
		dropdown.selectByIndex(0);
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("05-11-1988");
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		
		}

}
