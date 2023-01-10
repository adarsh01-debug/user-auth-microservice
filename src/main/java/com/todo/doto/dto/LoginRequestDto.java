package com.todo.doto.dto;

import com.sun.istack.NotNull;
import lombok.Getter;

@Getter
public class LoginRequestDto {
    String username;
    String email;
    @NotNull
    String password;
}
