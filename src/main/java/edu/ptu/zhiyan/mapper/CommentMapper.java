package edu.ptu.zhiyan.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.ptu.zhiyan.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description 评论数据的mapper
 */
@Mapper
public interface CommentMapper extends BaseMapper<Comment> {

}
