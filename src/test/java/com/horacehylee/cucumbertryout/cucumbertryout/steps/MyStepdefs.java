package com.horacehylee.cucumbertryout.cucumbertryout.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.io.File;
import java.net.URI;

import static org.assertj.core.api.Assertions.*;

public class MyStepdefs {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyStepdefs.class);

    @Then("^test should equal (\\d+)$")
    public void testShouldEqual(int number) throws Throwable {
        LOGGER.info("Hello World");

        ProcessBuilder pb = new ProcessBuilder("open", "/home/horacehylee/Downloads/my-umatrix-rules.txt");
        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        pb.redirectError(ProcessBuilder.Redirect.INHERIT);
        Process p = pb.start();
        p.waitFor();

        // Need to disable headless mode first
        // -Djava.awt.headless=false
        Desktop.getDesktop().open(new File("/home/horacehylee/Downloads/my-umatrix-rules.txt"));
//        Desktop.getDesktop().browse(new URI("https://www.google.com"));

        assertThat(number).isEqualTo(1);
    }
}
