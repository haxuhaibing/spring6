package com.blog.reflect;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class CalcFactory {
    private  Object target;
    public CalcFactory(Object target){
        this.target = target;
    }
    
    public Object getProxy(){
        ClassLoader classLoader=target.getClass().getClassLoader();
        Class<?>[] interfaces=target.getClass().getInterfaces();
        InvocationHandler invocationHandler=new InvocationHandler(){
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("dynamic proxy before："+ method.getName()+ Arrays.toString(args));
                Object invoke = method.invoke(target, args);
                System.out.println("dynamic proxy after："+method.getName());
                return invoke;
            }
        };
        return Proxy.newProxyInstance(classLoader,interfaces,invocationHandler);
    }
}
