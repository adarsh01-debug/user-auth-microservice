package com.todo.doto.dto;

import lombok.Setter;

import java.util.Date;

@Setter
public class LoginResponseDto {
    String token;
    String createdAt = new Date().toString();
}
