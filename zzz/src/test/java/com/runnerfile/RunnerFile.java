package com.runnerfile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
        		 glue={"stepDefination"},
        	
        		 tags="@Smoke",
        		 plugin={"pretty",
        				 "json:target/MyReport/report.json",
        				 "junit:target/MYReport/report.xml"
}
        		 
        		
        
        		 
        		 
		)

public class RunnerFile {

}
