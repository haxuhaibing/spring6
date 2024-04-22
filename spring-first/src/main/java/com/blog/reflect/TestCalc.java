package com.blog.reflect;

public class TestCalc {
    public static void main(String[] args) {
       CalcFactory calcFactory = new CalcFactory(new CalcImpl());
       Calc proxy=(Calc)calcFactory.getProxy();
       proxy.add(1,3);
    }
}
