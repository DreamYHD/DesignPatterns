package cn.edu.nuc2;

/**
 * Created by Administrator on 2018/4/22.
 */
public interface BaseFactory {
    <T extends Produce>T createProduce(Class<T>cls);
}
