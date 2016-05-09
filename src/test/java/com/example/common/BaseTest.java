package com.example.common;


import com.example.Application;
import com.example.service.HelloWorldService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

@Slf4j
//@ActiveProfiles(value = {"qa"})
@SpringApplicationConfiguration(classes = Application.class)
@TestPropertySource("classpath:/application-test.properties")
public class BaseTest extends AbstractTestNGSpringContextTests {

    @Autowired
    protected HelloWorldService helloWorldService;

    @BeforeMethod
    public void beforeMethod(Method m, ITestContext ctx) {
        int i = this.getClass().getName().lastIndexOf(".");
        String message = String.format("Test name '%s.%s' - %s", this.getClass().getName().substring(i + 1), m.getName(), getThreadId());
        log.info(message);
        log.info("Service '{}'", helloWorldService.toString());
    }

    private String getThreadId() {
        return "Thread #" + Thread.currentThread().getId();
    }

}
