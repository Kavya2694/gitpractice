package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\Feature\\loginfb2.feature"},glue= {"com.steps"},dryRun=false)
public class TestRunner {

}
