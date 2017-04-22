package cn.edu.nuc2;

/**
 * Created by Administrator on 2017/4/21.
 */
public interface Aggregate<T> {

    void add(T t);

    void delete(T t);

    Iterator<T> iterator();
}
