package day11dropdown27feb;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import day4.browserOps16feb.IOEException;
import day4.browserOps16feb.ReusableFunctions;

public class swagLabhomework {

	public static void main(String[] args) throws IOException
	{
         WebDriver driver=ReusableFunctions.setUp("chrome","https://www.saucedemo.com/");
	String userNames=driver.findElement(By.id("login_credentials")).getText();
			String[]userNameList=userNames.split("\n");
			
			String passwords=driver.findElement(By.cssSelector(".login_password")).getText();
			String[] passwordsList=passwords.split("\n");

			for(int i=1;i<userNameList.length;i++) {

				System.out.println(" *************User used for Login: "+userNameList[i]);
				driver.findElement(By.id("user-Name")).sendKeys(userNameList[i]);
				driver.findElement(By.id("password")).clear();
				driver.findElement(By.id("login-button")).click();	 
			    if(driver.getCurrentUrl().contains("/Inventory.html")) {
			    	driver.findElement(By.id("react-burger-cross-btn")).click();
			    	driver.findElement(By.id("logout_sidebar_link ")).click();
			    }else {
			    	driver.findElement(By.id("user-Name")).clear();
			    	
			    	driver.findElement(By.id("password")).clear();
			    }
			}
			System.out.println("Ends********");
	}}
