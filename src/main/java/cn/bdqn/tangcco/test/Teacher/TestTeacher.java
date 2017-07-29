package cn.bdqn.tangcco.test.Teacher;

import cn.bdqn.tangcco.Teacher.services.TeacherService;
import cn.bdqn.tangcco.entity.Department;
import cn.bdqn.tangcco.entity.Tbuser;
import cn.bdqn.tangcco.entity.Teacher;
import cn.bdqn.tangcco.test.base.TestBase;
import cn.bdqn.tangcco.tools.PageUtil;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ZUO-PC on 2017/7/28.
 */

public class TestTeacher extends TestBase{
    @Resource
    private TeacherService teacherService;
    @Test
    public void queryAll(){
        PageUtil<Teacher> t=teacherService.queryTeacher (1,3,"admin");
        System.out.println (t.getTotal ());
        List<Teacher> teacherList=t.getObjs ();
        for(int i=0;i<teacherList.size ();i++){
            System.out.println (teacherList.get (i));
        }
    }
    @Test
    public void addTest(){
        Teacher teacher=new Teacher ();
        teacher.setTeacherDesc ("炒菜");
        teacher.setTeacherName ("王阿姨");
        Department department=new Department ();
        department.setDepId (2);
        Tbuser tbuser=new Tbuser ();
        tbuser.setUserId (2);
        teacher.setDepartment (department);
        teacher.setTbuser (tbuser);
        int count=teacherService.addTeacher (teacher);
        if(count>0){
            System.out.println ("yes");
        }else{
            System.out.println ("No");
        }
    }
    @Test
    public void deleteTest(){
        int count=teacherService.deleteTeacher (4);
        if(count>0){
            System.out.println ("Yes");
        }else{
            System.out.println ("No");
        }
    }
    @Test
    public void queryTeacherById(){
        System.out.println (teacherService.queryTeacherById (1));
    }
    @Test
    public void updateTest(){
        Teacher teacher=new Teacher ();
        Department department=new Department ();
        teacher.setTeacherName ("小帅帅");
        teacher.setTeacherDesc ("打架能手");
        department.setDepId (1);
        teacher.setDepartment (department);
        teacher.setTeacherId (7);
        int count=teacherService.updateTeacher (teacher);
        if(count>0){
            System.out.println ("yes");
        }else{
            System.out.println ("No");
        }
    }
}
