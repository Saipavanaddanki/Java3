package com.nit;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@SelectPackages("com.nit")
@SelectClasses({AppTest.class,AppTest2.class,AppTest3.class})
@Suite
public class suiteTest {

}
