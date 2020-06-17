package com.mashibing.dp.singleton.mycode;

/**
 * @ClassName Mgr04
 * @Description: 静态内部类
 *  可以保证单例，也能保证懒加载
 *  也算是比较完美的一种写法，除了不能防止反序列化
 *
 *  不能防止反序列化的意思是
 *  通过反射得到的对象和通过getInstance得到的对象不是同一个对象
 *
 * @Author 李淼
 * @Date 2020/3/19
 * @Version V1.0
 **/
public class Mgr04 {
    //构造方法是private的
    private Mgr04(){}

    //调用该方法时，内部类才会被加载
    public static Mgr04 getInstance(){
        return Mgr04Loader.INSTANCE;
    }

    //外部类 加载的时候，内部类不会被加载；是JVM的类加载机制保证的
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
