package com.tcs.aig.sample;

public class SampleOne {
	
	
	private void statusMethod() {
		System.out.println("Status");
	}
	
	 private void videoMethod() {
		System.out.println("video call");
	}
	
	 private void audioMethod() {
		System.out.println("Audio call");
	}

	public static void main(String[] args) {
		SampleOne s = new SampleOne();
		s.audioMethod();
		s.statusMethod();
	}
}


