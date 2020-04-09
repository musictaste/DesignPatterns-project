package com.mashibing.dp.abstractfactory.mycode;

/**
 * @ClassName AnimalFactory
 * @Description: TODO
 * @Author 李淼
 * @Date 2020/3/20
 * @Version V1.0
 **/
public class AnimalFactory extends AbstractFactory {
    @Override
    Meat createFood() {
        return new Meat();
    }

    @Override
    Vehicle createVehicle() {
        return new Leg();
    }

    @Override
    Weapon createWeapon() {
        return new Mugun();
    }
}
