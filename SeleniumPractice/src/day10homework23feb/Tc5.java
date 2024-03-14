package day10homework23feb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day4.browserOps16feb.ReusableFunctions;

public class Tc5 {

	public static void main(String[] args) {
		WebDriver driver=ReusableFunctions.setUp("chrome","https://www.google.com/");
		//identify all devices present in the page
		List<WebElement> linksList=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>A"));
		System.out.println("Device count: "+linksList.size());
		for(int i=0;i<linksList.size();i++) {
			WebElement element=linksList.get(i);
			String deviceName=element.getText();
			System.out.println("Device name: "+deviceName);
						

	}
	}
}
