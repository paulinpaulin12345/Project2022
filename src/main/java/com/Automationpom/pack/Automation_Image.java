package com.Automationpom.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_Image {
	public WebDriver driver;
	@FindBy(xpath="//img[@title='Faded Short Sleeve T-shirts'][1]")
	private WebElement imge;

	public Automation_Image(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getImge() {
		return imge;
	}
	

}
