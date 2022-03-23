package com.Automationpom.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_cbtn2 {
	public WebDriver driver;
@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?controller=order&step=1']")
private WebElement btn2;

public Automation_cbtn2(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);

}

public WebElement getBtn2() {
	return btn2;
}
}
