package com.todo.doto.repository;

import com.todo.doto.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {
    Optional<User> findByUsernameOrEmailAndPassword(String username, String email, String password);
}
