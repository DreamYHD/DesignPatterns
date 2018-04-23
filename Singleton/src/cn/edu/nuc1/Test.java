package cn.edu.nuc1;

/**
 * Created by Administrator on 2017/4/19.
 */
public class Test {
    public static void main(String[] args) {
        SingletonClass.getInstance();
        SingletonEhan.getInstance();
        SingletonVolatile.getSingletonVolatile();
        SingletonSync.getSingletonSync();
        SingletonTwoSync.getSingletonSync();
        SingletonLanhan.getInstance();
    }
}
