package com.mashibing.dp.strategy.mycode.camparable;

/**
 * @ClassName Sort
 * @Description: TODO
 * @Author 李淼
 * @Date 2020/3/20
 * @Version V1.0
 **/
public class Sort {

    public void sort(Comparable[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min =i;
            for (int j = i+1; j < arr.length; j++) {
                min = arr[j].compareTo(arr[min])== -1?j:min;
            }
            swap(arr,i,min);
        }
    }

    public void swap(Comparable[] arr,int i,int j){
        Comparable temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
