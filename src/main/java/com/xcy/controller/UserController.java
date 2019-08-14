package com.xcy.controller;

import com.xcy.pojo.LoginResult;
import com.xcy.pojo.User;
import com.xcy.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@RestController
@EnableSwagger2
@RequestMapping(method = {RequestMethod.POST})
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation("登陆验证")
    @RequestMapping("login")
    public LoginResult login(String userPhone, String userPassword){
        User user = new User();
        user.setUserPhone(userPhone);
        user.setUserPassword(userPassword);
        LoginResult loginResult = userService.isLogin(user);
        return loginResult;
    }

    @ApiOperation("查询注册账号是否已经存在")
    @RequestMapping("isRegisted")
    public String isRegisted(String username){

        boolean isRegisted = userService.validateUsername(username);
        return isRegisted ? "fail" : "success";
    }

    /*
     * 请求格式 POST
     * 注册 使用手机号注册
     * @param regPhone       注册名(手机号)
     * @param pwd           登陆密码，第一次密码
     * @param pwdRepeat     确认密码，第二次密码
     * @param realName      真实姓名
     * @param pID           身份证号
     * @param email         邮箱
     * 点击获取 @param mobileCode    手机验证码
     * @param authCode      输入的验证码
     * @return
     */
/*     @RequestMapping("register")
     public String sendRegPhone(String regPhone, String pwd, String pwdRepeat, String realName, String pID, String email, String authCode, String city, String landPhone){
         return userService.register(regPhone, pwd, pwdRepeat, realName, pID, email, authCode, city, landPhone);
     }


     *//* 验证手机号，邮箱是否重复
      * @param isEngaged 检测的名称
      * @param regPhone 用户名电话
      * @param email 邮箱
      *//*
      @RequestMapping("/validateuser/{isEngaged}")
      public String validateUser(@PathVariable String isEngaged, @RequestParam(defaultValue = "") String regPhone, @RequestParam(defaultValue = "") String email){
          return userService.validateUser(isEngaged, regPhone, email);

      }

      @RequestMapping("/notifyuser/mobileCode")
      public String mobilCode(String mobile){
          return notifyUserService.mobileNotify(mobile);
      }*/



























}
