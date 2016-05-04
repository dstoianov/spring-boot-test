package com.example.configuration;

import lombok.Getter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


@Component
@Configuration
@ConfigurationProperties(prefix = "test.email")
@Getter
@ToString
public class EmailConfig {

    private Map<String, String> conf = new HashMap<>();

    public Properties asProperties() {
        Properties props = new Properties();
        props.putAll(conf);
        return props;
    }
}
