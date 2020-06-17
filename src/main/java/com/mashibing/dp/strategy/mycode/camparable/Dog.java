package com.mashibing.dp.strategy.mycode.camparable;

/**
 * @ClassName Dog
 * @Description: TODO
 * @Author 李淼
 * @Date 2020/6/17
 * @Version V1.0
 **/
public class Dog implements Comparable<Dog> {
    private int food;

    public Dog(int food) {
        this.food = food;
    }

    @Override
    public int compareTo(Dog dog) {
        if(this.food>dog.food) return 1;
        else if(this.food<dog.food) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}
