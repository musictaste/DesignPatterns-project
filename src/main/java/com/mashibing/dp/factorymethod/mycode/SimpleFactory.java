package com.mashibing.dp.factorymethod.mycode;

/**
 * @ClassName SimpleFactory
 * @Description: 简单工厂
 * @Author 李淼
 * @Date 2020/6/18
 * @Version V1.0
 **/
public class SimpleFactory {
    public Car createCar(){
        return new Car();
    }

    public Flain createFlain(){
        return new Flain();
    }
}
