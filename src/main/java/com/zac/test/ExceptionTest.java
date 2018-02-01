package com.zac.test;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTest {
	public static void main(String[] args) {
		ExceptionTest exceptionTest = new ExceptionTest();
		exceptionTest.methodA();
	}

	void methodA() {
		try {
			methodB(); // (1)
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage()); // (3)
		} finally {
			System.out.println("MethodA was finished"); // (4)
		}
	}

	void methodB() throws FileNotFoundException { // (2)
		FileReader exFile = new FileReader("exFile.txt");
	}
}
