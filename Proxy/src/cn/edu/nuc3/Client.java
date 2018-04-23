package cn.edu.nuc3;

import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2018/4/23.
 */
public class Client {
    public static void main(String[] args) {
        Baoxian baoxian = new Baoxian();
        BaoxianhHandle baoxianhHandle = new BaoxianhHandle(baoxian);
        BaoxianImp baoxianProxy = (BaoxianImp) Proxy.newProxyInstance(
                baoxian.getClass().getClassLoader(),
                baoxian.getClass().getInterfaces(),
                baoxianhHandle);
        baoxianProxy.pao();




    }
}
