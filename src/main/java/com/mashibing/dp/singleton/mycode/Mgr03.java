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
    //必须加volatile，因为如果使用了JIT优化（优化成本地代码）会导致指令重排，volatile可以防止指令重排序
    private static volatile Mgr03 instance;

    public static Mgr03 getInstance(){
        if(instance ==null){
            //妄图通过减小同步代码块的方式来提高效率
            synchronized (Mgr03.class){
                if(instance ==null){
                    //因为执行速度太快，加一下睡眠，增加了被其他打断的可能性
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
