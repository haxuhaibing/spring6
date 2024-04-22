package com.blog.reflect;

public class CalcProxy implements Calc {


    private Calc target;

    public CalcProxy(Calc target) {
        this.target = target;
    }

    @Override
    public int add(int a,int b){
        int result=target.add(a,b);
        return result;
    }

}
