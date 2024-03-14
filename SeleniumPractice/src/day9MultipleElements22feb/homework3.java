package day9MultipleElements22feb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day4.browserOps16feb.ReusableFunctions;

public class homework3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=ReusableFunctions.setUp("chrome","https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium testing");
		
		//identify all suggestions given by google
		List<WebElement> suggestionList=driver.findElements(By.cssSelector("ul.G43f7e>li>div>div:nth-of-type(2)>*:first-child>*:first-child>span"));
		System.out.println("Suggestion count: "+suggestionList.size());
		for(int i=0;i<suggestionList.size();i++) {
			//to avoid staleElement Exception re-identifying suggestion list
			suggestionList=driver.findElements(By.cssSelector("ul.G43f7e>li>div>div:nth-of-type(2)>*:first-child>*:first-child>span"));
			WebElement element=suggestionList.get(i);
			String suggestion=element.getText();
			System.out.println("suggestion name: "+suggestion);
			
		}

	}

}
