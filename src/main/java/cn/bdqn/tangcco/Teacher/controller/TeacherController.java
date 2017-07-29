package cn.bdqn.tangcco.Teacher.controller;

import cn.bdqn.tangcco.Teacher.services.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by ZUO-PC on 2017/7/29.
 */
@Controller
@RequestMapping(value = "teacher")
public class TeacherController {
    @Resource
    private TeacherService teacherService;
    @RequestMapping(value = "toTeacherList",method = RequestMethod.GET)
    public String toTeacherList(){
        return "Teacher";
    }
}
