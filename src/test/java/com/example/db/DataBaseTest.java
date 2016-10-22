package com.example.db;

import com.example.common.BaseTest;
import com.example.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.List;

/**
 * Created by Funker on 06.05.2016.
 */
@Slf4j
public class DataBaseTest extends BaseTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testReadFromDB() throws Exception {
//        http://www.dreamjava.com/content/spring-jdbc-example-query-update-queryForObject-queryForList-batchUpdate-beanPropertyRownMapper.html
        List<User> users = jdbcTemplate.query("SELECT * FROM USER", new BeanPropertyRowMapper(User.class));

        users.forEach(System.out::println);
    }


    @Test(enabled = false)
    public void testName2() throws Exception {
        Class.forName("org.sqlite.JDBC");

        Connection connection = null;
        try {
            // create a database connection
            String property = System.getProperty("user.dir") + "/src/main/resources/test-db-qa.sqlite";
            connection = DriverManager.getConnection("jdbc:sqlite:" + property);
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);  // set timeout to 30 sec.

            ResultSet rs = statement.executeQuery("select * from user;");
            while (rs.next()) {
                // read the result set
                System.out.println("id = " + rs.getInt("id") + "; name = " + rs.getString("name"));

            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }
}
