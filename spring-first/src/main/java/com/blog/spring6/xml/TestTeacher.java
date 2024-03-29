package com.blog.spring6.xml;

import com.blog.spring6.TestUser;
import com.blog.spring6.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTeacher {

    private final Logger logger = LoggerFactory.getLogger(TestTeacher.class);

    @Test

    public void testUserObject() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //1.通过id获取bean

//        Teacher teacher=(Teacher)context.getBean("teacher");
//        teacher.run();

        //2.通过class获取bean
//        Teacher teacher2=(Teacher)context.getBean(Teacher.class);
//        teacher2.run();

        //3.通过id和class获取bean
        Teacher teacher3 = (Teacher) context.getBean("teacher", Teacher.class);
        teacher3.run();
    }
}
