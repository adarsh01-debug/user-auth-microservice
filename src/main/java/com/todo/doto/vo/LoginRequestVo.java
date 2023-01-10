package com.todo.doto.vo;

import com.sun.istack.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class LoginRequestVo {
    String username;
    String email;
    @NotNull
    String password;
    @NotNull
    String hashedPassword;
}
