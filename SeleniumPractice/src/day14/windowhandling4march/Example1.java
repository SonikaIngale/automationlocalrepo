package day14.windowhandling4march;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import day4.browserOps16feb.ReusableFunctions;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = ReusableFunctions.setUp("chrome", "https://etrain.info/in");
		//main page id
		String homeWinId=driver.getWindowHandle();
		//click on linkedin logo to open linkedin page in new tab/window
		driver.findElement(By.cssSelector(".icon-linkedin")).click();
		//get all window ids opened by WebDriver instance
				Set<String> allWinIds=driver.getWindowHandles();
				//remove home win id from all win ids
				allWinIds.remove(homeWinId);
		         Iterator<String>itr=allWinIds.iterator();
				String childWindId=itr.next();
				//now move control to child to child window
				driver.switchTo().window(childWindId);
				System.out.println("Linkedin title: "+driver.getTitle());

				//close- will close only current linkedin page but control won't switch back to main page
				//driver.close();
				
				//to come back to home page
				driver.switchTo().window(homeWinId);

				System.out.println("Etrail title: "+driver.getTitle());
				
				//driver.close();
				
				//close all browser instance
				driver.quit();
	}

}
