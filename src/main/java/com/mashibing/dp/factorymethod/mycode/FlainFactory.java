package com.mashibing.dp.factorymethod.mycode;

/**
 * @ClassName FlainFactory
 * @Description: TODO
 * @Author 李淼
 * @Date 2020/3/20
 * @Version V1.0
 **/
public class FlainFactory extends Factory {
    @Override
    Moveable create() {
        return new Flain();
    }
}
