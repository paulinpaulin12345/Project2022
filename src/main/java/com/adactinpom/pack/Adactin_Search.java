package com.adactinpom.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Search {
	public WebDriver driver;
	@FindBy(xpath="//select[@id='location']")
	private WebElement location;
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement hotel;
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement roomtype;
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement noofroom;
	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement adultroom;
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement childroom;
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement submit;

	
	

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNoofroom() {
		return noofroom;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public Adactin_Search(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}

}
