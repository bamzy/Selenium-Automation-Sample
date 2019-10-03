package GSMS.scenarios;

import GSMS.controllers.env;
import GSMS.view.pages.admission.ManageApplicationsPage;
import GSMS.view.pages.awards.AddNewAward.AddNewAwardHubPage;
import GSMS.view.pages.awards.AddNewAward.AddNewAwardPage;
import GSMS.view.pages.awards.AwardPortalPage;
import GSMS.view.pages.awards.SearchForCompetition.AddNewCompetitionPage;
import GSMS.view.pages.awards.SearchForCompetition.SearchForCompetitionPage;
import GSMS.view.pages.common.ApplicantLoginPage;
import scenario.core.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static scenario.core.ScenarioCaps.FAssertIsTrue;

public class Scenario6 extends Scenario{

	/**
	 * Constructor
	 *
	 * @param Name
	 * @param Description
	 */
	public Scenario6() {
		super("Scenario 6", "Search for a Competition");
		
		List<ScenarioStep> steps = new ArrayList<ScenarioStep>();

		steps.add(new ScenarioStep("Step 1", "Perform Searching for a competition", m_CodeStep1));



		
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
			awardPortalPage.click_Search_for_a_competition_link();


			SearchForCompetitionPage searchForCompetitionPage = new SearchForCompetitionPage(caps.getDriver(), caps.getBrowser());
			searchForCompetitionPage.click_add_button();


			AddNewCompetitionPage addNewCompetitionPage  = new AddNewCompetitionPage(caps.getDriver(), caps.getBrowser());
			addNewCompetitionPage.select_academic_years_input("2018/2019")
								 .enter_competition_name_input("Dummy Competition")
								.enter_subcommittee_date_input("10/Sep/2024")
								.enter_final_meeting_date_input("10/Sep/2023")
								.click_save_button();






			manageApplicationsPage.click_LogoutLink();
			manageApplicationsPage.closeTabs();
			return TestScore.PASSED;
		}
	};







}