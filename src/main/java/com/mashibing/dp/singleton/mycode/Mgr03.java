package com.mashibing.dp.singleton.mycode;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName Mgr03
 * @Description: TODO
 * @Author 李淼
 * @Date 2020/3/19
 * @Version V1.0
 **/
public class Mgr03 {
    private static volatile Mgr03 instance;

    public static Mgr03 getInstance(){
        if(instance ==null){
            synchronized (Mgr03.class){
                if(instance ==null){
                    try {
                        TimeUnit.MILLISECONDS.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new Mgr03();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr03.getInstance().hashCode());
            },"T"+i).start();
        }
    }
}
