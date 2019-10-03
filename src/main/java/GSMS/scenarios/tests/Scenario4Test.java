package GSMS.scenarios.tests;

import GSMS.scenarios.Scenario4;
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

public class Scenario4Test implements IScenarioTest {
	
	private Scenario4 scenario4 = new Scenario4();
	private static UUID uid=UUID.randomUUID();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Log log=new Log("Search for an Award");
		UnitTestHelper.RunScenarioTest(this, log);
	}

	public TestScore partialtest(RemoteWebDriver driver, Browser browserType, Log log) throws Exception {
	
		System.out.println("Scenario Name: " + scenario4.getName());
		System.out.println("Scenario Description: " + scenario4.getDescription());
		
		return scenario4.Run(new ScenarioCaps(driver, browserType, log));
	}

	@Override
	public String getUID() {
		return uid.toString();
	}

	@Override
	public String getDescription() {
		return scenario4.getDescription();
	}

	@Override
	public String getName() {
		return scenario4.getName();
	}
}