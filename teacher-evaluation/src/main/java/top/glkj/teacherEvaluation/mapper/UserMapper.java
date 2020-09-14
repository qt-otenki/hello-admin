package top.glkj.teacherEvaluation.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.glkj.teacherEvaluation.bean.User;

/**
 * 需要加@Mapper
 * @author : xgl
 * @version : 0.0.1
 * @date :2020/9/8 11:42
 */
@Mapper
public interface UserMapper {

    public User getUerByName(String loginName);
}
