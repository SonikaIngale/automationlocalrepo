package day11dropdown27feb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day4.browserOps16feb.ReusableFunctions;

public class BootstrapDropdown {

	public static void main(String[] args) {
		WebDriver driver = ReusableFunctions.setUp("chrome", "https://thompsonsj.com/bootstrap-select-dropdown/");

		// identify dropdown
		List<WebElement> dropdowns = driver.findElements(By.cssSelector("button[id$='-button']"));
		dropdowns.get(0).click();
		
		List<WebElement> countries=driver.findElements(By.cssSelector(".dropdown-menu.show>div>a"));
		System.out.println("country count: "+countries.size());
		for(WebElement element:countries) {
			System.out.println(element.getText());
		}		
		countries.get(5).click();		
	}
		

	}

