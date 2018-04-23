package cn.edu.nuc1; /**
 * Created by Administrator on 2017/4/19.
 */

/**
 *饿汉式
 */
public class SingletonEhan {

    private  SingletonEhan(){

    }

    private static SingletonEhan singletonEhan=new SingletonEhan();

    public static SingletonEhan getInstance(){

        return singletonEhan;
    }
}
