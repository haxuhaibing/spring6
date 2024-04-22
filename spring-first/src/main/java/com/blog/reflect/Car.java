package com.blog.reflect;

public class Car {
    private String name;
    private int age;
    private String color;

    public Car() {
    }
    public Car(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void run(){
        System.out.println("car is running");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
