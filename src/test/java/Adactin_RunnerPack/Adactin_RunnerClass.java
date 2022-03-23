package Adactin_RunnerPack;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import Base_Package.Base_Class;

public class Adactin_RunnerClass extends Base_Class {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		driver = browser_Configuration("chrome");
		getUrl("https://adactinhotelapp.com/");
		WebElement username = driver.findElement(By.id("username"));
		inputValueElement(username, "ammukutty25202125202");
		driver.findElement(By.linkText("Forgot Password?")).click();
		Thread.sleep(2000);
		driver.navigate().back();
        WebElement passcode = driver.findElement(By.id("password"));
		inputValueElement(passcode, "ammukutty252021");
		WebElement btn = driver.findElement(By.id("login"));
		clickOnElement(btn);
	    WebElement web = driver.findElement(By.xpath("//select[@id='location']"));
		select(web,"ByIndex","2");
		WebElement web1 = driver.findElement(By.xpath("//select[@id='hotels']"));
		select(web1, "ByValue", "Hotel Cornice");
        WebElement web2 = driver.findElement(By.xpath("//select[@id='room_type']"));
		select(web2, "ByText", "Super Deluxe");
		WebElement web3 = driver.findElement(By.xpath("//select[@id='room_nos']"));
     	select(web3, "Byvalue", "2");
     	WebElement web5 = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select s4 = new Select(web5);
		select(web5, "ByText", "2 - Two");
		System.out.println("Selected adult Rooms are: " + s4.getFirstSelectedOption().getText());
		WebElement web6 = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select s5 = new Select(web6);
		select(web6, "ByIndex", "0");
		System.out.println("Selected child Rooms are: " + s5.getFirstSelectedOption().getText());
		WebElement searchbtn = driver.findElement(By.xpath("//input[@id='Submit']"));
		clickOnElement(searchbtn);
		WebElement submitbtn = driver.findElement(By.cssSelector("input[value='0']"));
		clickOnElement(submitbtn);
		WebElement continuebtn = driver.findElement(By.xpath("//input[@id='continue']"));
		clickOnElement(continuebtn);
		WebElement fname = driver.findElement(By.id("first_name"));
		inputValueElement(fname, "Ammu");
		WebElement lname1 = driver.findElement(By.id("last_name"));
		inputValueElement(lname1, "Kutty");
		WebElement address = driver.findElement(By.id("address"));
		inputValueElement(address, " No1.Everest Garden ,Errandam Kattalai,Koovoor,Chennai-600128");
		WebElement credit = driver.findElement(By.name("cc_num"));
		inputValueElement(credit, "1111 1111 1111 1111");
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		select(cardtype, "ByValue", "MAST");
		WebElement expmnth = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(expmnth);
		select(expmnth, "ByText", "November");
		WebElement expyear = driver.findElement(By.name("cc_exp_year"));
		Select s8 = new Select(expyear);
		select(expyear, "ByValue", "2022");
		WebElement bookbtn = driver.findElement(By.id("book_now"));
		clickOnElement(bookbtn);
		System.err.print("Please Enter CVV number");
		Thread.sleep(1000);
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		inputValueElement(cvv, "123446");
		WebElement bookbtn1 = driver.findElement(By.id("book_now"));
		clickOnElement(bookbtn1);
		driver.navigate().to("https://adactinhotelapp.com/BookedItinerary.php");
		screenshot("img.png");
		WebElement logoutbtn = driver.findElement(By.id("logout"));
		clickOnElement(logoutbtn);
		System.out.println("\nLogout Successfully");
		System.out.println("\nProcess Successfully Finished");
		driver.close();

	}

}
