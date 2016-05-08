package com.example.common;


import com.example.Application;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;


//@ActiveProfiles(value = {"qa"})
@SpringApplicationConfiguration(classes = Application.class)
@TestPropertySource("classpath:/application-test.properties")
public class BaseTest extends AbstractTestNGSpringContextTests {


}
