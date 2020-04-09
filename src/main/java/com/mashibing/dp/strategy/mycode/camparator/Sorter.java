package com.mashibing.dp.strategy.mycode.camparator;

/**
 * @ClassName Sorter
 * @Description: TODO
 * @Author 李淼
 * @Date 2020/3/20
 * @Version V1.0
 **/
public class Sorter<T> {
    public void sort(T[] arr,Comparator<T> comparator){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                min = comparator.compare(arr[j],arr[min])==-1? j:min;
            }
            swap(arr,i,min);
        }
    }

    public void swap(T[] arr,int i,int j){
        T temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
