package com.horacehylee.cucumbertryout.cucumbertryout;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(Cucumber.class)
@SpringBootTest
@CucumberOptions(
        features = {"classpath:sample.feature"},
        glue = {"com.horacehylee.cucumbertryout.cucumbertryout.steps"},
        plugin = {"pretty"}
)
public class CucumberIT {
}
