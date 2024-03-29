package com.blog.spring6.company;

public class Employee {
    //员工属于某个部门
    private Department department;
    private String name;
    private int age;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void work(){
        System.out.println("员工姓名:"+name+" 员工年龄:"+age+" 部门名称："+department.getName());
        department.info();
    }
}
