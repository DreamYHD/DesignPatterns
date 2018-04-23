package cn.edu.nuc1;

/**
 * Created by Administrator on 2018/4/22.
 */
public abstract class DEcorator extends   Component {
    private ConcreatComponent concreatComponent;

    public DEcorator(ConcreatComponent concreatComponent) {
        this.concreatComponent = concreatComponent;
    }

    @Override
    public void invoke() {
        concreatComponent.invoke();
    }
}
