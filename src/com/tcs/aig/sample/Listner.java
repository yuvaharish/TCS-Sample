package com.tcs.aig.sample;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Listner implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation annatation, Class arg1, Constructor arg2, Method arg3) {
		annatation.setRetryAnalyzer(Retry.class);	
		
	}

}
