package com.todo.doto.service;

import com.todo.doto.dto.LoginRequestDto;
import com.todo.doto.dto.LoginResponseDto;
import com.todo.doto.dto.SignUpRequestDto;
import com.todo.doto.dto.SignUpResponseDto;

public interface UserService {
    LoginResponseDto login(LoginRequestDto loginRequestDto);
    SignUpResponseDto signup(SignUpRequestDto signUpRequestDto);

}
