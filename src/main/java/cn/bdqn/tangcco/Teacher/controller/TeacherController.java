package cn.bdqn.tangcco.Teacher.controller;

import cn.bdqn.tangcco.Teacher.services.TeacherService;
import cn.bdqn.tangcco.entity.Teacher;
import cn.bdqn.tangcco.tools.PageUtil;
import com.alibaba.fastjson.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

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

    //查看全部
    @RequestMapping(value = "queryTeacher",method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String queryTeacher(Integer page,Integer rows,String teacherName){
        Map<String,Object> map=new java.util.HashMap<> ();
        PageUtil<Teacher> t=teacherService.queryTeacher (page,rows,teacherName);
        map.put ("total",t.getTotal ());
        map.put ("rows",t.getObjs ());
        String json= JSONArray.toJSONString (map);
        return json;

    }
}
