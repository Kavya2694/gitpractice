package com.steps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.base.BaseClass;
import com.pom.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{
	@Given("user launch browser")
	public void user_launch_browser() {
		driver=launchBrowser();	   
	}

	@Given("user enter fb url")
	public void user_enter_fb_url() {
		loadUrl("https://www.facebook.com/");
	}
	
	@When("user enter username and password credential")
	public void user_enter_username_and_password_credential(io.cucumber.datatable.DataTable twodMap) {
		List<Map<String,String>> mp= twodMap.asMaps();
		LoginPage l=new LoginPage();
		typeValue(l.getTxtBox(),mp.get(0).get("name"));
		typeValue(l.getPassBox(),mp.get(2).get("pwd"));
		
	}
	
	/*
	@When("user enter username and password credential")
	public void user_enter_username_and_password_credential(io.cucumber.datatable.DataTable twodlist) {
		List<List<String>> li=twodlist.asLists();
		LoginPage l=new LoginPage();
		typeValue(l.getTxtBox(),li.get(2).get(0));
		typeValue(l.getPassBox(),li.get(2).get(1));
	    
	}
	*/
	
	/*
	@When("user enter username and password credential")
	public void user_enter_username_and_password_credential(io.cucumber.datatable.DataTable onedMap) {
		Map<String,String> mp=onedMap.asMap(String.class, String.class);
		LoginPage l=new LoginPage();
		typeValue(l.getTxtBox(),mp.get("username2"));
		typeValue(l.getPassBox(),mp.get("password2"));
	    
	}
	*/
/*
	@When("user enter username and password credential")
	public void user_enter_username_and_password_credential(io.cucumber.datatable.DataTable onedlist) {
		List<String> li=onedlist.asList();
		String s1=li.get(2);
		String s2=li.get(4);
		LoginPage l=new LoginPage();
		typeValue(l.getTxtBox(),s1);
		typeValue(l.getPassBox(),s2);
	  
	}
*/
	@When("user click login button")
	public void user_click_login_button() {
		LoginPage l=new LoginPage();
		clickButton(l.getFbBtn());	
	}

	@Then("user verify test")
	public void user_verify_test() {
		/*String url=driver.getCurrentUrl();
		boolean value=url.contains("login_attempt");
		Assert.assertTrue(value);
		System.out.println("Test Case is Pass");
		*/
		killBrowser();
	}


}
