package GSMS.scenarios.tests;

import GSMS.scenarios.Scenario7;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.RemoteWebDriver;
import scenario.core.ScenarioCaps;
import scenario.core.TestScore;
import test.core.IScenarioTest;
import test.core.Log;
import test.core.UnitTestHelper;
import view.core.Browser;

import java.util.UUID;

public class Scenario7Test implements IScenarioTest {
	
	private Scenario7 scenario7 = new Scenario7();
	private static UUID uid=UUID.randomUUID();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Log log=new Log("Search for Applicant");
		UnitTestHelper.RunScenarioTest(this, log);
	}

	public TestScore partialtest(RemoteWebDriver driver, Browser browserType, Log log) throws Exception {
	
		System.out.println("Scenario Name: " + scenario7.getName());
		System.out.println("Scenario Description: " + scenario7.getDescription());
		
		return scenario7.Run(new ScenarioCaps(driver, browserType, log));
	}

	@Override
	public String getUID() {
		return uid.toString();
	}

	@Override
	public String getDescription() {
		return scenario7.getDescription();
	}

	@Override
	public String getName() {
		return scenario7.getName();
	}
}