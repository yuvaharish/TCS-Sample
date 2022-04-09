package com.tcs.aig.sample;

import org.junit.Ignore;
import org.junit.Test;

public class JunitSample2 {
	@org.junit.BeforeClass
	public static void BeforeClass() {
		BaseClass.loadDriver();
	}
	@org.junit.AfterClass
	public static void AfterClass() {
		BaseClass.close();
	}
	
	@Ignore
	public void FaceBoook() {
		BaseClass.url("https://www.facebook.com/");
	}
	
	@Test
	public void Google() {
		BaseClass.url("https://www.google.com/");
	}
	
}
