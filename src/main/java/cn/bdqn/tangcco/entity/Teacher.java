package cn.bdqn.tangcco.entity;

public class Teacher {
    private Integer teacherId;

    private Department department;

    private String teacherDesc;

    private Tbuser tbuser;

    private String teacherName;

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", department=" + department +
                ", teacherDesc='" + teacherDesc + '\'' +
                ", tbuser=" + tbuser +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getTeacherDesc() {
        return teacherDesc;
    }

    public void setTeacherDesc(String teacherDesc) {
        this.teacherDesc = teacherDesc;
    }

    public Tbuser getTbuser() {
        return tbuser;
    }

    public void setTbuser(Tbuser tbuser) {
        this.tbuser = tbuser;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Teacher(Integer teacherId, Department department, String teacherDesc, Tbuser tbuser, String teacherName) {
        this.teacherId = teacherId;
        this.department = department;
        this.teacherDesc = teacherDesc;
        this.tbuser = tbuser;
        this.teacherName = teacherName;
    }
}