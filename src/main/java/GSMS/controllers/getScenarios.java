package GSMS.controllers;

import test.core.IScenarioTest;

public class getScenarios {

	public static IScenarioTest[] get() {
		return new IScenarioTest[] {
				
		};
	}
	
	public static IScenarioTest getScenarioById(String id) throws Exception{
		for( IScenarioTest scenario  : get() ){
			if (scenario.getUID().toString().equals(id))
				return scenario;
		}
		
		throw new Exception("ID Not Found");
	}
}
