package Junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//import cucumber.api.junit.Cucumber;

	@RunWith(Suite.class)
	@SuiteClasses({Login.class,AddEmployee.class,Logout.class})
	public class Batchtest{
		
	}
	


