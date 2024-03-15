package day16.MavenPratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     WebDriver driver=new FirefoxDriver();	
         driver.get("https://www.google.com");
         driver.close();
	}

}
