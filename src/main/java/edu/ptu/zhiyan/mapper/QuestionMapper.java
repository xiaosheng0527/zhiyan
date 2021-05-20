package edu.ptu.zhiyan.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.ptu.zhiyan.entity.Question;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description 问题数据的mapper
 */
@Mapper
public interface QuestionMapper extends BaseMapper<Question> {

}
