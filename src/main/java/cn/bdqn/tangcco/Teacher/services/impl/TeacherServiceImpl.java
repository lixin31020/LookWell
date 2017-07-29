package cn.bdqn.tangcco.Teacher.services.impl;

import cn.bdqn.tangcco.Teacher.dao.TeacherMapper;
import cn.bdqn.tangcco.Teacher.services.TeacherService;
import cn.bdqn.tangcco.entity.Teacher;
import cn.bdqn.tangcco.tools.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ZUO-PC on 2017/7/28.
 */
@Service
public class TeacherServiceImpl implements TeacherService{
    @Resource
    private TeacherMapper teacherMapper;
    @Override
    public PageUtil queryTeacher(Integer page, Integer rows, String teacherName) {
        Integer count=teacherMapper.queryCountTeacher (teacherName);
        PageUtil pageUtil=new PageUtil (page,rows);
        List<Teacher> teacherList=teacherMapper.queryTeacherByName (pageUtil.getStart (),rows,teacherName);
        pageUtil.setTotal (count);
        pageUtil.setObjs (teacherList);
        return pageUtil;
    }

    @Override
    public Integer addTeacher(Teacher teacher) {
        return teacherMapper.addTeacher (teacher);
    }

    @Override
    public Integer deleteTeacher(Integer teacherId) {
        return teacherMapper.deleteTeacher (teacherId);
    }

    @Override
    public Teacher queryTeacherById(Integer teacherId) {
        return teacherMapper.queryTeacher (teacherId);
    }

    @Override
    public Integer updateTeacher(Teacher teacher) {
        return teacherMapper.updateTeacher (teacher);
    }
}
