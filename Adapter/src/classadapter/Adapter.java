package classadapter;

/**
 * Created by Administrator on 2018/4/22.
 */
//使用适配器来把我们的源类添加一些需要的功能转换成目标功能型对象
public class Adapter {
    private Adaptee adaptee;
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    public void method1(){
        adaptee.method1();
    }
    public void method2(){

    }
}
