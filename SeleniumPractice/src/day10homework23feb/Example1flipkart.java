package day10homework23feb;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1flipkart {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        WebElement login=driver.findElement(By.linkText("login"));
        System.out.println("Clickin on the login element in the main page");
        login.click();
        List<WebElement> linksList=driver.findElements(By.cssSelector("#container>div>div>div>div>div>div.>div>div>div>div>div"));
		System.out.println("Device count: "+linksList.size());
		for(int i=0;i<linksList.size();i++) {
			WebElement element=linksList.get(i);
			String deviceName=element.getText();
			System.out.println("Device name: "+deviceName);
					
		}
	}

}
