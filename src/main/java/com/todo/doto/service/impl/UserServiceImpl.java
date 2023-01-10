package com.todo.doto.service.impl;

import com.todo.doto.dto.LoginRequestDto;
import com.todo.doto.dto.LoginResponseDto;
import com.todo.doto.dto.SignUpRequestDto;
import com.todo.doto.dto.SignUpResponseDto;
import com.todo.doto.service.UserService;
import com.todo.doto.vo.LoginRequestVo;
import org.springframework.beans.BeanUtils;

public class UserServiceImpl implements UserService {

    @Override
    public LoginResponseDto login(LoginRequestDto loginRequestDto) {
        LoginRequestVo loginRequestVo = new LoginRequestVo();
        BeanUtils.copyProperties(loginRequestDto, loginRequestVo);
        return null;
    }

    @Override
    public SignUpResponseDto signup(SignUpRequestDto signUpRequestDto) {
        return null;
    }
}
