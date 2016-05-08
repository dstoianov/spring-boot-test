package com.example.components;

import com.example.common.BaseTest;
import com.example.component.SomeHelper;
import com.example.configuration.Config;
import com.example.configuration.EmailConfig;
import com.example.configuration.RandomConfig;
import com.example.service.HelloWorldService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;

/**
 * Created by Funker on 06.05.2016.
 */
@Slf4j
public class ServiceTest extends BaseTest {

    @Autowired
    protected SomeHelper helper;

    @Autowired
    private HelloWorldService helloWorldService;

    @Autowired
    private EmailConfig emailConfig;

    @Autowired
    private Config config;

    @Autowired
    private RandomConfig randomConfig;

    @Test
    public void contextLoads() {

        assertThat(helper, is(notNullValue()));
        assertThat(helloWorldService, is(notNullValue()));
        assertThat(emailConfig, is(notNullValue()));

        log.info(helloWorldService.getHelloMessage());

        log.info(emailConfig.toString());

    }

    @Test
    public void testCountries() {
        List<String> servers = config.getServers();
        assertThat(servers.size(), is(2));
        servers.forEach(System.out::println);
    }

    @Test
    public void testRandomConfig() {
        Properties properties = randomConfig.asProperties();
        Map<String, String> vals = randomConfig.getVal();
        vals.forEach((k, v) -> System.out.println("key : " + k + " value : " + v));
    }
}
