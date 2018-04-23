package cn.edu.nuc3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018/4/23.
 */
public class BaoxianhHandle implements InvocationHandler {
    private Object baoxianImp;

    public BaoxianhHandle(Object baoxianImp) {

        this.baoxianImp = baoxianImp;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(baoxianImp,args);
        return result;
    }
}
