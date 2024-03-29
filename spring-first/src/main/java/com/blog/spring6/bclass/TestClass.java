package com.blog.spring6.bclass;

import com.blog.spring6.company.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean-class-map.xml");
        Student stu=context.getBean("student",Student.class);
        stu.run();
    }

}
