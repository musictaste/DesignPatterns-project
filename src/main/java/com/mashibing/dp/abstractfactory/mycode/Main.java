package com.mashibing.dp.abstractfactory.mycode;

/**
 * @ClassName Main
 * @Description: TODO
 * @Author 李淼
 * @Date 2020/3/20
 * @Version V1.0
 **/
public class Main {
    public static void main(String[] args) {
//        AbstractFactory factory = new PersonFactory();
        AbstractFactory factory = new AnimalFactory();
        Food food = factory.createFood();
        food.eat();
        Vehicle vehicle = factory.createVehicle();
        vehicle.run();

        Weapon weapon = factory.createWeapon();
        weapon.shoot();
    }
}
