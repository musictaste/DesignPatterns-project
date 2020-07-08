package com.mashibing.dp.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Random;

/**
 * CGLIB实现动态代理不需要接口
 */
public class Main {
    public static void main(String[] args) {
        //Enhancer 增强器
        Enhancer enhancer = new Enhancer();
        //设置父类
        //既然CGLIB不需要实现接口，那么代理类怎么知道实现哪些方法呢？就是因为是目标类的子类
        enhancer.setSuperclass(Tank.class);
        enhancer.setCallback(new TimeMethodInterceptor());
        Tank tank = (Tank)enhancer.create();
        tank.move();
    }
}

//MethodInterceptor 相当于JDK动态代理的InvocationHandler
class TimeMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println(o.getClass().getSuperclass().getName()); //com/mashibing/dp/cglib/Main.java
        System.out.println("before");
        Object result = null;
        result = methodProxy.invokeSuper(o, objects);
        System.out.println("after");
        return result;
    }
}

class Tank {
    public void move() {
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


