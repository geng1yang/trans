package com.xcy.service;

import com.xcy.pojo.LoginResult;
import com.xcy.pojo.User;

public interface UserService {

    LoginResult isLogin(User user);

    boolean validateUsername(String userPhone);

    int insertUser(User user);

    //String register(String regPhone, String pwd, String pwdRepeat, String realName, String pID, String email, String authCode, String city, String landPhone);
}
