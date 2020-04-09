package com.mashibing.dp.strategy.mycode.camparable;

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
        Sort sort = new Sort();
        sort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
