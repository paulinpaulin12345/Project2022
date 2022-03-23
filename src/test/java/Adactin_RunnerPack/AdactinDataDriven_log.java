package Adactin_RunnerPack;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.Adactin_Pomanager.Adactin_Manager;

import Base_Package.Base_Class;

public class AdactinDataDriven_log extends Base_Class {
	public static WebDriver driver = browser_Configuration("chrome");
	public static Adactin_Manager pom = new Adactin_Manager(driver);
	public static Logger log=Logger.getLogger(AdactinDataDriven_log.class);

	public static void main(String[] args) throws IOException {
		PropertyConfigurator.configure("log4j.properties");
		getUrl("https://adactinhotelapp.com/");
		log.info("Url Launch");
		String emailid=particular_Cell_Data("C:\\Users\\Lenovo\\eclipse-workspace\\Mainproject_march22\\TestCase\\Adactin TestCase.xlsx",15,5);
		inputValueElement(pom.get_AL().getMailid(), emailid);
		String password=particular_Cell_Data("C:\\Users\\Lenovo\\eclipse-workspace\\Mainproject_march22\\TestCase\\Adactin TestCase.xlsx",16,5);
		inputValueElement(pom.get_AL().getPassword(), password);
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
		String fname=particular_Cell_Data("C:\\Users\\Lenovo\\eclipse-workspace\\Mainproject_march22\\TestCase\\Adactin TestCase.xlsx",41,5);
		inputValueElement(pom.getAB().getFname(),fname );
		String lname=particular_Cell_Data("C:\\Users\\Lenovo\\eclipse-workspace\\Mainproject_march22\\TestCase\\Adactin TestCase.xlsx",42,5);
		inputValueElement(pom.getAB().getLname(), lname);
		String address=particular_Cell_Data("C:\\Users\\Lenovo\\eclipse-workspace\\Mainproject_march22\\TestCase\\Adactin TestCase.xlsx",43,5);
		inputValueElement(pom.getAB().getAddres(), address);
		String cardNo=particular_Cell_Data("C:\\Users\\Lenovo\\eclipse-workspace\\Mainproject_march22\\TestCase\\Adactin TestCase.xlsx",45,5);
		inputValueElement(pom.getAB().getCreditno(), cardNo);
		select(pom.getAB().getCardtype(), "ByValue", "MAST");
		select(pom.getAB().getExpmonth(), "ByText", "November");
		select(pom.getAB().getExpyear(), "ByValue", "2022");
		String cvvNo=particular_Cell_Data("C:\\Users\\Lenovo\\eclipse-workspace\\Mainproject_march22\\TestCase\\Adactin TestCase.xlsx",48,5);
		inputValueElement(pom.getAB().getNo(), cvvNo);
		clickOnElement(pom.getAB().getBookbtn());
		navigate("https://adactinhotelapp.com/BookedItinerary.php");
		screenshot("img.png");
		clickOnElement(pom.get_AI().getOptbtn1());
		clickOnElement(pom.get_AI().getLogoutbtn());
		log.info("Successfully Booking");
		driver.close();
	}


}
