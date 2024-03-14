package day2.basicops15feb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle1 {

	public static void main(String[] args) {
		//open chrome browser
	WebDriver driver=new ChromeDriver();
		//enter google url
		driver.get("https://www.google.com");
        //validate -title & URL
     String expectedTitle="Google";
	String actualdTitle=driver.getTitle();
	System.out.println(" Title validation status :"+actualdTitle.equals(expectedTitle));
	
	String expectedURL="https://www.google.com/";
	String actualURL=driver.getTitle();
    System.out.println("URL Validation status:"+actualdTitle.equals(expectedTitle));
	 
    String pageSource=driver.getPageSource();
    System.out.println("Page Source length : "+pageSource.length());
    //close browser
	driver.close();
	}

}
