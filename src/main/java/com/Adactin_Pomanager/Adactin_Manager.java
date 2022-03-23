package com.Adactin_Pomanager;

import org.openqa.selenium.WebDriver;

import com.adactinpom.pack.Adactin_Book;
import com.adactinpom.pack.Adactin_Itenary;
import com.adactinpom.pack.Adactin_Login;
import com.adactinpom.pack.Adactin_Search;
import com.adactinpom.pack.Adactin_Select;

public class Adactin_Manager {
	public WebDriver driver;
	private Adactin_Book AB;
	private Adactin_Itenary AI;
	private Adactin_Login AL;
	private Adactin_Search AS;
	private Adactin_Select Ase;
	public Adactin_Manager(WebDriver driver2) {
		this.driver=driver2;
	}
	public Adactin_Book getAB() {
		if(AB==null)
		{
			AB=new Adactin_Book(driver);
		}
		return AB;
	}
	public Adactin_Itenary get_AI() {
		if(AI==null)
		{
			AI=new Adactin_Itenary(driver);
		}
		
		return AI;
	}
	public Adactin_Login get_AL() {
		if(AL==null)
		{
			AL=new Adactin_Login(driver);
		}
		return AL;
	}
	public Adactin_Search get_AS() {
		if(AS==null)
		{
			AS=new Adactin_Search(driver);
		}
		return AS;
	}
	public Adactin_Select get_Ase() {
		if(Ase==null)
		{
			Ase=new Adactin_Select(driver);
		}
		return Ase;
	}
	
	
	
	
	

}
