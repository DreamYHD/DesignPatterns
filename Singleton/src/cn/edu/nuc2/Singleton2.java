package cn.edu.nuc2;

/**
 * Created by Administrator on 2018/4/22.
 */
//恶汉模式 ，线程安全，但是一开始就会被初始化
public class Singleton2 {
    private static final Singleton2 singleton2 = new Singleton2();
    private Singleton2(){

    }
    public static Singleton2 getSingleton2() {
        return singleton2;
    }
}
