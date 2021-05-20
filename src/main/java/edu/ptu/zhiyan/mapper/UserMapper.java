package edu.ptu.zhiyan.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.ptu.zhiyan.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description 用户信息的mapper
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
