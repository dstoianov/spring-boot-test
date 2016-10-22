package com.example.repository;

/**
 * Created by denys.stoianov on 2016-05-12.
 */

import com.example.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findById(Integer id);

    Set<User> findByIdIn(Set<Integer> ids);

    Optional<User> findByIdAndName(Integer id, String name);

}
