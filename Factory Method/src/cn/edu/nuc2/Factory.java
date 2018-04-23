package cn.edu.nuc2;

/**
 * Created by Administrator on 2018/4/22.
 */
public class Factory implements BaseFactory {
    @Override
    public <T extends Produce> T createProduce(Class<T> cls) {
        Produce p = null;
        try {
            p = (Produce) Class.forName(cls.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) p;
    }
}
