package com.blog.spring6.bclass;

public class Teacher {
    private String tid;
    private String tname;

    @Override
    public String toString(){
        return "Teacher name"+tname+"Teacher id"+tid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }


}
