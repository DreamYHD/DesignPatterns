package cn.edu.nuc2;

import java.util.concurrent.SynchronousQueue;

/**
 * Created by Administrator on 2018/4/22.
 */
//懒汉模式，线程安全但是消耗资源
public class Singleton {
    private static Singleton singleton;
    public Singleton(){}
    //如果线程已经创建，但是依然每次都要进行同步检测
    public static synchronized Singleton getInstance() {
        if ( singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
