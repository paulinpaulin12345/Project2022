package Adactin_RunnerPack;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactinpom.pack.Adactin_Book;
import com.adactinpom.pack.Adactin_Itenary;
import com.adactinpom.pack.Adactin_Login;
import com.adactinpom.pack.Adactin_Search;
import com.adactinpom.pack.Adactin_Select;

import Base_Package.Base_Class;

public class Adactin_Pom extends Base_Class {

	public static WebDriver driver = browser_Configuration("chrome");
	public static Adactin_Login login=new Adactin_Login(driver);
	public static Adactin_Search search=new Adactin_Search(driver);
	public static Adactin_Select select=new Adactin_Select(driver);
	public static Adactin_Book book=new Adactin_Book(driver);
	public static Adactin_Itenary itenary=new Adactin_Itenary(driver);

	public static void main(String[] args) throws InterruptedException, IOException {
		getUrl("https://adactinhotelapp.com/");
		inputValueElement(login.getMailid(), "ammukutty25202125202");
		inputValueElement(login.getPassword(), "ammukutty252021");
		clickOnElement(login.getLoginbtn());
		select(search.getLocation(),"ByIndex","2");
		select(search.getHotel(), "ByValue", "Hotel Cornice");
		select(search.getRoomtype(), "ByText", "Super Deluxe");
     	select(search.getNoofroom(), "Byvalue", "2");
		select(search.getAdultroom(), "ByText", "2 - Two");
		select(search.getChildroom(), "ByIndex", "0");
		clickOnElement(search.getSubmit());
		clickOnElement(select.getBtn1());
		clickOnElement(select.getBtn2());
		inputValueElement(book.getFname(), "Ammu");
		inputValueElement(book.getLname(), "Kutty");
		inputValueElement(book.getAddres(), " No1.Everest Garden ,Errandam Kattalai,Koovoor,Chennai-600128");
		inputValueElement(book.getCreditno(), "1111 1111 1111 1111");
		select(book.getCardtype(), "ByValue", "MAST");
		select(book.getExpmonth(), "ByText", "November");
		select(book.getExpyear(), "ByValue", "2022");
		inputValueElement(book.getNo(), "123446");
		clickOnElement(book.getBookbtn());
		navigate("https://adactinhotelapp.com/BookedItinerary.php");
		screenshot("img.png");
		clickOnElement(itenary.getOptbtn1());
		clickOnElement(itenary.getLogoutbtn());
		driver.close();

	}


}
