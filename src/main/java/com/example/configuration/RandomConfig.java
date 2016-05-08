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
@ConfigurationProperties(prefix = "random")
@Getter
@ToString
public class RandomConfig {

    private Map<String, String> val = new HashMap<>();

    public Properties asProperties() {
        Properties props = new Properties();
        props.putAll(val);
        return props;
    }
}
