package com.Automationpom.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_Submit {
	public WebDriver driver;
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	private WebElement Submitbtn;

	public Automation_Submit(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSubmitbtn() {
		return Submitbtn;
	}
	

}
