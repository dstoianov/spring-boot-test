package com.example.db;

import com.example.common.BaseTest;
import com.example.dto.User;
import com.example.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import java.util.Optional;

/**
 * Created by denys.stoianov on 2016-05-12.
 */
@Slf4j
public class JpaTest extends BaseTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testName() throws Exception {
        Optional<User> byId = userRepository.findById(1);
        log.info(byId.toString());

    }
}
