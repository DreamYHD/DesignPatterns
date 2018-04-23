package cn.edu.nuc1;

/**
 * Created by Administrator on 2018/4/22.
 */
public class ComponentA extends DEcorator {
    public ComponentA(ConcreatComponent concreatComponent) {
        super(concreatComponent);
    }

    @Override
    public void invoke() {
        doPre();
        super.invoke();
        doNext();
    }
    private void doNext() {
        System.out.println("next");
    }
    private void doPre() {
        System.out.println("pre");
    }
}
