package com.example.MySpringBoot.repository;

import com.example.MySpringBoot.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findUserByEmail(String email);
}
