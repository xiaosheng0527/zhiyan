package edu.ptu.zhiyan.service.test.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.ptu.zhiyan.entity.User;
import edu.ptu.zhiyan.mapper.UserMapper;
import edu.ptu.zhiyan.service.test.ITestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

@Service
public class TestService extends ServiceImpl<UserMapper,User> implements IService<User> {

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
