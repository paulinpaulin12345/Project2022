import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassEncoding {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjQ3OTQxNjA4LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		driver.manage().window().maximize();
		WebElement id=driver.findElement(By.id("email"));
		id.sendKeys("paulin.rajasekar@gmail.com");
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("cGF1bGluaW5mYW50YQ==");
		
		
	}
	String decode(String password)
	{
	byte[] decode=Base64.decodeBase64(password);
	return(new String(decode));
	}


}
