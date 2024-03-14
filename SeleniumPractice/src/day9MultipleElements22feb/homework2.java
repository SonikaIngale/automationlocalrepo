package day9MultipleElements22feb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import day4.browserOps16feb.ReusableFunctions;

public class homework2 {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=ReusableFunctions.setUp("chrome","https://www.demoblaze.com/");
			//identify all devices present in the page
			List<WebElement> linksList=driver.findElements(By.cssSelector("#tbodyid>div>div>a>div>h4>h5>p"));
			System.out.println("Device count: "+linksList.size());
			for(int i=0;i<linksList.size();i++) {
				WebElement element=linksList.get(i);
				String deviceName=element.getText();
				System.out.println("Device name: "+deviceName);
         
         
	}
		}
}
