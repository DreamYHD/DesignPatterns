package cn.edu.nuc1;

/**
 * Created by Administrator on 2017/4/23.
 */
public abstract class Factory {
    public abstract <T extends Product>T creatProduct(Class<T> mTClass);
}
