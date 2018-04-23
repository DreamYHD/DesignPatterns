package cn.edu.nuc2;

/**
 * Created by Administrator on 2018/4/22.
 */
public class DCLSingleton {
    private volatile static DCLSingleton singleton = null;
    private DCLSingleton(){}

    public static DCLSingleton getSingleton() {
        if (singleton == null) {
            synchronized (DCLSingleton.class){
                if (singleton == null) {
                    //非原子操作
                    singleton = new DCLSingleton();
                }
            }
        }
        return singleton;
    }
}
