package com.hooks;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Myhooks extends BaseClass{
	
	@Before
	public static void browserLaunch() {
		initDriver();
		launchUrl();
		maximize();
	}

	@After
	public static void browserClose(Scenario scenario) {
		if (scenario.isFailed()) {
			takeScreenshot(driver, scenario, "FAILED");
		}
		quitBrowser();
	}
}
