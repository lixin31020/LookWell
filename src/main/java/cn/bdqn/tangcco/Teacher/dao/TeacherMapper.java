package cn.bdqn.tangcco.Teacher.dao;

import cn.bdqn.tangcco.entity.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by ZUO-PC on 2017/7/28.
 */
public interface TeacherMapper {
    public Integer queryCountTeacher(@Param ("teacherName") String teacherName);
    public List<Teacher> queryTeacherByName(@Param ("start") Integer start, @Param ("rows") Integer rows, @Param ("gradeName") String gradeName);
}
