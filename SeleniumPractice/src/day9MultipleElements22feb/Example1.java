package day9MultipleElements22feb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day4.browserOps16feb.ReusableFunctions;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=ReusableFunctions.setUp("chrome"," https://demowebshop.tricentis.com/");
		Thread.sleep(5000);
		//identify all link present in the page 
		List<WebElement>linkslist=driver.findElements(By.tagName("a"));
		System.out.println("Link count:" +linkslist.size());

	}

}