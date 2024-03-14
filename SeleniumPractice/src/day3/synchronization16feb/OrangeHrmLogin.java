package day3.synchronization16feb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import day1browseropening12feb.GenericWayTOOpenBrowser;

public class OrangeHrmLogin {

		public static void main(String[] args) {
			WebDriver driver=GenericWayTOOpenBrowser.setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			//implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.name("username")).sendKeys("Admin");//0-20 sec
			driver.findElement(By.name("password")).sendKeys("admin123");//0-20 sec
			driver.findElement(By.className("orangehrm-login-button")).click();//0-20 sec
		
		}
	}


