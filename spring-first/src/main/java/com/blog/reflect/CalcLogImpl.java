package com.blog.reflect;

public class CalcLogImpl implements Calc {

    @Override
    public int add(int a,int b){

        int result= a+b;

        System.out.println("日志"+result);
        return result;
    }


}
