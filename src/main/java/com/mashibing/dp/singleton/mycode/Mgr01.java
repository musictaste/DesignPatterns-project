package com.mashibing.dp.singleton.mycode;

/**
 * @ClassName Mgr01
 * @Description: TODO
 * @Author 李淼
 * @Date 2020/3/19
 * @Version V1.0
 **/
public class Mgr01 {
//    private static final Mgr01 INSTANCE = new Mgr01();
    private static final Mgr01 INSTANCE;
    static {
        INSTANCE = new Mgr01();
    }
    //关键在于构造方法是private的
    private Mgr01(){}

    public static Mgr01 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        Mgr01 o1 = Mgr01.getInstance();
        Mgr01 o2 = Mgr01.getInstance();
        System.out.println(o1==o2);
    }
}
