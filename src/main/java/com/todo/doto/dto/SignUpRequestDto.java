package com.todo.doto.dto;

import com.sun.istack.NotNull;
import lombok.Getter;

@Getter
public class SignUpRequestDto {
    @NotNull
    String username;
    @NotNull
    String email;
    @NotNull
    String hashedPassword;
}
