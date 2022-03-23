package com.Automationpom.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_cbtn3 {
	public WebDriver driver;
	@FindBy(name="processAddress")
	private WebElement btn3;

	public Automation_cbtn3(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);

	}

	public WebElement getBtn3() {
		return btn3;
	}
	

}
