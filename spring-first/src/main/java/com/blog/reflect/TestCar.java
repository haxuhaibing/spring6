package com.blog.reflect;

import org.junit.jupiter.api.Test;

public class TestCar {
    //1.use reflect


    @Test
    public void test01() throws Exception{
        //1.className.class
        Class clazz1=Car.class;
        //2.object.getClass()
        Class clazz2=new Car().getClass();
        //3.Class.forName("full path")
        Class clazz3= Class.forName("com.blog.reflect.Car");

        //2.get construct function
        Car car =(Car) clazz3.getDeclaredConstructor().newInstance();
        car.run();
        //3.get attr

    }
}
