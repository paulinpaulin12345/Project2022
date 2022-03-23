package Automation_RunnerPack;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.Automation_pomanger.Automation_Manger;

import Base_Package.Base_Class;

public class Automation_DataDriven extends Base_Class {
	public static WebDriver driver = browser_Configuration("chrome");
	public static Automation_Manger pom = new Automation_Manger(driver);
	public static void main(String[] args) throws IOException{
		wait(10, TimeUnit.SECONDS);
		getUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		clickOnElement(pom.get_Hp().getLogin());
		String userid=particular_Cell_Data("C:\\Users\\Lenovo\\eclipse-workspace\\Mainproject_march22\\TestCase\\Automation TestCase.xlsx",8,5);
		inputValueElement(pom.get_Login().getEmail(),userid );
		String username=particular_Cell_Data("C:\\Users\\Lenovo\\eclipse-workspace\\Mainproject_march22\\TestCase\\Automation TestCase.xlsx",9,5);
		inputValueElement(pom.get_Login().getPassword(),username );
		clickOnElement(pom.get_Login().getSubmitbtn());
		clickOnElement(pom.get_Women().getWomen());
		javaScript();
		clickOnElement(pom.get_Img().getImge());
		clickOnElement(pom.get_Cart().getCart());
		clickOnElement(pom.get_Btn1().getBtn1());
		clickOnElement(pom.get_Btn2().getBtn2());
		clickOnElement(pom.get_Btn3().getBtn3());
		clickOnElement(pom.get_Process().getCheckBox());
		clickOnElement(pom.get_Process().getProcessbtn());
		clickOnElement(pom.get_Cheq().getCheqq());
		clickOnElement(pom.get_Submit().getSubmitbtn());
		clickOnElement(pom.get_Order().getConform());
		clickOnElement(pom.get_Logout().getLogoff());
		close();

	}


}
