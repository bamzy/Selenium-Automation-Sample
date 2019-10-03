package GSMS.scenarios;

import GSMS.controllers.env;
import GSMS.view.pages.admission.ManageApplicationsPage;
import GSMS.view.pages.awards.AwardPortalPage;
import GSMS.view.pages.common.ApplicantLoginPage;
import scenario.core.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static scenario.core.ScenarioCaps.FAssertIsTrue;

public class Scenario2 extends Scenario{

	/**
	 * Constructor
	 *
	 * @param Name
	 * @param Description
	 */
	public Scenario2() {
		super("Scenario 1", "Perform simple login as a GA.");
		
		List<ScenarioStep> steps = new ArrayList<ScenarioStep>();
		
		steps.add(new ScenarioStep("Step 1", "Perform simple login as an applicant", m_CodeStep1));
		steps.add(new ScenarioStep("Step 2", "Navigate to Awards Tab and search in upcoming awards", m_CodeStep2));

		
		this.setSteps(steps);
	}
	
	private ICodeStep m_CodeStep1 = new ICodeStep (){

		@Override
		public TestScore Run(ScenarioCaps caps) throws Exception {
			
			ApplicantLoginPage page = new ApplicantLoginPage(caps.getDriver(), caps.getBrowser());
			page.NavigateToLoginPage();
			
			page.performLogin(env.get("GA_1_LOGIN_USER_NAME"), env.get("GA_1_LOGIN_PASSWORD"));


			ManageApplicationsPage manageApplicationsPage = new ManageApplicationsPage(caps.getDriver(),caps.getBrowser());
			manageApplicationsPage.click_ManageApplicationsTab();
			FAssertIsTrue(new IAssertionWait(){
				@Override
				public void Assert() {

					assertTrue(manageApplicationsPage.get_page_title().equalsIgnoreCase("Manage Applications"));
				}
	        });


			manageApplicationsPage.click_AwardsTab();
			FAssertIsTrue(new IAssertionWait(){
				@Override
				public void Assert() {

					assertTrue(manageApplicationsPage.get_page_title().equalsIgnoreCase("Awards Portal"));
				}
			});


			return TestScore.PASSED;
		}
	};
	private ICodeStep m_CodeStep2 = new ICodeStep () {
		@Override
		public TestScore Run(ScenarioCaps caps) throws Exception {


			ManageApplicationsPage manageApplicationsPage = new ManageApplicationsPage(caps.getDriver(), caps.getBrowser());
			manageApplicationsPage.click_AwardsTab();

			AwardPortalPage awardPortalPage = new AwardPortalPage(caps.getDriver(),caps.getBrowser());

			FAssertIsTrue(new IAssertionWait() {
				@Override
				public void Assert() {

					assertTrue(awardPortalPage.search_by_award_id("000007"));
				}
			});


			return TestScore.PASSED;
		}

	};


}