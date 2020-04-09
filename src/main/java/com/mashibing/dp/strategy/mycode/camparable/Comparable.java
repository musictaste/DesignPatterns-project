package com.mashibing.dp.strategy.mycode.camparable;

/**
 * @ClassName Comparable
 * @Description: TODO
 * @Author 李淼
 * @Date 2020/3/20
 * @Version V1.0
 **/
//如果只有一个抽象方法，可以不加注解
//@FunctionalInterface
public interface Comparable<T> {
    int compareTo(T t);
    default void m(){
        System.out.println("test");
    }
}
