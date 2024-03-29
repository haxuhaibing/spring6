package com.blog.spring6.company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCompany {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean-company.xml");
        Employee emp=context.getBean("employee",Employee.class);
        emp.work();
    }
}
