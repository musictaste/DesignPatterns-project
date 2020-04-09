package com.mashibing.dp.strategy.mycode.camparator;

/**
 * @ClassName CatWeightComparator
 * @Description: TODO
 * @Author 李淼
 * @Date 2020/3/20
 * @Version V1.0
 **/
public class CatWeightComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat t1, Cat t2) {
        if(t1.weight < t2.weight) return -1;
        else if(t1.weight >t2.weight) return 1;
        else return 0;
    }
}
