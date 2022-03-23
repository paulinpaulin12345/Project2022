package com.Automationpom.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_Orderconform {
	public WebDriver driver;
	@FindBy(xpath="//a[@class='button-exclusive btn btn-default']")
	private WebElement conform;

	public Automation_Orderconform(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getConform() {
		return conform;
	}
	
		

}
