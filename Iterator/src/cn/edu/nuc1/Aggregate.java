package cn.edu.nuc1;

/**
 * Created by Administrator on 2017/4/21.
 */
public interface Aggregate<T> {

    abstract void add(T t);

    abstract void delete(T mT);

    Iterator<T> iterator();


}
