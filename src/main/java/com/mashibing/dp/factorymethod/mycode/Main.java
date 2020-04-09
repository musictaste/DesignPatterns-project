package com.mashibing.dp.factorymethod.mycode;

/**
 * @ClassName Main
 * @Description: TODO
 * @Author 李淼
 * @Date 2020/3/20
 * @Version V1.0
 **/
public class Main {
    public static void main(String[] args) {
       Moveable moveable = new CarFactory().create();
       moveable.run();

       Moveable moveable1 = new FlainFactory().create();
       moveable1.run();
    }
}
