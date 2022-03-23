package Automation_RunnerPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Automationpom.pack.Automation_Cart;
import com.Automationpom.pack.Automation_Image;
import com.Automationpom.pack.Automation_Login;
import com.Automationpom.pack.Automation_Logout;
import com.Automationpom.pack.Automation_Orderconform;
import com.Automationpom.pack.Automation_Process;
import com.Automationpom.pack.Automation_Submit;
import com.Automationpom.pack.Automation_Women;
import com.Automationpom.pack.Automation_cbtn1;
import com.Automationpom.pack.Automation_cbtn2;
import com.Automationpom.pack.Automation_cbtn3;
import com.Automationpom.pack.Automation_cheq;
import com.Automationpom.pack.Home_Page;

import Base_Package.Base_Class;

public class Automation_PomRunner extends Base_Class {
	public static WebDriver driver = browser_Configuration("chrome");
	public static Home_Page hp = new Home_Page(driver);
	public static Automation_Login login = new Automation_Login(driver);
	public static Automation_Women women = new Automation_Women(driver);
	public static Automation_Image imge = new Automation_Image(driver);
	public static Automation_Cart acart = new Automation_Cart(driver);
	public static Automation_cbtn1 cbtn1 = new Automation_cbtn1(driver);
	public static Automation_cbtn2 cbtn2 = new Automation_cbtn2(driver);
	public static Automation_cbtn3 cbtn3 = new Automation_cbtn3(driver);
	public static Automation_Process process = new Automation_Process(driver);
	public static Automation_cheq cheq1 = new Automation_cheq(driver);
	public static Automation_Submit submit = new Automation_Submit(driver);
	public static Automation_Orderconform Conform = new Automation_Orderconform(driver);
	public static Automation_Logout logout = new Automation_Logout(driver);

	public static void main(String[] args) throws InterruptedException {
		wait(10,TimeUnit.SECONDS);
		getUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		clickOnElement(hp.getLogin());
		inputValueElement(login.getEmail(), "ammukutty252021@gmail.com");
		inputValueElement(login.getPassword(), "ammukutty252021");
		clickOnElement(login.getSubmitbtn());
		clickOnElement(women.getWomen());
		Thread.sleep(1000);
		javaScript();
		Thread.sleep(1000);
		clickOnElement(imge.getImge());
		clickOnElement(acart.getCart());
		clickOnElement(cbtn1.getBtn1());
		clickOnElement(cbtn2.getBtn2());
		clickOnElement(cbtn3.getBtn3());
		clickOnElement(process.getCheckBox());
		clickOnElement(process.getProcessbtn());
		clickOnElement(cheq1.getCheqq());
		clickOnElement(submit.getSubmitbtn());
		clickOnElement(Conform.getConform());
		clickOnElement(logout.getLogoff());
		close();

	}

}
