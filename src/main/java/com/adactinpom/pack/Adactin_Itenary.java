package com.adactinpom.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Itenary {
	public WebDriver driver;
@FindBy(xpath="//input[@name='ids[]']")
private WebElement optbtn1;
@FindBy(id="logout")
private WebElement logoutbtn;
public Adactin_Itenary(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);

}
public WebElement getOptbtn1() {
	return optbtn1;
}
public WebElement getLogoutbtn() {
	return logoutbtn;
}
}
