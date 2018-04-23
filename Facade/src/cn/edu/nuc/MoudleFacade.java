package cn.edu.nuc;

/**
 * Created by Administrator on 2018/4/22.
 */
public class MoudleFacade {
    private MoudleA a = new MoudleA();
    private MoudleB b = new MoudleB();
    private MoudleC c = new MoudleC();
    public void a1(){
        a.doA();
    }
    public void b1(){
        b.doB();
    }
    public void c1(){
        c.doC();
    }
}
