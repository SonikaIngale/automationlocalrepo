package day14.windowhandling4march;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day4.browserOps16feb.ReusableFunctions;

public class Example2 {

	public static void main(String[] args, WebElement[] eCatering) {
		// TODO Auto-generated method stub
		WebDriver driver = ReusableFunctions.setUp("chrome", "https://erail.in/");
		List<WebElement> eCatering1 = driver.findElements(By.cssSelector("#divMain > div:nth-child(5) > a:nth-child(4)"));
		//
		
		
	//dropdowns.get(0).click();

}}
