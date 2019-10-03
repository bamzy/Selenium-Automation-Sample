package GSMS.scenarios;

import scenario.core.IAssertionWait;
import scenario.core.ICodeStep;
import scenario.core.Scenario;
import scenario.core.ScenarioCaps;
import scenario.core.ScenarioStep;
import scenario.core.TestScore;

import static org.junit.Assert.*;
import static scenario.core.ScenarioCaps.FAssertIsTrue;

import java.util.ArrayList;
import java.util.List;

import GSMS.view.pages.AdvancedSearchPage;
import GSMS.view.pages.SearchResultsPage;
import GSMS.view.pages.SimpleSearchPage;

public class Scenario1 extends Scenario{

	/**
	 * Constructor
	 * 
	 * @param Name
	 * @param Description
	 */
	public Scenario1() {
		super("Scenario 1", "Perform simple search and advanced search. Verify the search results.");
		
		List<ScenarioStep> steps = new ArrayList<ScenarioStep>();
		
		steps.add(new ScenarioStep("Step 1", "Perform simple search to check when no records matched the search", m_CodeStep1));
		steps.add(new ScenarioStep("Step 2", "Perform simple search and sort the search results table", m_CodeStep2));
		steps.add(new ScenarioStep("Step 3", "Find records with names that match", m_CodeStep3));
		steps.add(new ScenarioStep("Step 4", "View the information details and documents", m_CodeStep4));
		steps.add(new ScenarioStep("Step 5", "Find records with years that match", m_CodeStep5));
		steps.add(new ScenarioStep("Step 6", "Find records with geolocation informaton that match", m_CodeStep6));
		steps.add(new ScenarioStep("Step 7", "Verify French accent marks are displayed correctly", m_CodeStep7));
		steps.add(new ScenarioStep("Step 8", "Verify annotation shows when the results have question mark", m_CodeStep8));
		steps.add(new ScenarioStep("Step 9", "Verify search queries with punctuation return the correct results", m_CodeStep9));
		
		this.setSteps(steps);
	}
	
	private ICodeStep m_CodeStep1 = new ICodeStep (){

		@Override
		public TestScore Run(ScenarioCaps caps) throws Exception {
			
			SimpleSearchPage page = new SimpleSearchPage(caps.getDriver(), caps.getBrowser());
			page.NavigateToSimpleSearch();
			
			page.performSimpleSearch("balabala");
			
			SearchResultsPage results = new SearchResultsPage(caps.getDriver(), caps.getBrowser());
			FAssertIsTrue(new IAssertionWait(){
				@Override
				public void Assert() {
					assertTrue(results.hasNoMatchedRecords());
				}
	        });
			results.clickModifySearch();
			
			return TestScore.PASSED;
		}
	}; 
	
	private ICodeStep m_CodeStep2 = new ICodeStep (){

		@Override
		public TestScore Run(ScenarioCaps caps) throws Exception {
			
			SimpleSearchPage page = new SimpleSearchPage(caps.getDriver(), caps.getBrowser());
			page.performSimpleSearch("Simon");
			
			SearchResultsPage results = new SearchResultsPage(caps.getDriver(), caps.getBrowser());
			FAssertIsTrue(new IAssertionWait(){
				@Override
				public void Assert() {
					assertEquals(results.getFamilyName(0), "Attaken");
				}
	        });
			
			results.descSortingFamilyName();
			FAssertIsTrue(new IAssertionWait(){
				@Override
				public void Assert() {
					assertEquals(results.getFamilyName(0), "William");
				}
	        });
			
			results.ascSortingFirstName();
			FAssertIsTrue(new IAssertionWait(){
				@Override
				public void Assert() {
					assertEquals(results.getFirstName(0), "Alexis");
				}
	        });
			
			results.descSortingFirstName();
			FAssertIsTrue(new IAssertionWait(){
				@Override
				public void Assert() {
					assertEquals(results.getFirstName(0), "Simont");
				}
	        });
			
			results.ascSortingYearOfBirth();
			FAssertIsTrue(new IAssertionWait(){
				@Override
				public void Assert() {
					assertEquals(results.getYearOfBirth(0), "");
				}
	        });
			
			results.descSortingYearOfBirth();
			FAssertIsTrue(new IAssertionWait(){
				@Override
				public void Assert() {
					assertEquals(results.getYearOfBirth(0), "1900");
				}
	        });
			
			results.ascSortingDataSource();
			FAssertIsTrue(new IAssertionWait(){
				@Override
				public void Assert() {
					assertEquals(results.getDataSource(0), "Census 1891");
				}
	        });
			
			results.descSortingDataSource();
			FAssertIsTrue(new IAssertionWait(){
				@Override
				public void Assert() {
					assertEquals(results.getDataSource(0), "Northwest Scrip");
				}
	        });
			
			results.ascSortingPlaceOfApplication();
			FAssertIsTrue(new IAssertionWait(){
				@Override
				public void Assert() {
					assertEquals(results.getPlaceofApplication(0), "");
				}
	        });
			
			results.descSortingPlaceOfApplication();
			FAssertIsTrue(new IAssertionWait(){
				@Override
				public void Assert() {
					assertEquals(results.getPlaceofApplication(0), "Yale North K2");
				}
	        });
			
			return TestScore.PASSED;
		}
	}; 
	
