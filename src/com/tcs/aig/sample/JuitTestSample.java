package com.tcs.aig.sample;

import org.junit.Test;

import com.google.common.annotations.VisibleForTesting;

public class JuitTestSample {
	@org.junit.BeforeClass
	public static void BeforeClass() {
		BaseClass.loadDriver();
	}
	@org.junit.AfterClass
	public static void AfterClass() {
		BaseClass.close();
	}
	
	
	@Test
	public void Google() {
		BaseClass.url("https://www.google.com/");
	}
	
	

}
