package GSMS.scenarios;

import GSMS.controllers.env;
import GSMS.view.pages.admission.ManageApplicationsPage;
import GSMS.view.pages.awards.AwardPortalPage;
import GSMS.view.pages.awards.AwardTenureReport.AwardTenureReportSearchPage;
import GSMS.view.pages.awards.AwardTenureReport.AwardTenureReportSearchResultPage;
import GSMS.view.pages.common.ApplicantLoginPage;
import scenario.core.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static scenario.core.ScenarioCaps.FAssertIsTrue;

public class Scenario3 extends Scenario{

	/**
	 * Constructor
	 *
	 * @param Name
	 * @param Description
	 */
	public Scenario3() {
		super("Scenario 3", "Award Tenure Report");
		
		List<ScenarioStep> steps = new ArrayList<ScenarioStep>();

		steps.add(new ScenarioStep("Step 1", "Perform simple login as an applicant", m_CodeStep1));
		steps.add(new ScenarioStep("Step 2", "Perform failed award tenure report search", m_CodeStep2));
		steps.add(new ScenarioStep("Step 3", "Perform successful award tenure report search", m_CodeStep3));


		
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
			awardPortalPage.click_Award_tenure_report_link();


			AwardTenureReportSearchPage awardTenureReportSearchPage = new AwardTenureReportSearchPage(caps.getDriver(), caps.getBrowser());
			awardTenureReportSearchPage.select_years_input("2012/2013")
					.enter_last_name_input("aaa")
					.enter_first_name_input("bbb")
					.enter_emplid_input("1234567")
					.select_department_input("Anthropology")
					.select_faculty_input("Faculty of Arts")
					.enter_award_name_input("ffff")
					.select_status_input("Alternate")
					.click_search_button();

			AwardTenureReportSearchResultPage awardTenureReportSearchResultPage = new AwardTenureReportSearchResultPage(caps.getDriver(), caps.getBrowser());

			FAssertIsTrue(new IAssertionWait(){
				@Override
				public void Assert() {

					assertFalse(awardTenureReportSearchResultPage.search_for_report_row("cccc","bbb","aaa","ffff","2011/2012","dummy","dummy","dummy","1500"));
				}
			});


			manageApplicationsPage.click_LogoutLink();
			manageApplicationsPage.closeTabs();


			return TestScore.PASSED;
		}
	};


	private ICodeStep m_CodeStep3 = new ICodeStep (){

		@Override
		public TestScore Run(ScenarioCaps caps) throws Exception {

			ApplicantLoginPage page = new ApplicantLoginPage(caps.getDriver(), caps.getBrowser());
			page.NavigateToLoginPage();

			page.performLogin(env.get("GA_1_LOGIN_USER_NAME"), env.get("GA_1_LOGIN_PASSWORD"));
			ManageApplicationsPage manageApplicationsPage = new ManageApplicationsPage(caps.getDriver(),caps.getBrowser());
			manageApplicationsPage.click_AwardsTab();




			AwardPortalPage awardPortalPage = new AwardPortalPage(caps.getDriver(), caps.getBrowser());
			awardPortalPage.click_Award_tenure_report_link();

			AwardTenureReportSearchPage awardTenureReportSearchPage = new AwardTenureReportSearchPage(caps.getDriver(), caps.getBrowser());
			awardTenureReportSearchPage.select_years_input("2011/2012")
					.enter_last_name_input("AH")
					.enter_first_name_input("QJZZIJ")
					.enter_emplid_input("1270267")
					.select_department_input("Electrical and Computer Engineering")
					.select_status_input("Offer Accepted")
					.click_search_button();



			AwardTenureReportSearchResultPage awardTenureReportSearchResultPage = new AwardTenureReportSearchResultPage(caps.getDriver(), caps.getBrowser());
			FAssertIsTrue(new IAssertionWait(){
				@Override
				public void Assert() {

					assertTrue(awardTenureReportSearchResultPage.search_for_report_row("1270267","AH","QJZZIJ","Walter H Johns Graduate Fellowship 2011/12","2011/2012","Electrical and Computer Engineering","01/Sep/2011","31/Aug/2012","5184"));
				}
			});

			awardTenureReportSearchResultPage.click_export_button();



			manageApplicationsPage.click_LogoutLink();
			manageApplicationsPage.closeTabs();


			return TestScore.PASSED;
		}
	};





}