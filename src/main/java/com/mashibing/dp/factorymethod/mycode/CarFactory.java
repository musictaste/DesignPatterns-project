package com.mashibing.dp.factorymethod.mycode;

/**
 * @ClassName CarFactory
 * @Description: TODO
 * @Author 李淼
 * @Date 2020/3/20
 * @Version V1.0
 **/
public class CarFactory extends Factory {
    @Override
    Moveable create() {
        return new Car();
    }
}
