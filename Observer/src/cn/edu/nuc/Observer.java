package cn.edu.nuc;

/**
 * Created by Administrator on 2017/4/22.
 */
public interface Observer {
    void next(Observable mObservable);

    void complete();

    void wrong();
}
