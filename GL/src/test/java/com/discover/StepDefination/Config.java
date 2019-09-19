package com.discover.StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.discover.pages.Shows;
import com.webdriverUtils.Commonfunctions;

import cucumber.api.java.Before;

public class Config extends Commonfunctions{
@Before
public void initialisation(){
	//Shows show=PageFactory.initElements(this.driver,Shows.class);
}
}
