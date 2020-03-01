package org.techAltum.com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice_01 {

	@Test
	public void test01() {
		
		String userDir = System.getProperty("user.dir");
		System.out.println("User dir is = " + userDir);
		
		String chromeDriverEXE = userDir + "//browserDriversEXE//chromedriver.exe";
		
		String osName = System.getProperty("os.name");
		System.out.println("OS is = " + osName);
		
		String osStruct = System.getProperty("os.arch");
		System.out.println("OS struct = " + osStruct);
		
		String userName = System.getProperty("user.name");
		System.out.println("User name = " + userName);
		
		
		int t1 = 2;
		int t2 = 2;
		
		Assert.assertEquals(t1, t2);
		System.out.println("Hi");
		
		String s1 = "Selenium";
		String s2 = "Se";
		
		Assert.assertTrue(s1.contains(s2));
		System.out.println("Done");
	}
}
