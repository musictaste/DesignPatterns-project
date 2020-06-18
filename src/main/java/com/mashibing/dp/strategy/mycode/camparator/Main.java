package com.mashibing.dp.strategy.mycode.camparator;

import java.util.Arrays;

/**
 * @ClassName Main
 * @Description: TODO
 * @Author 李淼
 * @Date 2020/3/20
 * @Version V1.0
 **/
public class Main {
    public static void main(String[] args) {
        Cat[] arr = {new Cat(3,3),new Cat(5,5),new Cat(1,1)};
        Sorter<Cat> sorter = new Sorter<>();
        sorter.sort(arr,new CatWeightComparator());
        System.out.println(Arrays.toString(arr));

        System.out.println("==============");
        sorter.sort(arr,new CatHeightComparator());
        System.out.println(Arrays.toString(arr));

        System.out.println("==============");
        //lambda表达式  函数式接口
        sorter.sort(arr,(o1,o2)->{
            if(o1.weight<o2.weight) return -1;
            else if(o1.weight >o2.weight) return 1;
            else return 0;
        });
        System.out.println(Arrays.toString(arr));
    }
}
