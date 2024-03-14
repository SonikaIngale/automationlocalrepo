package day13.mouse1march;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.Lists;

import day4.browserOps16feb.ReusableFunctions;

public class Example5 {

	public static void main(String[] args) throws InterruptedException {
				WebDriver driver;
				List<WebElement> lists=driver.findElements(By.xpath("//ul[@id='sorable']/li"));

		//	driver.get("https://jqueryui.com/sortable/");
			Actions action=new Actions(driver);

			WebElement lastEle=driver.findElements(By.xpath("//li[text()='Item"+lists.size()+ ""));
			for(int i=1;i<=lists.size()-1;++i) {
				WebElement elementToDrag=driver.findElement(By.xpath("//li[text()='Item"+i+"']"));
			action.clickAndHold(elementToDrag).dragAndDrop(elementToDrag,lastEle).build(). perform();
				Thread.sleep(1000);
			}
	}}			
			