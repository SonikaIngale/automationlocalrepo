package day1browseropening12feb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWayTOOpenBrowser {

	public static void main(String[] args) {
		// ChromeDriver driver=new ChromeDriver();
		// or
		// WebDriver driver=new ChromeDriver();
		WebDriver driver = setUp("chrome");
	}

	private static WebDriver setUp(String browserstring) {
		WebDriver driver = null;
		if (browserstring.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserstring.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserstring.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();

		}
		return driver;
	
	}
 public static WebDriver setUp(Object string, String string2String ) {
		// TODO Auto-generated method stub
		return null;
	}

	}


