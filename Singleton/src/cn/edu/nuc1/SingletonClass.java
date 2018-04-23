package cn.edu.nuc1;

/**
 * Created by Administrator on 2017/4/19.
 */
public class
SingletonClass {
    private SingletonClass(){

    }
    private static class Single{
        private static final SingletonClass INSTANCE=new SingletonClass();
    }

    public static SingletonClass getInstance(){

        return  Single.INSTANCE;
    }
}
