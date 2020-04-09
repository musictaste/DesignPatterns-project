package com.mashibing.dp.singleton.mycode;

/**
 * @ClassName Mgr04
 * @Description: TODO
 * @Author 李淼
 * @Date 2020/3/19
 * @Version V1.0
 **/
public class Mgr04 {
    public static Mgr04 getInstance(){
        return Mgr04Loader.INSTANCE;
    }

    static class Mgr04Loader{
        private final static Mgr04 INSTANCE=new Mgr04();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr04.getInstance().hashCode());
            },"T"+i).start();
        }
    }

}
