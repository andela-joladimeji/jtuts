package com.andela.tutorials;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ArrayUtilTest.class, DateUtilTest.class, FileUtilTest.class,
		MethodUtilTest.class, StringUtilTest.class })
public class AllTests {

}
