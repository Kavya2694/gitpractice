package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass{
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement txtBox;
	
	@FindBy(id="pass")
	private WebElement passBox;
	
	@FindBy(id="loginbutton")
	private WebElement fbBtn;

	public WebElement getTxtBox() {
		return txtBox;
	}

	public WebElement getPassBox() {
		return passBox;
	}

	public WebElement getFbBtn() {
		return fbBtn;
	}

}