	private ICodeStep m_CodeStep3 = new ICodeStep (){

		@Override
		public TestScore Run(ScenarioCaps caps) throws Exception {
			
			AdvancedSearchPage page = new AdvancedSearchPage(caps.getDriver(), caps.getBrowser());
			page.NavigateToAdvancedSearch();
			
			page.selectDataSource("All")
			.enterYearOfBirth("1883")
			.enterFamilyName("Whiteford")
			.enterFirstName("Marie")
			.performAdvancedSearch();
			
			SearchResultsPage results = new SearchResultsPage(caps.getDriver(), caps.getBrowser());
			FAssertIsTrue(new IAssertionWait(){
				@Override
				public void Assert() {
					assertEquals(results.getFamilyName(0), "Whiteford");
					assertEquals(results.getFirstName(0), "Marie");
					assertEquals(results.getYearOfBirth(0), "1883");
					assertEquals(results.getDataSource(0), "Census 1901");
					assertEquals(results.getPlaceofApplication(0), "Willowbunch");
				}
	        });
			
			return TestScore.PASSED;
		}
	};
	
	private ICodeStep m_CodeStep4 = new ICodeStep (){

		@Override
		public TestScore Run(ScenarioCaps caps) throws Exception {
			
			SearchResultsPage results = new SearchResultsPage(caps.getDriver(), caps.getBrowser());
			results.clickFamilyName(0);
			FAssertIsTrue(new IAssertionWait(){
				@Override
				public void Assert() {
					assertTrue(caps.getDriver().getPageSource().contains("Document Series: Census 1901"));
					assertTrue(caps.getDriver().getPageSource().contains("6553_204Assin_Y2_53_p001"));
				}
	        });
			
			results.clickDocument("6553_204Assin_Y2_53_p001");
			
			ArrayList<String> tabs = new ArrayList<String>(caps.getDriver().getWindowHandles());
			caps.getDriver().switchTo().window(tabs.get(1));
			FAssertIsTrue(new IAssertionWait(){
				@Override
				public void Assert() {
					assertTrue(caps.getDriver().getPageSource().contains("Documents that do not load will be posted soon."));
				}
	        });
			caps.getDriver().close();
			caps.getDriver().switchTo().window(tabs.get(0));
			
			return TestScore.PASSED;
		}
	};
	
	private ICodeStep m_CodeStep5 = new ICodeStep (){

		@Override
		public TestScore Run(ScenarioCaps caps) throws Exception {
			
			AdvancedSearchPage page = new AdvancedSearchPage(caps.getDriver(), caps.getBrowser());
			page.NavigateToAdvancedSearch();
			
			page.enterFirstName("Paul")
			.enterYearOfBirth("1873?")
			.enterYearOfApplication("1881")
			.performAdvancedSearch();
			
			SearchResultsPage results = new SearchResultsPage(caps.getDriver(), caps.getBrowser());
			FAssertIsTrue(new IAssertionWait(){
				@Override
				public void Assert() {
					assertEquals(results.getFamilyName(0), "Beaulieu");
					assertEquals(results.getFirstName(0), "Paul");
					assertEquals(results.getYearOfBirth(0), "1873?");
					assertEquals(results.getDataSource(0), "Census 1881");
					assertEquals(results.getPlaceofApplication(0), "Fort Resolution");
				}
	        });
			
			return TestScore.PASSED;
		}
	};
	
