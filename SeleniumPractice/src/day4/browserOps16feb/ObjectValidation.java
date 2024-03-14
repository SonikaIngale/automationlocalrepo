package day4.browserOps16feb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjectValidation {

	public static void main(String[] args) {
		WebDriver driver=ReusableFunctions.setUp("chrome","https://demo.vtiger.com/vtigecrm/index.php");
	WebElement  userNameInputField=driver.findElement(By.id("username"));
		 	System.out.println("Is username input field visiable?"+userNameInputField.isDisplayed());
		 	System.out.println("Is username input field Functional/editable or not ?"+userNameInputField.isEnabled());
		 	System.out.println("Default value of username input field:"+userNameInputField.getAttribute("value"));
		 	


	}
}
