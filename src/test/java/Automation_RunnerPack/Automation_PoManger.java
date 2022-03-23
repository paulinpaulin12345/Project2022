package Automation_RunnerPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.Automation_pomanger.Automation_Manger;
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

public class Automation_PoManger extends Base_Class {
	public static WebDriver driver = browser_Configuration("chrome");
	public static Automation_Manger pom = new Automation_Manger(driver);
	public static void main(String[] args){
		wait(10, TimeUnit.SECONDS);
		getUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		clickOnElement(pom.get_Hp().getLogin());
		inputValueElement(pom.get_Login().getEmail(), "ammukutty252021@gmail.com");
		inputValueElement(pom.get_Login().getPassword(), "ammukutty252021");
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
