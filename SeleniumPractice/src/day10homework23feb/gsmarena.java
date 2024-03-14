package day10homework23feb;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import day4.browserOps16feb.ReusableFunctions;


public class gsmarena {


		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=ReusableFunctions.setUp("chrome","https://www.gsmarena.com/samsung-phones-9.php");
			//identify all devices present in the page
			List<WebElement> suggestionList=driver.findElements(By.cssSelector("#review-body>div>ul"));
			System.out.println("Device count: "+suggestionList.size());
			for(int i=0;i<suggestionList.size();i++) {
				WebElement element=suggestionList.get(i);
				String deviceName=element.getText();
				System.out.println("Device name: "+deviceName);
							

}}}
