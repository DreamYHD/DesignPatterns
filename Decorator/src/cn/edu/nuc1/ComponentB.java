package cn.edu.nuc1;

/**
 * Created by Administrator on 2018/4/22.
 */
public class ComponentB extends DEcorator {
    public ComponentB(ConcreatComponent concreatComponent) {
        super(concreatComponent);
    }

    @Override
    public void invoke() {
        super.invoke();
    }
}
