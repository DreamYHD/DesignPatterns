package cn.edu.nuc2;

import cn.edu.nuc.Subject;
import cn.edu.nuc.SubjectImp;

import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/8/13.
 */
public class Client  {

    public static void main(String[] args) {

        SubjectImp subjectImp = new SubjectImp();
        //构造一个动态代理
        DynamicProxy dynamicProxy = new DynamicProxy(subjectImp);
        //动态构造的代理
        /**
         * 1 需要代理的类的classloader
         * 2 目标对象实现的接口
         * 3 动态代理对象(把目标交给代理)
         */
        Subject subject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(),SubjectImp.class.getInterfaces(),dynamicProxy);
        System.out.println(subjectImp.getClass().getClassLoader());
        System.out.println(Subject.class.getClassLoader());
        subject.visit();
    }
}
