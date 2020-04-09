package com.mashibing.dp.singleton.mycode;

import sun.security.jca.GetInstance;

/**
 * @ClassName Mgr02
 * @Description: TODO
 * @Author 李淼
 * @Date 2020/3/19
 * @Version V1.0
 **/
public class Mgr02 {
    private static Mgr02 INSTANCE;

    public static synchronized Mgr02 getINstance(){
        if(INSTANCE ==null){
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
