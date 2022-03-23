package Adactin_RunnerPack;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Adactin_Pomanager.Adactin_Manager;
import com.adactinpom.pack.Adactin_Book;
import com.adactinpom.pack.Adactin_Itenary;
import com.adactinpom.pack.Adactin_Login;
import com.adactinpom.pack.Adactin_Search;
import com.adactinpom.pack.Adactin_Select;

import Base_Package.Base_Class;

public class Adactin_POManager extends Base_Class {
	public static WebDriver driver = browser_Configuration("chrome");
	public static Adactin_Manager pom = new Adactin_Manager(driver);

	public static void main(String[] args) throws IOException {
		getUrl("https://adactinhotelapp.com/");
		inputValueElement(pom.get_AL().getMailid(), "ammukutty25202125202");
		inputValueElement(pom.get_AL().getPassword(), "ammukutty252021");
		clickOnElement(pom.get_AL().getLoginbtn());
		select(pom.get_AS().getLocation(), "ByIndex", "2");
		select(pom.get_AS().getHotel(), "ByValue", "Hotel Cornice");
		select(pom.get_AS().getRoomtype(), "ByText", "Super Deluxe");
		select(pom.get_AS().getNoofroom(), "Byvalue", "2");
		select(pom.get_AS().getAdultroom(), "ByText", "2 - Two");
		select(pom.get_AS().getChildroom(), "ByIndex", "0");
		clickOnElement(pom.get_AS().getSubmit());
		clickOnElement(pom.get_Ase().getBtn1());
		clickOnElement(pom.get_Ase().getBtn2());
		inputValueElement(pom.getAB().getFname(), "Ammu");
		inputValueElement(pom.getAB().getLname(), "Kutty");
		inputValueElement(pom.getAB().getAddres(), " No1.Everest Garden ,Errandam Kattalai,Koovoor,Chennai-600128");
		inputValueElement(pom.getAB().getCreditno(), "1111 1111 1111 1111");
		select(pom.getAB().getCardtype(), "ByValue", "MAST");
		select(pom.getAB().getExpmonth(), "ByText", "November");
		select(pom.getAB().getExpyear(), "ByValue", "2022");
		inputValueElement(pom.getAB().getNo(), "123446");
		clickOnElement(pom.getAB().getBookbtn());
		navigate("https://adactinhotelapp.com/BookedItinerary.php");
		screenshot("img.png");
		clickOnElement(pom.get_AI().getOptbtn1());
		clickOnElement(pom.get_AI().getLogoutbtn());
		driver.close();
	}

}
