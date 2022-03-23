package com.adactinpom.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Book {
	public WebDriver driver;
	@FindBy(id="first_name")
	private WebElement fname;
	@FindBy(id="last_name")
	private WebElement lname;
	@FindBy(id="address")
	private WebElement addres;
	@FindBy(name="cc_num")
	private WebElement creditno;
	@FindBy(id="cc_type")
	private WebElement cardtype;
	@FindBy(id="cc_exp_month")
	private WebElement expmonth;
	@FindBy(name="cc_exp_year")
	private WebElement expyear;
	@FindBy(id="cc_cvv")
	private WebElement no;
	
	@FindBy(id="book_now")
	private WebElement bookbtn;
	public Adactin_Book(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getAddres() {
		return addres;
	}
	public WebElement getCreditno() {
		return creditno;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getExpmonth() {
		return expmonth;
	}
	public WebElement getExpyear() {
		return expyear;
	}
	public WebElement getNo() {
		return no;
	}
	public WebElement getBookbtn() {
		return bookbtn;
	}

}
