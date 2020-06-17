package com.mashibing.dp.singleton.mycode;

/**
* java创始人之一，《effective java》的作者
 * 《effective java》中的提到的单例
 * 序列化问题：反射 将class load到内存中，可以instance出一个实例；如果想反序列化非常复杂，需要设置一些内部的变量
 * 枚举类不能反序列化的问题：因为枚举类没有构造方法
 *
 *  通过反射得到的Instance和通过Enum.Instance得到的对象是同一个对象
 *
 * 所以该方法是最完美的单例方法
**/
public enum Mgr05 {
    INSTANCE;
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr05.INSTANCE.hashCode());
            },"T"+i).start();
        }
    }

}
