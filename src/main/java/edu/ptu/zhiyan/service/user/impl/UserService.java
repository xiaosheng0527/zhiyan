package edu.ptu.zhiyan.service.user.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.ptu.zhiyan.entity.User;
import edu.ptu.zhiyan.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService extends ServiceImpl<UserMapper, User> implements IService<User> {

    @Resource
    UserMapper userMapper;
    public boolean saveUser(User user){
        try {
            userMapper.insert(user);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }

    }
}