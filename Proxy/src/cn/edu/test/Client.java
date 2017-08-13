package cn.edu.test;

import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/8/13.
 */
public class Client {
    public static void main(String[] args) {
        Lvshi mLvshi = new LvshiImp();
        DProxy mDProxy = new DProxy(mLvshi);

        Lvshi mLvshi1 = (Lvshi) Proxy.newProxyInstance(Lvshi.class.getClassLoader(),mLvshi.getClass().getInterfaces(),mDProxy);
        mLvshi1.doThing();










    }
}
