package day12.keyboardOps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day4.browserOps16feb.ReusableFunctions;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = ReusableFunctions.setUp("chrome", "https://online.actitime.com/tcs/login.do");
		WebElement userNameInputField=driver.findElement(By.id("username"));
	userNameInputField.sendKeys("admin01",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
	//or
	Thread.sleep(2000);
	userNameInputField.sendKeys("admin01");
	userNameInputField.sendKeys(Keys.chord(Keys.CONTROL,"a"));
	userNameInputField.sendKeys(Keys.chord(Keys.CONTROL,"c"));
	driver.findElement(By.name("pwd")).sendKeys(Keys.chord(Keys.CONTROL,"v"),Keys.ENTER);
}
	
	}


