package com.mashibing.dp.strategy.mycode.camparator;

/**
 * @ClassName Comparator
 * @Description: TODO
 * @Author 李淼
 * @Date 2020/3/20
 * @Version V1.0
 **/
//如果只有一个抽象方法，可以不加注解，另外可以使用lambda表达式
//函数式接口
//@FunctionalInterface
public interface Comparator<T> {
    int compare(T t1,T t2);

    //1.8以后，可以写方法实现
    default void m(){
        System.out.println("m");
    }
}
