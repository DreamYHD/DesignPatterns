package cn.edu.nuc2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/21.
 */
public class IteratorImp<T> implements Iterator<T> {

    private List<T>mTList=new ArrayList<>();

    private int cursor=0;

    public IteratorImp(List<T> mTList) {
        this.mTList = mTList;
    }

    @Override
    public boolean hasNext() {
        return !(cursor>mTList.size()-1||mTList.get(cursor)!=null);
    }

    @Override
    public T next() {
       T obj=null;
       if (this.hasNext()){
           obj=this.mTList.get(cursor++);
       }
        return obj;
    }
}
