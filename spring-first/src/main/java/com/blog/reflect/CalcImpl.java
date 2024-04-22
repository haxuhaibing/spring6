package com.blog.reflect;

public class CalcImpl implements Calc {
    @Override
    public int add(int a,int b){
        int result= a+b;

      //  System.out.println("默认日志");
        return result;
    }


}
