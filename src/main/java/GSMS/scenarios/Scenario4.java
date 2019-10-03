package GSMS.scenarios;

import GSMS.controllers.env;
import GSMS.view.pages.admission.ManageApplicationsPage;
import GSMS.view.pages.awards.AwardPortalPage;
import GSMS.view.pages.awards.AwardTenureReport.AwardTenureReportSearchPage;
import GSMS.view.pages.awards.AwardTenureReport.AwardTenureReportSearchResultPage;
import GSMS.view.pages.awards.SearchForAnAward.SearchForAwardPage;
import GSMS.view.pages.awards.SearchForAnAward.SearchForAwardResultPage;
import GSMS.view.pages.common.ApplicantLoginPage;
import scenario.core.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static scenario.core.ScenarioCaps.FAssertIsTrue;

public class Scenario4 extends Scenario{

	/**
	 * Constructor
	 *
	 * @param Name
	 * @param Description
	 */
	public Scenario4() {
		super("Scenario 4", "Search for an Award");
		
		List<ScenarioStep> steps = new ArrayList<ScenarioStep>();

		steps.add(new ScenarioStep("Step 3", "Perform successful award search", m_CodeStep1));
		steps.add(new ScenarioStep("Step 2", "Perform failed award search", m_CodeStep2));


		
		this.setSteps(steps);
	}





	private ICodeStep m_CodeStep1 = new ICodeStep (){

		@Override
		public TestScore Run(ScenarioCaps caps) throws Exception {

			ApplicantLoginPage page = new ApplicantLoginPage(caps.getDriver(), caps.getBrowser());
			page.NavigateToLoginPage();

			page.performLogin(env.get("GA_1_LOGIN_USER_NAME"), env.get("GA_1_LOGIN_PASSWORD"));
			ManageApplicationsPage manageApplicationsPage = new ManageApplicationsPage(caps.getDriver(),caps.getBrowser());
			manageApplicationsPage.click_AwardsTab();




			AwardPortalPage awardPortalPage = new AwardPortalPage(caps.getDriver(), caps.getBrowser());
			awardPortalPage.click_Search_for_an_award_link();;


			SearchForAwardPage searchForAwardPage = new SearchForAwardPage(caps.getDriver(), caps.getBrowser());
			searchForAwardPage.enter_speedcode_input("02996")
					.click_search_button();

			SearchForAwardResultPage searchForAwardResultPage = new SearchForAwardResultPage(caps.getDriver(), caps.getBrowser());

			FAssertIsTrue(new IAssertionWait(){
				@Override
				public void Assert() {

					assertTrue(searchForAwardResultPage.search_for_award_row(
							"000002",
							"Izaak Walton Killam Memorial Scholarship 2018/19",
							"2018/19",
							"Killam Trusts",
							"02996",
							"000027256",
							"",
							"Yes",
							"Endowment"));
				}
			});


			manageApplicationsPage.click_LogoutLink();
			manageApplicationsPage.closeTabs();


			return TestScore.PASSED;
		}
	};


	private ICodeStep m_CodeStep2 = new ICodeStep (){

		@Override
		public TestScore Run(ScenarioCaps caps) throws Exception {

			ApplicantLoginPage page = new ApplicantLoginPage(caps.getDriver(), caps.getBrowser());
			page.NavigateToLoginPage();

			page.performLogin(env.get("GA_1_LOGIN_USER_NAME"), env.get("GA_1_LOGIN_PASSWORD"));
			ManageApplicationsPage manageApplicationsPage = new ManageApplicationsPage(caps.getDriver(),caps.getBrowser());
			manageApplicationsPage.click_AwardsTab();




			AwardPortalPage awardPortalPage = new AwardPortalPage(caps.getDriver(), caps.getBrowser());
			awardPortalPage.click_Search_for_an_award_link();;


			SearchForAwardPage searchForAwardPage = new SearchForAwardPage(caps.getDriver(), caps.getBrowser());
			searchForAwardPage.enter_award_id_input("")
					.enter_award_name_input("")
					.select_years_input("")
					.enter_combo_code_input("02996")
					.enter_speedcode_input("")
					.select_category_input("")
					.select_pending_input("")
					.select_funding_type_input("")
					.click_search_button();

			SearchForAwardResultPage searchForAwardResultPage = new SearchForAwardResultPage(caps.getDriver(), caps.getBrowser());

			FAssertIsTrue(new IAssertionWait(){
				@Override
				public void Assert() {

					assertFalse(searchForAwardResultPage.search_for_award_row(
							"000020",
							"Izaak Walton Killam Memorial Postdoctoral Fellowship 2018/19",
							"2018/19",
							"Killam Trusts",
							"02996",
							"000027256",
							"",
							"Yes",
							"Endowment"));
				}
			});


			manageApplicationsPage.click_LogoutLink();
			manageApplicationsPage.closeTabs();

			return TestScore.PASSED;

		}
	};





}