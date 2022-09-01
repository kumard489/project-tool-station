package org.utilities;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class RetryAllFailedTC implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		IRetryAnalyzer ra = annotation.getRetryAnalyzer();
		if(ra==null) {
			annotation.setRetryAnalyzer(RetryFailureTC.class);
		}
	}

}
