package com.Automationpom.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_Process {
	public WebDriver driver;
	@FindBy(id = "cgv")
	private WebElement checkBox;
	@FindBy(name = "processCarrier")
	private WebElement processbtn;

	public Automation_Process(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getProcessbtn() {
		return processbtn;
	}

}
