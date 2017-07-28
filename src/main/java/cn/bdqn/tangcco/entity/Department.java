package cn.bdqn.tangcco.entity;

import java.util.Date;

public class Department {
    private Integer depId;

    private Integer schoolId;

    private String depName;

    private String depDesc;

    private Date addTime;

    private Date lastUpdate;

    public Department() {
    }

    @Override
    public String toString() {
        return "Department{" +
                "depId=" + depId +
                ", schoolId=" + schoolId +
                ", depName='" + depName + '\'' +
                ", depDesc='" + depDesc + '\'' +
                ", addTime=" + addTime +
                ", lastUpdate=" + lastUpdate +
                '}';
    }

    public Department(Integer depId, Integer schoolId, String depName, String depDesc, Date addTime, Date lastUpdate) {
        this.depId = depId;
        this.schoolId = schoolId;
        this.depName = depName;
        this.depDesc = depDesc;
        this.addTime = addTime;
        this.lastUpdate = lastUpdate;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName == null ? null : depName.trim();
    }

    public String getDepDesc() {
        return depDesc;
    }

    public void setDepDesc(String depDesc) {
        this.depDesc = depDesc == null ? null : depDesc.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}