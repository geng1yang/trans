package com.xcy.service.impl;

import com.xcy.mapper.UserMapper;
import com.xcy.pojo.LoginResult;
import com.xcy.pojo.User;
import com.xcy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public LoginResult isLogin(User user) {

        int count = userMapper.login(user);

        if (count == 1) {
            int id = userMapper.isLogin(user);

            return new LoginResult(1, id, "登陆成功");
        }else {
            int id;
            return new LoginResult(0, 0, "登陆失败");

        }
    }

    @Override
    public boolean validateUsername(String userPhone) {
        int count = userMapper.validateUsername(userPhone);
        return count > 0 ? true : false;
    }

    @Override
    public int insertUser(User user) {

        return userMapper.insertUser(user);
    }

//**************************************************************************************************************


/*
    @Override
    public String register(String regPhone, String pwd, String pwdRepeat, String realName, String pID, String email, String authCode, String city, String landPhone) {
        if (!pwd.equals(pwdRepeat)){

            String info = "两次密码输入不同";
            return "({'info':'" + info + "'})";

        }

        if (StringUtils.isBlank(code) || !code.equalsIgnoreCase(authCode)){
            String info = "验证码";
        }

    }
*/






















}
