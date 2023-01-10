package com.todo.doto.helper.impl;

import com.todo.doto.entity.User;
import com.todo.doto.helper.UserHelper;
import com.todo.doto.repository.UserRepository;
import com.todo.doto.utils.ErrorConstants;
import com.todo.doto.vo.LoginRequestVo;
import com.todo.doto.vo.LoginResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

public class UserHelperImpl implements UserHelper {

    @Autowired
    UserRepository userRepository;

    @Override
    public LoginResponseVo loginHelper(LoginRequestVo loginRequestVo) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        loginRequestVo.setHashedPassword(bCryptPasswordEncoder.encode(loginRequestVo.getPassword()));
        Optional<User> user = userRepository.findByUsernameOrEmailAndPassword(loginRequestVo.getUsername(), loginRequestVo.getEmail(), loginRequestVo.getPassword());
        if(!user.isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, ErrorConstants.USER_NOT_FOUND);
        }

        return null;
    }
}
