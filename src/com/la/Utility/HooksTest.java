package com.la.Utility;

import org.joda.time.DateTime;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksTest {
	
	
	
	@Before
	public static void enterStartedTime(int startTimeRow, int startTimeCell) {

		DateTime.now();

	}

	@After
	public static void enterFinishedTime(int finishedTimeRow, int finishedTimeCell) {

		DateTime.now();

	}

}
