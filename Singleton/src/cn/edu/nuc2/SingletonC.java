package cn.edu.nuc2;

/**
 * Created by Administrator on 2018/4/22.
 */
public class SingletonC {
    private SingletonC(){

    }
    public static SingletonC getInstance() {
        return SingletonH.INSTANCE;
    }
    private static class SingletonH{
        private static final SingletonC INSTANCE = new SingletonC();
    }
}
