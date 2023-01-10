package com.todo.doto.helper;

import com.todo.doto.vo.LoginRequestVo;
import com.todo.doto.vo.LoginResponseVo;

public interface UserHelper {
    LoginResponseVo loginHelper(LoginRequestVo loginRequestVo);
}
