package day10dropdown23feb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import day4.browserOps16feb.ReusableFunctions;

public class Example1Multiselection {

	public static void main(String[] args) {
		WebDriver driver=ReusableFunctions.setUp("chrome","https://omayo.blogspot.com/");
      //identify dropdown
		WebElement dropdown= driver.findElement(By.id("multiselect1"));
		//creat an instance of select class
		Select selectSkill=new Select(dropdown);
		System.out.println(selectSkill.isMultiple());
		selectSkill.selectByIndex(0);
		selectSkill.selectByIndex(1);
		selectSkill.selectByIndex(2);
		System.out.println(selectSkill.getAllSelectedOptions().size());
		selectSkill.deselectAll();
	}

}
