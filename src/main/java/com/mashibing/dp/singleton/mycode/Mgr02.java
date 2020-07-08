package com.mashibing.dp.singleton.mycode;

//import sun.security.jca.GetInstance;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName Mgr02
 * @Description: TODO
 * @Author 李淼
 * @Date 2020/3/19
 * @Version V1.0
 **/
public class Mgr02 {
    //没有final修饰，因为加了final修饰，必须进行初始化
    private static Mgr02 INSTANCE;

    public static synchronized Mgr02 getINstance(){
        if(INSTANCE ==null){
            //因为执行速度太快，加一下睡眠，增加了被其他打断的可能性
            try {
                TimeUnit.MILLISECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr02();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr02.getINstance().hashCode());
            },"T"+i).start();
        }
    }
}
