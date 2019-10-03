package GSMS.scenarios;

import GSMS.controllers.env;
import GSMS.view.pages.admission.ManageApplicationsPage;
import GSMS.view.pages.awards.ApplicantSearch.ApplicantSearchPage;
import GSMS.view.pages.awards.ApplicantSearch.ApplicantSearchResultPage;
import GSMS.view.pages.awards.AwardPortalPage;
import GSMS.view.pages.awards.SearchForCompetition.AddNewCompetitionPage;
import GSMS.view.pages.awards.SearchForCompetition.SearchForCompetitionPage;
import GSMS.view.pages.common.ApplicantLoginPage;
import scenario.core.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static scenario.core.ScenarioCaps.FAssertIsTrue;

public class Scenario7 extends Scenario{

	/**
	 * Constructor
	 *
	 * @param Name
	 * @param Description
	 */
	public Scenario7() {
		super("Scenario 7", "Search for an Applicant");
		
		List<ScenarioStep> steps = new ArrayList<ScenarioStep>();

		steps.add(new ScenarioStep("Step 1", "Perform Searching for applicant while logged in with GN role", m_CodeStep1));



		
		this.setSteps(steps);
	}





	private ICodeStep m_CodeStep1 = new ICodeStep (){

		@Override
		public TestScore Run(ScenarioCaps caps) throws Exception {

			ApplicantLoginPage page = new ApplicantLoginPage(caps.getDriver(), caps.getBrowser());
			page.NavigateToLoginPage();

			page.performLogin(env.get("GA_2_LOGIN_USER_NAME"), env.get("GA_2_LOGIN_PASSWORD"));
			ManageApplicationsPage manageApplicationsPage = new ManageApplicationsPage(caps.getDriver(),caps.getBrowser());
			manageApplicationsPage.click_AwardsTab();




			AwardPortalPage awardPortalPage = new AwardPortalPage(caps.getDriver(), caps.getBrowser());
			awardPortalPage.click_Applicant_search_link();


			ApplicantSearchPage applicantSearchPage = new ApplicantSearchPage(caps.getDriver(), caps.getBrowser());
			applicantSearchPage.enter_last_name_input("")
							.enter_first_name_input("")
							.enter_emplid_input("")
							.select_department_input("Anthropology (Faculty of Arts)")
							.select_department_input("All")
							.select_program_input("All")
							.select_course_or_thesis_input("Course-based")
							.click_search_button();

			ApplicantSearchResultPage applicantSearchResultPage = new ApplicantSearchResultPage(caps.getDriver(), caps.getBrowser());

			FAssertIsTrue(new IAssertionWait(){
				@Override
				public void Assert() {

					assertFalse(applicantSearchResultPage.search_for_applicant_result_row(
							"",
							"",
							"",
							"",
							"",
							"",
							"",
							""));
				}
			});






			manageApplicationsPage.click_LogoutLink();
			manageApplicationsPage.closeTabs();
			return TestScore.PASSED;
		}
	};







}