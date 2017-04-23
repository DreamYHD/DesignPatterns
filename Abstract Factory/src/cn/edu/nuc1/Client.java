package cn.edu.nuc1;

/**
 * Created by Administrator on 2017/4/23.
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory mFactory1=new Factory1();
        AbstractFactory mFactory2=new Factory2();
        mFactory1.createAbstractProductA().method();
        mFactory1.createAbstractProductB().method();
        mFactory2.createAbstractProductB().method();
        mFactory2.createAbstractProductA().method();
    }
}
