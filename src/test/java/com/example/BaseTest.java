package com.example;


import com.example.component.SomeHelper;
import com.example.configuration.EmailConfig;
import com.example.service.HelloWorldService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;

//@RunWith(SpringJUnit4ClassRunner.class)
@Slf4j
@SpringApplicationConfiguration(classes = Application.class)
//@WebAppConfiguration
@TestPropertySource("classpath:/application-test.properties")
public class BaseTest extends AbstractTestNGSpringContextTests {

    @Autowired
    protected SomeHelper helper;

    @Autowired
    private HelloWorldService helloWorldService;

    @Autowired
    private EmailConfig emailConfig;

    @Test
    public void contextLoads() {

        assertThat("dd", is("dd"));
        assertThat(helper, is(notNullValue()));
        assertThat(helloWorldService, is(notNullValue()));
        assertThat(emailConfig, is(notNullValue()));

        log.info(helloWorldService.getHelloMessage());

        log.info(emailConfig.toString());

    }

}
