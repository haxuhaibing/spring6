package com.blog.spring6.company;

public class Department {

    private String dname;
    private int age;

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void info(){
        System.out.println("部门类info执行了。。。");
    }

}
