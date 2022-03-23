package Automation_RunnerPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Base_Package.Base_Class;

public class Automation_Base extends Base_Class {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = browser_Configuration("chrome");
		wait(10, TimeUnit.SECONDS);
		getUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		WebElement email = driver.findElement(By.id("email"));
		inputValueElement(email, "ammukutty252021@gmail.com");
		WebElement pass = driver.findElement(By.id("passwd"));
		inputValueElement(pass, "ammukutty252021");
		WebElement sign = driver.findElement(By.id("SubmitLogin"));
		clickOnElement(sign);
		WebElement women = driver.findElement(By.className("sf-with-ul"));
		clickOnElement(women);
		Thread.sleep(1000);
		javaScript();
		Thread.sleep(1000);
		WebElement a = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts'][1]"));
		clickOnElement(a);
		WebElement add = driver.findElement(By.xpath("(//span[text()='Add to cart'])[1]"));
		clickOnElement(add);
		WebElement chekout = driver
				.findElement(By.xpath("(//a[@href='http://automationpractice.com/index.php?controller=order'])[1]"));
		clickOnElement(chekout);
		WebElement chekout2 = driver
				.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?controller=order&step=1']"));
		clickOnElement(chekout2);
		WebElement chekout3 = driver.findElement(By.name("processAddress"));
		clickOnElement(chekout3);
		WebElement w = driver.findElement(By.id("cgv"));
		clickOnElement(w);
		WebElement chekout4 = driver.findElement(By.name("processCarrier"));
		clickOnElement(chekout4);
		WebElement che = driver.findElement(By.className("cheque"));
		clickOnElement(che);
		WebElement submit = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		clickOnElement(submit);
		WebElement orderconform = driver.findElement(By.xpath("//a[@class='button-exclusive btn btn-default']"));
		clickOnElement(orderconform);
		WebElement con = driver.findElement(By.xpath("//a[@title='Log me out']"));
		clickOnElement(con);

		driver.close();

	}

}
