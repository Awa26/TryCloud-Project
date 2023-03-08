package com.seamlessly.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",
        glue = "com/seamlessly/step_definitions",
        dryRun = false,


        tags = "@MP",

       // tags = "@IG",


       // tags = "@uploadFile",

       // tags = "@dashboard",

        publish = true //generating a report with public link
)
public class CukesRunner {}


