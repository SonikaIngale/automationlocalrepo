package day4.browserOps16feb;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReusableFunctions {
		public static WebDriver setUp(String browserName,String appUrl) {
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();

		}
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Maximize browser window
		driver.manage().window().maximize();
		driver.get(appUrl);
		return driver;
		
	}

		public static Properties getPropertyFileInstance(String string) {
			// TODO Auto-generated method stub
			return null;
		}
	}