	private ICodeStep m_CodeStep6 = new ICodeStep (){

		@Override
		public TestScore Run(ScenarioCaps caps) throws Exception {
			
			AdvancedSearchPage page = new AdvancedSearchPage(caps.getDriver(), caps.getBrowser());
			page.NavigateToAdvancedSearch();
			
			page.enterFirstName("Robert")
			.enterPlaceOfBirth("United States")
			.enterResidenceLocation("British Columbia")
			.enterPlaceOfApplication("A1 Chilliwack S D")
			.performAdvancedSearch();
			
			SearchResultsPage results = new SearchResultsPage(caps.getDriver(), caps.getBrowser());
			FAssertIsTrue(new IAssertionWait(){
				@Override
				public void Assert() {
					assertEquals(results.getFamilyName(0), "Gardner");
					assertEquals(results.getFirstName(0), "Robert");
					assertEquals(results.getYearOfBirth(0), "1833");
					assertEquals(results.getDataSource(0), "Census 1901");
					assertEquals(results.getPlaceofApplication(0), "A1 Chilliwack S D");
				}
	        });
			
			return TestScore.PASSED;
		}
	};
	
	private ICodeStep m_CodeStep7 = new ICodeStep (){

		@Override
		public TestScore Run(ScenarioCaps caps) throws Exception {
			
			AdvancedSearchPage page = new AdvancedSearchPage(caps.getDriver(), caps.getBrowser());
			page.NavigateToAdvancedSearch();
			
			page.enterFamilyName("Couillonneur").enterFirstName("Jérôme").performAdvancedSearch();
			
			SearchResultsPage results = new SearchResultsPage(caps.getDriver(), caps.getBrowser());
			FAssertIsTrue(new IAssertionWait(){
				@Override
				public void Assert() {
					assertEquals(results.getFirstName(0), "Jérôme");
				}
	        });
			results.clickModifySearch();
			
			page.enterFamilyName("Beaudry").enterFirstName("Noël").performAdvancedSearch();
			FAssertIsTrue(new IAssertionWait(){
				@Override
				public void Assert() {
					assertEquals(results.getFirstName(0), "Noël");
				}
	        });
			results.clickModifySearch();
			
			page.enterFamilyName("Beauchemin").enterFirstName("Adélaïde").performAdvancedSearch();
			FAssertIsTrue(new IAssertionWait(){
				@Override
				public void Assert() {
					assertEquals(results.getFirstName(2), "Adélaïde");
				}
	        });
			results.clickModifySearch();
			
			page.enterFamilyName("Beaulieu").enterFirstName("Hélène").performAdvancedSearch();
			FAssertIsTrue(new IAssertionWait(){
				@Override
				public void Assert() {
					assertEquals(results.getFirstName(0), "Hélène");
				}
	        });
			
			return TestScore.PASSED;
		}
	};
	
	private ICodeStep m_CodeStep8 = new ICodeStep (){

		@Override
		public TestScore Run(ScenarioCaps caps) throws Exception {
			
			AdvancedSearchPage page = new AdvancedSearchPage(caps.getDriver(), caps.getBrowser());
			page.NavigateToAdvancedSearch();
			
			page.enterFirstName("?").enterFamilyName("?").performAdvancedSearch();
			
			SearchResultsPage results = new SearchResultsPage(caps.getDriver(), caps.getBrowser());
			FAssertIsTrue(new IAssertionWait(){
				@Override
				public void Assert() {
					assertTrue(results.getFamilyName(0).contains("?"));
					assertTrue(results.getFirstName(0).contains("?"));
					assertTrue(caps.getDriver().getPageSource().contains("Data with '?' indicates records matched by best"));
				}
	        });
			
			return TestScore.PASSED;
		}
	};
	
	private ICodeStep m_CodeStep9 = new ICodeStep (){

		@Override
		public TestScore Run(ScenarioCaps caps) throws Exception {
			
			AdvancedSearchPage page = new AdvancedSearchPage(caps.getDriver(), caps.getBrowser());
			page.NavigateToAdvancedSearch();
			
			page.enterPlaceOfApplication("St. Albert").performAdvancedSearch();
			
			SearchResultsPage results = new SearchResultsPage(caps.getDriver(), caps.getBrowser());
			FAssertIsTrue(new IAssertionWait(){
				@Override
				public void Assert() {
					assertEquals(results.getPlaceofApplication(0), "St Albert");
				}
	        });
			
			return TestScore.PASSED;
		}
	};
}