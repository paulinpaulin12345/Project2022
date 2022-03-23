package com.adactinpom.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Select {
	public WebDriver driver;
	@FindBy(css="input[value='0']")
	private WebElement btn1;
	@FindBy(xpath="//input[@id='continue']")
	private WebElement btn2;
	public Adactin_Select(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
	}
	public WebElement getBtn1() {
		return btn1;
	}
	public WebElement getBtn2() {
		return btn2;
	}
	

}
