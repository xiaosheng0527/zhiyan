package edu.ptu.zhiyan.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.ptu.zhiyan.entity.Answer;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description 回答数据的mapper
 */
@Mapper
public interface AnswerMapper extends BaseMapper<Answer> {

}
