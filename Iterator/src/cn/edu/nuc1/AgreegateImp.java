package cn.edu.nuc1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/21.
 */
public class AgreegateImp<T> implements Aggregate<T>  {
    private List<T>mTList=new ArrayList<>();


    @Override
    public void add(T mT) {
        mTList.add(mT);

    }

    @Override
    public void delete(T mT) {

        mTList.remove(mT);
    }

    @Override
    public Iterator<T> iterator() {
        return new IteratorImp<T>(mTList);
    }
}
