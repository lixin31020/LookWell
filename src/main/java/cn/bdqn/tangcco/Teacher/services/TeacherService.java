package cn.bdqn.tangcco.Teacher.services;

import cn.bdqn.tangcco.entity.Teacher;
import cn.bdqn.tangcco.tools.PageUtil;

/**
 * Created by ZUO-PC on 2017/7/28.
 */
public interface TeacherService {
    public PageUtil queryTeacher(Integer page,Integer rows,String teacherName);
    public Integer addTeacher(Teacher teacher);
    public Integer deleteTeacher(Integer teacherId);
    public Teacher queryTeacherById(Integer teacherId);
    public Integer updateTeacher(Teacher teacher);
}
