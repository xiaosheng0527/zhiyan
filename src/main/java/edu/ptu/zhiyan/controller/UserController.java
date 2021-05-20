package edu.ptu.zhiyan.controller;

import com.alibaba.fastjson.JSONObject;
import edu.ptu.zhiyan.base.Result;
import edu.ptu.zhiyan.entity.User;
import edu.ptu.zhiyan.service.user.impl.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/api")
public class UserController {

    @Resource
    UserService userService;

    @PostMapping("/register")
    public Result userRegister(@RequestBody User user){

        if(userService.saveUser(user)){
            return Result.ok("注册成功");

        }else{
            //System.out.println("注册"+user);
            return Result.fail("注册失败");
        }

    }
}
