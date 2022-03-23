package com.adactinpom.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Login {
	public WebDriver driver;
	@FindBy(id="username")
	private WebElement mailid;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="login")
	private WebElement loginbtn;
	public Adactin_Login(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getMailid() {
		return mailid;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}

}
