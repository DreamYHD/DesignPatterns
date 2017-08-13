package cn.edu.test;

import java.awt.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/8/13.
 */
public class DProxy implements InvocationHandler {
    private Object mObject;

    public DProxy(Object object){
        this.mObject = object;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        return method.invoke(mObject,args);
    }
}
