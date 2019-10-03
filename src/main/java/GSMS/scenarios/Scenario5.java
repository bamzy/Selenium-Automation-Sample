package GSMS.scenarios;

import GSMS.controllers.env;
import GSMS.view.pages.admission.ManageApplicationsPage;
import GSMS.view.pages.awards.AddNewAward.AddNewAwardHubPage;
import GSMS.view.pages.awards.AddNewAward.AddNewAwardPage;
import GSMS.view.pages.awards.AwardPortalPage;
import GSMS.view.pages.awards.SearchForAnAward.SearchForAwardResultPage;
import GSMS.view.pages.common.ApplicantLoginPage;
import scenario.core.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static scenario.core.ScenarioCaps.FAssertIsTrue;

public class Scenario5 extends Scenario{

	/**
	 * Constructor
	 *
	 * @param Name
	 * @param Description
	 */
	public Scenario5() {
		super("Scenario 5", "Add a new Award");
		
		List<ScenarioStep> steps = new ArrayList<ScenarioStep>();

		steps.add(new ScenarioStep("Step 1", "Perform Adding new award", m_CodeStep1));



		
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
			awardPortalPage.click_Add_new_Award_link();;


			AddNewAwardPage addNewAwardPage = new AddNewAwardPage(caps.getDriver(), caps.getBrowser());
			addNewAwardPage.enter_short_name_input("Dummy Award Short Name")
							.enter_full_name_input("Dummy Award Full Name")
							.select_years_input("2018/2019")
							.select_funding_type_input("Centrally Funded")
							.click_save_button();

			AddNewAwardHubPage addNewAwardHubPage = new AddNewAwardHubPage(caps.getDriver(), caps.getBrowser());
			addNewAwardHubPage.enter_approval_date_input("19/Sep/2019")
							.select_award_type_input("Award")
							.select_award_category_input("National")
							.select_citizenship_status_input("All")
							.select_program_input("Doctoral")
							.select_topup_award_input("KILLAM DF")
							.enter_award_or_honour_code_input("123456")
							.select_payment_frequency_input("Standard")
//							.select_course_or_thesis_based_input("Thesis-based")
							.select_administrative_authority_input("FGSR");


			addNewAwardHubPage.select_period_slot_input("Fall Term")
							.enter_start_date_input("19/Sep/2018")
							.enter_end_date_input("19/Sep/2019")
							.enter_display_end_date_input("19/Sep/2019")
							.enter_application_deadline_input("19/Sep/2018")
							.enter_nomination_deadline_input("19/Sep/2018")
							.select_status_input("Open")
//							.select_advisor_one_input("blah")
//							.select_advisor_two_input("blah")
							.select_workflow_input("Direct Application")
							.enter_max_awards_input("4000")
							.enter_min_awards_input("3000")
							.enter_default_or_max_value_input("4000")
							.enter_min_amount_input("400")
							.select_fund_group_input("Travel Awards")
							.select_eligibility_group_input("Canadian Citizen or Permanent Resident")
					.click_update_button();
			addNewAwardHubPage.click_close_button();

			manageApplicationsPage.click_LogoutLink();
			manageApplicationsPage.closeTabs();


			return TestScore.PASSED;
		}
	};







}