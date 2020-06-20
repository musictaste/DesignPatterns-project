package com.mashibing.dp.abstractfactory.mycode;

/**
 * @ClassName AbstractFactory
 * @Description: 抽象的工厂
 * @Author 李淼
 * @Date 2020/3/20
 * @Version V1.0
 **/
public abstract class AbstractFactory {
    abstract Food createFood();
    abstract Vehicle createVehicle();
    abstract Weapon createWeapon();
}
