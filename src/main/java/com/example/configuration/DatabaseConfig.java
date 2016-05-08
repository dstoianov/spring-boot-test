package com.example.configuration;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * Created by denys.stoianov on 2016-05-06.
 */
@Configuration
public class DatabaseConfig {

    @Resource
    private Environment env;

    @Bean
    public DataSource dataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(env.getProperty("spring.datasource.driverClassName"));
        ds.setUrl(env.getProperty("spring.datasource.url"));
//        ds.setUsername(env.getProperty("jdbc.username"));
//        ds.setPassword(env.getProperty("jdbc.password"));
        return ds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }


}