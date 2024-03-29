package com.blog.spring6.bclass;

import java.util.Map;

public class Student {
    private String sid;
    private String sname;

    private Map<String,Teacher> teacherMap;

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void run (){
        System.out.println("学生id"+sid+ "学生name"+sname );
        System.out.println(teacherMap);
    }


}
