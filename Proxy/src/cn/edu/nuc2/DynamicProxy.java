package cn.edu.nuc2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/8/13.
 */
public class DynamicProxy implements InvocationHandler {
    private Object object;
    public DynamicProxy(Object o){
        this.object = o;
    }

    /**
     *
     * @param proxy
     * @param method 代理目标的方法
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(object,args);
        System.out.println(method.getName());
        return result;
    }
}
