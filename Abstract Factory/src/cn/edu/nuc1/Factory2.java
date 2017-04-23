package cn.edu.nuc1;

/**
 * Created by Administrator on 2017/4/23.
 */
public class Factory2 extends AbstractFactory {
    @Override
    public AbstractProductA createAbstractProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createAbstractProductB() {
        return new ProductB2();
    }
}
