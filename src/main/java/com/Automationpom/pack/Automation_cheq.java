package com.Automationpom.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_cheq {
	public WebDriver driver;
	@FindBy(className="cheque")
	private WebElement cheqq;

	public Automation_cheq(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);

	}

	public WebElement getCheqq() {
		return cheqq;
	}

}
