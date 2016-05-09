package com.example.licteners;

import lombok.extern.slf4j.Slf4j;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.util.List;

/**
 * Created by Funker on 21.08.2015.
 */
@Slf4j
public class TestSuiteListener implements ISuiteListener {

    @Override
    public void onStart(ISuite suite) {
        log.info("Start suite '{}'", suite.getName());
        List<XmlTest> tests = suite.getXmlSuite().getTests();

        for (XmlTest test : tests) {
            test.setParallel(XmlSuite.ParallelMode.CLASSES);
            test.setThreadCount(3);
            log.info("Test name '{}', set parallel '{}' and thread count '{}'",
                    test.getName(), test.getParallel(), test.getThreadCount());
        }
    }

    @Override
    public void onFinish(ISuite suite) {
        log.info("Finish suite '{}'", suite.getName());
    }
}
