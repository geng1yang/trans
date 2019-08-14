package com.xcy.mapper;

import com.xcy.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserMapper {

    int login(User user);

    int isLogin(User user);

    int validateUsername(String username);

    int insertUser(User user);
}
